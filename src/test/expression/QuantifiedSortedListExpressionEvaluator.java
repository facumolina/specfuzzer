package expression;

import DataStructures.korat.singlysortedlist.SortedList;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantifiedSortedListExpressionEvaluator {


  @Test
  public void sortedness1() {
    SortedList sl = new SortedList();
    sl.add(-1);
    sl.add(-2);
    sl.add(-3);
    assertFalse(ExpressionEvaluator.eval("all n : SortedList.header.*(next+previous) : n.element <= n.next.element", sl));
  }

}
