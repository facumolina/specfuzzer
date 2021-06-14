package grammar;

import DataStructures.AvlTreeList;
import DataStructures.List;
import org.junit.Test;
import utils.JavaTypesUtil;

import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Tests for class JavaTypesUtil
 */
public class JavaTypesUtilTest {

  @Test
  public void arg_types_list() {
    Set<String> list_arg_types = JavaTypesUtil.all_arguments_types(List.class);
    assertTrue(list_arg_types.contains(JavaTypesUtil.INTEGER));
  }

  @Test
  public void arg_types_avltreelist() {
    Set<String> avltree_arg_types = JavaTypesUtil.all_arguments_types(AvlTreeList.class);
    assertTrue(avltree_arg_types.contains(JavaTypesUtil.INTEGER));
    assertTrue(avltree_arg_types.contains(JavaTypesUtil.OBJECT));
  }

  @Test
  public void is_collection() {
    assertTrue(!JavaTypesUtil.is_collection("java.util.Random"));
    assertTrue(JavaTypesUtil.is_collection("java.util.LinkedList"));
    assertTrue(JavaTypesUtil.is_collection("java.util.HashSet"));
  }
}