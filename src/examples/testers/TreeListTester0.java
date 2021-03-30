package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeListTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test001");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) 'a', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test002");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-9), "", (-3), objList3, (byte) 0, 7, 9, false, 0.0f, 10.0d, (-1L) };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList12.replaceAll(objUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test003");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test004");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objList2.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test005");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList2.replaceAll(objUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test006");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test007");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test008");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) "hi!");
        boolean boolean5 = objList1.removeElem((java.lang.Object) true);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList9, objArray8);
        java.lang.Object obj12 = objList9.remove((int) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-4), boolean5, 1L, (short) 0, (short) -1, (byte) 1, 1, (short) 100, (-2), (byte) 0, 10.0d, (short) -1, 1, (-1.0d), 0.0d, 0, 100.0d, true, (byte) 1, boolean32, 10L, 0L, 10, 0.0d, 0, (-6), (-1), '4', 2, (-1.0d), obj43, 9, (-5), (-10), 'a' };
        java.util.ArrayList<java.lang.Object> objList49 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList49, objArray48);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator51 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList49.replaceAll(objUnaryOperator51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test009");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test010");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test011");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test012");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test013");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test014");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test015");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test016");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test017");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test018");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test019");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test020");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test021");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test022");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-5), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test023");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test024");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test025");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        // The following exception was thrown during execution in test generation
        try {
            objList62.add((-6), (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=36");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test026");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test027");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test028");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test029");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-4), (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test030");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test031");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList2.add((-6), (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test032");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList2.add(100, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test033");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test034");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test035");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test036");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test037");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test038");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test039");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test040");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test041");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test042");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test043");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList4.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test044");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList6.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList13 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean14 = objList6.removeElem((java.lang.Object) objCollectionList13);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test045");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test046");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test047");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test048");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test049");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList17 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean18 = objList10.removeElem((java.lang.Object) objCollectionList17);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(4, (java.lang.Object) objCollectionList17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test050");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test051");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test052");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test053");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test054");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test055");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test056");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test057");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList2.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 10, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test058");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean16 = objList12.removeElem((java.lang.Object) (-4));
        java.lang.Object obj17 = null;
        boolean boolean18 = objList12.removeElem(obj17);
        boolean boolean20 = objList12.removeElem((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) '#', (java.lang.Object) objList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test059");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) (byte) 0);
        boolean boolean14 = objList10.removeElem((java.lang.Object) (-4));
        boolean boolean16 = objList10.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test060");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test061");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test062");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList17 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean18 = objList10.removeElem((java.lang.Object) objCollectionList17);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) 1, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test063");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test064");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test065");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test066");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test067");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test068");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test069");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) (byte) 0);
        boolean boolean14 = objList10.removeElem((java.lang.Object) (byte) 100);
        boolean boolean16 = objList10.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 0L);
        boolean boolean22 = objList10.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test070");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-3), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test071");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList16 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) objListList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test072");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>> objIterableList8 = new DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) objIterableList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test073");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-100), (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test074");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        boolean boolean20 = objList14.removeElem((java.lang.Object) 4);
        boolean boolean22 = objList14.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test075");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test076");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test077");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objList0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test078");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test079");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objList2.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test080");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test081");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test082");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test083");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test084");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test085");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test086");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test087");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test088");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList13.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test089");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test090");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test091");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test092");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test093");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = objList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test094");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test095");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test096");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.lang.Object obj14 = objList11.remove((int) (short) 0);
        boolean boolean15 = objList0.removeElem(obj14);
        boolean boolean17 = objList0.removeElem((java.lang.Object) 1.0f);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test097");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test098");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test099");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test100");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test101");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.lang.Object obj14 = objList11.remove((int) (short) 0);
        boolean boolean15 = objList0.removeElem(obj14);
        boolean boolean17 = objList0.removeElem((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test102");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.Object>> objListList15 = new DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) objListList15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test103");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList7.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test104");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        boolean boolean28 = objList22.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-8), (java.lang.Object) objList22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test105");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test106");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test107");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.Object>> objListList8 = new DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) -1, (java.lang.Object) objListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test108");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test109");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test110");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean21 = objList17.removeElem((java.lang.Object) (byte) 100);
        boolean boolean23 = objList17.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList17.removeElem((java.lang.Object) 0L);
        objList17.add(0, (java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(8, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test111");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.lang.Object obj14 = objList11.remove((int) (short) 0);
        boolean boolean15 = objList0.removeElem(obj14);
        boolean boolean17 = objList0.removeElem((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test112");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test113");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test114");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList10.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test115");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test116");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test117");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList7.replaceAll(objUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test118");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test119");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-5), obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test120");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test121");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean36 = objList26.removeElem((java.lang.Object) objList33);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add((-2), (java.lang.Object) objList33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test122");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        boolean boolean13 = objList9.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList9.removeElem((java.lang.Object) boolean16);
        boolean boolean19 = objList9.removeElem((java.lang.Object) (short) 0);
        boolean boolean20 = objList6.removeElem((java.lang.Object) objList9);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) '#', (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test123");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objList5.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test124");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test125");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test126");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        java.lang.Object obj19 = null;
        boolean boolean20 = objList10.removeElem(obj19);
        objList10.add((int) (short) 0, (java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) objList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test127");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) (byte) 0);
        boolean boolean22 = objList18.removeElem((java.lang.Object) (-4));
        boolean boolean24 = objList18.removeElem((java.lang.Object) (short) 0);
        boolean boolean25 = objList11.removeElem((java.lang.Object) objList18);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) -1, (java.lang.Object) objList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test128");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test129");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test130");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(4, (java.lang.Object) charSequenceList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test131");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 1L);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (-1.0d));
        boolean boolean18 = objList6.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) 1L);
        boolean boolean30 = objList24.removeElem((java.lang.Object) (-1.0d));
        boolean boolean31 = objList19.removeElem((java.lang.Object) objList24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "hi!");
        boolean boolean36 = objList32.removeElem((java.lang.Object) true);
        boolean boolean38 = objList32.removeElem((java.lang.Object) 4);
        boolean boolean40 = objList32.removeElem((java.lang.Object) 1);
        boolean boolean42 = objList32.removeElem((java.lang.Object) 10);
        boolean boolean43 = objList24.removeElem((java.lang.Object) objList32);
        boolean boolean44 = objList11.removeElem((java.lang.Object) objList32);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) boolean44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test132");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(8, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test133");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test134");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test135");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (short) 0);
        boolean boolean22 = objList7.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = objList11.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test136");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objList5.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test137");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) '4');
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test138");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        objList0.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test139");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        boolean boolean14 = objList8.removeElem((java.lang.Object) 4);
        objList8.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList19.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList19.removeElem((java.lang.Object) 100.0d);
        objList8.add(1, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-4), (java.lang.Object) objList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test140");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) (short) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test141");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test142");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test143");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test144");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-3), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test145");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList9.removeElem(obj14);
        boolean boolean16 = objList0.removeElem((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test146");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 1L);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (-1.0d));
        boolean boolean18 = objList6.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) 1L);
        boolean boolean30 = objList24.removeElem((java.lang.Object) (-1.0d));
        boolean boolean31 = objList19.removeElem((java.lang.Object) objList24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "hi!");
        boolean boolean36 = objList32.removeElem((java.lang.Object) true);
        boolean boolean38 = objList32.removeElem((java.lang.Object) 4);
        boolean boolean40 = objList32.removeElem((java.lang.Object) 1);
        boolean boolean42 = objList32.removeElem((java.lang.Object) 10);
        boolean boolean43 = objList24.removeElem((java.lang.Object) objList32);
        boolean boolean44 = objList11.removeElem((java.lang.Object) objList32);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) boolean44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test147");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        java.lang.Object obj9 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList10.removeElem((java.lang.Object) true);
        boolean boolean16 = objList10.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean34 = objList30.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "");
        boolean boolean51 = objList47.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList54 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) "hi!");
        boolean boolean59 = objList55.removeElem((java.lang.Object) true);
        boolean boolean61 = objList55.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList67 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList68 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray69 = new java.lang.Object[] { (-1), obj9, objList10, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList24, 1.0d, (short) 1, objList27, (-4), (-4), boolean34, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList54, boolean61, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList67, objCollectionList68 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList70, objArray69);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = objList72.removeElem((java.lang.Object) "");
        boolean boolean75 = objList70.removeElem((java.lang.Object) boolean74);
        boolean boolean77 = objList70.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) 'a', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test148");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objList5.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test149");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test150");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList17.removeElem((java.lang.Object) boolean24);
        boolean boolean27 = objList17.removeElem((java.lang.Object) (short) 0);
        boolean boolean28 = objList14.removeElem((java.lang.Object) objList17);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) objList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test151");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test152");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test153");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test154");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList11.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test155");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 1L);
        boolean boolean19 = objList13.removeElem((java.lang.Object) (-1.0d));
        boolean boolean20 = objList8.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) 100, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test156");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList11.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test157");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = objList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test158");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test159");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test160");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList5.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test161");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test162");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test163");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        objList0.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test164");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 10, (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test165");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test166");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test167");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        objList10.add(0, (java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = objList10.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test168");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test169");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList16.removeElem((java.lang.Object) true);
        boolean boolean22 = objList16.removeElem((java.lang.Object) 4);
        objList16.add(0, (java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) -1, (java.lang.Object) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test170");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add((int) (byte) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test171");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(1, (java.lang.Object) objList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test172");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList10.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList10.removeElem((java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 1, (java.lang.Object) objList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test173");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test174");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        objList10.add(0, (java.lang.Object) (-1L));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList10.replaceAll(objUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test175");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        objList11.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList0.add((int) (short) 0, (java.lang.Object) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test176");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test177");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test178");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test179");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test180");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) 100.0d);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test181");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test182");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test183");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-100), (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test184");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-10));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "hi!");
        boolean boolean22 = objList18.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList18.removeElem((java.lang.Object) boolean25);
        boolean boolean28 = objList18.removeElem((java.lang.Object) (-9));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test185");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList7.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test186");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test187");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test188");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        objList0.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objList0.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test189");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.String> strList18 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) '#', (java.lang.Object) strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test190");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test191");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test192");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        boolean boolean44 = objList40.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            objList26.add(1, (java.lang.Object) objList40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test193");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        boolean boolean18 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean19 = objList5.removeElem((java.lang.Object) objList8);
        boolean boolean20 = objList0.removeElem((java.lang.Object) boolean19);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 10, (java.lang.Object) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test194");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test195");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        boolean boolean12 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 0L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-5));
        boolean boolean22 = objList14.removeElem((java.lang.Object) (-8));
        java.lang.Object obj23 = null;
        boolean boolean24 = objList14.removeElem(obj23);
        objList14.add((int) (short) 0, (java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test196");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList56 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean57 = objList49.removeElem((java.lang.Object) objCollectionList56);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) (byte) 0);
        boolean boolean62 = objList58.removeElem((java.lang.Object) (-4));
        java.lang.Object obj63 = null;
        boolean boolean64 = objList58.removeElem(obj63);
        boolean boolean65 = objList49.removeElem((java.lang.Object) boolean64);
        boolean boolean66 = objList0.removeElem((java.lang.Object) objList49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = objList49.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test197");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test198");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add(2, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test199");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator70 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test200");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList7.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test201");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = objList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test202");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.lang.Object obj20 = objList17.remove((int) (short) 0);
        boolean boolean21 = objList0.removeElem((java.lang.Object) objList17);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList17.replaceAll(objUnaryOperator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test203");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objList5.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test204");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test205");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.lang.Object obj20 = objList17.remove((int) (short) 0);
        boolean boolean21 = objList0.removeElem((java.lang.Object) objList17);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test206");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test207");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) 1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test208");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test209");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        objList10.add(0, (java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            objList10.add((-1), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test210");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList12.removeElem((java.lang.Object) boolean19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "");
        boolean boolean30 = objList26.removeElem((java.lang.Object) 1L);
        boolean boolean32 = objList26.removeElem((java.lang.Object) (-1.0d));
        boolean boolean33 = objList21.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "");
        boolean boolean38 = objList34.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 1L);
        boolean boolean45 = objList39.removeElem((java.lang.Object) (-1.0d));
        boolean boolean46 = objList34.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) 4);
        boolean boolean55 = objList47.removeElem((java.lang.Object) 1);
        boolean boolean57 = objList47.removeElem((java.lang.Object) 10);
        boolean boolean58 = objList39.removeElem((java.lang.Object) objList47);
        boolean boolean59 = objList26.removeElem((java.lang.Object) objList47);
        boolean boolean60 = objList12.removeElem((java.lang.Object) objList47);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList61 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = objList61.removeElem((java.lang.Object) "");
        boolean boolean65 = objList61.removeElem((java.lang.Object) 0L);
        boolean boolean67 = objList61.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList68 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean69 = objList61.removeElem((java.lang.Object) objCollectionList68);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        java.lang.Object obj75 = null;
        boolean boolean76 = objList70.removeElem(obj75);
        boolean boolean77 = objList61.removeElem((java.lang.Object) boolean76);
        boolean boolean78 = objList12.removeElem((java.lang.Object) objList61);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) objList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test211");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test212");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test213");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean22 = objList14.removeElem((java.lang.Object) boolean21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.Object obj28 = objList25.remove((int) (short) 0);
        boolean boolean29 = objList14.removeElem(obj28);
        boolean boolean31 = objList14.removeElem((java.lang.Object) 1.0f);
        boolean boolean32 = objList0.removeElem((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test214");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-6));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test215");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test216");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList13.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test217");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean16 = objList12.removeElem((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test218");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 1L);
        boolean boolean19 = objList13.removeElem((java.lang.Object) (-1.0d));
        boolean boolean20 = objList8.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) -1, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test219");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        boolean boolean18 = objList8.removeElem((java.lang.Object) (-9));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test220");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test221");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test222");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test223");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-100), (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test224");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.Object>> objCollectionList16 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) 1, (java.lang.Object) objCollectionList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test225");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) '#', (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test226");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean10 = objList4.removeElem((java.lang.Object) (byte) 0);
        objList4.add((int) (byte) 0, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) -1, (java.lang.Object) objList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test227");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList8 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean9 = objList0.removeElem((java.lang.Object) objCollectionList8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test228");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test229");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList4.removeElem((java.lang.Object) (-4));
        boolean boolean10 = objList4.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) -1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test230");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "hi!");
        boolean boolean10 = objList6.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList6.removeElem((java.lang.Object) boolean13);
        boolean boolean16 = objList6.removeElem((java.lang.Object) (-9));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test231");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList26.replaceAll(objUnaryOperator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test232");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test233");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test234");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        boolean boolean69 = objList62.removeElem((java.lang.Object) 100);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator70 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test235");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList24.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList24.removeElem((java.lang.Object) boolean31);
        boolean boolean34 = objList24.removeElem((java.lang.Object) (short) 0);
        boolean boolean35 = objList21.removeElem((java.lang.Object) objList24);
        boolean boolean37 = objList21.removeElem((java.lang.Object) 10);
        boolean boolean38 = objList0.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.util.List<java.lang.Object>> objListList40 = new DataStructures.commonscollections.TreeList<java.util.List<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList21.add((-1), (java.lang.Object) objListList40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test236");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (short) 0);
        boolean boolean22 = objList7.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList24.removeElem((java.lang.Object) true);
        boolean boolean30 = objList24.removeElem((java.lang.Object) 4);
        objList24.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) (byte) 0);
        boolean boolean39 = objList35.removeElem((java.lang.Object) (-4));
        boolean boolean41 = objList35.removeElem((java.lang.Object) 1L);
        objList35.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList24.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList24.add((int) (short) 0, (java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            objList11.add((int) (short) 1, (java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test237");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean21 = objList17.removeElem((java.lang.Object) (-4));
        boolean boolean23 = objList17.removeElem((java.lang.Object) 1L);
        boolean boolean25 = objList17.removeElem((java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            objList5.add(8, (java.lang.Object) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test238");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test239");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) (byte) 0);
        boolean boolean14 = objList10.removeElem((java.lang.Object) (-4));
        boolean boolean16 = objList10.removeElem((java.lang.Object) 1L);
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 100, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test240");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        objList12.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) 1L);
        objList23.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList12.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList12.add((int) (short) 0, (java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test241");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList12.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test242");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test243");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test244");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList10.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList10.removeElem((java.lang.Object) boolean17);
        boolean boolean20 = objList10.removeElem((java.lang.Object) (-9));
        boolean boolean22 = objList10.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) ' ', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test245");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test246");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.io.Serializable> serializableList6 = new DataStructures.commonscollections.TreeList<java.io.Serializable>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) -1, (java.lang.Object) serializableList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test247");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        java.lang.Object obj12 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "");
        boolean boolean54 = objList50.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList57 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "hi!");
        boolean boolean62 = objList58.removeElem((java.lang.Object) true);
        boolean boolean64 = objList58.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList71 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1), obj12, objList13, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList27, 1.0d, (short) 1, objList30, (-4), (-4), boolean37, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList57, boolean64, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList70, objCollectionList71 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList73, objArray72);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "");
        boolean boolean78 = objList73.removeElem((java.lang.Object) boolean77);
        java.lang.Object obj80 = objList73.remove(7);
        java.lang.Object obj82 = objList73.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(2, obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test248");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList16.removeElem((java.lang.Object) true);
        boolean boolean22 = objList16.removeElem((java.lang.Object) 4);
        objList16.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) (byte) 0);
        boolean boolean31 = objList27.removeElem((java.lang.Object) (-4));
        boolean boolean33 = objList27.removeElem((java.lang.Object) 1L);
        objList27.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList16.add((int) (short) 0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        boolean boolean45 = objList39.removeElem((java.lang.Object) (-5));
        boolean boolean47 = objList39.removeElem((java.lang.Object) (-8));
        objList16.add((int) (byte) 0, (java.lang.Object) boolean47);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add((int) (short) -1, (java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test249");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) (byte) 0);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (byte) 0);
        objList16.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean26 = objList7.removeElem((java.lang.Object) objList16);
        boolean boolean27 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator28 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList7.replaceAll(objUnaryOperator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test250");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test251");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test252");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-10), (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test253");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        boolean boolean15 = objList9.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) (short) 0);
        boolean boolean23 = objList9.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList8.removeElem((java.lang.Object) objList9);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) 'a', (java.lang.Object) objList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test254");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test255");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList56 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean57 = objList49.removeElem((java.lang.Object) objCollectionList56);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) (byte) 0);
        boolean boolean62 = objList58.removeElem((java.lang.Object) (-4));
        java.lang.Object obj63 = null;
        boolean boolean64 = objList58.removeElem(obj63);
        boolean boolean65 = objList49.removeElem((java.lang.Object) boolean64);
        boolean boolean66 = objList0.removeElem((java.lang.Object) objList49);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test256");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "hi!");
        boolean boolean10 = objList6.removeElem((java.lang.Object) true);
        objList0.add(0, (java.lang.Object) boolean10);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test257");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList15.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList15.removeElem((java.lang.Object) boolean22);
        boolean boolean25 = objList15.removeElem((java.lang.Object) (-9));
        boolean boolean26 = objList3.removeElem((java.lang.Object) objList15);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList15.replaceAll(objUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test258");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList9.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test259");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test260");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        objList0.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList10.removeElem((java.lang.Object) true);
        boolean boolean16 = objList10.removeElem((java.lang.Object) 4);
        objList10.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (-4));
        boolean boolean27 = objList21.removeElem((java.lang.Object) 1L);
        objList21.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList10.add((int) (short) 0, (java.lang.Object) (byte) 1);
        boolean boolean32 = objList0.removeElem((java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        boolean boolean40 = objList34.removeElem((java.lang.Object) 4);
        objList34.add(0, (java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-3), (java.lang.Object) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test261");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean23 = objList13.removeElem((java.lang.Object) objList20);
        boolean boolean24 = objList8.removeElem((java.lang.Object) objList20);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(2, (java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test262");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList56 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean57 = objList49.removeElem((java.lang.Object) objCollectionList56);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) (byte) 0);
        boolean boolean62 = objList58.removeElem((java.lang.Object) (-4));
        java.lang.Object obj63 = null;
        boolean boolean64 = objList58.removeElem(obj63);
        boolean boolean65 = objList49.removeElem((java.lang.Object) boolean64);
        boolean boolean66 = objList0.removeElem((java.lang.Object) objList49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = objList49.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test263");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test264");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList7.replaceAll(objUnaryOperator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test265");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test266");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test267");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test268");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 1L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-1.0d));
        boolean boolean24 = objList12.removeElem((java.lang.Object) objList17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "");
        boolean boolean29 = objList25.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean34 = objList30.removeElem((java.lang.Object) 1L);
        boolean boolean36 = objList30.removeElem((java.lang.Object) (-1.0d));
        boolean boolean37 = objList25.removeElem((java.lang.Object) objList30);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean40 = objList38.removeElem((java.lang.Object) "hi!");
        boolean boolean42 = objList38.removeElem((java.lang.Object) true);
        boolean boolean44 = objList38.removeElem((java.lang.Object) 4);
        boolean boolean46 = objList38.removeElem((java.lang.Object) 1);
        boolean boolean48 = objList38.removeElem((java.lang.Object) 10);
        boolean boolean49 = objList30.removeElem((java.lang.Object) objList38);
        boolean boolean50 = objList17.removeElem((java.lang.Object) objList38);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) boolean50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test269");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test270");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test271");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList50.removeElem((java.lang.Object) 100.0d);
        objList39.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        boolean boolean67 = objList63.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList63.removeElem((java.lang.Object) boolean70);
        boolean boolean73 = objList63.removeElem((java.lang.Object) (short) 0);
        boolean boolean74 = objList60.removeElem((java.lang.Object) objList63);
        boolean boolean76 = objList60.removeElem((java.lang.Object) 10);
        boolean boolean77 = objList39.removeElem((java.lang.Object) objList60);
        boolean boolean78 = objList26.removeElem((java.lang.Object) objList39);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator79 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList26.replaceAll(objUnaryOperator79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test272");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) (-3));
        boolean boolean19 = objList13.removeElem((java.lang.Object) 6);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test273");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList7.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test274");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        boolean boolean16 = objList3.removeElem((java.lang.Object) 1.0f);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList3.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test275");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test276");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList15.removeElem((java.lang.Object) (-4));
        boolean boolean21 = objList15.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) (byte) 0);
        boolean boolean26 = objList22.removeElem((java.lang.Object) (-4));
        boolean boolean28 = objList22.removeElem((java.lang.Object) (short) 0);
        boolean boolean29 = objList15.removeElem((java.lang.Object) objList22);
        boolean boolean30 = objList14.removeElem((java.lang.Object) objList15);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) objList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test277");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 1L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-1.0d));
        boolean boolean23 = objList11.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList7.removeElem((java.lang.Object) objList16);
        // The following exception was thrown during execution in test generation
        try {
            objList16.add((int) (short) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test278");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList1.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test279");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (-5));
        objList11.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 0L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-5));
        boolean boolean29 = objList21.removeElem((java.lang.Object) (-8));
        boolean boolean30 = objList11.removeElem((java.lang.Object) objList21);
        boolean boolean32 = objList11.removeElem((java.lang.Object) 0);
        boolean boolean33 = objList0.removeElem((java.lang.Object) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test280");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList62.removeElem((java.lang.Object) objList70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = objList70.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test281");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList62.removeElem((java.lang.Object) objList70);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator72 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList70.replaceAll(objUnaryOperator72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test282");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList7.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test283");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        objList31.add(0, (java.lang.Object) 10.0f);
        boolean boolean41 = objList26.removeElem((java.lang.Object) objList31);
        objList13.add(0, (java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = objList26.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test284");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        boolean boolean12 = objList0.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test285");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        boolean boolean83 = objList77.removeElem((java.lang.Object) (short) 0);
        boolean boolean84 = objList70.removeElem((java.lang.Object) objList77);
        boolean boolean85 = objList62.removeElem((java.lang.Object) objList70);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator86 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test286");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList13.replaceAll(objUnaryOperator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test287");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        objList12.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) 1L);
        objList23.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList12.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList0.add(0, (java.lang.Object) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test288");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList9.replaceAll(objUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test289");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "");
        boolean boolean54 = objList50.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) "");
        boolean boolean59 = objList55.removeElem((java.lang.Object) 1L);
        boolean boolean61 = objList55.removeElem((java.lang.Object) (-1.0d));
        boolean boolean62 = objList50.removeElem((java.lang.Object) objList55);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "");
        boolean boolean67 = objList63.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "");
        boolean boolean72 = objList68.removeElem((java.lang.Object) 1L);
        boolean boolean74 = objList68.removeElem((java.lang.Object) (-1.0d));
        boolean boolean75 = objList63.removeElem((java.lang.Object) objList68);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = objList76.removeElem((java.lang.Object) "hi!");
        boolean boolean80 = objList76.removeElem((java.lang.Object) true);
        boolean boolean82 = objList76.removeElem((java.lang.Object) 4);
        boolean boolean84 = objList76.removeElem((java.lang.Object) 1);
        boolean boolean86 = objList76.removeElem((java.lang.Object) 10);
        boolean boolean87 = objList68.removeElem((java.lang.Object) objList76);
        boolean boolean88 = objList55.removeElem((java.lang.Object) objList76);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) objList55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test290");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList9.removeElem(obj14);
        boolean boolean16 = objList0.removeElem((java.lang.Object) boolean15);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 0L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-5));
        objList18.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        boolean boolean34 = objList28.removeElem((java.lang.Object) (-5));
        boolean boolean36 = objList28.removeElem((java.lang.Object) (-8));
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList28);
        objList28.add(0, (java.lang.Object) (-1L));
        objList0.add(0, (java.lang.Object) objList28);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator42 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList28.replaceAll(objUnaryOperator42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test291");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-3));
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList11.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test292");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test293");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        boolean boolean23 = objList17.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean27 = objList17.removeElem((java.lang.Object) objList24);
        boolean boolean28 = objList0.removeElem((java.lang.Object) objList24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 0L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-5));
        boolean boolean37 = objList29.removeElem((java.lang.Object) 1L);
        boolean boolean39 = objList29.removeElem((java.lang.Object) (-1));
        boolean boolean40 = objList24.removeElem((java.lang.Object) boolean39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList24.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test294");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList15.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList15.removeElem((java.lang.Object) boolean22);
        boolean boolean25 = objList15.removeElem((java.lang.Object) (-9));
        boolean boolean26 = objList3.removeElem((java.lang.Object) objList15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = objList3.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test295");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "");
        boolean boolean7 = objList3.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 1L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-1.0d));
        boolean boolean15 = objList3.removeElem((java.lang.Object) objList8);
        boolean boolean17 = objList8.removeElem((java.lang.Object) true);
        boolean boolean18 = objList0.removeElem((java.lang.Object) boolean17);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test296");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test297");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test298");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        objList12.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) 1L);
        objList23.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList12.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList0.add(0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) (byte) 0);
        boolean boolean40 = objList36.removeElem((java.lang.Object) (-4));
        boolean boolean42 = objList36.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) (byte) 0);
        boolean boolean47 = objList43.removeElem((java.lang.Object) (-4));
        boolean boolean49 = objList43.removeElem((java.lang.Object) (short) 0);
        boolean boolean50 = objList36.removeElem((java.lang.Object) objList43);
        boolean boolean51 = objList35.removeElem((java.lang.Object) objList36);
        boolean boolean52 = objList0.removeElem((java.lang.Object) boolean51);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator53 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test299");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList9.removeElem(obj14);
        boolean boolean16 = objList0.removeElem((java.lang.Object) boolean15);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 0L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-5));
        objList18.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        boolean boolean34 = objList28.removeElem((java.lang.Object) (-5));
        boolean boolean36 = objList28.removeElem((java.lang.Object) (-8));
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList28);
        objList28.add(0, (java.lang.Object) (-1L));
        objList0.add(0, (java.lang.Object) objList28);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) (byte) 0);
        boolean boolean47 = objList43.removeElem((java.lang.Object) (-4));
        boolean boolean49 = objList43.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean54 = objList50.removeElem((java.lang.Object) (-4));
        boolean boolean56 = objList50.removeElem((java.lang.Object) (short) 0);
        boolean boolean57 = objList43.removeElem((java.lang.Object) objList50);
        java.lang.Object[] objArray59 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList60, objArray59);
        java.lang.Object obj63 = objList60.remove((int) (short) 0);
        boolean boolean64 = objList43.removeElem((java.lang.Object) objList60);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        boolean boolean72 = objList66.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = objList73.removeElem((java.lang.Object) "");
        boolean boolean76 = objList66.removeElem((java.lang.Object) objList73);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) "hi!");
        boolean boolean81 = objList77.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList82 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean84 = objList82.removeElem((java.lang.Object) "hi!");
        boolean boolean85 = objList77.removeElem((java.lang.Object) boolean84);
        boolean boolean87 = objList77.removeElem((java.lang.Object) (short) 0);
        boolean boolean88 = objList73.removeElem((java.lang.Object) objList77);
        objList60.add(0, (java.lang.Object) boolean88);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(4, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test300");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList50.removeElem((java.lang.Object) 100.0d);
        objList39.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        boolean boolean67 = objList63.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList63.removeElem((java.lang.Object) boolean70);
        boolean boolean73 = objList63.removeElem((java.lang.Object) (short) 0);
        boolean boolean74 = objList60.removeElem((java.lang.Object) objList63);
        boolean boolean76 = objList60.removeElem((java.lang.Object) 10);
        boolean boolean77 = objList39.removeElem((java.lang.Object) objList60);
        boolean boolean78 = objList26.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "");
        boolean boolean83 = objList79.removeElem((java.lang.Object) 0L);
        boolean boolean85 = objList79.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList86 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean87 = objList79.removeElem((java.lang.Object) objCollectionList86);
        boolean boolean88 = objList39.removeElem((java.lang.Object) objCollectionList86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = objList39.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test301");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList24.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList24.removeElem((java.lang.Object) boolean31);
        boolean boolean34 = objList24.removeElem((java.lang.Object) (short) 0);
        boolean boolean35 = objList21.removeElem((java.lang.Object) objList24);
        boolean boolean37 = objList21.removeElem((java.lang.Object) 10);
        boolean boolean38 = objList0.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        boolean boolean44 = objList40.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList45 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean47 = objList45.removeElem((java.lang.Object) "");
        boolean boolean49 = objList45.removeElem((java.lang.Object) 1L);
        boolean boolean51 = objList45.removeElem((java.lang.Object) (-1.0d));
        boolean boolean52 = objList40.removeElem((java.lang.Object) objList45);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) "hi!");
        boolean boolean57 = objList53.removeElem((java.lang.Object) true);
        boolean boolean59 = objList53.removeElem((java.lang.Object) 4);
        boolean boolean61 = objList53.removeElem((java.lang.Object) 1);
        boolean boolean63 = objList53.removeElem((java.lang.Object) 10);
        boolean boolean64 = objList45.removeElem((java.lang.Object) objList53);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) objList45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test302");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList23);
        boolean boolean32 = objList16.removeElem((java.lang.Object) (-10));
        boolean boolean33 = objList5.removeElem((java.lang.Object) objList16);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList16.replaceAll(objUnaryOperator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test303");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.lang.Object obj14 = objList11.remove((int) (short) 0);
        boolean boolean15 = objList0.removeElem(obj14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList17.removeElem((java.lang.Object) boolean24);
        boolean boolean27 = objList17.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) (-3));
        boolean boolean33 = objList17.removeElem((java.lang.Object) objList28);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) objList28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test304");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-10));
        java.lang.Object obj18 = null;
        objList0.add(0, obj18);
        java.lang.Object obj21 = objList0.remove((int) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 1L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test305");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        objList31.add(0, (java.lang.Object) 10.0f);
        boolean boolean41 = objList26.removeElem((java.lang.Object) objList31);
        objList13.add(0, (java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = objList13.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test306");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        boolean boolean18 = objList8.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) (-3));
        boolean boolean24 = objList8.removeElem((java.lang.Object) objList19);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) objList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test307");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test308");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test309");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (short) 0);
        boolean boolean22 = objList7.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = objList7.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test310");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean72 = objList68.removeElem((java.lang.Object) true);
        boolean boolean74 = objList68.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "");
        boolean boolean78 = objList68.removeElem((java.lang.Object) objList75);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "hi!");
        boolean boolean83 = objList79.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList84 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean86 = objList84.removeElem((java.lang.Object) "hi!");
        boolean boolean87 = objList79.removeElem((java.lang.Object) boolean86);
        boolean boolean89 = objList79.removeElem((java.lang.Object) (short) 0);
        boolean boolean90 = objList75.removeElem((java.lang.Object) objList79);
        boolean boolean91 = objList62.removeElem((java.lang.Object) boolean90);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj93 = objList62.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test311");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (-5));
        objList9.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) 0L);
        boolean boolean25 = objList19.removeElem((java.lang.Object) (-5));
        boolean boolean27 = objList19.removeElem((java.lang.Object) (-8));
        boolean boolean28 = objList9.removeElem((java.lang.Object) objList19);
        boolean boolean29 = objList0.removeElem((java.lang.Object) boolean28);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) (byte) 0);
        boolean boolean35 = objList31.removeElem((java.lang.Object) (byte) 100);
        boolean boolean37 = objList31.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean40 = objList38.removeElem((java.lang.Object) "");
        boolean boolean42 = objList38.removeElem((java.lang.Object) 0L);
        boolean boolean44 = objList38.removeElem((java.lang.Object) (-5));
        objList38.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "");
        boolean boolean52 = objList48.removeElem((java.lang.Object) 0L);
        boolean boolean54 = objList48.removeElem((java.lang.Object) (-5));
        boolean boolean56 = objList48.removeElem((java.lang.Object) (-8));
        boolean boolean57 = objList38.removeElem((java.lang.Object) objList48);
        boolean boolean59 = objList38.removeElem((java.lang.Object) 0);
        boolean boolean60 = objList31.removeElem((java.lang.Object) objList38);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) objList38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test312");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test313");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        boolean boolean83 = objList77.removeElem((java.lang.Object) (short) 0);
        boolean boolean84 = objList70.removeElem((java.lang.Object) objList77);
        boolean boolean85 = objList62.removeElem((java.lang.Object) objList70);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList87 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean89 = objList87.removeElem((java.lang.Object) "hi!");
        boolean boolean91 = objList87.removeElem((java.lang.Object) true);
        boolean boolean93 = objList87.removeElem((java.lang.Object) 4);
        boolean boolean95 = objList87.removeElem((java.lang.Object) 1);
        boolean boolean97 = objList87.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList70.add((-1), (java.lang.Object) objList87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test314");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test315");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList21.removeElem((java.lang.Object) true);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList28.removeElem((java.lang.Object) true);
        boolean boolean34 = objList28.removeElem((java.lang.Object) 4);
        boolean boolean35 = objList21.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            objList9.add((-7), (java.lang.Object) objList21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test316");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.Object>> objCollectionList8 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-3), (java.lang.Object) objCollectionList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test317");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.lang.Object obj20 = objList17.remove((int) (short) 0);
        boolean boolean21 = objList0.removeElem((java.lang.Object) objList17);
        DataStructures.commonscollections.TreeList<java.io.Serializable> serializableList23 = new DataStructures.commonscollections.TreeList<java.io.Serializable>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) serializableList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test318");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (-5));
        objList9.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) 0L);
        boolean boolean25 = objList19.removeElem((java.lang.Object) (-5));
        boolean boolean27 = objList19.removeElem((java.lang.Object) (-8));
        boolean boolean28 = objList9.removeElem((java.lang.Object) objList19);
        boolean boolean29 = objList0.removeElem((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test319");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean22 = objList14.removeElem((java.lang.Object) boolean21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.Object obj28 = objList25.remove((int) (short) 0);
        boolean boolean29 = objList14.removeElem(obj28);
        boolean boolean31 = objList14.removeElem((java.lang.Object) 1.0f);
        boolean boolean32 = objList0.removeElem((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test320");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test321");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-10));
        java.lang.Object obj18 = null;
        objList0.add(0, obj18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test322");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) (byte) 0);
        boolean boolean14 = objList10.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        boolean boolean19 = objList15.removeElem((java.lang.Object) 0L);
        boolean boolean21 = objList15.removeElem((java.lang.Object) (-5));
        objList15.add(0, (java.lang.Object) 10.0f);
        boolean boolean25 = objList10.removeElem((java.lang.Object) objList15);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (-4));
        boolean boolean32 = objList26.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) (byte) 0);
        boolean boolean37 = objList33.removeElem((java.lang.Object) (-4));
        boolean boolean39 = objList33.removeElem((java.lang.Object) (short) 0);
        boolean boolean40 = objList26.removeElem((java.lang.Object) objList33);
        boolean boolean42 = objList26.removeElem((java.lang.Object) (-10));
        boolean boolean43 = objList15.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "");
        boolean boolean51 = objList47.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) "");
        boolean boolean56 = objList52.removeElem((java.lang.Object) 1L);
        boolean boolean58 = objList52.removeElem((java.lang.Object) (-1.0d));
        boolean boolean59 = objList47.removeElem((java.lang.Object) objList52);
        boolean boolean61 = objList52.removeElem((java.lang.Object) true);
        boolean boolean62 = objList44.removeElem((java.lang.Object) boolean61);
        boolean boolean63 = objList15.removeElem((java.lang.Object) boolean61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean67 = objList65.removeElem((java.lang.Object) "hi!");
        boolean boolean69 = objList65.removeElem((java.lang.Object) true);
        boolean boolean71 = objList65.removeElem((java.lang.Object) 4);
        objList15.add(0, (java.lang.Object) boolean71);
        boolean boolean73 = objList0.removeElem((java.lang.Object) objList15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = objList15.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test323");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test324");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        boolean boolean18 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean19 = objList5.removeElem((java.lang.Object) objList8);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        boolean boolean26 = objList20.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList27.removeElem((java.lang.Object) true);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        boolean boolean40 = objList34.removeElem((java.lang.Object) 4);
        boolean boolean41 = objList27.removeElem((java.lang.Object) 4);
        boolean boolean42 = objList20.removeElem((java.lang.Object) boolean41);
        boolean boolean43 = objList5.removeElem((java.lang.Object) boolean42);
        boolean boolean44 = objList0.removeElem((java.lang.Object) boolean43);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator45 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test325");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        objList11.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList0.add((int) (short) 0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-5));
        boolean boolean31 = objList23.removeElem((java.lang.Object) (-8));
        objList0.add((int) (byte) 0, (java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test326");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList9.removeElem(obj14);
        boolean boolean16 = objList0.removeElem((java.lang.Object) boolean15);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 0L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-5));
        objList18.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        boolean boolean34 = objList28.removeElem((java.lang.Object) (-5));
        boolean boolean36 = objList28.removeElem((java.lang.Object) (-8));
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList28);
        objList28.add(0, (java.lang.Object) (-1L));
        objList0.add(0, (java.lang.Object) objList28);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator42 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test327");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test328");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(1, (java.lang.Object) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test329");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList56 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean57 = objList49.removeElem((java.lang.Object) objCollectionList56);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) (byte) 0);
        boolean boolean62 = objList58.removeElem((java.lang.Object) (-4));
        java.lang.Object obj63 = null;
        boolean boolean64 = objList58.removeElem(obj63);
        boolean boolean65 = objList49.removeElem((java.lang.Object) boolean64);
        boolean boolean66 = objList0.removeElem((java.lang.Object) objList49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = objList49.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test330");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        objList31.add(0, (java.lang.Object) 10.0f);
        boolean boolean41 = objList26.removeElem((java.lang.Object) objList31);
        objList13.add(0, (java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = objList13.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test331");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList50.removeElem((java.lang.Object) 100.0d);
        objList39.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        boolean boolean67 = objList63.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList63.removeElem((java.lang.Object) boolean70);
        boolean boolean73 = objList63.removeElem((java.lang.Object) (short) 0);
        boolean boolean74 = objList60.removeElem((java.lang.Object) objList63);
        boolean boolean76 = objList60.removeElem((java.lang.Object) 10);
        boolean boolean77 = objList39.removeElem((java.lang.Object) objList60);
        boolean boolean78 = objList26.removeElem((java.lang.Object) objList39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = objList39.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test332");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        boolean boolean54 = objList50.removeElem((java.lang.Object) true);
        boolean boolean56 = objList50.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) "");
        boolean boolean60 = objList50.removeElem((java.lang.Object) objList57);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) 'a', (java.lang.Object) boolean60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test333");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        java.lang.Object obj16 = null;
        boolean boolean17 = objList0.removeElem(obj16);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test334");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.lang.Object obj14 = objList11.remove((int) (short) 0);
        boolean boolean15 = objList0.removeElem(obj14);
        boolean boolean17 = objList0.removeElem((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objList0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test335");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 1L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-1.0d));
        boolean boolean23 = objList11.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList7.removeElem((java.lang.Object) objList16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList16.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test336");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList12 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean13 = objList5.removeElem((java.lang.Object) objCollectionList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean18 = objList14.removeElem((java.lang.Object) (-4));
        java.lang.Object obj19 = null;
        boolean boolean20 = objList14.removeElem(obj19);
        boolean boolean21 = objList5.removeElem((java.lang.Object) boolean20);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-5));
        objList23.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-5));
        boolean boolean41 = objList33.removeElem((java.lang.Object) (-8));
        boolean boolean42 = objList23.removeElem((java.lang.Object) objList33);
        objList33.add(0, (java.lang.Object) (-1L));
        objList5.add(0, (java.lang.Object) objList33);
        boolean boolean47 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) (byte) 0);
        boolean boolean53 = objList49.removeElem((java.lang.Object) (byte) 100);
        objList49.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList57 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean58 = objList49.removeElem((java.lang.Object) objCollectionList57);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 100, (java.lang.Object) boolean58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test337");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        boolean boolean21 = objList10.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 1L);
        boolean boolean34 = objList28.removeElem((java.lang.Object) (-1.0d));
        boolean boolean35 = objList23.removeElem((java.lang.Object) objList28);
        boolean boolean37 = objList23.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList10.add((int) (byte) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test338");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test339");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test340");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        objList0.add(0, (java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test341");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test342");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList50.removeElem((java.lang.Object) 100.0d);
        objList39.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        boolean boolean67 = objList63.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList63.removeElem((java.lang.Object) boolean70);
        boolean boolean73 = objList63.removeElem((java.lang.Object) (short) 0);
        boolean boolean74 = objList60.removeElem((java.lang.Object) objList63);
        boolean boolean76 = objList60.removeElem((java.lang.Object) 10);
        boolean boolean77 = objList39.removeElem((java.lang.Object) objList60);
        boolean boolean78 = objList26.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList80.removeElem((java.lang.Object) "");
        boolean boolean84 = objList80.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList85 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean87 = objList85.removeElem((java.lang.Object) "hi!");
        boolean boolean89 = objList85.removeElem((java.lang.Object) true);
        boolean boolean91 = objList85.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList92 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean94 = objList92.removeElem((java.lang.Object) "");
        boolean boolean95 = objList85.removeElem((java.lang.Object) objList92);
        boolean boolean96 = objList80.removeElem((java.lang.Object) objList92);
        java.lang.Object obj97 = new java.lang.Object();
        boolean boolean98 = objList80.removeElem(obj97);
        objList26.add((int) (short) 0, (java.lang.Object) objList80);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test343");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) (-3));
        boolean boolean19 = objList13.removeElem((java.lang.Object) 6);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList13);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList13.replaceAll(objUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test344");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test345");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test346");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList23);
        boolean boolean32 = objList16.removeElem((java.lang.Object) (-10));
        boolean boolean33 = objList5.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 1L);
        boolean boolean48 = objList42.removeElem((java.lang.Object) (-1.0d));
        boolean boolean49 = objList37.removeElem((java.lang.Object) objList42);
        boolean boolean51 = objList42.removeElem((java.lang.Object) true);
        boolean boolean52 = objList34.removeElem((java.lang.Object) boolean51);
        boolean boolean53 = objList5.removeElem((java.lang.Object) boolean51);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) "hi!");
        boolean boolean59 = objList55.removeElem((java.lang.Object) true);
        boolean boolean61 = objList55.removeElem((java.lang.Object) 4);
        objList5.add(0, (java.lang.Object) boolean61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = objList5.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test347");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test348");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean13 = objList7.removeElem((java.lang.Object) (-5));
        objList7.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 0L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-5));
        boolean boolean25 = objList17.removeElem((java.lang.Object) (-8));
        boolean boolean26 = objList7.removeElem((java.lang.Object) objList17);
        boolean boolean28 = objList7.removeElem((java.lang.Object) 0);
        boolean boolean29 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList7.replaceAll(objUnaryOperator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test349");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList9.removeElem(obj14);
        boolean boolean16 = objList0.removeElem((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test350");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList12 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean13 = objList5.removeElem((java.lang.Object) objCollectionList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean18 = objList14.removeElem((java.lang.Object) (-4));
        java.lang.Object obj19 = null;
        boolean boolean20 = objList14.removeElem(obj19);
        boolean boolean21 = objList5.removeElem((java.lang.Object) boolean20);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-5));
        objList23.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-5));
        boolean boolean41 = objList33.removeElem((java.lang.Object) (-8));
        boolean boolean42 = objList23.removeElem((java.lang.Object) objList33);
        objList33.add(0, (java.lang.Object) (-1L));
        objList5.add(0, (java.lang.Object) objList33);
        boolean boolean47 = objList0.removeElem((java.lang.Object) objList5);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator48 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test351");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test352");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = objList62.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test353");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        boolean boolean19 = objList15.removeElem((java.lang.Object) 0L);
        boolean boolean21 = objList15.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        boolean boolean28 = objList22.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        boolean boolean35 = objList29.removeElem((java.lang.Object) 4);
        boolean boolean36 = objList22.removeElem((java.lang.Object) 4);
        boolean boolean37 = objList15.removeElem((java.lang.Object) boolean36);
        boolean boolean38 = objList0.removeElem((java.lang.Object) boolean37);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) (byte) 0);
        boolean boolean44 = objList40.removeElem((java.lang.Object) (-4));
        boolean boolean46 = objList40.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) (byte) 0);
        boolean boolean51 = objList47.removeElem((java.lang.Object) (-4));
        boolean boolean53 = objList47.removeElem((java.lang.Object) (short) 0);
        boolean boolean54 = objList40.removeElem((java.lang.Object) objList47);
        boolean boolean56 = objList40.removeElem((java.lang.Object) (-10));
        java.lang.Object obj58 = null;
        objList40.add(0, obj58);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(1, obj58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test354");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList13.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test355");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test356");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) (byte) 0);
        boolean boolean14 = objList10.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        boolean boolean19 = objList15.removeElem((java.lang.Object) 0L);
        boolean boolean21 = objList15.removeElem((java.lang.Object) (-5));
        objList15.add(0, (java.lang.Object) 10.0f);
        boolean boolean25 = objList10.removeElem((java.lang.Object) objList15);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (-4));
        boolean boolean32 = objList26.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) (byte) 0);
        boolean boolean37 = objList33.removeElem((java.lang.Object) (-4));
        boolean boolean39 = objList33.removeElem((java.lang.Object) (short) 0);
        boolean boolean40 = objList26.removeElem((java.lang.Object) objList33);
        boolean boolean42 = objList26.removeElem((java.lang.Object) (-10));
        boolean boolean43 = objList15.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "");
        boolean boolean51 = objList47.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) "");
        boolean boolean56 = objList52.removeElem((java.lang.Object) 1L);
        boolean boolean58 = objList52.removeElem((java.lang.Object) (-1.0d));
        boolean boolean59 = objList47.removeElem((java.lang.Object) objList52);
        boolean boolean61 = objList52.removeElem((java.lang.Object) true);
        boolean boolean62 = objList44.removeElem((java.lang.Object) boolean61);
        boolean boolean63 = objList15.removeElem((java.lang.Object) boolean61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean67 = objList65.removeElem((java.lang.Object) "hi!");
        boolean boolean69 = objList65.removeElem((java.lang.Object) true);
        boolean boolean71 = objList65.removeElem((java.lang.Object) 4);
        objList15.add(0, (java.lang.Object) boolean71);
        boolean boolean73 = objList0.removeElem((java.lang.Object) objList15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test357");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        // The following exception was thrown during execution in test generation
        try {
            objList62.add((int) 'a', (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=36");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test358");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 1L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-1.0d));
        boolean boolean23 = objList11.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList7.removeElem((java.lang.Object) objList16);
        boolean boolean26 = objList7.removeElem((java.lang.Object) false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test359");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        boolean boolean13 = objList9.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList9.removeElem((java.lang.Object) boolean16);
        boolean boolean19 = objList9.removeElem((java.lang.Object) (short) 0);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList9.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test360");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean22 = objList14.removeElem((java.lang.Object) boolean21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.Object obj28 = objList25.remove((int) (short) 0);
        boolean boolean29 = objList14.removeElem(obj28);
        boolean boolean31 = objList14.removeElem((java.lang.Object) 1.0f);
        boolean boolean32 = objList0.removeElem((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList0.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test361");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        boolean boolean83 = objList77.removeElem((java.lang.Object) (short) 0);
        boolean boolean84 = objList70.removeElem((java.lang.Object) objList77);
        boolean boolean85 = objList62.removeElem((java.lang.Object) objList70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = objList62.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=34");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test362");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) (byte) 0);
        boolean boolean29 = objList25.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean34 = objList30.removeElem((java.lang.Object) 0L);
        boolean boolean36 = objList30.removeElem((java.lang.Object) (-5));
        objList30.add(0, (java.lang.Object) 10.0f);
        boolean boolean40 = objList25.removeElem((java.lang.Object) objList30);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) (byte) 0);
        boolean boolean45 = objList41.removeElem((java.lang.Object) (-4));
        boolean boolean47 = objList41.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) (byte) 0);
        boolean boolean52 = objList48.removeElem((java.lang.Object) (-4));
        boolean boolean54 = objList48.removeElem((java.lang.Object) (short) 0);
        boolean boolean55 = objList41.removeElem((java.lang.Object) objList48);
        boolean boolean57 = objList41.removeElem((java.lang.Object) (-10));
        boolean boolean58 = objList30.removeElem((java.lang.Object) objList41);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean64 = objList62.removeElem((java.lang.Object) "");
        boolean boolean66 = objList62.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList67 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean69 = objList67.removeElem((java.lang.Object) "");
        boolean boolean71 = objList67.removeElem((java.lang.Object) 1L);
        boolean boolean73 = objList67.removeElem((java.lang.Object) (-1.0d));
        boolean boolean74 = objList62.removeElem((java.lang.Object) objList67);
        boolean boolean76 = objList67.removeElem((java.lang.Object) true);
        boolean boolean77 = objList59.removeElem((java.lang.Object) boolean76);
        boolean boolean78 = objList30.removeElem((java.lang.Object) boolean76);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList80.removeElem((java.lang.Object) "hi!");
        boolean boolean84 = objList80.removeElem((java.lang.Object) true);
        boolean boolean86 = objList80.removeElem((java.lang.Object) 4);
        objList30.add(0, (java.lang.Object) boolean86);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) boolean86);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test363");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 1L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-1.0d));
        boolean boolean30 = objList18.removeElem((java.lang.Object) objList23);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) objList18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test364");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 1L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-1.0d));
        boolean boolean23 = objList11.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList7.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean29 = objList25.removeElem((java.lang.Object) true);
        boolean boolean31 = objList25.removeElem((java.lang.Object) (-1.0d));
        boolean boolean33 = objList25.removeElem((java.lang.Object) (-6));
        boolean boolean34 = objList16.removeElem((java.lang.Object) objList25);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList16.replaceAll(objUnaryOperator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test365");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 0L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-5));
        objList18.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        boolean boolean34 = objList28.removeElem((java.lang.Object) (-5));
        boolean boolean36 = objList28.removeElem((java.lang.Object) (-8));
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList28);
        // The following exception was thrown during execution in test generation
        try {
            objList12.add((int) '4', (java.lang.Object) boolean37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test366");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        objList0.add(0, (java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList12.removeElem((java.lang.Object) boolean19);
        boolean boolean22 = objList12.removeElem((java.lang.Object) (short) 0);
        boolean boolean23 = objList9.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) '4');
        boolean boolean28 = objList24.removeElem((java.lang.Object) 100.0d);
        boolean boolean29 = objList12.removeElem((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test367");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.lang.Object obj20 = objList17.remove((int) (short) 0);
        boolean boolean21 = objList0.removeElem((java.lang.Object) objList17);
        java.lang.Object obj23 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            objList17.add((-3), obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test368");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        boolean boolean18 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean19 = objList5.removeElem((java.lang.Object) objList8);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        boolean boolean26 = objList20.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList27.removeElem((java.lang.Object) true);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        boolean boolean40 = objList34.removeElem((java.lang.Object) 4);
        boolean boolean41 = objList27.removeElem((java.lang.Object) 4);
        boolean boolean42 = objList20.removeElem((java.lang.Object) boolean41);
        boolean boolean43 = objList5.removeElem((java.lang.Object) boolean42);
        boolean boolean44 = objList0.removeElem((java.lang.Object) boolean43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = objList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test369");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 0L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-5));
        objList8.add(0, (java.lang.Object) 10.0f);
        boolean boolean18 = objList0.removeElem((java.lang.Object) objList8);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) (byte) 0);
        boolean boolean24 = objList20.removeElem((java.lang.Object) (byte) 100);
        objList20.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList28 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean29 = objList20.removeElem((java.lang.Object) objCollectionList28);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test370");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = objList0.removeElem(obj17);
        java.lang.Object obj20 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList21.removeElem((java.lang.Object) true);
        boolean boolean27 = objList21.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "");
        boolean boolean54 = objList50.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "");
        boolean boolean62 = objList58.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList65 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        boolean boolean72 = objList66.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList78 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList79 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray80 = new java.lang.Object[] { (-1), obj20, objList21, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList35, 1.0d, (short) 1, objList38, (-4), (-4), boolean45, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList65, boolean72, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList78, objCollectionList79 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList83 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean85 = objList83.removeElem((java.lang.Object) "");
        boolean boolean86 = objList81.removeElem((java.lang.Object) boolean85);
        java.lang.Object obj88 = objList81.remove(7);
        java.lang.Object obj90 = objList81.remove(1);
        boolean boolean91 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj93 = objList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test371");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = objList5.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test372");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList12.removeElem((java.lang.Object) boolean19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (byte) 0);
        objList21.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean31 = objList12.removeElem((java.lang.Object) objList21);
        // The following exception was thrown during execution in test generation
        try {
            objList7.add((int) '4', (java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test373");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "");
        boolean boolean7 = objList3.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 1L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-1.0d));
        boolean boolean15 = objList3.removeElem((java.lang.Object) objList8);
        boolean boolean17 = objList8.removeElem((java.lang.Object) true);
        boolean boolean18 = objList0.removeElem((java.lang.Object) boolean17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList19.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList19.removeElem((java.lang.Object) boolean26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 1L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-1.0d));
        boolean boolean40 = objList28.removeElem((java.lang.Object) objList33);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) 1L);
        boolean boolean52 = objList46.removeElem((java.lang.Object) (-1.0d));
        boolean boolean53 = objList41.removeElem((java.lang.Object) objList46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) "hi!");
        boolean boolean58 = objList54.removeElem((java.lang.Object) true);
        boolean boolean60 = objList54.removeElem((java.lang.Object) 4);
        boolean boolean62 = objList54.removeElem((java.lang.Object) 1);
        boolean boolean64 = objList54.removeElem((java.lang.Object) 10);
        boolean boolean65 = objList46.removeElem((java.lang.Object) objList54);
        boolean boolean66 = objList33.removeElem((java.lang.Object) objList54);
        boolean boolean67 = objList19.removeElem((java.lang.Object) objList54);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "");
        boolean boolean72 = objList68.removeElem((java.lang.Object) 0L);
        boolean boolean74 = objList68.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList75 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean76 = objList68.removeElem((java.lang.Object) objCollectionList75);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        java.lang.Object obj82 = null;
        boolean boolean83 = objList77.removeElem(obj82);
        boolean boolean84 = objList68.removeElem((java.lang.Object) boolean83);
        boolean boolean85 = objList19.removeElem((java.lang.Object) objList68);
        boolean boolean86 = objList0.removeElem((java.lang.Object) boolean85);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator87 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test374");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        objList31.add(0, (java.lang.Object) 10.0f);
        boolean boolean41 = objList26.removeElem((java.lang.Object) objList31);
        objList13.add(0, (java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = objList13.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test375");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) (byte) 0);
        boolean boolean13 = objList9.removeElem((java.lang.Object) (-4));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList9.removeElem(obj14);
        boolean boolean16 = objList0.removeElem((java.lang.Object) boolean15);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test376");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test377");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList19, objArray18);
        java.lang.Object obj22 = objList19.remove((int) (short) 0);
        boolean boolean23 = objList8.removeElem(obj22);
        boolean boolean25 = objList8.removeElem((java.lang.Object) 1.0f);
        objList0.add(0, (java.lang.Object) objList8);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList8.replaceAll(objUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test378");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) (byte) 0);
        boolean boolean29 = objList25.removeElem((java.lang.Object) (-4));
        java.lang.Object obj30 = null;
        boolean boolean31 = objList25.removeElem(obj30);
        boolean boolean33 = objList25.removeElem((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            objList7.add((-100), (java.lang.Object) boolean33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test379");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList23);
        boolean boolean32 = objList16.removeElem((java.lang.Object) (-10));
        boolean boolean33 = objList5.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 1L);
        boolean boolean48 = objList42.removeElem((java.lang.Object) (-1.0d));
        boolean boolean49 = objList37.removeElem((java.lang.Object) objList42);
        boolean boolean51 = objList42.removeElem((java.lang.Object) true);
        boolean boolean52 = objList34.removeElem((java.lang.Object) boolean51);
        boolean boolean53 = objList5.removeElem((java.lang.Object) boolean51);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) "hi!");
        boolean boolean59 = objList55.removeElem((java.lang.Object) true);
        boolean boolean61 = objList55.removeElem((java.lang.Object) 4);
        objList5.add(0, (java.lang.Object) boolean61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "hi!");
        boolean boolean68 = objList64.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList69.removeElem((java.lang.Object) "hi!");
        boolean boolean72 = objList64.removeElem((java.lang.Object) boolean71);
        boolean boolean74 = objList64.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) '4');
        boolean boolean79 = objList75.removeElem((java.lang.Object) 100.0d);
        boolean boolean80 = objList64.removeElem((java.lang.Object) objList75);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean83 = objList81.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList84 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean86 = objList84.removeElem((java.lang.Object) "hi!");
        boolean boolean88 = objList84.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList89 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean91 = objList89.removeElem((java.lang.Object) "hi!");
        boolean boolean92 = objList84.removeElem((java.lang.Object) boolean91);
        boolean boolean94 = objList84.removeElem((java.lang.Object) (short) 0);
        boolean boolean95 = objList81.removeElem((java.lang.Object) objList84);
        boolean boolean96 = objList75.removeElem((java.lang.Object) boolean95);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add((-1), (java.lang.Object) boolean96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test380");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) (byte) 0);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList17.removeElem((java.lang.Object) 100.0d);
        boolean boolean27 = objList17.removeElem((java.lang.Object) 100.0d);
        boolean boolean28 = objList1.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = objList1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test381");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) (byte) 0);
        boolean boolean10 = objList6.removeElem((java.lang.Object) (-4));
        boolean boolean12 = objList6.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(2, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test382");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) '4');
        boolean boolean26 = objList22.removeElem((java.lang.Object) 100.0d);
        boolean boolean27 = objList11.removeElem((java.lang.Object) objList22);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList28.removeElem((java.lang.Object) true);
        boolean boolean34 = objList28.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "");
        boolean boolean38 = objList28.removeElem((java.lang.Object) objList35);
        boolean boolean39 = objList11.removeElem((java.lang.Object) objList35);
        boolean boolean40 = objList0.removeElem((java.lang.Object) objList11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList11.replaceAll(objUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test383");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList4.removeElem((java.lang.Object) (-4));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList4.removeElem(obj9);
        boolean boolean12 = objList4.removeElem((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) objList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test384");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = objList0.removeElem(obj17);
        java.lang.Object obj20 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList21.removeElem((java.lang.Object) true);
        boolean boolean27 = objList21.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "");
        boolean boolean54 = objList50.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "");
        boolean boolean62 = objList58.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList65 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        boolean boolean72 = objList66.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList78 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList79 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray80 = new java.lang.Object[] { (-1), obj20, objList21, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList35, 1.0d, (short) 1, objList38, (-4), (-4), boolean45, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList65, boolean72, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList78, objCollectionList79 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList83 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean85 = objList83.removeElem((java.lang.Object) "");
        boolean boolean86 = objList81.removeElem((java.lang.Object) boolean85);
        java.lang.Object obj88 = objList81.remove(7);
        java.lang.Object obj90 = objList81.remove(1);
        boolean boolean91 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj93 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test385");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) 'a', (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test386");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test387");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test388");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 1L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-1.0d));
        boolean boolean20 = objList12.removeElem((java.lang.Object) (-8));
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test389");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList23);
        boolean boolean32 = objList16.removeElem((java.lang.Object) (-10));
        boolean boolean33 = objList5.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 1L);
        boolean boolean48 = objList42.removeElem((java.lang.Object) (-1.0d));
        boolean boolean49 = objList37.removeElem((java.lang.Object) objList42);
        boolean boolean51 = objList42.removeElem((java.lang.Object) true);
        boolean boolean52 = objList34.removeElem((java.lang.Object) boolean51);
        boolean boolean53 = objList5.removeElem((java.lang.Object) boolean51);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList54.removeElem((java.lang.Object) (byte) 100);
        objList54.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean64 = objList62.removeElem((java.lang.Object) "");
        boolean boolean66 = objList62.removeElem((java.lang.Object) 0L);
        boolean boolean68 = objList62.removeElem((java.lang.Object) (-5));
        objList62.add(0, (java.lang.Object) 10.0f);
        boolean boolean72 = objList54.removeElem((java.lang.Object) objList62);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = objList73.removeElem((java.lang.Object) (byte) 0);
        boolean boolean77 = objList73.removeElem((java.lang.Object) (byte) 100);
        objList73.add(0, (java.lang.Object) 1);
        boolean boolean81 = objList62.removeElem((java.lang.Object) 1);
        boolean boolean82 = objList5.removeElem((java.lang.Object) 1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test390");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "");
        boolean boolean30 = objList26.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 1L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-1.0d));
        boolean boolean38 = objList26.removeElem((java.lang.Object) objList31);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        boolean boolean47 = objList39.removeElem((java.lang.Object) 1);
        boolean boolean49 = objList39.removeElem((java.lang.Object) 10);
        boolean boolean50 = objList31.removeElem((java.lang.Object) objList39);
        boolean boolean51 = objList18.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) "hi!");
        boolean boolean56 = objList52.removeElem((java.lang.Object) true);
        boolean boolean58 = objList52.removeElem((java.lang.Object) 4);
        objList52.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) (byte) 0);
        boolean boolean69 = objList63.removeElem((java.lang.Object) (byte) 0);
        boolean boolean71 = objList63.removeElem((java.lang.Object) 100.0d);
        objList52.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = objList73.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = objList76.removeElem((java.lang.Object) "hi!");
        boolean boolean80 = objList76.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean83 = objList81.removeElem((java.lang.Object) "hi!");
        boolean boolean84 = objList76.removeElem((java.lang.Object) boolean83);
        boolean boolean86 = objList76.removeElem((java.lang.Object) (short) 0);
        boolean boolean87 = objList73.removeElem((java.lang.Object) objList76);
        boolean boolean89 = objList73.removeElem((java.lang.Object) 10);
        boolean boolean90 = objList52.removeElem((java.lang.Object) objList73);
        boolean boolean91 = objList39.removeElem((java.lang.Object) objList52);
        boolean boolean92 = objList0.removeElem((java.lang.Object) boolean91);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test391");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test392");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 1L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-1.0d));
        boolean boolean23 = objList11.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList7.removeElem((java.lang.Object) objList16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList7.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test393");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        objList10.add(0, (java.lang.Object) (-1L));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList24.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList24.removeElem((java.lang.Object) boolean31);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) (byte) 0);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (byte) 0);
        objList33.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean43 = objList24.removeElem((java.lang.Object) objList33);
        boolean boolean45 = objList24.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>> objIterableList46 = new DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean47 = objList24.removeElem((java.lang.Object) objIterableList46);
        // The following exception was thrown during execution in test generation
        try {
            objList10.add((-3), (java.lang.Object) objIterableList46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test394");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test395");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean13 = objList7.removeElem((java.lang.Object) (-5));
        objList7.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 0L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-5));
        boolean boolean25 = objList17.removeElem((java.lang.Object) (-8));
        boolean boolean26 = objList7.removeElem((java.lang.Object) objList17);
        boolean boolean28 = objList7.removeElem((java.lang.Object) 0);
        boolean boolean29 = objList0.removeElem((java.lang.Object) objList7);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test396");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test397");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test398");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = objList0.removeElem((java.lang.Object) strList3);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100.0f);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test399");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test400");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList62.removeElem((java.lang.Object) objList70);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = objList73.removeElem((java.lang.Object) '4');
        boolean boolean77 = objList73.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList62.add((int) (byte) -1, (java.lang.Object) objList73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=34");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test401");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test402");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test403");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (byte) 100);
        objList21.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 0L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-5));
        objList29.add(0, (java.lang.Object) 10.0f);
        boolean boolean39 = objList21.removeElem((java.lang.Object) objList29);
        objList9.add((int) (short) 1, (java.lang.Object) objList21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList21.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test404");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList62.removeElem((java.lang.Object) objList70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = objList70.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test405");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.lang.Object obj20 = objList17.remove((int) (short) 0);
        boolean boolean21 = objList0.removeElem((java.lang.Object) objList17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = objList17.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test406");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        boolean boolean13 = objList9.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList9.removeElem((java.lang.Object) boolean16);
        boolean boolean19 = objList9.removeElem((java.lang.Object) (short) 0);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList9);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList9.replaceAll(objUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test407");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList11 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) objCollectionList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test408");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add(3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test409");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(10);
        java.lang.Object obj71 = objList62.remove(4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = objList72.removeElem((java.lang.Object) (byte) 0);
        boolean boolean76 = objList72.removeElem((java.lang.Object) (-4));
        boolean boolean77 = objList62.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "");
        boolean boolean83 = objList79.removeElem((java.lang.Object) 0L);
        boolean boolean85 = objList79.removeElem((java.lang.Object) (-5));
        objList79.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList90 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean92 = objList90.removeElem((java.lang.Object) (byte) 0);
        boolean boolean94 = objList90.removeElem((java.lang.Object) (-4));
        java.lang.Object obj95 = null;
        boolean boolean96 = objList90.removeElem(obj95);
        objList79.add(0, obj95);
        objList62.add(1, obj95);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test410");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList16.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test411");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList10.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList10.removeElem((java.lang.Object) boolean17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList19.removeElem((java.lang.Object) (byte) 0);
        objList19.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean29 = objList10.removeElem((java.lang.Object) objList19);
        boolean boolean31 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList0.removeElem((java.lang.Object) objList10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList10.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test412");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList1.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test413");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test414");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "");
        boolean boolean7 = objList3.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 1L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-1.0d));
        boolean boolean15 = objList3.removeElem((java.lang.Object) objList8);
        boolean boolean17 = objList8.removeElem((java.lang.Object) true);
        boolean boolean18 = objList0.removeElem((java.lang.Object) boolean17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList19.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList19.removeElem((java.lang.Object) boolean26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 1L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-1.0d));
        boolean boolean40 = objList28.removeElem((java.lang.Object) objList33);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) 1L);
        boolean boolean52 = objList46.removeElem((java.lang.Object) (-1.0d));
        boolean boolean53 = objList41.removeElem((java.lang.Object) objList46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) "hi!");
        boolean boolean58 = objList54.removeElem((java.lang.Object) true);
        boolean boolean60 = objList54.removeElem((java.lang.Object) 4);
        boolean boolean62 = objList54.removeElem((java.lang.Object) 1);
        boolean boolean64 = objList54.removeElem((java.lang.Object) 10);
        boolean boolean65 = objList46.removeElem((java.lang.Object) objList54);
        boolean boolean66 = objList33.removeElem((java.lang.Object) objList54);
        boolean boolean67 = objList19.removeElem((java.lang.Object) objList54);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "");
        boolean boolean72 = objList68.removeElem((java.lang.Object) 0L);
        boolean boolean74 = objList68.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList75 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean76 = objList68.removeElem((java.lang.Object) objCollectionList75);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        java.lang.Object obj82 = null;
        boolean boolean83 = objList77.removeElem(obj82);
        boolean boolean84 = objList68.removeElem((java.lang.Object) boolean83);
        boolean boolean85 = objList19.removeElem((java.lang.Object) objList68);
        boolean boolean86 = objList0.removeElem((java.lang.Object) boolean85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test415");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList11.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test416");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test417");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean14 = objList10.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList10.removeElem((java.lang.Object) boolean17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList19.removeElem((java.lang.Object) (byte) 0);
        objList19.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean29 = objList10.removeElem((java.lang.Object) objList19);
        boolean boolean31 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList0.removeElem((java.lang.Object) objList10);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList10.replaceAll(objUnaryOperator33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test418");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "");
        boolean boolean7 = objList3.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 1L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-1.0d));
        boolean boolean15 = objList3.removeElem((java.lang.Object) objList8);
        boolean boolean17 = objList8.removeElem((java.lang.Object) true);
        boolean boolean18 = objList0.removeElem((java.lang.Object) boolean17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList19.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList19.removeElem((java.lang.Object) boolean26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 1L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-1.0d));
        boolean boolean40 = objList28.removeElem((java.lang.Object) objList33);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) 1L);
        boolean boolean52 = objList46.removeElem((java.lang.Object) (-1.0d));
        boolean boolean53 = objList41.removeElem((java.lang.Object) objList46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) "hi!");
        boolean boolean58 = objList54.removeElem((java.lang.Object) true);
        boolean boolean60 = objList54.removeElem((java.lang.Object) 4);
        boolean boolean62 = objList54.removeElem((java.lang.Object) 1);
        boolean boolean64 = objList54.removeElem((java.lang.Object) 10);
        boolean boolean65 = objList46.removeElem((java.lang.Object) objList54);
        boolean boolean66 = objList33.removeElem((java.lang.Object) objList54);
        boolean boolean67 = objList19.removeElem((java.lang.Object) objList54);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "");
        boolean boolean72 = objList68.removeElem((java.lang.Object) 0L);
        boolean boolean74 = objList68.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList75 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean76 = objList68.removeElem((java.lang.Object) objCollectionList75);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        java.lang.Object obj82 = null;
        boolean boolean83 = objList77.removeElem(obj82);
        boolean boolean84 = objList68.removeElem((java.lang.Object) boolean83);
        boolean boolean85 = objList19.removeElem((java.lang.Object) objList68);
        boolean boolean86 = objList0.removeElem((java.lang.Object) boolean85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test419");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test420");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        boolean boolean13 = objList9.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList9.removeElem((java.lang.Object) boolean16);
        boolean boolean19 = objList9.removeElem((java.lang.Object) (short) 0);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList9);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test421");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList24.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList24.removeElem((java.lang.Object) boolean31);
        boolean boolean34 = objList24.removeElem((java.lang.Object) (short) 0);
        boolean boolean35 = objList21.removeElem((java.lang.Object) objList24);
        boolean boolean37 = objList21.removeElem((java.lang.Object) 10);
        boolean boolean38 = objList0.removeElem((java.lang.Object) objList21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = objList21.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test422");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList12.add((int) (byte) -1, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test423");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = objList0.removeElem(obj17);
        java.lang.Object obj20 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList21.removeElem((java.lang.Object) true);
        boolean boolean27 = objList21.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "");
        boolean boolean54 = objList50.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "");
        boolean boolean62 = objList58.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList65 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        boolean boolean72 = objList66.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList78 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList79 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray80 = new java.lang.Object[] { (-1), obj20, objList21, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList35, 1.0d, (short) 1, objList38, (-4), (-4), boolean45, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList65, boolean72, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList78, objCollectionList79 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList83 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean85 = objList83.removeElem((java.lang.Object) "");
        boolean boolean86 = objList81.removeElem((java.lang.Object) boolean85);
        java.lang.Object obj88 = objList81.remove(7);
        java.lang.Object obj90 = objList81.remove(1);
        boolean boolean91 = objList0.removeElem((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) 'a', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test424");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList50.removeElem((java.lang.Object) 100.0d);
        objList39.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        boolean boolean67 = objList63.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList63.removeElem((java.lang.Object) boolean70);
        boolean boolean73 = objList63.removeElem((java.lang.Object) (short) 0);
        boolean boolean74 = objList60.removeElem((java.lang.Object) objList63);
        boolean boolean76 = objList60.removeElem((java.lang.Object) 10);
        boolean boolean77 = objList39.removeElem((java.lang.Object) objList60);
        boolean boolean78 = objList26.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "");
        boolean boolean83 = objList79.removeElem((java.lang.Object) 0L);
        boolean boolean85 = objList79.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList86 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean87 = objList79.removeElem((java.lang.Object) objCollectionList86);
        boolean boolean88 = objList39.removeElem((java.lang.Object) objCollectionList86);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator89 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList39.replaceAll(objUnaryOperator89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test425");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList17.removeElem((java.lang.Object) boolean24);
        boolean boolean27 = objList17.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) '4');
        boolean boolean32 = objList28.removeElem((java.lang.Object) 100.0d);
        boolean boolean33 = objList17.removeElem((java.lang.Object) objList28);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        boolean boolean40 = objList34.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean44 = objList34.removeElem((java.lang.Object) objList41);
        boolean boolean45 = objList17.removeElem((java.lang.Object) objList41);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-100), (java.lang.Object) boolean45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test426");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        objList10.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        boolean boolean26 = objList20.removeElem((java.lang.Object) (-5));
        boolean boolean28 = objList20.removeElem((java.lang.Object) (-8));
        boolean boolean29 = objList10.removeElem((java.lang.Object) objList20);
        boolean boolean30 = objList0.removeElem((java.lang.Object) objList10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        boolean boolean39 = objList31.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "hi!");
        boolean boolean50 = objList46.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList51 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean53 = objList51.removeElem((java.lang.Object) "hi!");
        boolean boolean54 = objList46.removeElem((java.lang.Object) boolean53);
        boolean boolean56 = objList46.removeElem((java.lang.Object) (-9));
        boolean boolean57 = objList41.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "hi!");
        boolean boolean62 = objList58.removeElem((java.lang.Object) true);
        boolean boolean64 = objList58.removeElem((java.lang.Object) (-1.0d));
        boolean boolean66 = objList58.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList67 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean69 = objList67.removeElem((java.lang.Object) "");
        boolean boolean71 = objList67.removeElem((java.lang.Object) 0L);
        boolean boolean73 = objList67.removeElem((java.lang.Object) (-5));
        objList67.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) "");
        boolean boolean81 = objList77.removeElem((java.lang.Object) 0L);
        boolean boolean83 = objList77.removeElem((java.lang.Object) (-5));
        boolean boolean85 = objList77.removeElem((java.lang.Object) (-8));
        boolean boolean86 = objList67.removeElem((java.lang.Object) objList77);
        boolean boolean87 = objList58.removeElem((java.lang.Object) boolean86);
        boolean boolean88 = objList41.removeElem((java.lang.Object) boolean86);
        objList31.add(0, (java.lang.Object) objList41);
        boolean boolean90 = objList0.removeElem((java.lang.Object) objList31);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test427");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        boolean boolean54 = objList50.removeElem((java.lang.Object) true);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (-1.0d));
        boolean boolean58 = objList50.removeElem((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "");
        boolean boolean63 = objList59.removeElem((java.lang.Object) 0L);
        boolean boolean65 = objList59.removeElem((java.lang.Object) (-5));
        boolean boolean67 = objList59.removeElem((java.lang.Object) 1L);
        boolean boolean69 = objList59.removeElem((java.lang.Object) (-1));
        boolean boolean70 = objList50.removeElem((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            objList35.add(5, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test428");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList23);
        boolean boolean32 = objList16.removeElem((java.lang.Object) (-10));
        boolean boolean33 = objList5.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 1L);
        boolean boolean48 = objList42.removeElem((java.lang.Object) (-1.0d));
        boolean boolean49 = objList37.removeElem((java.lang.Object) objList42);
        boolean boolean51 = objList42.removeElem((java.lang.Object) true);
        boolean boolean52 = objList34.removeElem((java.lang.Object) boolean51);
        boolean boolean53 = objList5.removeElem((java.lang.Object) boolean51);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) (byte) 0);
        boolean boolean57 = objList5.removeElem((java.lang.Object) boolean56);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList59 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            objList5.add((-1), (java.lang.Object) strComparableList59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test429");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.String> strList10 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(3, (java.lang.Object) strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test430");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(10);
        java.lang.Object obj71 = objList62.remove(4);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator72 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test431");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        objList10.add(0, (java.lang.Object) (-1L));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean26 = objList10.removeElem((java.lang.Object) boolean25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = objList10.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test432");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        objList12.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) 1L);
        objList23.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList12.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList0.add(0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "");
        boolean boolean40 = objList36.removeElem((java.lang.Object) 1L);
        boolean boolean42 = objList36.removeElem((java.lang.Object) (-1.0d));
        boolean boolean44 = objList36.removeElem((java.lang.Object) (-8));
        boolean boolean46 = objList36.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) "hi!");
        boolean boolean55 = objList47.removeElem((java.lang.Object) boolean54);
        boolean boolean57 = objList47.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) '4');
        boolean boolean62 = objList58.removeElem((java.lang.Object) 100.0d);
        boolean boolean63 = objList47.removeElem((java.lang.Object) objList58);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "hi!");
        boolean boolean68 = objList64.removeElem((java.lang.Object) true);
        boolean boolean70 = objList64.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "");
        boolean boolean74 = objList64.removeElem((java.lang.Object) objList71);
        boolean boolean75 = objList47.removeElem((java.lang.Object) objList71);
        boolean boolean76 = objList36.removeElem((java.lang.Object) objList47);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) objList36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test433");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList18 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean19 = objList11.removeElem((java.lang.Object) objCollectionList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) (byte) 0);
        boolean boolean24 = objList20.removeElem((java.lang.Object) (-4));
        java.lang.Object obj25 = null;
        boolean boolean26 = objList20.removeElem(obj25);
        boolean boolean27 = objList11.removeElem((java.lang.Object) boolean26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 0L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-5));
        objList29.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        boolean boolean45 = objList39.removeElem((java.lang.Object) (-5));
        boolean boolean47 = objList39.removeElem((java.lang.Object) (-8));
        boolean boolean48 = objList29.removeElem((java.lang.Object) objList39);
        objList39.add(0, (java.lang.Object) (-1L));
        objList11.add(0, (java.lang.Object) objList39);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-100), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test434");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) '4');
        boolean boolean26 = objList22.removeElem((java.lang.Object) 100.0d);
        boolean boolean27 = objList11.removeElem((java.lang.Object) objList22);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList28.removeElem((java.lang.Object) true);
        boolean boolean34 = objList28.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "");
        boolean boolean38 = objList28.removeElem((java.lang.Object) objList35);
        boolean boolean39 = objList11.removeElem((java.lang.Object) objList35);
        boolean boolean40 = objList0.removeElem((java.lang.Object) objList11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test435");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 0L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-5));
        objList8.add(0, (java.lang.Object) 10.0f);
        boolean boolean18 = objList0.removeElem((java.lang.Object) objList8);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.Object>> objCollectionList19 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.Object>>();
        boolean boolean20 = objList8.removeElem((java.lang.Object) objCollectionList19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList8.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test436");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (byte) 100);
        objList21.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 0L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-5));
        objList29.add(0, (java.lang.Object) 10.0f);
        boolean boolean39 = objList21.removeElem((java.lang.Object) objList29);
        objList9.add((int) (short) 1, (java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) "hi!");
        boolean boolean55 = objList47.removeElem((java.lang.Object) boolean54);
        boolean boolean57 = objList47.removeElem((java.lang.Object) (-9));
        boolean boolean58 = objList42.removeElem((java.lang.Object) (-9));
        objList21.add((int) (byte) 1, (java.lang.Object) (-9));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test437");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (byte) 100);
        objList21.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 0L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-5));
        objList29.add(0, (java.lang.Object) 10.0f);
        boolean boolean39 = objList21.removeElem((java.lang.Object) objList29);
        objList9.add((int) (short) 1, (java.lang.Object) objList21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList9.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test438");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) (byte) 0);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (byte) 0);
        objList16.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean26 = objList7.removeElem((java.lang.Object) objList16);
        boolean boolean27 = objList0.removeElem((java.lang.Object) objList7);
        boolean boolean29 = objList0.removeElem((java.lang.Object) (-4));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test439");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        objList5.add(0, (java.lang.Object) 10.0f);
        boolean boolean15 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) (byte) 0);
        boolean boolean20 = objList16.removeElem((java.lang.Object) (-4));
        boolean boolean22 = objList16.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList23);
        boolean boolean32 = objList16.removeElem((java.lang.Object) (-10));
        boolean boolean33 = objList5.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 1L);
        boolean boolean48 = objList42.removeElem((java.lang.Object) (-1.0d));
        boolean boolean49 = objList37.removeElem((java.lang.Object) objList42);
        boolean boolean51 = objList42.removeElem((java.lang.Object) true);
        boolean boolean52 = objList34.removeElem((java.lang.Object) boolean51);
        boolean boolean53 = objList5.removeElem((java.lang.Object) boolean51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = objList5.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test440");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        boolean boolean18 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean19 = objList5.removeElem((java.lang.Object) objList8);
        boolean boolean20 = objList0.removeElem((java.lang.Object) boolean19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test441");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        boolean boolean21 = objList0.removeElem((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = objList0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test442");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        objList31.add(0, (java.lang.Object) 10.0f);
        boolean boolean41 = objList26.removeElem((java.lang.Object) objList31);
        objList13.add(0, (java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        boolean boolean48 = objList44.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean52 = objList44.removeElem((java.lang.Object) boolean51);
        boolean boolean54 = objList44.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) "");
        boolean boolean59 = objList55.removeElem((java.lang.Object) (-3));
        boolean boolean60 = objList44.removeElem((java.lang.Object) objList55);
        // The following exception was thrown during execution in test generation
        try {
            objList26.add((-6), (java.lang.Object) objList44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test443");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) (-3));
        boolean boolean19 = objList13.removeElem((java.lang.Object) 6);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean29 = objList25.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList25.removeElem((java.lang.Object) boolean32);
        boolean boolean35 = objList25.removeElem((java.lang.Object) (short) 0);
        boolean boolean36 = objList22.removeElem((java.lang.Object) objList25);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, (java.lang.Object) objList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test444");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        objList10.add(0, (java.lang.Object) (-1L));
        java.lang.Object obj24 = objList10.remove(0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean29 = objList25.removeElem((java.lang.Object) true);
        boolean boolean31 = objList25.removeElem((java.lang.Object) 4);
        objList25.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList35.removeElem((java.lang.Object) boolean42);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) (byte) 0);
        boolean boolean50 = objList44.removeElem((java.lang.Object) (byte) 0);
        objList44.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean54 = objList35.removeElem((java.lang.Object) objList44);
        boolean boolean56 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean57 = objList25.removeElem((java.lang.Object) objList35);
        boolean boolean58 = objList10.removeElem((java.lang.Object) objList25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = objList10.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test445");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "");
        boolean boolean12 = objList8.removeElem((java.lang.Object) 0L);
        boolean boolean14 = objList8.removeElem((java.lang.Object) (-5));
        objList8.add(0, (java.lang.Object) 10.0f);
        boolean boolean18 = objList0.removeElem((java.lang.Object) objList8);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) (byte) 0);
        boolean boolean23 = objList19.removeElem((java.lang.Object) (byte) 100);
        objList19.add(0, (java.lang.Object) 1);
        boolean boolean27 = objList8.removeElem((java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) (byte) 0);
        boolean boolean32 = objList28.removeElem((java.lang.Object) (byte) 100);
        objList28.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "");
        boolean boolean40 = objList36.removeElem((java.lang.Object) 0L);
        boolean boolean42 = objList36.removeElem((java.lang.Object) (-5));
        objList36.add(0, (java.lang.Object) 10.0f);
        boolean boolean46 = objList28.removeElem((java.lang.Object) objList36);
        boolean boolean47 = objList8.removeElem((java.lang.Object) objList28);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) (byte) 0);
        boolean boolean52 = objList48.removeElem((java.lang.Object) (-4));
        boolean boolean54 = objList48.removeElem((java.lang.Object) 1L);
        boolean boolean56 = objList48.removeElem((java.lang.Object) (-100));
        boolean boolean57 = objList8.removeElem((java.lang.Object) objList48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = objList48.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test446");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "hi!");
        boolean boolean22 = objList18.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList18.removeElem((java.lang.Object) boolean25);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) (byte) 0);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (byte) 0);
        objList27.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList27);
        boolean boolean38 = objList11.removeElem((java.lang.Object) objList18);
        boolean boolean39 = objList0.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) 1L);
        boolean boolean52 = objList46.removeElem((java.lang.Object) (-1.0d));
        boolean boolean53 = objList41.removeElem((java.lang.Object) objList46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) "hi!");
        boolean boolean58 = objList54.removeElem((java.lang.Object) true);
        boolean boolean60 = objList54.removeElem((java.lang.Object) 4);
        boolean boolean62 = objList54.removeElem((java.lang.Object) 1);
        boolean boolean64 = objList54.removeElem((java.lang.Object) 10);
        boolean boolean65 = objList46.removeElem((java.lang.Object) objList54);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) '4', (java.lang.Object) boolean65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test447");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean13 = objList7.removeElem((java.lang.Object) (-5));
        objList7.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 0L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-5));
        boolean boolean25 = objList17.removeElem((java.lang.Object) (-8));
        boolean boolean26 = objList7.removeElem((java.lang.Object) objList17);
        boolean boolean28 = objList7.removeElem((java.lang.Object) 0);
        boolean boolean29 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "hi!");
        boolean boolean35 = objList31.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList31.removeElem((java.lang.Object) boolean38);
        boolean boolean41 = objList31.removeElem((java.lang.Object) (-9));
        boolean boolean43 = objList31.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) boolean43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test448");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        objList11.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList0.add((int) (short) 0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-5));
        boolean boolean31 = objList23.removeElem((java.lang.Object) (-8));
        objList0.add((int) (byte) 0, (java.lang.Object) boolean31);
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(6, obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test449");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList0.removeElem(obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test450");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        boolean boolean83 = objList77.removeElem((java.lang.Object) (short) 0);
        boolean boolean84 = objList70.removeElem((java.lang.Object) objList77);
        boolean boolean85 = objList62.removeElem((java.lang.Object) objList70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = objList62.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=34");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test451");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test452");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList77.removeElem((java.lang.Object) (-4));
        boolean boolean83 = objList77.removeElem((java.lang.Object) (short) 0);
        boolean boolean84 = objList70.removeElem((java.lang.Object) objList77);
        boolean boolean85 = objList62.removeElem((java.lang.Object) objList70);
        // The following exception was thrown during execution in test generation
        try {
            objList70.add(4, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test453");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test454");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) '4');
        boolean boolean26 = objList22.removeElem((java.lang.Object) 100.0d);
        boolean boolean27 = objList11.removeElem((java.lang.Object) objList22);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList28.removeElem((java.lang.Object) true);
        boolean boolean34 = objList28.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "");
        boolean boolean38 = objList28.removeElem((java.lang.Object) objList35);
        boolean boolean39 = objList11.removeElem((java.lang.Object) objList35);
        boolean boolean40 = objList0.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) (byte) 0);
        boolean boolean45 = objList41.removeElem((java.lang.Object) (byte) 100);
        objList41.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        objList49.add(0, (java.lang.Object) 10.0f);
        boolean boolean59 = objList41.removeElem((java.lang.Object) objList49);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean64 = objList60.removeElem((java.lang.Object) (byte) 100);
        objList60.add(0, (java.lang.Object) 1);
        boolean boolean68 = objList49.removeElem((java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList69.removeElem((java.lang.Object) (byte) 0);
        boolean boolean73 = objList69.removeElem((java.lang.Object) (byte) 100);
        objList69.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) "");
        boolean boolean81 = objList77.removeElem((java.lang.Object) 0L);
        boolean boolean83 = objList77.removeElem((java.lang.Object) (-5));
        objList77.add(0, (java.lang.Object) 10.0f);
        boolean boolean87 = objList69.removeElem((java.lang.Object) objList77);
        boolean boolean88 = objList49.removeElem((java.lang.Object) objList69);
        boolean boolean89 = objList0.removeElem((java.lang.Object) boolean88);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-2), (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test455");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = objList0.removeElem((java.lang.Object) strComparableList11);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test456");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList56 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean57 = objList49.removeElem((java.lang.Object) objCollectionList56);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) (byte) 0);
        boolean boolean62 = objList58.removeElem((java.lang.Object) (-4));
        java.lang.Object obj63 = null;
        boolean boolean64 = objList58.removeElem(obj63);
        boolean boolean65 = objList49.removeElem((java.lang.Object) boolean64);
        boolean boolean66 = objList0.removeElem((java.lang.Object) objList49);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList49.replaceAll(objUnaryOperator67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test457");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean21 = objList17.removeElem((java.lang.Object) (byte) 100);
        boolean boolean22 = objList12.removeElem((java.lang.Object) (byte) 100);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList12.replaceAll(objUnaryOperator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test458");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-3));
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test459");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList4.removeElem((java.lang.Object) true);
        boolean boolean10 = objList4.removeElem((java.lang.Object) 4);
        boolean boolean12 = objList4.removeElem((java.lang.Object) 1);
        boolean boolean14 = objList4.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test460");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "");
        boolean boolean17 = objList13.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean22 = objList18.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList18.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList13.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        boolean boolean34 = objList26.removeElem((java.lang.Object) 1);
        boolean boolean36 = objList26.removeElem((java.lang.Object) 10);
        boolean boolean37 = objList18.removeElem((java.lang.Object) objList26);
        boolean boolean38 = objList5.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList50.removeElem((java.lang.Object) 100.0d);
        objList39.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "hi!");
        boolean boolean67 = objList63.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList63.removeElem((java.lang.Object) boolean70);
        boolean boolean73 = objList63.removeElem((java.lang.Object) (short) 0);
        boolean boolean74 = objList60.removeElem((java.lang.Object) objList63);
        boolean boolean76 = objList60.removeElem((java.lang.Object) 10);
        boolean boolean77 = objList39.removeElem((java.lang.Object) objList60);
        boolean boolean78 = objList26.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "");
        boolean boolean83 = objList79.removeElem((java.lang.Object) 0L);
        boolean boolean85 = objList79.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList86 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean87 = objList79.removeElem((java.lang.Object) objCollectionList86);
        boolean boolean88 = objList39.removeElem((java.lang.Object) objCollectionList86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = objList39.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test461");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        objList10.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        boolean boolean26 = objList20.removeElem((java.lang.Object) (-5));
        boolean boolean28 = objList20.removeElem((java.lang.Object) (-8));
        boolean boolean29 = objList10.removeElem((java.lang.Object) objList20);
        boolean boolean30 = objList0.removeElem((java.lang.Object) objList10);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList10.replaceAll(objUnaryOperator31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test462");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-10));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test463");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList7.removeElem((java.lang.Object) boolean14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object obj21 = objList18.remove((int) (short) 0);
        boolean boolean22 = objList7.removeElem(obj21);
        boolean boolean23 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test464");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean13 = objList5.removeElem((java.lang.Object) boolean12);
        boolean boolean15 = objList5.removeElem((java.lang.Object) (-9));
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) (byte) 0);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList17.removeElem((java.lang.Object) 100.0d);
        boolean boolean26 = objList0.removeElem((java.lang.Object) 100.0d);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test465");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        boolean boolean19 = objList15.removeElem((java.lang.Object) 0L);
        boolean boolean21 = objList15.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        boolean boolean28 = objList22.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        boolean boolean35 = objList29.removeElem((java.lang.Object) 4);
        boolean boolean36 = objList22.removeElem((java.lang.Object) 4);
        boolean boolean37 = objList15.removeElem((java.lang.Object) boolean36);
        boolean boolean38 = objList0.removeElem((java.lang.Object) boolean37);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test466");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        boolean boolean16 = objList3.removeElem((java.lang.Object) 1.0f);
        boolean boolean18 = objList3.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList19.removeElem((java.lang.Object) true);
        boolean boolean25 = objList19.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "");
        boolean boolean29 = objList19.removeElem((java.lang.Object) objList26);
        boolean boolean30 = objList3.removeElem((java.lang.Object) objList19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean42 = objList34.removeElem((java.lang.Object) boolean41);
        boolean boolean44 = objList34.removeElem((java.lang.Object) (short) 0);
        boolean boolean45 = objList31.removeElem((java.lang.Object) objList34);
        boolean boolean47 = objList34.removeElem((java.lang.Object) 1.0f);
        boolean boolean48 = objList3.removeElem((java.lang.Object) boolean47);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test467");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1.0f);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test468");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test469");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (short) 0);
        boolean boolean22 = objList7.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = objList7.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test470");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "hi!");
        boolean boolean13 = objList5.removeElem((java.lang.Object) boolean12);
        boolean boolean15 = objList5.removeElem((java.lang.Object) (-9));
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-1.0d));
        boolean boolean25 = objList17.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "");
        boolean boolean30 = objList26.removeElem((java.lang.Object) 0L);
        boolean boolean32 = objList26.removeElem((java.lang.Object) (-5));
        objList26.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "");
        boolean boolean40 = objList36.removeElem((java.lang.Object) 0L);
        boolean boolean42 = objList36.removeElem((java.lang.Object) (-5));
        boolean boolean44 = objList36.removeElem((java.lang.Object) (-8));
        boolean boolean45 = objList26.removeElem((java.lang.Object) objList36);
        boolean boolean46 = objList17.removeElem((java.lang.Object) boolean45);
        boolean boolean47 = objList0.removeElem((java.lang.Object) boolean45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = objList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test471");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test472");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList12 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean13 = objList5.removeElem((java.lang.Object) objCollectionList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean18 = objList14.removeElem((java.lang.Object) (-4));
        java.lang.Object obj19 = null;
        boolean boolean20 = objList14.removeElem(obj19);
        boolean boolean21 = objList5.removeElem((java.lang.Object) boolean20);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-5));
        objList23.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-5));
        boolean boolean41 = objList33.removeElem((java.lang.Object) (-8));
        boolean boolean42 = objList23.removeElem((java.lang.Object) objList33);
        objList33.add(0, (java.lang.Object) (-1L));
        objList5.add(0, (java.lang.Object) objList33);
        boolean boolean47 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean54 = objList50.removeElem((java.lang.Object) (-4));
        boolean boolean56 = objList50.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) (byte) 0);
        boolean boolean61 = objList57.removeElem((java.lang.Object) (-4));
        boolean boolean63 = objList57.removeElem((java.lang.Object) (short) 0);
        boolean boolean64 = objList50.removeElem((java.lang.Object) objList57);
        boolean boolean65 = objList49.removeElem((java.lang.Object) objList50);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) ' ', (java.lang.Object) objList50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test473");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        objList0.add(0, (java.lang.Object) (-1.0d));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test474");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList13.removeElem((java.lang.Object) 1);
        boolean boolean23 = objList13.removeElem((java.lang.Object) 10);
        boolean boolean24 = objList5.removeElem((java.lang.Object) objList13);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList26.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        objList31.add(0, (java.lang.Object) 10.0f);
        boolean boolean41 = objList26.removeElem((java.lang.Object) objList31);
        objList13.add(0, (java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = objList13.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test475");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        java.lang.Object obj69 = objList62.remove(10);
        java.lang.Object obj71 = objList62.remove(4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = objList72.removeElem((java.lang.Object) (byte) 0);
        boolean boolean76 = objList72.removeElem((java.lang.Object) (-4));
        boolean boolean77 = objList62.removeElem((java.lang.Object) (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = objList62.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=33");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test476");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "");
        boolean boolean18 = objList14.removeElem((java.lang.Object) 1L);
        boolean boolean20 = objList14.removeElem((java.lang.Object) (-1.0d));
        boolean boolean21 = objList9.removeElem((java.lang.Object) objList14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean39 = objList35.removeElem((java.lang.Object) true);
        boolean boolean41 = objList35.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList35.removeElem((java.lang.Object) 1);
        boolean boolean45 = objList35.removeElem((java.lang.Object) 10);
        boolean boolean46 = objList27.removeElem((java.lang.Object) objList35);
        boolean boolean47 = objList14.removeElem((java.lang.Object) objList35);
        boolean boolean48 = objList0.removeElem((java.lang.Object) objList35);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean53 = objList49.removeElem((java.lang.Object) true);
        boolean boolean55 = objList49.removeElem((java.lang.Object) 4);
        objList49.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) (byte) 0);
        boolean boolean66 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean68 = objList60.removeElem((java.lang.Object) 100.0d);
        objList49.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        boolean boolean78 = objList70.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "hi!");
        boolean boolean83 = objList79.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList84 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean86 = objList84.removeElem((java.lang.Object) "hi!");
        boolean boolean87 = objList79.removeElem((java.lang.Object) boolean86);
        boolean boolean89 = objList79.removeElem((java.lang.Object) (short) 0);
        boolean boolean90 = objList70.removeElem((java.lang.Object) objList79);
        boolean boolean91 = objList49.removeElem((java.lang.Object) objList79);
        boolean boolean92 = objList35.removeElem((java.lang.Object) objList49);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator93 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList35.replaceAll(objUnaryOperator93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test477");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        boolean boolean16 = objList0.removeElem((java.lang.Object) (-10));
        java.lang.Object obj18 = null;
        objList0.add(0, obj18);
        java.lang.Object obj21 = objList0.remove((int) (short) 0);
        boolean boolean23 = objList0.removeElem((java.lang.Object) (-100));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test478");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (byte) 0);
        objList9.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList9);
        boolean boolean21 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>> objIterableList22 = new DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean23 = objList0.removeElem((java.lang.Object) objIterableList22);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) (byte) 0);
        boolean boolean29 = objList25.removeElem((java.lang.Object) (byte) 100);
        objList25.add(0, (java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(5, (java.lang.Object) objList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test479");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) (byte) 0);
        boolean boolean5 = objList1.removeElem((java.lang.Object) (-4));
        boolean boolean7 = objList1.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) (byte) 0);
        boolean boolean12 = objList8.removeElem((java.lang.Object) (-4));
        boolean boolean14 = objList8.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList8);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList1);
        boolean boolean18 = objList0.removeElem((java.lang.Object) false);
        java.lang.Object obj21 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        boolean boolean28 = objList22.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList51 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean53 = objList51.removeElem((java.lang.Object) "");
        boolean boolean55 = objList51.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "");
        boolean boolean63 = objList59.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList66 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList67 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean69 = objList67.removeElem((java.lang.Object) "hi!");
        boolean boolean71 = objList67.removeElem((java.lang.Object) true);
        boolean boolean73 = objList67.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList80 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray81 = new java.lang.Object[] { (-1), obj21, objList22, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList36, 1.0d, (short) 1, objList39, (-4), (-4), boolean46, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList66, boolean73, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList79, objCollectionList80 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList82 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList82, objArray81);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList84 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean86 = objList84.removeElem((java.lang.Object) "");
        boolean boolean87 = objList82.removeElem((java.lang.Object) boolean86);
        java.lang.Object obj89 = objList82.remove(10);
        java.lang.Object obj91 = objList82.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) ' ', obj91);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test480");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 1L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-1.0d));
        boolean boolean23 = objList11.removeElem((java.lang.Object) objList16);
        boolean boolean24 = objList7.removeElem((java.lang.Object) objList16);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean29 = objList25.removeElem((java.lang.Object) true);
        boolean boolean31 = objList25.removeElem((java.lang.Object) (-1.0d));
        boolean boolean33 = objList25.removeElem((java.lang.Object) (-6));
        boolean boolean34 = objList16.removeElem((java.lang.Object) objList25);
        // The following exception was thrown during execution in test generation
        try {
            objList16.add(4, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test481");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test482");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        boolean boolean16 = objList10.removeElem((java.lang.Object) (-5));
        boolean boolean18 = objList10.removeElem((java.lang.Object) (-8));
        boolean boolean19 = objList0.removeElem((java.lang.Object) objList10);
        boolean boolean21 = objList10.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = objList10.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test483");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList15.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList15.removeElem((java.lang.Object) boolean22);
        boolean boolean25 = objList15.removeElem((java.lang.Object) (-9));
        boolean boolean26 = objList10.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList27.removeElem((java.lang.Object) true);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean35 = objList27.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "");
        boolean boolean40 = objList36.removeElem((java.lang.Object) 0L);
        boolean boolean42 = objList36.removeElem((java.lang.Object) (-5));
        objList36.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) 0L);
        boolean boolean52 = objList46.removeElem((java.lang.Object) (-5));
        boolean boolean54 = objList46.removeElem((java.lang.Object) (-8));
        boolean boolean55 = objList36.removeElem((java.lang.Object) objList46);
        boolean boolean56 = objList27.removeElem((java.lang.Object) boolean55);
        boolean boolean57 = objList10.removeElem((java.lang.Object) boolean55);
        objList0.add(0, (java.lang.Object) objList10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = objList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test484");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        // The following exception was thrown during execution in test generation
        try {
            objList12.add((int) (byte) -1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test485");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList12 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean13 = objList5.removeElem((java.lang.Object) objCollectionList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean18 = objList14.removeElem((java.lang.Object) (-4));
        java.lang.Object obj19 = null;
        boolean boolean20 = objList14.removeElem(obj19);
        boolean boolean21 = objList5.removeElem((java.lang.Object) boolean20);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-5));
        objList23.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-5));
        boolean boolean41 = objList33.removeElem((java.lang.Object) (-8));
        boolean boolean42 = objList23.removeElem((java.lang.Object) objList33);
        objList33.add(0, (java.lang.Object) (-1L));
        objList5.add(0, (java.lang.Object) objList33);
        boolean boolean47 = objList0.removeElem((java.lang.Object) objList5);
        java.lang.Object obj48 = new java.lang.Object();
        boolean boolean49 = objList5.removeElem(obj48);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList51 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean53 = objList51.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) "hi!");
        boolean boolean58 = objList54.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "hi!");
        boolean boolean62 = objList54.removeElem((java.lang.Object) boolean61);
        boolean boolean64 = objList54.removeElem((java.lang.Object) (short) 0);
        boolean boolean65 = objList51.removeElem((java.lang.Object) objList54);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "hi!");
        boolean boolean74 = objList66.removeElem((java.lang.Object) boolean73);
        boolean boolean76 = objList66.removeElem((java.lang.Object) (-9));
        boolean boolean77 = objList54.removeElem((java.lang.Object) objList66);
        // The following exception was thrown during execution in test generation
        try {
            objList5.add((int) (short) 100, (java.lang.Object) boolean77);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test486");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
        boolean boolean13 = objList3.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList3);
        boolean boolean16 = objList0.removeElem((java.lang.Object) 10);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test487");
        java.lang.Object obj1 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean4 = objList2.removeElem((java.lang.Object) "hi!");
        boolean boolean6 = objList2.removeElem((java.lang.Object) true);
        boolean boolean8 = objList2.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList46 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList47.removeElem((java.lang.Object) true);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList60 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1), obj1, objList2, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList16, 1.0d, (short) 1, objList19, (-4), (-4), boolean26, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList46, boolean53, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList59, objCollectionList60 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean67 = objList62.removeElem((java.lang.Object) boolean66);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList69.removeElem((java.lang.Object) "");
        boolean boolean73 = objList69.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList74 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean76 = objList74.removeElem((java.lang.Object) "");
        boolean boolean78 = objList74.removeElem((java.lang.Object) 1L);
        boolean boolean80 = objList74.removeElem((java.lang.Object) (-1.0d));
        boolean boolean81 = objList69.removeElem((java.lang.Object) objList74);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList82 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean84 = objList82.removeElem((java.lang.Object) "hi!");
        boolean boolean86 = objList82.removeElem((java.lang.Object) true);
        boolean boolean88 = objList82.removeElem((java.lang.Object) 4);
        boolean boolean90 = objList82.removeElem((java.lang.Object) 1);
        boolean boolean92 = objList82.removeElem((java.lang.Object) 10);
        boolean boolean93 = objList74.removeElem((java.lang.Object) objList82);
        objList62.add(5, (java.lang.Object) objList82);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator95 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test488");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) '4');
        boolean boolean15 = objList11.removeElem((java.lang.Object) 100.0d);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 1L);
        boolean boolean28 = objList22.removeElem((java.lang.Object) (-1.0d));
        boolean boolean29 = objList17.removeElem((java.lang.Object) objList22);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean34 = objList30.removeElem((java.lang.Object) true);
        boolean boolean36 = objList30.removeElem((java.lang.Object) 4);
        boolean boolean38 = objList30.removeElem((java.lang.Object) 1);
        boolean boolean40 = objList30.removeElem((java.lang.Object) 10);
        boolean boolean41 = objList22.removeElem((java.lang.Object) objList30);
        boolean boolean42 = objList11.removeElem((java.lang.Object) objList22);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        boolean boolean48 = objList44.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            objList22.add((-1), (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test489");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test490");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test491");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test492");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        objList0.add((int) (byte) 0, (java.lang.Object) (short) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) (byte) 0);
        boolean boolean22 = objList18.removeElem((java.lang.Object) (-4));
        boolean boolean24 = objList18.removeElem((java.lang.Object) (short) 0);
        boolean boolean25 = objList11.removeElem((java.lang.Object) objList18);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) objList18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test493");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (short) 0);
        java.lang.Object obj12 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) "");
        boolean boolean54 = objList50.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList57 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "hi!");
        boolean boolean62 = objList58.removeElem((java.lang.Object) true);
        boolean boolean64 = objList58.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList71 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1), obj12, objList13, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList27, 1.0d, (short) 1, objList30, (-4), (-4), boolean37, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList57, boolean64, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList70, objCollectionList71 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList73, objArray72);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "");
        boolean boolean78 = objList73.removeElem((java.lang.Object) boolean77);
        java.lang.Object obj80 = objList73.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList73.removeElem((java.lang.Object) objList81);
        boolean boolean83 = objList0.removeElem((java.lang.Object) boolean82);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator84 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test494");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean19 = objList11.removeElem((java.lang.Object) 100.0d);
        objList0.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList26.removeElem((java.lang.Object) true);
        boolean boolean32 = objList26.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean36 = objList26.removeElem((java.lang.Object) objList33);
        boolean boolean37 = objList21.removeElem((java.lang.Object) objList33);
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = objList21.removeElem(obj38);
        boolean boolean40 = objList0.removeElem(obj38);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test495");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList19, objArray18);
        java.lang.Object obj22 = objList19.remove((int) (short) 0);
        boolean boolean23 = objList8.removeElem(obj22);
        boolean boolean25 = objList8.removeElem((java.lang.Object) 1.0f);
        objList0.add(0, (java.lang.Object) objList8);
        java.lang.Object obj28 = null;
        objList0.add((int) (byte) 1, obj28);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "");
        boolean boolean40 = objList36.removeElem((java.lang.Object) 1L);
        boolean boolean42 = objList36.removeElem((java.lang.Object) (-1.0d));
        boolean boolean43 = objList31.removeElem((java.lang.Object) objList36);
        boolean boolean45 = objList31.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-10), (java.lang.Object) objList31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test496");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList8.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList8.removeElem((java.lang.Object) boolean15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList19, objArray18);
        java.lang.Object obj22 = objList19.remove((int) (short) 0);
        boolean boolean23 = objList8.removeElem(obj22);
        boolean boolean25 = objList8.removeElem((java.lang.Object) 1.0f);
        objList0.add(0, (java.lang.Object) objList8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = objList8.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test497");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        objList11.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList0.add((int) (short) 0, (java.lang.Object) (byte) 1);
        java.lang.Object obj23 = objList0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test498");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean9 = objList5.removeElem((java.lang.Object) true);
        boolean boolean11 = objList5.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean15 = objList5.removeElem((java.lang.Object) objList12);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean25 = objList17.removeElem((java.lang.Object) boolean24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) (byte) 0);
        boolean boolean32 = objList26.removeElem((java.lang.Object) (byte) 0);
        objList26.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean36 = objList17.removeElem((java.lang.Object) objList26);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean40 = objList38.removeElem((java.lang.Object) (byte) 0);
        boolean boolean42 = objList38.removeElem((java.lang.Object) (byte) 100);
        objList38.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) 0L);
        boolean boolean52 = objList46.removeElem((java.lang.Object) (-5));
        objList46.add(0, (java.lang.Object) 10.0f);
        boolean boolean56 = objList38.removeElem((java.lang.Object) objList46);
        objList26.add((int) (short) 1, (java.lang.Object) objList38);
        boolean boolean58 = objList0.removeElem((java.lang.Object) objList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = objList26.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test499");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) (byte) 0);
        boolean boolean10 = objList6.removeElem((java.lang.Object) (byte) 100);
        objList6.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList14 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean15 = objList6.removeElem((java.lang.Object) objCollectionList14);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-2), (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test500");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

