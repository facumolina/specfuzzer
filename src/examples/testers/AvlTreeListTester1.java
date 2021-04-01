package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeListTester1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test501");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test502");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test503");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test504");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test505");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test506");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (byte) 0);
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
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test507");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(7, strComparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test508");
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
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test509");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test510");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 1);
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test511");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test512");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test513");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test514");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test515");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test516");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test517");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test518");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-7), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test519");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test520");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(7, strComparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test521");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test522");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test523");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test524");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test525");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test526");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test527");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test528");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test529");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test530");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test531");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test532");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test533");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (short) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test534");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test535");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test536");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test537");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test538");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
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
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test539");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test540");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test541");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test542");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test543");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test544");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test545");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test546");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test547");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList2.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test548");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList0.remove(0);
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test549");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test550");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        strComparableList2.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-4), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test551");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test552");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-6), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test553");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(9, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test554");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test555");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test556");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test557");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test558");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test559");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test560");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test561");
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
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test562");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test563");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test564");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test565");
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
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test566");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test567");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test568");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test569");
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
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test570");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test571");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test572");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test573");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test574");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test575");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test576");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test577");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test578");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        strComparableList2.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test579");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test580");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test581");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test582");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test583");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test584");
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
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test585");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
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
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test586");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test587");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test588");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test589");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test590");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (byte) 1);
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
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test591");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test592");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove(2);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test593");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test594");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test595");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test596");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test597");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test598");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
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
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test599");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList2.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test600");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test601");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test602");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test603");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test604");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove(2);
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableList0.remove((int) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test605");
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
            strComparableList2.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test606");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test607");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 0);
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
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test608");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test609");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test610");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test611");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(0);
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test612");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test613");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test614");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test615");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test616");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test617");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test618");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        strComparableList2.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test619");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test620");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test621");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test622");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test623");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove((int) (short) 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test624");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test625");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-9), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test626");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test627");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test628");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test629");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test630");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test631");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(9, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test632");
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
            strComparableList0.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test633");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test634");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test635");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test636");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test637");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test638");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test639");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test640");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test641");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test642");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test643");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test644");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test645");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test646");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test647");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test648");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test649");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test650");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList2.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test651");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test652");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test653");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test654");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test655");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test656");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test657");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test658");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test659");
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
            strComparableList0.add(7, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test660");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test661");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test662");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test663");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
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
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test664");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test665");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test666");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test667");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList2.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test668");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (short) 1);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test669");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test670");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test671");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (short) 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test672");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test673");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test674");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test675");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test676");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test677");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test678");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test679");
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
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test680");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(1);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test681");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test682");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test683");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test684");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test685");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test686");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test687");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test688");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test689");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test690");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test691");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test692");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test693");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test694");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test695");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-9), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test696");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test697");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test698");
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
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test699");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-4), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test700");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableList0.add(0, strComparable14);
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
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test701");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(5, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test702");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test703");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test704");
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
            strComparableList2.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test705");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test706");
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
            strComparableList2.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test707");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test708");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(0);
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test709");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-9), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test710");
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
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test711");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test712");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test713");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test714");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test715");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test716");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test717");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test718");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test719");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) ' ', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test720");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test721");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test722");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test723");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test724");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test725");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test726");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test727");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableList0.add(0, strComparable21);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test728");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (short) 1);
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
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test729");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test730");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test731");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test732");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test733");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((int) (byte) 1);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test734");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test735");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(3);
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
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test736");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test737");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test738");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove(1);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test739");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test740");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test741");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
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
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test742");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test743");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (byte) 1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(0);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test744");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(0);
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
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test745");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test746");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add(8, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test747");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-7), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test748");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test749");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test750");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test751");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove(0);
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
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test752");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test753");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test754");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove(0);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test755");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test756");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test757");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 100, strComparable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test758");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test759");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test760");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(6, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable23 = strComparableList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test761");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
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
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test762");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test763");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test764");
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
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test765");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test766");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test767");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test768");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove(0);
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test769");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove((int) (short) 0);
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
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test770");
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
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test771");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(3, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test772");
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
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test773");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add((int) (byte) 0, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test774");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test775");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test776");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        strComparableList1.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test777");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test778");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test779");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test780");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test781");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
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
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test782");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableList0.add(0, strComparable21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test783");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(1);
        strComparableList2.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.replaceAll(strComparableUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test784");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList2.remove((int) (byte) 0);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test785");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test786");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-3), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test787");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test788");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test789");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test790");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-1), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test791");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test792");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test793");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(1);
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test794");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test795");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove(0);
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test796");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test797");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test798");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableList0.add((int) (short) 1, strComparable13);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test799");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(8, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test800");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test801");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test802");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
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
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test803");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test804");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test805");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test806");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test807");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableList2.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test808");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test809");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(1);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableList2.remove(0);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList2.remove(0);
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableList2.remove(0);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test810");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(0);
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
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test811");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test812");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test813");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(6, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test814");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test815");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test816");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test817");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(4, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(6, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((-7), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test818");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((-100), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test819");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test820");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test821");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
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
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test822");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '#', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test823");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(2);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(4, (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test824");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.remove(0);
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = strComparableList2.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test825");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test826");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList0.remove(1);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test827");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableList2.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test828");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test829");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList2.remove(0);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test830");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList0.add((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(1);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(2);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test831");
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableList0.add(1, strComparable5);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList0.remove(0);
        strComparableList0.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList0.remove(1);
        strComparableList0.add(2, (java.lang.Comparable<java.lang.String>) "");
        strComparableList0.add(1, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.add((int) '4', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

