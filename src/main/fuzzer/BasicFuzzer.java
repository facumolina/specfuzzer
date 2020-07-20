package fuzzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import grammar.GrammarBuilder;

/**
 * This class implements a Basic Fuzzer based on the Simple Grammar Fuzzer from The Fuzzing Book
 * (https://www.fuzzingbook.org/)
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class BasicFuzzer {

  private static final int max_nonterminals = 15;
  private static final int max_expansion_trials = 100;

  private static String re_nonterminal = "(<[^<> ]*>)";

  private static JSONObject grammar;

  /**
   * Fuzz the given grammar and returns a valid expression
   */
  private static String fuzz() {
    Random rand = new Random();
    String term = GrammarBuilder.START_SYMBOL;
    int expansion_trials = 0;
    List<String> non_terminals = nonterminals(term);
    while (non_terminals.size() > 0) {
      String symbol_to_expand = non_terminals.get(rand.nextInt(non_terminals.size()));
      JSONArray expansions = (JSONArray) grammar.get(symbol_to_expand);
      String expansion = (String) expansions.get(rand.nextInt(expansions.size()));
      String new_term = term.replaceFirst(symbol_to_expand, expansion);
      non_terminals = nonterminals(new_term);
      if (non_terminals.size() < max_nonterminals) {
        term = new_term;
        expansion_trials = 0;
      } else {
        expansion_trials += 1;
        if (expansion_trials >= max_expansion_trials)
          throw new IllegalStateException("Can't expand " + term);
      }
    }
    return term;
  }

  /**
   * Fuzz the given grammar and returns a valid expression
   */
  public static String fuzz(String grammar_file_name) {
    try {
      if (grammar == null)
        grammar = read_grammar(grammar_file_name);
      return fuzz();
    } catch (Exception e) {
      System.out.println("Unable to read grammar: " + grammar_file_name);
      return null;
    }
  }

  /**
   * Empty the grammar (just for testing purposes)
   */
  public static void emtpy_grammar() {
    grammar = null;
  }

  /**
   * Get the amount of non terminals symbols of the given symbol
   */
  private static List<String> nonterminals(String symbol) {
    List<String> matches = new LinkedList<String>();
    Matcher m = Pattern.compile("(?=(" + re_nonterminal + "))").matcher(symbol);
    while (m.find()) {
      matches.add(m.group(1));
    }
    return matches;
  }

  /**
   * Load the grammar
   * 
   * @throws ParseException
   */
  private static JSONObject read_grammar(String grammar_file_name)
      throws IOException, ParseException {
    BufferedReader reader = new BufferedReader(new FileReader(grammar_file_name));
    StringBuilder stringBuilder = new StringBuilder();
    String line = null;
    while ((line = reader.readLine()) != null) {
      stringBuilder.append(line);
    }
    reader.close();

    String content = stringBuilder.toString();
    JSONParser parser = new JSONParser();
    return (JSONObject) parser.parse(content);
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      throw new IllegalArgumentException("Only the fully grammar file name is expected");
    }
    String grammar_file = args[0];
    System.out.println(fuzz(grammar_file));
  }
}
