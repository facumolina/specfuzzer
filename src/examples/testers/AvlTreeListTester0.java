package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeListTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test001");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test002");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test003");
        DataStructures.AvlTreeList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList0 = new DataStructures.AvlTreeList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test004");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test005");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test006");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test007");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test008");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test009");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test010");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test011");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test012");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test013");
        DataStructures.AvlTreeList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList0 = new DataStructures.AvlTreeList<java.util.List<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test014");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test015");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test016");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test017");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test018");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test019");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test020");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test021");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test022");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test023");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test024");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test025");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test026");
        DataStructures.AvlTreeList<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList0 = new DataStructures.AvlTreeList<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test027");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test028");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test029");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test030");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test031");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test032");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-7), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test033");
        DataStructures.AvlTreeList<java.util.AbstractList<java.lang.Comparable<java.lang.String>>> strComparableListList0 = new DataStructures.AvlTreeList<java.util.AbstractList<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test034");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test035");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test036");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test037");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(10, strComparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test038");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test039");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test040");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test041");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test042");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test043");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test044");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test045");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test046");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test047");
        DataStructures.AvlTreeList<java.io.Serializable> serializableList0 = new DataStructures.AvlTreeList<java.io.Serializable>();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test048");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test049");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test050");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test051");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test052");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test053");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test054");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test055");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test056");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test057");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test058");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-7), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test059");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test060");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(2, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test061");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test062");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test063");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test064");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test065");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test066");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test067");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test068");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test069");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-6), strComparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test070");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test071");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test072");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test073");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test074");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test075");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test076");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test077");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test078");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test079");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test080");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test081");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test082");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test083");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test084");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test085");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test086");
        DataStructures.AvlTreeList<java.lang.Object> objList0 = new DataStructures.AvlTreeList<java.lang.Object>();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test087");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test088");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test089");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test090");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test091");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test092");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test093");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test094");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test095");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test096");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test097");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test098");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test099");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test100");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test101");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test102");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test103");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test104");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test105");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test106");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test107");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test108");
        DataStructures.AvlTreeList<DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>> strComparableListList0 = new DataStructures.AvlTreeList<DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test109");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test110");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test111");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test112");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test113");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test114");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test115");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test116");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test117");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test118");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test119");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test120");
        DataStructures.AvlTreeList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList0 = new DataStructures.AvlTreeList<java.util.Collection<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test121");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test122");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test123");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test124");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test125");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test126");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test127");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test128");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test129");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test130");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test131");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test132");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test133");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test134");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test135");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test136");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test137");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test138");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test139");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test140");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-7), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test141");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test142");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test143");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test144");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test145");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test146");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test147");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test148");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test149");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test150");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test151");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test152");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test153");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test154");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test155");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test156");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test157");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test158");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test159");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test160");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test161");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test162");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test163");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test164");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test165");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test166");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test167");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test168");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test169");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test170");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test171");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(8, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test172");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test173");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test174");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test175");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test176");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test177");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test178");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test179");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test180");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test181");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test182");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test183");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test184");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test185");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test186");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test187");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test188");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test189");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test190");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test191");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test192");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test193");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test194");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test195");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test196");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test197");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test198");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test199");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test200");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test201");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test202");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test203");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test204");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test205");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test206");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test207");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test208");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test209");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test210");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test211");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test212");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test213");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test214");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test215");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test216");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test217");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test218");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test219");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test220");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test221");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test222");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test223");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test224");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test225");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test226");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test227");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test228");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test229");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test230");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test231");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test232");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test233");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test234");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-4), strComparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test235");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test236");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test237");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test238");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test239");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test240");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test241");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test242");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-8), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test243");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test244");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test245");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test246");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test247");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test248");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test249");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test250");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test251");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test252");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test253");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test254");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test255");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test256");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test257");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test258");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test259");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test260");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test261");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test262");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test263");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(9, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test264");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test265");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test266");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test267");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test268");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test269");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test270");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test271");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test272");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test273");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test274");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test275");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test276");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test277");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test278");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test279");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test280");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test281");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test282");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test283");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test284");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test285");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test286");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test287");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test288");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test289");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test290");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test291");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test292");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test293");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test294");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test295");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test296");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test297");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test298");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test299");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test300");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test301");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test302");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test303");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test304");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test305");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test306");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test307");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test308");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test309");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test310");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test311");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test312");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test313");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test314");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test315");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test316");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test317");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test318");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test319");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test320");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test321");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test322");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test323");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test324");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test325");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test326");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test327");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test328");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(5, strComparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test329");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test330");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test331");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test332");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test333");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test334");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test335");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test336");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test337");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test338");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test339");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test340");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test341");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test342");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test343");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test344");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test345");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test346");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test347");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test348");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test349");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-7), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test350");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-7), strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test351");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test352");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-7), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test353");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test354");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test355");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test356");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test357");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test358");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test359");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test360");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test361");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test362");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test363");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test364");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test365");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(3, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test366");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) 'a', strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test367");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test368");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test369");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test370");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test371");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test372");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test373");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test374");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test375");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test376");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test377");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test378");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-6), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test379");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test380");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test381");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test382");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test383");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test384");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test385");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test386");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test387");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test388");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test389");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-7), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test390");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test391");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test392");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test393");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test394");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test395");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test396");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test397");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test398");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test399");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test400");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test401");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test402");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test403");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test404");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test405");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test406");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test407");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test408");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test409");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test410");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test411");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test412");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test413");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test414");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test415");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test416");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test417");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, strComparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test418");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test419");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test420");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test421");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test422");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test423");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test424");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test425");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test426");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test427");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', strComparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test428");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-6), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test429");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test430");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test431");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test432");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test433");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test434");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test435");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test436");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test437");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList2.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test438");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test439");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList2.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test440");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test441");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test442");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test443");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test444");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test445");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test446");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test447");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test448");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test449");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test450");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test451");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList2.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test452");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test453");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test454");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test455");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test456");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test457");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test458");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test459");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test460");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test461");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test462");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test463");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test464");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test465");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(8, strComparable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test466");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test467");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test468");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test469");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test470");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-2), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test471");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test472");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test473");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test474");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test475");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test476");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test477");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test478");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test479");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test480");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test481");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableList0.add(0, strComparable16);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test482");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test483");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test484");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test485");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test486");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test487");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test488");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test489");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test490");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test491");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test492");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test493");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test494");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test495");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test496");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test497");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test498");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test499");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester0.test500");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

