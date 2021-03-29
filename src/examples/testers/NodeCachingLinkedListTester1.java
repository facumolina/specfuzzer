package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeCachingLinkedListTester1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test501");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>((int) (short) 100);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test502");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test503");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test504");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test505");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableList0.addLast(strComparable12);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test506");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList1.removeLast();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test507");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
        boolean boolean9 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test508");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test509");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test510");
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test511");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeLast();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test512");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableList0.addFirst(strComparable9);
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test513");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test514");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test515");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.removeLast();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test516");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (3) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test517");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>((int) (short) 10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test518");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        boolean boolean6 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.remove(0);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test519");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(4);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(5, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test520");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test521");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) '#');
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test522");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeFirst();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test523");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test524");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (3) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test525");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test526");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>(10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test527");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeLast();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test528");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test529");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test530");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test531");
        DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable> serializableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.io.Serializable>((-6));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test532");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test533");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableList0.addFirst(strComparable15);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test534");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test535");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(8);
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
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test536");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test537");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test538");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test539");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (byte) 0, strComparable13);
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
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test540");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.removeFirst();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test541");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test542");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test543");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.remove((int) (short) 1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test544");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test545");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-100));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-6) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test546");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test547");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-7));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (0) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test548");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test549");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableList0.addFirst(strComparable9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (32) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test550");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test551");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test552");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test553");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeFirst();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test554");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test555");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test556");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-10));
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test557");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (short) 0);
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
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test558");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) -1);
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
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test559");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test560");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
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
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test561");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test562");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test563");
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
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test564");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test565");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test566");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList1.removeFirst();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test567");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test568");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableList1.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList1.removeLast();
        boolean boolean12 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList1.removeLast();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test569");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-7), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-7) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test570");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.AbstractLinkedList<java.lang.Comparable<java.lang.String>>>((-7));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test571");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test572");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>(9);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test573");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeFirst();
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test574");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test575");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(4);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test576");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test577");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test578");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test579");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test580");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>(10);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test581");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
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
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test582");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test583");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
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
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test584");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test585");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test586");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test587");
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
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test588");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>(4);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test589");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test590");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeFirst();
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList1.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-10), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test591");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        boolean boolean14 = strComparableList0.addLast(strComparable13);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test592");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test593");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (4) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test594");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test595");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test596");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (5).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test597");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test598");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test599");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
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
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test600");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test601");
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
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableList0.addLast(strComparable15);
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
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test602");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-2) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test603");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test604");
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
        boolean boolean21 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test605");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test606");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
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
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test607");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeFirst();
        boolean boolean6 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test608");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
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
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test609");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.removeFirst();
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
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test610");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test611");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(7);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(7, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test612");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-2) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test613");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeLast();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test614");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-7));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove((int) (byte) 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test615");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove((int) (short) 1);
        boolean boolean11 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (4).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test616");
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
        boolean boolean16 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test617");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (3) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test618");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(2);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(7, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test619");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeLast();
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test620");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.removeLast();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test621");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-7));
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.removeLast();
        boolean boolean6 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test622");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.removeLast();
        boolean boolean5 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test623");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.removeFirst();
        boolean boolean17 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test624");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test625");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeLast();
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test626");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.removeLast();
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.removeFirst();
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test627");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test628");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-8));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test629");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test630");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>(1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test631");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test632");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test633");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-8) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test634");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        boolean boolean10 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test635");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeFirst();
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test636");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test637");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.remove(1);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test638");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-5), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-5) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test639");
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
        boolean boolean16 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test640");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test641");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test642");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeLast();
        boolean boolean8 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList0.removeFirst();
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (100) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test643");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.removeLast();
        boolean boolean13 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test644");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test645");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(8);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test646");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeLast();
        boolean boolean7 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.removeLast();
        boolean boolean10 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableList0.addLast(strComparable11);
        boolean boolean14 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test647");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(3);
        boolean boolean3 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test648");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        boolean boolean4 = strComparableList0.addFirst(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList0.removeFirst();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.removeFirst();
    }
}

