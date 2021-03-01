package grammar;

import DataStructures.AvlTreeList;
import DataStructures.List;
import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Tests for class JavaTypesUtil
 */
public class JavaTypesUtilTest {

  @Test
  public void arg_types_list() {
    Set<String> list_arg_types = JavaTypesUtil.all_arguments_types(List.class);
    assertTrue(list_arg_types.size()==1);
    assertTrue(list_arg_types.contains(JavaTypesUtil.INTEGER));
  }

  @Test
  public void arg_types_avltreelist() {
    Set<String> avltree_arg_types = JavaTypesUtil.all_arguments_types(AvlTreeList.class);
    assertTrue(avltree_arg_types.size()==22);
    assertTrue(avltree_arg_types.contains(JavaTypesUtil.INTEGER));
    assertTrue(avltree_arg_types.contains(JavaTypesUtil.OBJECT));
  }

}