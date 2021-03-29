package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeCachingLinkedListTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test001");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (52) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test002");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-2) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test003");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test004");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test005");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test006");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) (short) 10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test007");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test008");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test009");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test010");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (0) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test011");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test012");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test013");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test014");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test015");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test016");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test017");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test018");
        DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable> serializableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable>();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test019");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test020");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test021");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-5) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test022");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test023");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test024");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (32) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test025");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test026");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test027");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test028");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test029");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test030");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test031");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test032");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test033");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (8) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test034");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test035");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test036");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test037");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((-2));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test038");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test039");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test040");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test041");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test042");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test043");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test044");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (2) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test045");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-7) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test046");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test047");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test048");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((-8));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test049");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test050");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test051");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test052");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test053");
        DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable> serializableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable>(0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test054");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test055");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test056");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test057");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test058");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>((int) (byte) 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test059");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test060");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-10), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test061");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test062");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>(8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test063");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test064");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test065");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test066");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test067");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList0 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test068");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test069");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (8) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test070");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (32) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test071");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test072");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test073");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test074");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test075");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test076");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test077");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (52) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test078");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test079");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test080");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>(8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test081");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test082");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test083");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (0) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test084");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test085");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test086");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test087");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test088");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test089");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-6) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test090");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>((-5));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test091");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (8) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test092");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test093");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test094");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) (short) 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test095");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test096");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-7) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test097");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test098");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test099");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test100");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((int) (short) 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test101");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test102");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test103");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        boolean boolean6 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test104");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test105");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test106");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test107");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test108");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test109");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test110");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((int) (short) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test111");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test112");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test113");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test114");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 0);
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test115");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test116");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test117");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>((-4));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test118");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>((-10));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test119");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test120");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-5) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test121");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test122");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test123");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test124");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.removeLast();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test125");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test126");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test127");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test128");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test129");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test130");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test131");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test132");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>(0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test133");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test134");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test135");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>((int) (byte) 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test136");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (0) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test137");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test138");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test139");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test140");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test141");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test142");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test143");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test144");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test145");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test146");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test147");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test148");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test149");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) (short) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test150");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test151");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test152");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test153");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-6) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test154");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test155");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test156");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test157");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test158");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test159");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>(0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test160");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test161");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (32) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test162");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>(1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test163");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>(8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test164");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test165");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test166");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test167");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test168");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>((-3));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test169");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test170");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>((int) (short) 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test171");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (0) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test172");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test173");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test174");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test175");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeLast();
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test176");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(10);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test177");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test178");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test179");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((-7));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test180");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-2) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test181");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test182");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test183");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test184");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test185");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test186");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test187");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-7));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test188");
        DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable> serializableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable>((int) 'a');
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test189");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test190");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test191");
        DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable> serializableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable>((-4));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test192");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test193");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) '#', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test194");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-7) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test195");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(2);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-3), strComparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test196");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test197");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test198");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-100) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test199");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test200");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test201");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test202");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test203");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test204");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test205");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test206");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test207");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableList0.addLast(strComparable10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test208");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test209");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test210");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test211");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-9), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test212");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test213");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test214");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test215");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test216");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test217");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test218");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test219");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test220");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test221");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test222");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableList1.addLast(strComparable4);
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.removeLast();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test223");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) -1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test224");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test225");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((int) (byte) 10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test226");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test227");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test228");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-2), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-2) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test229");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test230");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test231");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test232");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test233");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test234");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test235");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test236");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test237");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test238");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test239");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test240");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test241");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
        boolean boolean9 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test242");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test243");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test244");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test245");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-6));
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-10), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test246");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test247");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test248");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test249");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test250");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test251");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        boolean boolean17 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test252");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test253");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>((int) (byte) -1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test254");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test255");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test256");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableList1.addLast(strComparable4);
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-1), strComparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test257");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test258");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test259");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test260");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test261");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test262");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test263");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test264");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test265");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test266");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test267");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test268");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test269");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test270");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test271");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test272");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        boolean boolean19 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test273");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test274");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test275");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test276");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test277");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test278");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test279");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test280");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test281");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        boolean boolean19 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test282");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test283");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((-7));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test284");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test285");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test286");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test287");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test288");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test289");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test290");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(7, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test291");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test292");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>((-100));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test293");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>(10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test294");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test295");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(4);
        strComparableList1.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test296");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>(1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test297");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((int) (short) 1);
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test298");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test299");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test300");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test301");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove(0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test302");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test303");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test304");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), strComparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test305");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test306");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>((-2));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test307");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (0) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test308");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test309");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(4);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test310");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test311");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
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
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test312");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test313");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((-5));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test314");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test315");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-10), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test316");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test317");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove(1);
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test318");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test319");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test320");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test321");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test322");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        boolean boolean19 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test323");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test324");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(2);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test325");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test326");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test327");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        boolean boolean3 = strComparableList1.addLast(strComparable2);
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test328");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>(2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test329");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test330");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test331");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>(7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test332");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test333");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test334");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test335");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test336");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test337");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        boolean boolean19 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test338");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test339");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test340");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        boolean boolean17 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test341");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test342");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>((int) (short) 1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test343");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test344");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test345");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test346");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test347");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>((int) (short) -1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test348");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test349");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test350");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList0 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test351");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(100);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test352");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test353");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test354");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test355");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test356");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        boolean boolean19 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test357");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-6) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test358");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test359");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.removeFirst();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test360");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-6) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test361");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test362");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test363");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test364");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test365");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test366");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test367");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableList0.addFirst(strComparable9);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test368");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test369");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test370");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test371");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (32) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test372");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test373");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test374");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test375");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(3);
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test376");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test377");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (8) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test378");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test379");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test380");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>((int) '4');
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test381");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test382");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test383");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (52) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test384");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test385");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test386");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test387");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableList0.addLast(strComparable7);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test388");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-9));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test389");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test390");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test391");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test392");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
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
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test393");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-6) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test394");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test395");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test396");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        boolean boolean14 = strComparableList0.addFirst(strComparable13);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeLast();
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
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test397");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test398");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test399");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test400");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (3) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test401");
        DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable> serializableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable>((int) '#');
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test402");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test403");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test404");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        boolean boolean6 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test405");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test406");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test407");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test408");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test409");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test410");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeFirst();
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableList1.addFirst(strComparable12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test411");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((int) (short) -1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test412");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (2) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test413");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test414");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test415");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((int) (short) 1);
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList1.removeFirst();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test416");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test417");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test418");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test419");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.removeFirst();
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test420");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test421");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test422");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test423");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test424");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(100);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test425");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test426");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(4, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test427");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test428");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test429");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        boolean boolean19 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test430");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.removeLast();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test431");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test432");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>(100);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test433");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test434");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test435");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test436");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-5) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test437");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-5) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test438");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test439");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((int) (byte) 1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test440");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList1.removeLast();
        boolean boolean12 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test441");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test442");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (52) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test443");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test444");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.removeFirst();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test445");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test446");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>(0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test447");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test448");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList0.remove((int) (byte) 0);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test449");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test450");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test451");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.removeFirst();
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test452");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test453");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test454");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test455");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test456");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test457");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>(9);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test458");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test459");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test460");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test461");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test462");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test463");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test464");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test465");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test466");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test467");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test468");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test469");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test470");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test471");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableList1.addFirst(strComparable12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test472");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-7));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test473");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test474");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test475");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (32) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test476");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((int) (short) 1);
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList1.removeLast();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test477");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-7));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test478");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableList1.addLast(strComparable4);
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test479");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test480");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.Collection<java.lang.Comparable<java.lang.String>>>((-3));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test481");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test482");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test483");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>(0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test484");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) (byte) 1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test485");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (52) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test486");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test487");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test488");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeLast();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test489");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(5);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test490");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test491");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList1.remove((int) (short) 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test492");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        boolean boolean6 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test493");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test494");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test495");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        boolean boolean8 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test496");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-4) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test497");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test498");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test499");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) 'a');
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester0.test500");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-3));
    }
}

