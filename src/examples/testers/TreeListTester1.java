package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeListTester1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test501");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) '#', (java.lang.Object) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test502");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        java.lang.Object obj11 = objList0.remove(0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList13.removeElem((java.lang.Object) boolean20);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "");
        boolean boolean39 = objList35.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        boolean boolean44 = objList40.removeElem((java.lang.Object) 1L);
        boolean boolean46 = objList40.removeElem((java.lang.Object) (-1.0d));
        boolean boolean47 = objList35.removeElem((java.lang.Object) objList40);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "hi!");
        boolean boolean52 = objList48.removeElem((java.lang.Object) true);
        boolean boolean54 = objList48.removeElem((java.lang.Object) 4);
        boolean boolean56 = objList48.removeElem((java.lang.Object) 1);
        boolean boolean58 = objList48.removeElem((java.lang.Object) 10);
        boolean boolean59 = objList40.removeElem((java.lang.Object) objList48);
        boolean boolean60 = objList27.removeElem((java.lang.Object) objList48);
        boolean boolean61 = objList13.removeElem((java.lang.Object) objList48);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-2), (java.lang.Object) boolean61);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test503");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList7.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test504");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test505");
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
            objList0.replaceAll(objUnaryOperator48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test506");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test507");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 0L);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (-5));
        boolean boolean17 = objList9.removeElem((java.lang.Object) 1L);
        boolean boolean19 = objList9.removeElem((java.lang.Object) (-1));
        boolean boolean20 = objList0.removeElem((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) (byte) 0);
        boolean boolean28 = objList22.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList22.removeElem((java.lang.Object) 100.0d);
        boolean boolean32 = objList22.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test508");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator48 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList28.replaceAll(objUnaryOperator48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test509");
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
        boolean boolean45 = objList43.removeElem((java.lang.Object) "hi!");
        boolean boolean47 = objList43.removeElem((java.lang.Object) true);
        boolean boolean49 = objList43.removeElem((java.lang.Object) 4);
        objList43.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) (byte) 0);
        boolean boolean58 = objList54.removeElem((java.lang.Object) (-4));
        boolean boolean60 = objList54.removeElem((java.lang.Object) 1L);
        objList54.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList43.add((int) (short) 0, (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList28.add(100, (java.lang.Object) objList43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test510");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 1L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-1.0d));
        boolean boolean19 = objList7.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "");
        boolean boolean29 = objList25.removeElem((java.lang.Object) 1L);
        boolean boolean31 = objList25.removeElem((java.lang.Object) (-1.0d));
        boolean boolean32 = objList20.removeElem((java.lang.Object) objList25);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "hi!");
        boolean boolean37 = objList33.removeElem((java.lang.Object) true);
        boolean boolean39 = objList33.removeElem((java.lang.Object) 4);
        boolean boolean41 = objList33.removeElem((java.lang.Object) 1);
        boolean boolean43 = objList33.removeElem((java.lang.Object) 10);
        boolean boolean44 = objList25.removeElem((java.lang.Object) objList33);
        boolean boolean45 = objList12.removeElem((java.lang.Object) objList33);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "hi!");
        boolean boolean50 = objList46.removeElem((java.lang.Object) true);
        boolean boolean52 = objList46.removeElem((java.lang.Object) 4);
        objList46.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean63 = objList57.removeElem((java.lang.Object) (byte) 0);
        boolean boolean65 = objList57.removeElem((java.lang.Object) 100.0d);
        objList46.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList67 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean69 = objList67.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) "hi!");
        boolean boolean74 = objList70.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "hi!");
        boolean boolean78 = objList70.removeElem((java.lang.Object) boolean77);
        boolean boolean80 = objList70.removeElem((java.lang.Object) (short) 0);
        boolean boolean81 = objList67.removeElem((java.lang.Object) objList70);
        boolean boolean83 = objList67.removeElem((java.lang.Object) 10);
        boolean boolean84 = objList46.removeElem((java.lang.Object) objList67);
        boolean boolean85 = objList33.removeElem((java.lang.Object) objList46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList86 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean88 = objList86.removeElem((java.lang.Object) "");
        boolean boolean90 = objList86.removeElem((java.lang.Object) 0L);
        boolean boolean92 = objList86.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList93 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean94 = objList86.removeElem((java.lang.Object) objCollectionList93);
        boolean boolean95 = objList46.removeElem((java.lang.Object) objCollectionList93);
        boolean boolean96 = objList0.removeElem((java.lang.Object) boolean95);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test511");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList6.removeElem((java.lang.Object) (-5));
        objList6.add(0, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-6), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test512");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "hi!");
        boolean boolean24 = objList20.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList20.removeElem((java.lang.Object) boolean27);
        boolean boolean30 = objList20.removeElem((java.lang.Object) (short) 0);
        boolean boolean31 = objList17.removeElem((java.lang.Object) objList20);
        boolean boolean32 = objList11.removeElem((java.lang.Object) boolean31);
        java.lang.Object obj33 = null;
        boolean boolean34 = objList11.removeElem(obj33);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test513");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        objList0.add((int) (byte) 0, (java.lang.Object) (short) 10);
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test514");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList23.removeElem((java.lang.Object) true);
        boolean boolean29 = objList23.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean34 = objList30.removeElem((java.lang.Object) true);
        boolean boolean36 = objList30.removeElem((java.lang.Object) 4);
        boolean boolean37 = objList23.removeElem((java.lang.Object) 4);
        boolean boolean38 = objList11.removeElem((java.lang.Object) 4);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test515");
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
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (-4));
        boolean boolean27 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean29 = objList21.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean34 = objList30.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList30.removeElem((java.lang.Object) boolean37);
        boolean boolean40 = objList30.removeElem((java.lang.Object) (short) 0);
        boolean boolean41 = objList21.removeElem((java.lang.Object) objList30);
        boolean boolean42 = objList0.removeElem((java.lang.Object) objList30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = objList0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test516");
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
        boolean boolean54 = objList0.removeElem((java.lang.Object) (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = objList0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test517");
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
        boolean boolean26 = objList13.removeElem((java.lang.Object) (-5));
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList13.replaceAll(objUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test518");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 1L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-1.0d));
        boolean boolean24 = objList12.removeElem((java.lang.Object) objList17);
        boolean boolean26 = objList17.removeElem((java.lang.Object) true);
        boolean boolean27 = objList9.removeElem((java.lang.Object) boolean26);
        boolean boolean28 = objList0.removeElem((java.lang.Object) boolean27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean34 = objList30.removeElem((java.lang.Object) true);
        boolean boolean36 = objList30.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "hi!");
        boolean boolean41 = objList37.removeElem((java.lang.Object) true);
        boolean boolean43 = objList37.removeElem((java.lang.Object) 4);
        boolean boolean44 = objList30.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 1, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test519");
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
        boolean boolean42 = objList40.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) (byte) 0);
        boolean boolean46 = objList40.removeElem((java.lang.Object) (byte) 0);
        boolean boolean48 = objList40.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) 10, (java.lang.Object) objList40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test520");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        boolean boolean29 = objList21.removeElem((java.lang.Object) (-8));
        boolean boolean31 = objList21.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "hi!");
        boolean boolean36 = objList32.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "hi!");
        boolean boolean40 = objList32.removeElem((java.lang.Object) boolean39);
        boolean boolean42 = objList32.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) '4');
        boolean boolean47 = objList43.removeElem((java.lang.Object) 100.0d);
        boolean boolean48 = objList32.removeElem((java.lang.Object) objList43);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean53 = objList49.removeElem((java.lang.Object) true);
        boolean boolean55 = objList49.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "");
        boolean boolean59 = objList49.removeElem((java.lang.Object) objList56);
        boolean boolean60 = objList32.removeElem((java.lang.Object) objList56);
        boolean boolean61 = objList21.removeElem((java.lang.Object) objList32);
        boolean boolean62 = objList0.removeElem((java.lang.Object) boolean61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = objList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test521");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        boolean boolean26 = objList20.removeElem((java.lang.Object) (-5));
        boolean boolean28 = objList20.removeElem((java.lang.Object) (-8));
        boolean boolean29 = objList0.removeElem((java.lang.Object) objList20);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test522");
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
        DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.Object>> objListList50 = new DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.Object>>();
        objList0.add(0, (java.lang.Object) objListList50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = objList0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test523");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-5));
        objList12.add(0, (java.lang.Object) 10.0f);
        boolean boolean22 = objList7.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-4));
        boolean boolean29 = objList23.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) (byte) 0);
        boolean boolean34 = objList30.removeElem((java.lang.Object) (-4));
        boolean boolean36 = objList30.removeElem((java.lang.Object) (short) 0);
        boolean boolean37 = objList23.removeElem((java.lang.Object) objList30);
        boolean boolean39 = objList23.removeElem((java.lang.Object) (-10));
        boolean boolean40 = objList12.removeElem((java.lang.Object) objList23);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "");
        boolean boolean48 = objList44.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 1L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-1.0d));
        boolean boolean56 = objList44.removeElem((java.lang.Object) objList49);
        boolean boolean58 = objList49.removeElem((java.lang.Object) true);
        boolean boolean59 = objList41.removeElem((java.lang.Object) boolean58);
        boolean boolean60 = objList12.removeElem((java.lang.Object) boolean58);
        java.lang.Object obj62 = objList12.remove(0);
        boolean boolean63 = objList0.removeElem(obj62);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test524");
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
        boolean boolean34 = objList0.removeElem((java.lang.Object) 1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test525");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        boolean boolean17 = objList11.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean21 = objList11.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList22.removeElem((java.lang.Object) boolean29);
        boolean boolean32 = objList22.removeElem((java.lang.Object) (short) 0);
        boolean boolean33 = objList18.removeElem((java.lang.Object) objList22);
        boolean boolean34 = objList0.removeElem((java.lang.Object) objList18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test526");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = objList82.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test527");
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
        java.lang.Object obj87 = objList62.remove((int) ' ');
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test528");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        boolean boolean28 = objList16.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        boolean boolean35 = objList29.removeElem((java.lang.Object) 4);
        boolean boolean37 = objList29.removeElem((java.lang.Object) 1);
        boolean boolean39 = objList29.removeElem((java.lang.Object) 10);
        boolean boolean40 = objList21.removeElem((java.lang.Object) objList29);
        boolean boolean41 = objList0.removeElem((java.lang.Object) objList21);
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
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test529");
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
        objList0.add((int) (short) 1, (java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) (byte) 0);
        boolean boolean45 = objList41.removeElem((java.lang.Object) (byte) 100);
        objList41.add(0, (java.lang.Object) 1);
        boolean boolean49 = objList0.removeElem((java.lang.Object) 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test530");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        boolean boolean9 = objList3.removeElem((java.lang.Object) 4);
        boolean boolean10 = objList0.removeElem((java.lang.Object) boolean9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean16 = objList12.removeElem((java.lang.Object) (-4));
        boolean boolean18 = objList12.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) (byte) 0);
        boolean boolean23 = objList19.removeElem((java.lang.Object) (-4));
        boolean boolean25 = objList19.removeElem((java.lang.Object) (short) 0);
        boolean boolean26 = objList12.removeElem((java.lang.Object) objList19);
        boolean boolean27 = objList11.removeElem((java.lang.Object) objList12);
        boolean boolean29 = objList11.removeElem((java.lang.Object) false);
        boolean boolean30 = objList0.removeElem((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = objList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test531");
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
        boolean boolean23 = objList11.removeElem((java.lang.Object) 100);
        boolean boolean24 = objList0.removeElem((java.lang.Object) boolean23);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test532");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = objList82.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test533");
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
        java.lang.Object obj55 = objList5.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = objList5.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test534");
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
            java.lang.Object obj14 = objList0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test535");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test536");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = objList8.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test537");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean37 = objList29.removeElem((java.lang.Object) boolean36);
        boolean boolean39 = objList29.removeElem((java.lang.Object) (-9));
        boolean boolean41 = objList29.removeElem((java.lang.Object) 100);
        boolean boolean43 = objList29.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList7.add(1, (java.lang.Object) boolean43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test538");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        java.lang.Object obj11 = objList0.remove(0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) (byte) 0);
        boolean boolean17 = objList13.removeElem((java.lang.Object) (-4));
        boolean boolean19 = objList13.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) (byte) 0);
        boolean boolean24 = objList20.removeElem((java.lang.Object) (-4));
        boolean boolean26 = objList20.removeElem((java.lang.Object) (short) 0);
        boolean boolean27 = objList13.removeElem((java.lang.Object) objList20);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList30, objArray29);
        java.lang.Object obj33 = objList30.remove((int) (short) 0);
        boolean boolean34 = objList13.removeElem((java.lang.Object) objList30);
        boolean boolean36 = objList13.removeElem((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(1, (java.lang.Object) boolean36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test539");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        boolean boolean16 = objList5.removeElem((java.lang.Object) 8);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test540");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test541");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test542");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = objList0.removeElem((java.lang.Object) strList3);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) objList5);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test543");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test544");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        boolean boolean17 = objList11.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) (byte) 0);
        boolean boolean22 = objList18.removeElem((java.lang.Object) (-4));
        boolean boolean24 = objList18.removeElem((java.lang.Object) (short) 0);
        boolean boolean25 = objList11.removeElem((java.lang.Object) objList18);
        boolean boolean27 = objList11.removeElem((java.lang.Object) (-10));
        java.lang.Object obj29 = null;
        objList11.add(0, obj29);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(2, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test545");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList2 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.lang.Object obj5 = objList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList2.add((int) '4', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test546");
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
            java.lang.Object obj18 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test547");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "hi!");
        boolean boolean24 = objList20.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList20.removeElem((java.lang.Object) boolean27);
        boolean boolean30 = objList20.removeElem((java.lang.Object) (short) 0);
        boolean boolean31 = objList17.removeElem((java.lang.Object) objList20);
        boolean boolean32 = objList11.removeElem((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList11.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test548");
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
        boolean boolean55 = objList28.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = objList28.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test549");
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
        objList24.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) "hi!");
        boolean boolean40 = objList36.removeElem((java.lang.Object) true);
        boolean boolean42 = objList36.removeElem((java.lang.Object) 4);
        boolean boolean43 = objList33.removeElem((java.lang.Object) boolean42);
        // The following exception was thrown during execution in test generation
        try {
            objList24.add((int) '#', (java.lang.Object) boolean42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test550");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList19 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean20 = objList12.removeElem((java.lang.Object) objCollectionList19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (-4));
        java.lang.Object obj26 = null;
        boolean boolean27 = objList21.removeElem(obj26);
        boolean boolean28 = objList12.removeElem((java.lang.Object) boolean27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean34 = objList30.removeElem((java.lang.Object) 0L);
        boolean boolean36 = objList30.removeElem((java.lang.Object) (-5));
        objList30.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        boolean boolean44 = objList40.removeElem((java.lang.Object) 0L);
        boolean boolean46 = objList40.removeElem((java.lang.Object) (-5));
        boolean boolean48 = objList40.removeElem((java.lang.Object) (-8));
        boolean boolean49 = objList30.removeElem((java.lang.Object) objList40);
        objList40.add(0, (java.lang.Object) (-1L));
        objList12.add(0, (java.lang.Object) objList40);
        boolean boolean54 = objList7.removeElem((java.lang.Object) objList12);
        boolean boolean55 = objList0.removeElem((java.lang.Object) boolean54);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "");
        boolean boolean60 = objList56.removeElem((java.lang.Object) 0L);
        boolean boolean62 = objList56.removeElem((java.lang.Object) (-5));
        objList56.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "");
        boolean boolean70 = objList66.removeElem((java.lang.Object) 0L);
        boolean boolean72 = objList66.removeElem((java.lang.Object) (-5));
        boolean boolean74 = objList66.removeElem((java.lang.Object) (-8));
        boolean boolean75 = objList56.removeElem((java.lang.Object) objList66);
        objList66.add(0, (java.lang.Object) (-1L));
        java.lang.Object obj80 = objList66.remove(0);
        boolean boolean81 = objList0.removeElem((java.lang.Object) objList66);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator82 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList66.replaceAll(objUnaryOperator82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test551");
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
        objList13.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) (byte) 0);
        boolean boolean30 = objList24.removeElem((java.lang.Object) (byte) 0);
        boolean boolean32 = objList24.removeElem((java.lang.Object) 100.0d);
        objList13.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "hi!");
        boolean boolean41 = objList37.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "hi!");
        boolean boolean45 = objList37.removeElem((java.lang.Object) boolean44);
        boolean boolean47 = objList37.removeElem((java.lang.Object) (short) 0);
        boolean boolean48 = objList34.removeElem((java.lang.Object) objList37);
        boolean boolean50 = objList34.removeElem((java.lang.Object) 10);
        boolean boolean51 = objList13.removeElem((java.lang.Object) objList34);
        boolean boolean52 = objList5.removeElem((java.lang.Object) boolean51);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test552");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean37 = objList29.removeElem((java.lang.Object) boolean36);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList40, objArray39);
        java.lang.Object obj43 = objList40.remove((int) (short) 0);
        boolean boolean44 = objList29.removeElem(obj43);
        boolean boolean46 = objList29.removeElem((java.lang.Object) 1.0f);
        boolean boolean47 = objList1.removeElem((java.lang.Object) 1.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "");
        boolean boolean52 = objList48.removeElem((java.lang.Object) 0L);
        boolean boolean54 = objList48.removeElem((java.lang.Object) (-5));
        boolean boolean56 = objList48.removeElem((java.lang.Object) (-8));
        java.lang.Object obj57 = null;
        boolean boolean58 = objList48.removeElem(obj57);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) (byte) 0);
        boolean boolean63 = objList59.removeElem((java.lang.Object) (-4));
        boolean boolean65 = objList59.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "hi!");
        boolean boolean74 = objList66.removeElem((java.lang.Object) boolean73);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList78 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean80 = objList78.removeElem((java.lang.Object) (byte) 0);
        boolean boolean81 = objList75.removeElem((java.lang.Object) (byte) 0);
        objList75.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean85 = objList66.removeElem((java.lang.Object) objList75);
        boolean boolean86 = objList59.removeElem((java.lang.Object) objList66);
        boolean boolean87 = objList48.removeElem((java.lang.Object) objList66);
        boolean boolean88 = objList1.removeElem((java.lang.Object) boolean87);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test553");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator48 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList8.replaceAll(objUnaryOperator48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test554");
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
            java.lang.Object obj18 = objList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test555");
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
        boolean boolean33 = objList31.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) (byte) 0);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (byte) 0);
        boolean boolean38 = objList10.removeElem((java.lang.Object) (byte) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList10.replaceAll(objUnaryOperator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test556");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList10.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test557");
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
        boolean boolean44 = objList42.removeElem((java.lang.Object) "hi!");
        boolean boolean46 = objList42.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean50 = objList42.removeElem((java.lang.Object) boolean49);
        boolean boolean52 = objList42.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) '4');
        boolean boolean57 = objList53.removeElem((java.lang.Object) 100.0d);
        boolean boolean58 = objList42.removeElem((java.lang.Object) objList53);
        // The following exception was thrown during execution in test generation
        try {
            objList9.add((int) '4', (java.lang.Object) objList53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test558");
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
            java.lang.Object obj16 = objList5.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test559");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        boolean boolean17 = objList11.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean21 = objList11.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList22.removeElem((java.lang.Object) boolean29);
        boolean boolean32 = objList22.removeElem((java.lang.Object) (short) 0);
        boolean boolean33 = objList18.removeElem((java.lang.Object) objList22);
        boolean boolean34 = objList0.removeElem((java.lang.Object) objList18);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList18.replaceAll(objUnaryOperator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test560");
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
            java.lang.Object obj23 = objList17.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test561");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        java.lang.Object obj13 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        boolean boolean20 = objList14.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "");
        boolean boolean38 = objList34.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) "");
        boolean boolean47 = objList43.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList51 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean53 = objList51.removeElem((java.lang.Object) "");
        boolean boolean55 = objList51.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList58 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "hi!");
        boolean boolean63 = objList59.removeElem((java.lang.Object) true);
        boolean boolean65 = objList59.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList72 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray73 = new java.lang.Object[] { (-1), obj13, objList14, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList28, 1.0d, (short) 1, objList31, (-4), (-4), boolean38, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList58, boolean65, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList71, objCollectionList72 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList74 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList74, objArray73);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = objList76.removeElem((java.lang.Object) "");
        boolean boolean79 = objList74.removeElem((java.lang.Object) boolean78);
        java.lang.Object obj81 = objList74.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList82 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean84 = objList82.removeElem((java.lang.Object) (byte) 0);
        boolean boolean86 = objList82.removeElem((java.lang.Object) (-4));
        boolean boolean88 = objList82.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList89 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean91 = objList89.removeElem((java.lang.Object) (byte) 0);
        boolean boolean93 = objList89.removeElem((java.lang.Object) (-4));
        boolean boolean95 = objList89.removeElem((java.lang.Object) (short) 0);
        boolean boolean96 = objList82.removeElem((java.lang.Object) objList89);
        boolean boolean97 = objList74.removeElem((java.lang.Object) objList82);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, (java.lang.Object) objList82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test562");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList19.replaceAll(objUnaryOperator31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test563");
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
        boolean boolean43 = objList41.removeElem((java.lang.Object) "hi!");
        boolean boolean45 = objList41.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "hi!");
        boolean boolean49 = objList41.removeElem((java.lang.Object) boolean48);
        boolean boolean51 = objList41.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) '4');
        boolean boolean56 = objList52.removeElem((java.lang.Object) 100.0d);
        boolean boolean57 = objList41.removeElem((java.lang.Object) objList52);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "hi!");
        boolean boolean62 = objList58.removeElem((java.lang.Object) true);
        boolean boolean64 = objList58.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean67 = objList65.removeElem((java.lang.Object) "");
        boolean boolean68 = objList58.removeElem((java.lang.Object) objList65);
        boolean boolean69 = objList41.removeElem((java.lang.Object) objList65);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-6), (java.lang.Object) objList65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test564");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList23.removeElem((java.lang.Object) true);
        boolean boolean29 = objList23.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean33 = objList23.removeElem((java.lang.Object) objList30);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean42 = objList34.removeElem((java.lang.Object) boolean41);
        boolean boolean44 = objList34.removeElem((java.lang.Object) (short) 0);
        boolean boolean45 = objList30.removeElem((java.lang.Object) objList34);
        objList17.add(0, (java.lang.Object) boolean45);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator47 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList17.replaceAll(objUnaryOperator47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test565");
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
            java.lang.Object obj24 = objList11.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test566");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test567");
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
        objList24.add(0, (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = objList24.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test568");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) "hi!");
        boolean boolean57 = objList53.removeElem((java.lang.Object) true);
        boolean boolean59 = objList53.removeElem((java.lang.Object) 4);
        boolean boolean60 = objList0.removeElem((java.lang.Object) objList53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = objList53.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test569");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean21 = objList17.removeElem((java.lang.Object) (-4));
        boolean boolean23 = objList17.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) (byte) 0);
        boolean boolean28 = objList24.removeElem((java.lang.Object) (-4));
        boolean boolean30 = objList24.removeElem((java.lang.Object) (short) 0);
        boolean boolean31 = objList17.removeElem((java.lang.Object) objList24);
        boolean boolean32 = objList16.removeElem((java.lang.Object) objList17);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean38 = objList36.removeElem((java.lang.Object) (byte) 0);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (byte) 0);
        boolean boolean41 = objList33.removeElem((java.lang.Object) 100.0d);
        boolean boolean43 = objList33.removeElem((java.lang.Object) 100.0d);
        boolean boolean44 = objList17.removeElem((java.lang.Object) 100.0d);
        boolean boolean45 = objList0.removeElem((java.lang.Object) objList17);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test570");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        boolean boolean16 = objList5.removeElem((java.lang.Object) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) (byte) 0);
        boolean boolean21 = objList17.removeElem((java.lang.Object) (-4));
        boolean boolean23 = objList17.removeElem((java.lang.Object) 1L);
        boolean boolean24 = objList5.removeElem((java.lang.Object) 1L);
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test571");
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
            java.lang.Object obj23 = objList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test572");
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
        java.lang.Object obj73 = objList62.remove((int) ' ');
        java.lang.Object obj75 = objList62.remove((int) (byte) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator76 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test573");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "");
        boolean boolean24 = objList20.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "");
        boolean boolean29 = objList25.removeElem((java.lang.Object) 1L);
        boolean boolean31 = objList25.removeElem((java.lang.Object) (-1.0d));
        boolean boolean32 = objList20.removeElem((java.lang.Object) objList25);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean40 = objList38.removeElem((java.lang.Object) "");
        boolean boolean42 = objList38.removeElem((java.lang.Object) 1L);
        boolean boolean44 = objList38.removeElem((java.lang.Object) (-1.0d));
        boolean boolean45 = objList33.removeElem((java.lang.Object) objList38);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "hi!");
        boolean boolean50 = objList46.removeElem((java.lang.Object) true);
        boolean boolean52 = objList46.removeElem((java.lang.Object) 4);
        boolean boolean54 = objList46.removeElem((java.lang.Object) 1);
        boolean boolean56 = objList46.removeElem((java.lang.Object) 10);
        boolean boolean57 = objList38.removeElem((java.lang.Object) objList46);
        boolean boolean58 = objList25.removeElem((java.lang.Object) objList46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "hi!");
        boolean boolean63 = objList59.removeElem((java.lang.Object) true);
        boolean boolean65 = objList59.removeElem((java.lang.Object) 4);
        objList59.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = objList73.removeElem((java.lang.Object) (byte) 0);
        boolean boolean76 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean78 = objList70.removeElem((java.lang.Object) 100.0d);
        objList59.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList80.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList83 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean85 = objList83.removeElem((java.lang.Object) "hi!");
        boolean boolean87 = objList83.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList88 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean90 = objList88.removeElem((java.lang.Object) "hi!");
        boolean boolean91 = objList83.removeElem((java.lang.Object) boolean90);
        boolean boolean93 = objList83.removeElem((java.lang.Object) (short) 0);
        boolean boolean94 = objList80.removeElem((java.lang.Object) objList83);
        boolean boolean96 = objList80.removeElem((java.lang.Object) 10);
        boolean boolean97 = objList59.removeElem((java.lang.Object) objList80);
        boolean boolean98 = objList46.removeElem((java.lang.Object) objList59);
        boolean boolean99 = objList0.removeElem((java.lang.Object) objList46);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test574");
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
        boolean boolean50 = objList44.removeElem((java.lang.Object) 4);
        objList44.add(0, (java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            objList13.add(9, (java.lang.Object) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test575");
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
        boolean boolean20 = objList18.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean28 = objList26.removeElem((java.lang.Object) "");
        boolean boolean30 = objList26.removeElem((java.lang.Object) 1L);
        boolean boolean32 = objList26.removeElem((java.lang.Object) (-1.0d));
        boolean boolean33 = objList21.removeElem((java.lang.Object) objList26);
        boolean boolean35 = objList26.removeElem((java.lang.Object) true);
        boolean boolean36 = objList18.removeElem((java.lang.Object) boolean35);
        objList11.add(0, (java.lang.Object) boolean35);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test576");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList24.replaceAll(objUnaryOperator29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test577");
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
            java.lang.Object obj59 = objList48.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test578");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) '4');
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) 1L);
        boolean boolean12 = objList6.removeElem((java.lang.Object) (-1.0d));
        boolean boolean14 = objList6.removeElem((java.lang.Object) (-8));
        objList0.add(0, (java.lang.Object) objList6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = objList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test579");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 0L);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (-5));
        boolean boolean19 = objList11.removeElem((java.lang.Object) (-8));
        java.lang.Object obj20 = null;
        boolean boolean21 = objList11.removeElem(obj20);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test580");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 1L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-1.0d));
        boolean boolean20 = objList12.removeElem((java.lang.Object) (-8));
        boolean boolean22 = objList12.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList23.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList23.removeElem((java.lang.Object) boolean30);
        boolean boolean33 = objList23.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) '4');
        boolean boolean38 = objList34.removeElem((java.lang.Object) 100.0d);
        boolean boolean39 = objList23.removeElem((java.lang.Object) objList34);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "hi!");
        boolean boolean44 = objList40.removeElem((java.lang.Object) true);
        boolean boolean46 = objList40.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "");
        boolean boolean50 = objList40.removeElem((java.lang.Object) objList47);
        boolean boolean51 = objList23.removeElem((java.lang.Object) objList47);
        boolean boolean52 = objList12.removeElem((java.lang.Object) objList23);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) -1, (java.lang.Object) objList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test581");
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
        objList70.add(0, (java.lang.Object) 1);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator75 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList70.replaceAll(objUnaryOperator75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test582");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.String> strList18 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean19 = objList15.removeElem((java.lang.Object) strList18);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList15);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (byte) 100);
        objList21.add(0, (java.lang.Object) 1);
        boolean boolean29 = objList0.removeElem((java.lang.Object) 0);
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
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test583");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test584");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test585");
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
            objList82.replaceAll(objUnaryOperator95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test586");
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
            java.lang.Object obj50 = objList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test587");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean57 = objList53.removeElem((java.lang.Object) (-4));
        boolean boolean59 = objList53.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean64 = objList60.removeElem((java.lang.Object) (-4));
        boolean boolean66 = objList60.removeElem((java.lang.Object) (short) 0);
        boolean boolean67 = objList53.removeElem((java.lang.Object) objList60);
        java.lang.Object[] objArray69 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList70, objArray69);
        java.lang.Object obj73 = objList70.remove((int) (short) 0);
        boolean boolean74 = objList53.removeElem((java.lang.Object) objList70);
        boolean boolean75 = objList0.removeElem((java.lang.Object) objList53);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = objList76.removeElem((java.lang.Object) "");
        boolean boolean80 = objList76.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean83 = objList81.removeElem((java.lang.Object) "");
        boolean boolean85 = objList81.removeElem((java.lang.Object) 1L);
        boolean boolean87 = objList81.removeElem((java.lang.Object) (-1.0d));
        boolean boolean88 = objList76.removeElem((java.lang.Object) objList81);
        boolean boolean90 = objList81.removeElem((java.lang.Object) true);
        boolean boolean92 = objList81.removeElem((java.lang.Object) 8);
        boolean boolean94 = objList81.removeElem((java.lang.Object) 10.0d);
        boolean boolean95 = objList53.removeElem((java.lang.Object) boolean94);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test588");
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
            objList0.replaceAll(objUnaryOperator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test589");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList0.removeElem((java.lang.Object) boolean7);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-9));
        boolean boolean12 = objList0.removeElem((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-3), (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test590");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        boolean boolean20 = objList14.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList11.removeElem((java.lang.Object) boolean20);
        boolean boolean22 = objList0.removeElem((java.lang.Object) objList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = objList11.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test591");
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
        java.lang.Object obj20 = objList8.remove(0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean26 = objList22.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "");
        boolean boolean31 = objList27.removeElem((java.lang.Object) 1L);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (-1.0d));
        boolean boolean34 = objList22.removeElem((java.lang.Object) objList27);
        boolean boolean36 = objList27.removeElem((java.lang.Object) true);
        boolean boolean38 = objList27.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList8.add(100, (java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test592");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
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
        boolean boolean26 = objList0.removeElem((java.lang.Object) boolean25);
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
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test593");
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
            java.lang.Object obj90 = objList39.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test594");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = objList0.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test595");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList4.removeElem((java.lang.Object) (byte) 100);
        objList4.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-5));
        objList12.add(0, (java.lang.Object) 10.0f);
        boolean boolean22 = objList4.removeElem((java.lang.Object) objList12);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList23.removeElem((java.lang.Object) (byte) 100);
        objList23.add(0, (java.lang.Object) 1);
        boolean boolean31 = objList12.removeElem((java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) (byte) 0);
        boolean boolean36 = objList32.removeElem((java.lang.Object) (byte) 100);
        objList32.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        boolean boolean44 = objList40.removeElem((java.lang.Object) 0L);
        boolean boolean46 = objList40.removeElem((java.lang.Object) (-5));
        objList40.add(0, (java.lang.Object) 10.0f);
        boolean boolean50 = objList32.removeElem((java.lang.Object) objList40);
        boolean boolean51 = objList12.removeElem((java.lang.Object) objList32);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList52.removeElem((java.lang.Object) (-4));
        boolean boolean58 = objList52.removeElem((java.lang.Object) 1L);
        boolean boolean60 = objList52.removeElem((java.lang.Object) (-100));
        boolean boolean61 = objList12.removeElem((java.lang.Object) objList52);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-7), (java.lang.Object) objList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test596");
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
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList43 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        boolean boolean44 = objList11.removeElem((java.lang.Object) objListList43);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator45 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList11.replaceAll(objUnaryOperator45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test597");
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
        boolean boolean30 = objList26.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) "");
        boolean boolean35 = objList31.removeElem((java.lang.Object) 0L);
        boolean boolean37 = objList31.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList38 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean39 = objList31.removeElem((java.lang.Object) objCollectionList38);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) (byte) 0);
        boolean boolean44 = objList40.removeElem((java.lang.Object) (-4));
        java.lang.Object obj45 = null;
        boolean boolean46 = objList40.removeElem(obj45);
        boolean boolean47 = objList31.removeElem((java.lang.Object) boolean46);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        objList49.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "");
        boolean boolean63 = objList59.removeElem((java.lang.Object) 0L);
        boolean boolean65 = objList59.removeElem((java.lang.Object) (-5));
        boolean boolean67 = objList59.removeElem((java.lang.Object) (-8));
        boolean boolean68 = objList49.removeElem((java.lang.Object) objList59);
        objList59.add(0, (java.lang.Object) (-1L));
        objList31.add(0, (java.lang.Object) objList59);
        boolean boolean73 = objList26.removeElem((java.lang.Object) objList31);
        java.lang.Object obj74 = new java.lang.Object();
        boolean boolean75 = objList31.removeElem(obj74);
        // The following exception was thrown during execution in test generation
        try {
            objList13.add((-1), (java.lang.Object) boolean75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test598");
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
            java.lang.Object obj91 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test599");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) (byte) 0);
        boolean boolean43 = objList39.removeElem((java.lang.Object) (-4));
        boolean boolean45 = objList39.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) (byte) 0);
        boolean boolean50 = objList46.removeElem((java.lang.Object) (-4));
        boolean boolean52 = objList46.removeElem((java.lang.Object) (short) 0);
        boolean boolean53 = objList39.removeElem((java.lang.Object) objList46);
        boolean boolean55 = objList39.removeElem((java.lang.Object) (-10));
        boolean boolean56 = objList21.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) '4');
        boolean boolean61 = objList57.removeElem((java.lang.Object) (byte) 1);
        boolean boolean62 = objList21.removeElem((java.lang.Object) boolean61);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test600");
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
            objList39.replaceAll(objUnaryOperator79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test601");
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
            java.lang.Object obj18 = objList0.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test602");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 1L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-1.0d));
        boolean boolean24 = objList12.removeElem((java.lang.Object) objList17);
        boolean boolean26 = objList17.removeElem((java.lang.Object) true);
        boolean boolean27 = objList9.removeElem((java.lang.Object) boolean26);
        boolean boolean28 = objList0.removeElem((java.lang.Object) boolean27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean37 = objList29.removeElem((java.lang.Object) boolean36);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean40 = objList38.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) (byte) 0);
        boolean boolean44 = objList38.removeElem((java.lang.Object) (byte) 0);
        objList38.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean48 = objList29.removeElem((java.lang.Object) objList38);
        boolean boolean50 = objList29.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>> objIterableList51 = new DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean52 = objList29.removeElem((java.lang.Object) objIterableList51);
        boolean boolean53 = objList0.removeElem((java.lang.Object) boolean52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test603");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        boolean boolean19 = objList15.removeElem((java.lang.Object) 1L);
        boolean boolean21 = objList15.removeElem((java.lang.Object) (-1.0d));
        boolean boolean22 = objList10.removeElem((java.lang.Object) objList15);
        boolean boolean24 = objList15.removeElem((java.lang.Object) true);
        boolean boolean26 = objList15.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(8, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test604");
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
            java.lang.Object obj14 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test605");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean57 = objList53.removeElem((java.lang.Object) (-4));
        boolean boolean59 = objList53.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean64 = objList60.removeElem((java.lang.Object) (-4));
        boolean boolean66 = objList60.removeElem((java.lang.Object) (short) 0);
        boolean boolean67 = objList53.removeElem((java.lang.Object) objList60);
        java.lang.Object[] objArray69 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList70, objArray69);
        java.lang.Object obj73 = objList70.remove((int) (short) 0);
        boolean boolean74 = objList53.removeElem((java.lang.Object) objList70);
        boolean boolean75 = objList0.removeElem((java.lang.Object) objList53);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) "hi!");
        boolean boolean81 = objList77.removeElem((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-2), (java.lang.Object) boolean81);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test606");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        objList0.add(0, (java.lang.Object) (-100));
        java.lang.Object obj11 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "");
        boolean boolean36 = objList32.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList56 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) "hi!");
        boolean boolean61 = objList57.removeElem((java.lang.Object) true);
        boolean boolean63 = objList57.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList70 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-1), obj11, objList12, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList26, 1.0d, (short) 1, objList29, (-4), (-4), boolean36, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList56, boolean63, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList69, objCollectionList70 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList72, objArray71);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList74 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean76 = objList74.removeElem((java.lang.Object) "");
        boolean boolean77 = objList72.removeElem((java.lang.Object) boolean76);
        java.lang.Object obj79 = objList72.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList72.removeElem((java.lang.Object) objList80);
        boolean boolean82 = objList0.removeElem((java.lang.Object) objList80);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test607");
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
            java.lang.Object obj21 = objList10.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test608");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = objList16.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test609");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 1L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-1.0d));
        boolean boolean24 = objList12.removeElem((java.lang.Object) objList17);
        boolean boolean26 = objList17.removeElem((java.lang.Object) true);
        boolean boolean27 = objList9.removeElem((java.lang.Object) boolean26);
        boolean boolean28 = objList0.removeElem((java.lang.Object) boolean27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 0L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-5));
        boolean boolean37 = objList29.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        boolean boolean48 = objList44.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean52 = objList44.removeElem((java.lang.Object) boolean51);
        boolean boolean54 = objList44.removeElem((java.lang.Object) (-9));
        boolean boolean55 = objList39.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "hi!");
        boolean boolean60 = objList56.removeElem((java.lang.Object) true);
        boolean boolean62 = objList56.removeElem((java.lang.Object) (-1.0d));
        boolean boolean64 = objList56.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean67 = objList65.removeElem((java.lang.Object) "");
        boolean boolean69 = objList65.removeElem((java.lang.Object) 0L);
        boolean boolean71 = objList65.removeElem((java.lang.Object) (-5));
        objList65.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "");
        boolean boolean79 = objList75.removeElem((java.lang.Object) 0L);
        boolean boolean81 = objList75.removeElem((java.lang.Object) (-5));
        boolean boolean83 = objList75.removeElem((java.lang.Object) (-8));
        boolean boolean84 = objList65.removeElem((java.lang.Object) objList75);
        boolean boolean85 = objList56.removeElem((java.lang.Object) boolean84);
        boolean boolean86 = objList39.removeElem((java.lang.Object) boolean84);
        objList29.add(0, (java.lang.Object) objList39);
        boolean boolean88 = objList0.removeElem((java.lang.Object) objList39);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test610");
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
        boolean boolean23 = objList0.removeElem((java.lang.Object) 0);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test611");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) "hi!");
        boolean boolean56 = objList52.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) "hi!");
        boolean boolean60 = objList52.removeElem((java.lang.Object) boolean59);
        boolean boolean62 = objList52.removeElem((java.lang.Object) (short) 0);
        boolean boolean63 = objList49.removeElem((java.lang.Object) objList52);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "hi!");
        boolean boolean68 = objList64.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList69.removeElem((java.lang.Object) "hi!");
        boolean boolean72 = objList64.removeElem((java.lang.Object) boolean71);
        boolean boolean74 = objList64.removeElem((java.lang.Object) (-9));
        boolean boolean75 = objList52.removeElem((java.lang.Object) objList64);
        // The following exception was thrown during execution in test generation
        try {
            objList28.add(6, (java.lang.Object) boolean75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test612");
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
            java.lang.Object obj93 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test613");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test614");
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test615");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) "hi!");
        boolean boolean57 = objList53.removeElem((java.lang.Object) true);
        boolean boolean59 = objList53.removeElem((java.lang.Object) 4);
        boolean boolean60 = objList0.removeElem((java.lang.Object) objList53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = objList53.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test616");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 100.0d);
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
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test617");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test618");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        objList0.add((int) (short) 0, (java.lang.Object) 0.0d);
        java.lang.Object obj16 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        boolean boolean23 = objList17.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean50 = objList46.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList54 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean56 = objList54.removeElem((java.lang.Object) "");
        boolean boolean58 = objList54.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList61 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean64 = objList62.removeElem((java.lang.Object) "hi!");
        boolean boolean66 = objList62.removeElem((java.lang.Object) true);
        boolean boolean68 = objList62.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList74 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList75 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), obj16, objList17, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList31, 1.0d, (short) 1, objList34, (-4), (-4), boolean41, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList61, boolean68, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList74, objCollectionList75 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList77, objArray76);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean81 = objList79.removeElem((java.lang.Object) "");
        boolean boolean82 = objList77.removeElem((java.lang.Object) boolean81);
        java.lang.Object obj84 = objList77.remove(10);
        java.lang.Object obj86 = objList77.remove(4);
        java.lang.Object obj88 = objList77.remove((int) ' ');
        java.lang.Object obj90 = objList77.remove((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) -1, (java.lang.Object) objList77);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test619");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList4.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList4.removeElem((java.lang.Object) boolean11);
        boolean boolean14 = objList4.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList4);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList4.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test620");
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
        java.lang.Object obj73 = objList62.remove(2);
        java.lang.Object obj75 = objList62.remove((int) ' ');
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator76 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList62.replaceAll(objUnaryOperator76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test621");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) (byte) 0);
        boolean boolean37 = objList33.removeElem((java.lang.Object) (-4));
        boolean boolean39 = objList33.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) (byte) 0);
        boolean boolean44 = objList40.removeElem((java.lang.Object) (-4));
        boolean boolean46 = objList40.removeElem((java.lang.Object) (short) 0);
        boolean boolean47 = objList33.removeElem((java.lang.Object) objList40);
        boolean boolean48 = objList32.removeElem((java.lang.Object) objList33);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) (byte) 0);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (byte) 0);
        boolean boolean57 = objList49.removeElem((java.lang.Object) 100.0d);
        boolean boolean59 = objList49.removeElem((java.lang.Object) 100.0d);
        boolean boolean60 = objList33.removeElem((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList61 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = objList61.removeElem((java.lang.Object) "hi!");
        boolean boolean65 = objList61.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean69 = objList61.removeElem((java.lang.Object) boolean68);
        java.lang.Object[] objArray71 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList72, objArray71);
        java.lang.Object obj75 = objList72.remove((int) (short) 0);
        boolean boolean76 = objList61.removeElem(obj75);
        boolean boolean78 = objList61.removeElem((java.lang.Object) 1.0f);
        boolean boolean79 = objList33.removeElem((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            objList10.add((int) (short) -1, (java.lang.Object) objList33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test622");
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
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList19, objArray18);
        java.lang.Object obj22 = objList19.remove((int) (short) 0);
        boolean boolean23 = objList0.removeElem((java.lang.Object) (short) 0);
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test623");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "");
        boolean boolean62 = objList58.removeElem((java.lang.Object) (-3));
        boolean boolean64 = objList58.removeElem((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) (byte) 0);
        boolean boolean70 = objList66.removeElem((java.lang.Object) (-4));
        boolean boolean72 = objList66.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList73 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean75 = objList73.removeElem((java.lang.Object) (byte) 0);
        boolean boolean77 = objList73.removeElem((java.lang.Object) (-4));
        boolean boolean79 = objList73.removeElem((java.lang.Object) (short) 0);
        boolean boolean80 = objList66.removeElem((java.lang.Object) objList73);
        boolean boolean81 = objList65.removeElem((java.lang.Object) objList66);
        boolean boolean82 = objList58.removeElem((java.lang.Object) boolean81);
        boolean boolean83 = objList8.removeElem((java.lang.Object) objList58);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test624");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList11.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test625");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        objList0.add(0, (java.lang.Object) 1);
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
        boolean boolean26 = objList0.removeElem((java.lang.Object) boolean25);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList27.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "hi!");
        boolean boolean35 = objList27.removeElem((java.lang.Object) boolean34);
        boolean boolean37 = objList27.removeElem((java.lang.Object) (short) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList38 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean40 = objList38.removeElem((java.lang.Object) "");
        boolean boolean42 = objList38.removeElem((java.lang.Object) (-3));
        boolean boolean43 = objList27.removeElem((java.lang.Object) objList38);
        boolean boolean44 = objList0.removeElem((java.lang.Object) objList38);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test626");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) (byte) 0);
        boolean boolean10 = objList6.removeElem((java.lang.Object) (-4));
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
        boolean boolean53 = objList6.removeElem((java.lang.Object) objList11);
        java.lang.Object obj54 = new java.lang.Object();
        boolean boolean55 = objList11.removeElem(obj54);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-5), obj54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test627");
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
        java.lang.Object obj31 = objList7.remove(0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test628");
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
        java.lang.Object obj18 = null;
        boolean boolean19 = objList0.removeElem(obj18);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test629");
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
        objList5.add((int) (short) 1, (java.lang.Object) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator61 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test630");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) (byte) 0);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean29 = objList21.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-10), (java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test631");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean29 = objList25.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList25.removeElem((java.lang.Object) boolean32);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        java.lang.Object obj39 = objList36.remove((int) (short) 0);
        boolean boolean40 = objList25.removeElem(obj39);
        boolean boolean42 = objList25.removeElem((java.lang.Object) 1.0f);
        objList17.add(0, (java.lang.Object) objList25);
        boolean boolean44 = objList0.removeElem((java.lang.Object) objList17);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test632");
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
        objList0.add((int) (short) 1, (java.lang.Object) objList21);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList21.replaceAll(objUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test633");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        objList0.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean11 = objList0.removeElem((java.lang.Object) '4');
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
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test634");
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
            java.lang.Object obj26 = objList13.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test635");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test636");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (byte) 100);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 100);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test637");
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
            java.lang.Object obj60 = objList10.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test638");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) '4');
        boolean boolean63 = objList59.removeElem((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = null;
        boolean boolean65 = objList59.removeElem(obj64);
        // The following exception was thrown during execution in test generation
        try {
            objList8.add(3, (java.lang.Object) objList59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test639");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList10 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean12 = objList10.removeElem((java.lang.Object) "");
        boolean boolean14 = objList10.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList15.removeElem((java.lang.Object) true);
        boolean boolean21 = objList15.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        boolean boolean25 = objList15.removeElem((java.lang.Object) objList22);
        boolean boolean26 = objList10.removeElem((java.lang.Object) objList22);
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = objList10.removeElem(obj27);
        objList0.add(0, obj27);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test640");
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
        boolean boolean48 = objList44.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean52 = objList44.removeElem((java.lang.Object) boolean51);
        boolean boolean54 = objList44.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) '4');
        boolean boolean59 = objList55.removeElem((java.lang.Object) 100.0d);
        boolean boolean60 = objList44.removeElem((java.lang.Object) objList55);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList61 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = objList61.removeElem((java.lang.Object) "hi!");
        boolean boolean65 = objList61.removeElem((java.lang.Object) true);
        boolean boolean67 = objList61.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "");
        boolean boolean71 = objList61.removeElem((java.lang.Object) objList68);
        boolean boolean72 = objList44.removeElem((java.lang.Object) objList68);
        // The following exception was thrown during execution in test generation
        try {
            objList22.add(3, (java.lang.Object) boolean72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test641");
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
            objList0.replaceAll(objUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test642");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 0);
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
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test643");
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
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList22.removeElem((java.lang.Object) boolean29);
        boolean boolean32 = objList22.removeElem((java.lang.Object) (-9));
        boolean boolean33 = objList17.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        boolean boolean40 = objList34.removeElem((java.lang.Object) (-1.0d));
        boolean boolean42 = objList34.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) "");
        boolean boolean47 = objList43.removeElem((java.lang.Object) 0L);
        boolean boolean49 = objList43.removeElem((java.lang.Object) (-5));
        objList43.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) "");
        boolean boolean57 = objList53.removeElem((java.lang.Object) 0L);
        boolean boolean59 = objList53.removeElem((java.lang.Object) (-5));
        boolean boolean61 = objList53.removeElem((java.lang.Object) (-8));
        boolean boolean62 = objList43.removeElem((java.lang.Object) objList53);
        boolean boolean63 = objList34.removeElem((java.lang.Object) boolean62);
        boolean boolean64 = objList17.removeElem((java.lang.Object) boolean62);
        boolean boolean65 = objList0.removeElem((java.lang.Object) objList17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = objList17.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test644");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "");
        boolean boolean16 = objList12.removeElem((java.lang.Object) 0L);
        boolean boolean18 = objList12.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList19 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean20 = objList12.removeElem((java.lang.Object) objCollectionList19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (-4));
        java.lang.Object obj26 = null;
        boolean boolean27 = objList21.removeElem(obj26);
        boolean boolean28 = objList12.removeElem((java.lang.Object) boolean27);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean34 = objList30.removeElem((java.lang.Object) 0L);
        boolean boolean36 = objList30.removeElem((java.lang.Object) (-5));
        objList30.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        boolean boolean44 = objList40.removeElem((java.lang.Object) 0L);
        boolean boolean46 = objList40.removeElem((java.lang.Object) (-5));
        boolean boolean48 = objList40.removeElem((java.lang.Object) (-8));
        boolean boolean49 = objList30.removeElem((java.lang.Object) objList40);
        objList40.add(0, (java.lang.Object) (-1L));
        objList12.add(0, (java.lang.Object) objList40);
        boolean boolean54 = objList7.removeElem((java.lang.Object) objList12);
        boolean boolean55 = objList0.removeElem((java.lang.Object) boolean54);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator56 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test645");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test646");
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
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(9, obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test647");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 1L);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (-1.0d));
        boolean boolean17 = objList9.removeElem((java.lang.Object) (-8));
        java.lang.Object obj18 = null;
        boolean boolean19 = objList9.removeElem(obj18);
        boolean boolean20 = objList0.removeElem((java.lang.Object) boolean19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test648");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList20 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean22 = objList20.removeElem((java.lang.Object) "hi!");
        boolean boolean24 = objList20.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean27 = objList25.removeElem((java.lang.Object) "hi!");
        boolean boolean28 = objList20.removeElem((java.lang.Object) boolean27);
        boolean boolean30 = objList20.removeElem((java.lang.Object) (short) 0);
        boolean boolean31 = objList17.removeElem((java.lang.Object) objList20);
        boolean boolean32 = objList11.removeElem((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = objList11.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test649");
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
            java.lang.Object obj28 = objList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test650");
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
        boolean boolean38 = objList36.removeElem((java.lang.Object) "hi!");
        boolean boolean40 = objList36.removeElem((java.lang.Object) true);
        boolean boolean42 = objList36.removeElem((java.lang.Object) 4);
        objList36.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean53 = objList47.removeElem((java.lang.Object) (byte) 0);
        boolean boolean55 = objList47.removeElem((java.lang.Object) 100.0d);
        objList36.add(1, (java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) "hi!");
        boolean boolean64 = objList60.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean67 = objList65.removeElem((java.lang.Object) "hi!");
        boolean boolean68 = objList60.removeElem((java.lang.Object) boolean67);
        boolean boolean70 = objList60.removeElem((java.lang.Object) (short) 0);
        boolean boolean71 = objList57.removeElem((java.lang.Object) objList60);
        boolean boolean73 = objList57.removeElem((java.lang.Object) 10);
        boolean boolean74 = objList36.removeElem((java.lang.Object) objList57);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) boolean74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test651");
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
        boolean boolean42 = objList40.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) "hi!");
        boolean boolean47 = objList43.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "hi!");
        boolean boolean51 = objList43.removeElem((java.lang.Object) boolean50);
        boolean boolean53 = objList43.removeElem((java.lang.Object) (short) 0);
        boolean boolean54 = objList40.removeElem((java.lang.Object) objList43);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) -1, (java.lang.Object) objList40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test652");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 0L);
        boolean boolean22 = objList16.removeElem((java.lang.Object) (-5));
        boolean boolean24 = objList16.removeElem((java.lang.Object) (-8));
        java.lang.Object obj25 = null;
        boolean boolean26 = objList16.removeElem(obj25);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList28.removeElem((java.lang.Object) true);
        boolean boolean34 = objList28.removeElem((java.lang.Object) 4);
        objList28.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) (byte) 0);
        boolean boolean43 = objList39.removeElem((java.lang.Object) (-4));
        boolean boolean45 = objList39.removeElem((java.lang.Object) 1L);
        objList39.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList28.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList16.add(0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList51 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList52 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = objList52.removeElem((java.lang.Object) (byte) 0);
        boolean boolean56 = objList52.removeElem((java.lang.Object) (-4));
        boolean boolean58 = objList52.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) (byte) 0);
        boolean boolean63 = objList59.removeElem((java.lang.Object) (-4));
        boolean boolean65 = objList59.removeElem((java.lang.Object) (short) 0);
        boolean boolean66 = objList52.removeElem((java.lang.Object) objList59);
        boolean boolean67 = objList51.removeElem((java.lang.Object) objList52);
        boolean boolean68 = objList16.removeElem((java.lang.Object) boolean67);
        boolean boolean70 = objList16.removeElem((java.lang.Object) (-3));
        boolean boolean71 = objList0.removeElem((java.lang.Object) objList16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = objList16.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test653");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        boolean boolean17 = objList11.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean21 = objList11.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList22.removeElem((java.lang.Object) boolean29);
        boolean boolean32 = objList22.removeElem((java.lang.Object) (short) 0);
        boolean boolean33 = objList18.removeElem((java.lang.Object) objList22);
        boolean boolean34 = objList0.removeElem((java.lang.Object) objList18);
        java.lang.Object obj35 = null;
        boolean boolean36 = objList18.removeElem(obj35);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator37 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList18.replaceAll(objUnaryOperator37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test654");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "");
        boolean boolean36 = objList32.removeElem((java.lang.Object) 0L);
        boolean boolean38 = objList32.removeElem((java.lang.Object) (-5));
        boolean boolean40 = objList32.removeElem((java.lang.Object) (-8));
        java.lang.Object obj41 = null;
        boolean boolean42 = objList32.removeElem(obj41);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean46 = objList44.removeElem((java.lang.Object) "hi!");
        boolean boolean48 = objList44.removeElem((java.lang.Object) true);
        boolean boolean50 = objList44.removeElem((java.lang.Object) 4);
        objList44.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList55 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean57 = objList55.removeElem((java.lang.Object) (byte) 0);
        boolean boolean59 = objList55.removeElem((java.lang.Object) (-4));
        boolean boolean61 = objList55.removeElem((java.lang.Object) 1L);
        objList55.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList44.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList32.add(0, (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList19.add((int) '#', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test655");
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
            java.lang.Object obj59 = objList8.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test656");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean10 = objList0.removeElem((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        boolean boolean17 = objList11.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList18 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean20 = objList18.removeElem((java.lang.Object) "");
        boolean boolean21 = objList11.removeElem((java.lang.Object) objList18);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList22.removeElem((java.lang.Object) boolean29);
        boolean boolean32 = objList22.removeElem((java.lang.Object) (short) 0);
        boolean boolean33 = objList18.removeElem((java.lang.Object) objList22);
        boolean boolean34 = objList0.removeElem((java.lang.Object) objList18);
        java.lang.Object obj36 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(100, obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test657");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) 1L);
        boolean boolean30 = objList24.removeElem((java.lang.Object) (-1.0d));
        boolean boolean31 = objList19.removeElem((java.lang.Object) objList24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "");
        boolean boolean36 = objList32.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 1L);
        boolean boolean43 = objList37.removeElem((java.lang.Object) (-1.0d));
        boolean boolean44 = objList32.removeElem((java.lang.Object) objList37);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList45 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean47 = objList45.removeElem((java.lang.Object) "hi!");
        boolean boolean49 = objList45.removeElem((java.lang.Object) true);
        boolean boolean51 = objList45.removeElem((java.lang.Object) 4);
        boolean boolean53 = objList45.removeElem((java.lang.Object) 1);
        boolean boolean55 = objList45.removeElem((java.lang.Object) 10);
        boolean boolean56 = objList37.removeElem((java.lang.Object) objList45);
        boolean boolean57 = objList24.removeElem((java.lang.Object) objList45);
        boolean boolean58 = objList0.removeElem((java.lang.Object) boolean57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = objList0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test658");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        java.lang.Object obj5 = null;
        boolean boolean6 = objList0.removeElem(obj5);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-1L));
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
        boolean boolean24 = objList0.removeElem((java.lang.Object) objList9);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test659");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test660");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean20 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 0L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-5));
        boolean boolean29 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean31 = objList21.removeElem((java.lang.Object) (-1));
        boolean boolean32 = objList0.removeElem((java.lang.Object) (-1));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test661");
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
            java.lang.Object obj17 = objList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test662");
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
        boolean boolean49 = objList8.removeElem((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.io.Serializable> serializableList51 = new DataStructures.commonscollections.TreeList<java.io.Serializable>();
        // The following exception was thrown during execution in test generation
        try {
            objList8.add((int) (short) 1, (java.lang.Object) serializableList51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test663");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) (byte) 0);
        boolean boolean26 = objList22.removeElem((java.lang.Object) (byte) 100);
        objList22.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "");
        boolean boolean34 = objList30.removeElem((java.lang.Object) 0L);
        boolean boolean36 = objList30.removeElem((java.lang.Object) (-5));
        objList30.add(0, (java.lang.Object) 10.0f);
        boolean boolean40 = objList22.removeElem((java.lang.Object) objList30);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) (byte) 0);
        boolean boolean45 = objList41.removeElem((java.lang.Object) (byte) 100);
        objList41.add(0, (java.lang.Object) 1);
        boolean boolean49 = objList30.removeElem((java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean54 = objList50.removeElem((java.lang.Object) (byte) 100);
        objList50.add(0, (java.lang.Object) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "");
        boolean boolean62 = objList58.removeElem((java.lang.Object) 0L);
        boolean boolean64 = objList58.removeElem((java.lang.Object) (-5));
        objList58.add(0, (java.lang.Object) 10.0f);
        boolean boolean68 = objList50.removeElem((java.lang.Object) objList58);
        boolean boolean69 = objList30.removeElem((java.lang.Object) objList50);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) (byte) 0);
        boolean boolean74 = objList70.removeElem((java.lang.Object) (-4));
        boolean boolean76 = objList70.removeElem((java.lang.Object) 1L);
        boolean boolean78 = objList70.removeElem((java.lang.Object) (-100));
        boolean boolean79 = objList30.removeElem((java.lang.Object) objList70);
        boolean boolean80 = objList10.removeElem((java.lang.Object) objList70);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test664");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 1L);
        boolean boolean34 = objList28.removeElem((java.lang.Object) (-1.0d));
        boolean boolean35 = objList23.removeElem((java.lang.Object) objList28);
        boolean boolean37 = objList28.removeElem((java.lang.Object) true);
        boolean boolean39 = objList28.removeElem((java.lang.Object) 8);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) '4');
        boolean boolean44 = objList40.removeElem((java.lang.Object) (byte) 1);
        java.lang.Object obj45 = null;
        boolean boolean46 = objList40.removeElem(obj45);
        boolean boolean47 = objList28.removeElem((java.lang.Object) boolean46);
        boolean boolean48 = objList11.removeElem((java.lang.Object) objList28);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test665");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        boolean boolean16 = objList5.removeElem((java.lang.Object) 8);
        boolean boolean18 = objList5.removeElem((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = objList5.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test666");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        objList0.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "");
        boolean boolean15 = objList11.removeElem((java.lang.Object) 1L);
        boolean boolean17 = objList11.removeElem((java.lang.Object) (-1.0d));
        boolean boolean19 = objList11.removeElem((java.lang.Object) (-8));
        boolean boolean21 = objList11.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList22 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean24 = objList22.removeElem((java.lang.Object) "hi!");
        boolean boolean26 = objList22.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean30 = objList22.removeElem((java.lang.Object) boolean29);
        boolean boolean32 = objList22.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) '4');
        boolean boolean37 = objList33.removeElem((java.lang.Object) 100.0d);
        boolean boolean38 = objList22.removeElem((java.lang.Object) objList33);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean43 = objList39.removeElem((java.lang.Object) true);
        boolean boolean45 = objList39.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList46 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean48 = objList46.removeElem((java.lang.Object) "");
        boolean boolean49 = objList39.removeElem((java.lang.Object) objList46);
        boolean boolean50 = objList22.removeElem((java.lang.Object) objList46);
        boolean boolean51 = objList11.removeElem((java.lang.Object) objList22);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (short) -1, (java.lang.Object) objList22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test667");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test668");
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
        objList0.add((int) (short) 1, (java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "hi!");
        boolean boolean46 = objList42.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "hi!");
        boolean boolean50 = objList42.removeElem((java.lang.Object) boolean49);
        java.lang.Object[] objArray52 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.Object obj56 = objList53.remove((int) (short) 0);
        boolean boolean57 = objList42.removeElem(obj56);
        boolean boolean59 = objList42.removeElem((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            objList21.add((-7), (java.lang.Object) boolean59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test669");
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
        boolean boolean26 = objList13.removeElem((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = objList13.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test670");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = objList0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test671");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) '4');
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) 1L);
        boolean boolean12 = objList6.removeElem((java.lang.Object) (-1.0d));
        boolean boolean14 = objList6.removeElem((java.lang.Object) (-8));
        objList0.add(0, (java.lang.Object) objList6);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList19.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList19.removeElem((java.lang.Object) boolean26);
        boolean boolean29 = objList19.removeElem((java.lang.Object) (short) 0);
        boolean boolean30 = objList16.removeElem((java.lang.Object) objList19);
        boolean boolean31 = objList6.removeElem((java.lang.Object) boolean30);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test672");
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
        java.lang.Object obj73 = objList62.remove(2);
        java.lang.Object obj75 = objList62.remove((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = objList62.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test673");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean64 = objList60.removeElem((java.lang.Object) (-4));
        boolean boolean66 = objList60.removeElem((java.lang.Object) 1L);
        boolean boolean68 = objList60.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList69.removeElem((java.lang.Object) "hi!");
        boolean boolean73 = objList69.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList74 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean76 = objList74.removeElem((java.lang.Object) "hi!");
        boolean boolean77 = objList69.removeElem((java.lang.Object) boolean76);
        boolean boolean79 = objList69.removeElem((java.lang.Object) (short) 0);
        boolean boolean80 = objList60.removeElem((java.lang.Object) objList69);
        objList25.add((int) (short) 0, (java.lang.Object) boolean80);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = objList25.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test674");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
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
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test675");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        boolean boolean16 = objList5.removeElem((java.lang.Object) 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objList5.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test676");
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
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test677");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList7 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        boolean boolean8 = objList0.removeElem((java.lang.Object) objCollectionList7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "");
        boolean boolean13 = objList9.removeElem((java.lang.Object) 1L);
        boolean boolean15 = objList9.removeElem((java.lang.Object) (-1.0d));
        boolean boolean17 = objList9.removeElem((java.lang.Object) (-8));
        java.lang.Object obj18 = null;
        boolean boolean19 = objList9.removeElem(obj18);
        boolean boolean20 = objList0.removeElem((java.lang.Object) boolean19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) '4');
        boolean boolean24 = objList0.removeElem((java.lang.Object) objList21);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test678");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 4);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 1);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean22 = objList12.removeElem((java.lang.Object) objList19);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "hi!");
        boolean boolean27 = objList23.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList23.removeElem((java.lang.Object) boolean30);
        boolean boolean33 = objList23.removeElem((java.lang.Object) (short) 0);
        boolean boolean34 = objList19.removeElem((java.lang.Object) objList23);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "");
        boolean boolean39 = objList35.removeElem((java.lang.Object) 1L);
        boolean boolean41 = objList35.removeElem((java.lang.Object) (-1.0d));
        boolean boolean43 = objList35.removeElem((java.lang.Object) (-8));
        boolean boolean45 = objList35.removeElem((java.lang.Object) (short) 1);
        boolean boolean46 = objList19.removeElem((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-4), (java.lang.Object) objList19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test680");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        boolean boolean28 = objList16.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        boolean boolean35 = objList29.removeElem((java.lang.Object) 4);
        boolean boolean37 = objList29.removeElem((java.lang.Object) 1);
        boolean boolean39 = objList29.removeElem((java.lang.Object) 10);
        boolean boolean40 = objList21.removeElem((java.lang.Object) objList29);
        boolean boolean41 = objList0.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) (byte) 0);
        boolean boolean46 = objList42.removeElem((java.lang.Object) (-4));
        boolean boolean48 = objList42.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) (byte) 0);
        boolean boolean53 = objList49.removeElem((java.lang.Object) (-4));
        boolean boolean55 = objList49.removeElem((java.lang.Object) (short) 0);
        boolean boolean56 = objList42.removeElem((java.lang.Object) objList49);
        java.lang.Object[] objArray58 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        java.lang.Object obj62 = objList59.remove((int) (short) 0);
        boolean boolean63 = objList42.removeElem((java.lang.Object) objList59);
        boolean boolean64 = objList0.removeElem((java.lang.Object) objList59);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test681");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = objList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test682");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) (byte) 0);
        boolean boolean57 = objList53.removeElem((java.lang.Object) (-4));
        boolean boolean59 = objList53.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList60 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean62 = objList60.removeElem((java.lang.Object) (byte) 0);
        boolean boolean64 = objList60.removeElem((java.lang.Object) (-4));
        boolean boolean66 = objList60.removeElem((java.lang.Object) (short) 0);
        boolean boolean67 = objList53.removeElem((java.lang.Object) objList60);
        java.lang.Object[] objArray69 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList70, objArray69);
        java.lang.Object obj73 = objList70.remove((int) (short) 0);
        boolean boolean74 = objList53.removeElem((java.lang.Object) objList70);
        boolean boolean75 = objList0.removeElem((java.lang.Object) objList53);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator76 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList53.replaceAll(objUnaryOperator76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test683");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        objList0.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) (byte) 0);
        boolean boolean15 = objList11.removeElem((java.lang.Object) (-4));
        java.lang.Object obj16 = null;
        boolean boolean17 = objList11.removeElem(obj16);
        objList0.add(0, obj16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = objList0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test684");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        boolean boolean29 = objList21.removeElem((java.lang.Object) (-8));
        boolean boolean31 = objList21.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "hi!");
        boolean boolean36 = objList32.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "hi!");
        boolean boolean40 = objList32.removeElem((java.lang.Object) boolean39);
        boolean boolean42 = objList32.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) '4');
        boolean boolean47 = objList43.removeElem((java.lang.Object) 100.0d);
        boolean boolean48 = objList32.removeElem((java.lang.Object) objList43);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean53 = objList49.removeElem((java.lang.Object) true);
        boolean boolean55 = objList49.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "");
        boolean boolean59 = objList49.removeElem((java.lang.Object) objList56);
        boolean boolean60 = objList32.removeElem((java.lang.Object) objList56);
        boolean boolean61 = objList21.removeElem((java.lang.Object) objList32);
        boolean boolean62 = objList0.removeElem((java.lang.Object) boolean61);
        boolean boolean64 = objList0.removeElem((java.lang.Object) (byte) 100);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test685");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList4 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean6 = objList4.removeElem((java.lang.Object) "hi!");
        boolean boolean8 = objList4.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList9 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean11 = objList9.removeElem((java.lang.Object) "hi!");
        boolean boolean12 = objList4.removeElem((java.lang.Object) boolean11);
        boolean boolean14 = objList4.removeElem((java.lang.Object) (short) 0);
        boolean boolean15 = objList1.removeElem((java.lang.Object) objList4);
        boolean boolean16 = objList0.removeElem((java.lang.Object) objList4);
        java.lang.Object obj18 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "hi!");
        boolean boolean23 = objList19.removeElem((java.lang.Object) true);
        boolean boolean25 = objList19.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList36 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "");
        boolean boolean52 = objList48.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "");
        boolean boolean60 = objList56.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList63 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "hi!");
        boolean boolean68 = objList64.removeElem((java.lang.Object) true);
        boolean boolean70 = objList64.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList77 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-1), obj18, objList19, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList33, 1.0d, (short) 1, objList36, (-4), (-4), boolean43, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList63, boolean70, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList76, objCollectionList77 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList79 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList79, objArray78);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList81 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean83 = objList81.removeElem((java.lang.Object) "");
        boolean boolean84 = objList79.removeElem((java.lang.Object) boolean83);
        java.lang.Object obj86 = objList79.remove(10);
        java.lang.Object obj88 = objList79.remove(4);
        java.lang.Object obj90 = objList79.remove((int) ' ');
        boolean boolean91 = objList0.removeElem((java.lang.Object) objList79);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-100), (java.lang.Object) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test686");
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
            objList49.replaceAll(objUnaryOperator93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test687");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-3));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 6);
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
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test688");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-100));
        java.lang.Object obj11 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) "hi!");
        boolean boolean16 = objList12.removeElem((java.lang.Object) true);
        boolean boolean18 = objList12.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "");
        boolean boolean36 = objList32.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) "");
        boolean boolean45 = objList41.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList56 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) "hi!");
        boolean boolean61 = objList57.removeElem((java.lang.Object) true);
        boolean boolean63 = objList57.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList70 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-1), obj11, objList12, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList26, 1.0d, (short) 1, objList29, (-4), (-4), boolean36, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList56, boolean63, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList69, objCollectionList70 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList72, objArray71);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList74 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean76 = objList74.removeElem((java.lang.Object) "");
        boolean boolean77 = objList72.removeElem((java.lang.Object) boolean76);
        java.lang.Object obj79 = objList72.remove(7);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList80.removeElem((java.lang.Object) (byte) 0);
        boolean boolean84 = objList80.removeElem((java.lang.Object) (-4));
        boolean boolean86 = objList80.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList87 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean89 = objList87.removeElem((java.lang.Object) (byte) 0);
        boolean boolean91 = objList87.removeElem((java.lang.Object) (-4));
        boolean boolean93 = objList87.removeElem((java.lang.Object) (short) 0);
        boolean boolean94 = objList80.removeElem((java.lang.Object) objList87);
        boolean boolean95 = objList72.removeElem((java.lang.Object) objList80);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(7, (java.lang.Object) objList72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test689");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) (short) 0);
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
        java.lang.Object obj77 = objList70.remove(10);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-9), (java.lang.Object) objList70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test690");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList1 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean3 = objList1.removeElem((java.lang.Object) "");
        boolean boolean5 = objList1.removeElem((java.lang.Object) 0L);
        boolean boolean7 = objList1.removeElem((java.lang.Object) (-5));
        boolean boolean9 = objList1.removeElem((java.lang.Object) (-8));
        java.lang.Object obj10 = null;
        boolean boolean11 = objList1.removeElem(obj10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList13 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean15 = objList13.removeElem((java.lang.Object) "hi!");
        boolean boolean17 = objList13.removeElem((java.lang.Object) true);
        boolean boolean19 = objList13.removeElem((java.lang.Object) 4);
        objList13.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) (byte) 0);
        boolean boolean28 = objList24.removeElem((java.lang.Object) (-4));
        boolean boolean30 = objList24.removeElem((java.lang.Object) 1L);
        objList24.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList13.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList1.add(0, (java.lang.Object) (byte) 1);
        boolean boolean36 = objList0.removeElem((java.lang.Object) 0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator37 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test691");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) (byte) 0);
        boolean boolean33 = objList27.removeElem((java.lang.Object) (byte) 0);
        boolean boolean34 = objList3.removeElem((java.lang.Object) boolean33);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test692");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        boolean boolean9 = objList3.removeElem((java.lang.Object) 4);
        boolean boolean10 = objList0.removeElem((java.lang.Object) boolean9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList12 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean14 = objList12.removeElem((java.lang.Object) (byte) 0);
        boolean boolean16 = objList12.removeElem((java.lang.Object) (-4));
        boolean boolean18 = objList12.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) (byte) 0);
        boolean boolean23 = objList19.removeElem((java.lang.Object) (-4));
        boolean boolean25 = objList19.removeElem((java.lang.Object) (short) 0);
        boolean boolean26 = objList12.removeElem((java.lang.Object) objList19);
        boolean boolean27 = objList11.removeElem((java.lang.Object) objList12);
        boolean boolean29 = objList11.removeElem((java.lang.Object) false);
        boolean boolean30 = objList0.removeElem((java.lang.Object) false);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList31 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean33 = objList31.removeElem((java.lang.Object) (byte) 0);
        boolean boolean35 = objList31.removeElem((java.lang.Object) (-4));
        java.lang.Object obj36 = null;
        boolean boolean37 = objList31.removeElem(obj36);
        boolean boolean39 = objList31.removeElem((java.lang.Object) (-1L));
        boolean boolean40 = objList0.removeElem((java.lang.Object) objList31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList31.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test693");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList19 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean21 = objList19.removeElem((java.lang.Object) "");
        boolean boolean23 = objList19.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) 1L);
        boolean boolean30 = objList24.removeElem((java.lang.Object) (-1.0d));
        boolean boolean31 = objList19.removeElem((java.lang.Object) objList24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "");
        boolean boolean36 = objList32.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "");
        boolean boolean41 = objList37.removeElem((java.lang.Object) 1L);
        boolean boolean43 = objList37.removeElem((java.lang.Object) (-1.0d));
        boolean boolean44 = objList32.removeElem((java.lang.Object) objList37);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList45 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean47 = objList45.removeElem((java.lang.Object) "hi!");
        boolean boolean49 = objList45.removeElem((java.lang.Object) true);
        boolean boolean51 = objList45.removeElem((java.lang.Object) 4);
        boolean boolean53 = objList45.removeElem((java.lang.Object) 1);
        boolean boolean55 = objList45.removeElem((java.lang.Object) 10);
        boolean boolean56 = objList37.removeElem((java.lang.Object) objList45);
        boolean boolean57 = objList24.removeElem((java.lang.Object) objList45);
        boolean boolean58 = objList0.removeElem((java.lang.Object) boolean57);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "hi!");
        boolean boolean63 = objList59.removeElem((java.lang.Object) true);
        boolean boolean65 = objList59.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "");
        boolean boolean69 = objList59.removeElem((java.lang.Object) objList66);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) "hi!");
        boolean boolean74 = objList70.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList75 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean77 = objList75.removeElem((java.lang.Object) "hi!");
        boolean boolean78 = objList70.removeElem((java.lang.Object) boolean77);
        boolean boolean80 = objList70.removeElem((java.lang.Object) (short) 0);
        boolean boolean81 = objList66.removeElem((java.lang.Object) objList70);
        boolean boolean82 = objList0.removeElem((java.lang.Object) boolean81);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator83 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList0.replaceAll(objUnaryOperator83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test694");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList62 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean64 = objList62.removeElem((java.lang.Object) (byte) 0);
        boolean boolean65 = objList59.removeElem((java.lang.Object) (byte) 0);
        objList59.add((int) (byte) 0, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            objList8.add(3, (java.lang.Object) objList59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test695");
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
        java.lang.Object obj26 = new java.lang.Object();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) "hi!");
        boolean boolean31 = objList27.removeElem((java.lang.Object) true);
        boolean boolean33 = objList27.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList44 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList47 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean49 = objList47.removeElem((java.lang.Object) "");
        boolean boolean51 = objList47.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "");
        boolean boolean60 = objList56.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList64 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean66 = objList64.removeElem((java.lang.Object) "");
        boolean boolean68 = objList64.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList71 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = objList72.removeElem((java.lang.Object) "hi!");
        boolean boolean76 = objList72.removeElem((java.lang.Object) true);
        boolean boolean78 = objList72.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList84 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>> objCollectionList85 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.Object>>();
        java.lang.Object[] objArray86 = new java.lang.Object[] { (-1), obj26, objList27, 100.0d, 10, (-1), 3, 0.0d, 10.0d, 7, charSequenceList41, 1.0d, (short) 1, objList44, (-4), (-4), boolean51, 10, (-1.0f), (-2), 0.0d, (-3), (short) -1, (byte) 100, 10, 0L, (-1L), (short) 1, objListList71, boolean78, (byte) -1, (short) 100, 2, (-1.0d), (byte) -1, objList84, objCollectionList85 };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList87 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList87, objArray86);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList89 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean91 = objList89.removeElem((java.lang.Object) "");
        boolean boolean92 = objList87.removeElem((java.lang.Object) boolean91);
        java.lang.Object obj94 = objList87.remove(7);
        java.lang.Object obj96 = objList87.remove(1);
        boolean boolean98 = objList87.removeElem((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-1), (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test696");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        boolean boolean6 = objList0.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) (byte) 0);
        boolean boolean11 = objList7.removeElem((java.lang.Object) (-4));
        boolean boolean13 = objList7.removeElem((java.lang.Object) (short) 0);
        boolean boolean14 = objList0.removeElem((java.lang.Object) objList7);
        java.lang.Object obj16 = null;
        objList7.add(0, obj16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objList7.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test697");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = objList8.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test698");
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
        boolean boolean40 = objList26.removeElem((java.lang.Object) (byte) 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test699");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList34.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "hi!");
        boolean boolean42 = objList34.removeElem((java.lang.Object) boolean41);
        boolean boolean44 = objList34.removeElem((java.lang.Object) (-9));
        boolean boolean46 = objList34.removeElem((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(10, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test700");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-5));
        boolean boolean8 = objList0.removeElem((java.lang.Object) 5);
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
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test701");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList63 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean65 = objList63.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "hi!");
        boolean boolean74 = objList66.removeElem((java.lang.Object) boolean73);
        boolean boolean76 = objList66.removeElem((java.lang.Object) (short) 0);
        boolean boolean77 = objList63.removeElem((java.lang.Object) objList66);
        boolean boolean78 = objList5.removeElem((java.lang.Object) boolean77);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator79 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test702");
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
            java.lang.Object obj28 = objList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test703");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 1L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-1.0d));
        boolean boolean12 = objList0.removeElem((java.lang.Object) objList5);
        boolean boolean14 = objList5.removeElem((java.lang.Object) true);
        boolean boolean16 = objList5.removeElem((java.lang.Object) 10);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "");
        boolean boolean21 = objList17.removeElem((java.lang.Object) 0L);
        boolean boolean23 = objList17.removeElem((java.lang.Object) (-5));
        boolean boolean25 = objList17.removeElem((java.lang.Object) (-8));
        java.lang.Object obj26 = null;
        boolean boolean27 = objList17.removeElem(obj26);
        boolean boolean28 = objList5.removeElem(obj26);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test704");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList6 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean8 = objList6.removeElem((java.lang.Object) "");
        boolean boolean10 = objList6.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        boolean boolean15 = objList11.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "hi!");
        boolean boolean19 = objList11.removeElem((java.lang.Object) boolean18);
        boolean boolean21 = objList11.removeElem((java.lang.Object) (-9));
        boolean boolean22 = objList6.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList23 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean25 = objList23.removeElem((java.lang.Object) "");
        boolean boolean27 = objList23.removeElem((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "hi!");
        boolean boolean32 = objList28.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "hi!");
        boolean boolean36 = objList28.removeElem((java.lang.Object) boolean35);
        boolean boolean38 = objList28.removeElem((java.lang.Object) (-9));
        boolean boolean39 = objList23.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean42 = objList40.removeElem((java.lang.Object) "hi!");
        boolean boolean44 = objList40.removeElem((java.lang.Object) true);
        boolean boolean46 = objList40.removeElem((java.lang.Object) (-1.0d));
        boolean boolean48 = objList40.removeElem((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "");
        boolean boolean53 = objList49.removeElem((java.lang.Object) 0L);
        boolean boolean55 = objList49.removeElem((java.lang.Object) (-5));
        objList49.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "");
        boolean boolean63 = objList59.removeElem((java.lang.Object) 0L);
        boolean boolean65 = objList59.removeElem((java.lang.Object) (-5));
        boolean boolean67 = objList59.removeElem((java.lang.Object) (-8));
        boolean boolean68 = objList49.removeElem((java.lang.Object) objList59);
        boolean boolean69 = objList40.removeElem((java.lang.Object) boolean68);
        boolean boolean70 = objList23.removeElem((java.lang.Object) boolean68);
        boolean boolean71 = objList6.removeElem((java.lang.Object) objList23);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add(2, (java.lang.Object) objList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test705");
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
        boolean boolean23 = objList17.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean27 = objList17.removeElem((java.lang.Object) objList24);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) "");
        boolean boolean32 = objList28.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList33 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean35 = objList33.removeElem((java.lang.Object) "");
        boolean boolean37 = objList33.removeElem((java.lang.Object) 1L);
        boolean boolean39 = objList33.removeElem((java.lang.Object) (-1.0d));
        boolean boolean40 = objList28.removeElem((java.lang.Object) objList33);
        boolean boolean41 = objList24.removeElem((java.lang.Object) objList33);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((-5), (java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test706");
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
        boolean boolean23 = objList21.removeElem((java.lang.Object) (byte) 0);
        boolean boolean25 = objList21.removeElem((java.lang.Object) (-4));
        boolean boolean27 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean29 = objList21.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList30 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean32 = objList30.removeElem((java.lang.Object) "hi!");
        boolean boolean34 = objList30.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "hi!");
        boolean boolean38 = objList30.removeElem((java.lang.Object) boolean37);
        boolean boolean40 = objList30.removeElem((java.lang.Object) (short) 0);
        boolean boolean41 = objList21.removeElem((java.lang.Object) objList30);
        boolean boolean42 = objList0.removeElem((java.lang.Object) objList30);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator43 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList30.replaceAll(objUnaryOperator43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test707");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "hi!");
        boolean boolean52 = objList48.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList53 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean55 = objList53.removeElem((java.lang.Object) "hi!");
        boolean boolean56 = objList48.removeElem((java.lang.Object) boolean55);
        boolean boolean58 = objList48.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) '4');
        boolean boolean63 = objList59.removeElem((java.lang.Object) 100.0d);
        boolean boolean64 = objList48.removeElem((java.lang.Object) objList59);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList65 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean67 = objList65.removeElem((java.lang.Object) "");
        boolean boolean69 = objList65.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList70 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean72 = objList70.removeElem((java.lang.Object) "");
        boolean boolean74 = objList70.removeElem((java.lang.Object) 1L);
        boolean boolean76 = objList70.removeElem((java.lang.Object) (-1.0d));
        boolean boolean77 = objList65.removeElem((java.lang.Object) objList70);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList78 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean80 = objList78.removeElem((java.lang.Object) "hi!");
        boolean boolean82 = objList78.removeElem((java.lang.Object) true);
        boolean boolean84 = objList78.removeElem((java.lang.Object) 4);
        boolean boolean86 = objList78.removeElem((java.lang.Object) 1);
        boolean boolean88 = objList78.removeElem((java.lang.Object) 10);
        boolean boolean89 = objList70.removeElem((java.lang.Object) objList78);
        boolean boolean90 = objList59.removeElem((java.lang.Object) objList70);
        boolean boolean91 = objList5.removeElem((java.lang.Object) boolean90);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test708");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test709");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) (byte) 0);
        boolean boolean38 = objList34.removeElem((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList39 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = objList39.removeElem((java.lang.Object) "");
        boolean boolean43 = objList39.removeElem((java.lang.Object) 0L);
        boolean boolean45 = objList39.removeElem((java.lang.Object) (-5));
        objList39.add(0, (java.lang.Object) 10.0f);
        boolean boolean49 = objList34.removeElem((java.lang.Object) objList39);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList50 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean52 = objList50.removeElem((java.lang.Object) (byte) 0);
        boolean boolean54 = objList50.removeElem((java.lang.Object) (-4));
        boolean boolean56 = objList50.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList57 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean59 = objList57.removeElem((java.lang.Object) (byte) 0);
        boolean boolean61 = objList57.removeElem((java.lang.Object) (-4));
        boolean boolean63 = objList57.removeElem((java.lang.Object) (short) 0);
        boolean boolean64 = objList50.removeElem((java.lang.Object) objList57);
        boolean boolean66 = objList50.removeElem((java.lang.Object) (-10));
        boolean boolean67 = objList39.removeElem((java.lang.Object) objList50);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList68 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean70 = objList68.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "");
        boolean boolean75 = objList71.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = objList76.removeElem((java.lang.Object) "");
        boolean boolean80 = objList76.removeElem((java.lang.Object) 1L);
        boolean boolean82 = objList76.removeElem((java.lang.Object) (-1.0d));
        boolean boolean83 = objList71.removeElem((java.lang.Object) objList76);
        boolean boolean85 = objList76.removeElem((java.lang.Object) true);
        boolean boolean86 = objList68.removeElem((java.lang.Object) boolean85);
        boolean boolean87 = objList39.removeElem((java.lang.Object) boolean85);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList89 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean91 = objList89.removeElem((java.lang.Object) "hi!");
        boolean boolean93 = objList89.removeElem((java.lang.Object) true);
        boolean boolean95 = objList89.removeElem((java.lang.Object) 4);
        objList39.add(0, (java.lang.Object) boolean95);
        objList0.add(0, (java.lang.Object) boolean95);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test710");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) (byte) 0);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean8 = objList0.removeElem((java.lang.Object) 100.0d);
        boolean boolean10 = objList0.removeElem((java.lang.Object) 100.0d);
        objList0.add(0, (java.lang.Object) (-8));
        java.lang.Object obj15 = objList0.remove(0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test711");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "");
        boolean boolean4 = objList0.removeElem((java.lang.Object) 1L);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        boolean boolean8 = objList0.removeElem((java.lang.Object) (-8));
        java.lang.Object obj9 = null;
        boolean boolean10 = objList0.removeElem(obj9);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList11 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean13 = objList11.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList14 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean16 = objList14.removeElem((java.lang.Object) "hi!");
        boolean boolean18 = objList14.removeElem((java.lang.Object) true);
        boolean boolean20 = objList14.removeElem((java.lang.Object) 4);
        boolean boolean21 = objList11.removeElem((java.lang.Object) boolean20);
        boolean boolean22 = objList0.removeElem((java.lang.Object) objList11);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) (-3));
        objList24.add(0, (java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            objList11.add((int) (byte) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test712");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList21.replaceAll(objUnaryOperator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test713");
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
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList8.replaceAll(objUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test714");
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
        java.lang.Object obj55 = objList5.remove(0);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator56 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList5.replaceAll(objUnaryOperator56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test715");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        boolean boolean4 = objList0.removeElem((java.lang.Object) true);
        boolean boolean6 = objList0.removeElem((java.lang.Object) (-1.0d));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList7.removeElem((java.lang.Object) true);
        boolean boolean13 = objList7.removeElem((java.lang.Object) 4);
        boolean boolean14 = objList0.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList15 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean17 = objList15.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.String> strList18 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean19 = objList15.removeElem((java.lang.Object) strList18);
        boolean boolean20 = objList0.removeElem((java.lang.Object) objList15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList15.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test716");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) (byte) 0);
        boolean boolean32 = objList28.removeElem((java.lang.Object) (byte) 100);
        boolean boolean34 = objList28.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList35 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean37 = objList35.removeElem((java.lang.Object) "");
        boolean boolean39 = objList35.removeElem((java.lang.Object) 0L);
        boolean boolean40 = objList28.removeElem((java.lang.Object) 0L);
        objList28.add(0, (java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            objList10.add((-100), (java.lang.Object) objList28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test717");
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
        java.lang.Object obj71 = objList62.remove(0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList72 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean74 = objList72.removeElem((java.lang.Object) "");
        boolean boolean76 = objList72.removeElem((java.lang.Object) 0L);
        boolean boolean78 = objList72.removeElem((java.lang.Object) (-5));
        boolean boolean80 = objList72.removeElem((java.lang.Object) 1L);
        boolean boolean81 = objList62.removeElem((java.lang.Object) objList72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = objList72.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test718");
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
            java.lang.Object obj25 = objList0.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test719");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList26 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList27 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean29 = objList27.removeElem((java.lang.Object) (byte) 0);
        boolean boolean31 = objList27.removeElem((java.lang.Object) (-4));
        boolean boolean33 = objList27.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) (byte) 0);
        boolean boolean38 = objList34.removeElem((java.lang.Object) (-4));
        boolean boolean40 = objList34.removeElem((java.lang.Object) (short) 0);
        boolean boolean41 = objList27.removeElem((java.lang.Object) objList34);
        boolean boolean42 = objList26.removeElem((java.lang.Object) objList27);
        objList16.add(0, (java.lang.Object) objList26);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test720");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        boolean boolean9 = objList3.removeElem((java.lang.Object) 4);
        boolean boolean10 = objList0.removeElem((java.lang.Object) boolean9);
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
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test721");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) (byte) 0);
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 100);
        boolean boolean6 = objList0.removeElem((java.lang.Object) 100);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList7 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean9 = objList7.removeElem((java.lang.Object) "");
        boolean boolean11 = objList7.removeElem((java.lang.Object) 0L);
        boolean boolean12 = objList0.removeElem((java.lang.Object) 0L);
        objList0.add(0, (java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList16 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean18 = objList16.removeElem((java.lang.Object) "");
        boolean boolean20 = objList16.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        boolean boolean28 = objList16.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        boolean boolean35 = objList29.removeElem((java.lang.Object) 4);
        boolean boolean37 = objList29.removeElem((java.lang.Object) 1);
        boolean boolean39 = objList29.removeElem((java.lang.Object) 10);
        boolean boolean40 = objList21.removeElem((java.lang.Object) objList29);
        boolean boolean41 = objList0.removeElem((java.lang.Object) objList21);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList42 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean44 = objList42.removeElem((java.lang.Object) "");
        boolean boolean46 = objList42.removeElem((java.lang.Object) 0L);
        boolean boolean48 = objList42.removeElem((java.lang.Object) (-5));
        boolean boolean50 = objList42.removeElem((java.lang.Object) 5);
        boolean boolean51 = objList0.removeElem((java.lang.Object) boolean50);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test722");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList51 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean53 = objList51.removeElem((java.lang.Object) (byte) 0);
        boolean boolean54 = objList48.removeElem((java.lang.Object) (byte) 0);
        objList48.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean59 = objList48.removeElem((java.lang.Object) '4');
        boolean boolean60 = objList5.removeElem((java.lang.Object) objList48);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList61 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean63 = objList61.removeElem((java.lang.Object) "hi!");
        boolean boolean65 = objList61.removeElem((java.lang.Object) true);
        boolean boolean67 = objList61.removeElem((java.lang.Object) 4);
        objList61.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "hi!");
        boolean boolean75 = objList71.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList76 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean78 = objList76.removeElem((java.lang.Object) "hi!");
        boolean boolean79 = objList71.removeElem((java.lang.Object) boolean78);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList80.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList83 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean85 = objList83.removeElem((java.lang.Object) (byte) 0);
        boolean boolean86 = objList80.removeElem((java.lang.Object) (byte) 0);
        objList80.add((int) (byte) 0, (java.lang.Object) (short) 10);
        boolean boolean90 = objList71.removeElem((java.lang.Object) objList80);
        boolean boolean92 = objList71.removeElem((java.lang.Object) "hi!");
        boolean boolean93 = objList61.removeElem((java.lang.Object) objList71);
        boolean boolean94 = objList5.removeElem((java.lang.Object) boolean93);
        boolean boolean96 = objList5.removeElem((java.lang.Object) (-7));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test723");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objList3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test724");
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
            java.lang.Object obj34 = objList0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test725");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) '4');
        boolean boolean4 = objList0.removeElem((java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList5 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean7 = objList5.removeElem((java.lang.Object) "");
        boolean boolean9 = objList5.removeElem((java.lang.Object) 0L);
        boolean boolean11 = objList5.removeElem((java.lang.Object) (-5));
        boolean boolean13 = objList5.removeElem((java.lang.Object) (-8));
        java.lang.Object obj14 = null;
        boolean boolean15 = objList5.removeElem(obj14);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList17 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean19 = objList17.removeElem((java.lang.Object) "hi!");
        boolean boolean21 = objList17.removeElem((java.lang.Object) true);
        boolean boolean23 = objList17.removeElem((java.lang.Object) 4);
        objList17.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList28 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean30 = objList28.removeElem((java.lang.Object) (byte) 0);
        boolean boolean32 = objList28.removeElem((java.lang.Object) (-4));
        boolean boolean34 = objList28.removeElem((java.lang.Object) 1L);
        objList28.add((int) (byte) 0, (java.lang.Object) (byte) 1);
        objList17.add((int) (short) 0, (java.lang.Object) (byte) 1);
        objList5.add(0, (java.lang.Object) (byte) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList41 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean43 = objList41.removeElem((java.lang.Object) (byte) 0);
        boolean boolean45 = objList41.removeElem((java.lang.Object) (-4));
        boolean boolean47 = objList41.removeElem((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList48 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean50 = objList48.removeElem((java.lang.Object) (byte) 0);
        boolean boolean52 = objList48.removeElem((java.lang.Object) (-4));
        boolean boolean54 = objList48.removeElem((java.lang.Object) (short) 0);
        boolean boolean55 = objList41.removeElem((java.lang.Object) objList48);
        boolean boolean56 = objList40.removeElem((java.lang.Object) objList41);
        boolean boolean57 = objList5.removeElem((java.lang.Object) boolean56);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList58 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean60 = objList58.removeElem((java.lang.Object) "hi!");
        boolean boolean62 = objList58.removeElem((java.lang.Object) true);
        boolean boolean64 = objList58.removeElem((java.lang.Object) 4);
        boolean boolean65 = objList5.removeElem((java.lang.Object) objList58);
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>> objListList66 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.Object>>();
        boolean boolean67 = objList58.removeElem((java.lang.Object) objListList66);
        boolean boolean68 = objList0.removeElem((java.lang.Object) objList58);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test726");
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
        boolean boolean23 = objList0.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList24 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean26 = objList24.removeElem((java.lang.Object) "");
        boolean boolean28 = objList24.removeElem((java.lang.Object) 0L);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "");
        boolean boolean33 = objList29.removeElem((java.lang.Object) 1L);
        boolean boolean35 = objList29.removeElem((java.lang.Object) (-1.0d));
        boolean boolean36 = objList24.removeElem((java.lang.Object) objList29);
        boolean boolean38 = objList29.removeElem((java.lang.Object) true);
        boolean boolean40 = objList29.removeElem((java.lang.Object) 8);
        boolean boolean42 = objList29.removeElem((java.lang.Object) 10.0d);
        boolean boolean43 = objList0.removeElem((java.lang.Object) objList29);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test727");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean2 = objList0.removeElem((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList3 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean5 = objList3.removeElem((java.lang.Object) "hi!");
        boolean boolean7 = objList3.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList8 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean10 = objList8.removeElem((java.lang.Object) "hi!");
        boolean boolean11 = objList3.removeElem((java.lang.Object) boolean10);
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
        boolean boolean51 = objList3.removeElem((java.lang.Object) objList38);
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
        boolean boolean75 = objList73.removeElem((java.lang.Object) (byte) 0);
        boolean boolean77 = objList73.removeElem((java.lang.Object) (-4));
        boolean boolean79 = objList73.removeElem((java.lang.Object) 1L);
        boolean boolean81 = objList73.removeElem((java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList82 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean84 = objList82.removeElem((java.lang.Object) "hi!");
        boolean boolean86 = objList82.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList87 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean89 = objList87.removeElem((java.lang.Object) "hi!");
        boolean boolean90 = objList82.removeElem((java.lang.Object) boolean89);
        boolean boolean92 = objList82.removeElem((java.lang.Object) (short) 0);
        boolean boolean93 = objList73.removeElem((java.lang.Object) objList82);
        boolean boolean94 = objList52.removeElem((java.lang.Object) objList82);
        boolean boolean95 = objList38.removeElem((java.lang.Object) objList52);
        boolean boolean96 = objList0.removeElem((java.lang.Object) objList52);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test728");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList21 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean23 = objList21.removeElem((java.lang.Object) "");
        boolean boolean25 = objList21.removeElem((java.lang.Object) 1L);
        boolean boolean27 = objList21.removeElem((java.lang.Object) (-1.0d));
        boolean boolean29 = objList21.removeElem((java.lang.Object) (-8));
        boolean boolean31 = objList21.removeElem((java.lang.Object) (short) 1);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList32 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean34 = objList32.removeElem((java.lang.Object) "hi!");
        boolean boolean36 = objList32.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList37 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean39 = objList37.removeElem((java.lang.Object) "hi!");
        boolean boolean40 = objList32.removeElem((java.lang.Object) boolean39);
        boolean boolean42 = objList32.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList43 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean45 = objList43.removeElem((java.lang.Object) '4');
        boolean boolean47 = objList43.removeElem((java.lang.Object) 100.0d);
        boolean boolean48 = objList32.removeElem((java.lang.Object) objList43);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean53 = objList49.removeElem((java.lang.Object) true);
        boolean boolean55 = objList49.removeElem((java.lang.Object) 4);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList56 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean58 = objList56.removeElem((java.lang.Object) "");
        boolean boolean59 = objList49.removeElem((java.lang.Object) objList56);
        boolean boolean60 = objList32.removeElem((java.lang.Object) objList56);
        boolean boolean61 = objList21.removeElem((java.lang.Object) objList32);
        boolean boolean62 = objList0.removeElem((java.lang.Object) boolean61);
        boolean boolean64 = objList0.removeElem((java.lang.Object) (-1.0f));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList66 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean68 = objList66.removeElem((java.lang.Object) "hi!");
        boolean boolean70 = objList66.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList71 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean73 = objList71.removeElem((java.lang.Object) "hi!");
        boolean boolean74 = objList66.removeElem((java.lang.Object) boolean73);
        boolean boolean76 = objList66.removeElem((java.lang.Object) (-9));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList77 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean79 = objList77.removeElem((java.lang.Object) '4');
        boolean boolean81 = objList77.removeElem((java.lang.Object) 100.0d);
        boolean boolean82 = objList66.removeElem((java.lang.Object) objList77);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList83 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean85 = objList83.removeElem((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList86 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean88 = objList86.removeElem((java.lang.Object) "hi!");
        boolean boolean90 = objList86.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList91 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean93 = objList91.removeElem((java.lang.Object) "hi!");
        boolean boolean94 = objList86.removeElem((java.lang.Object) boolean93);
        boolean boolean96 = objList86.removeElem((java.lang.Object) (short) 0);
        boolean boolean97 = objList83.removeElem((java.lang.Object) objList86);
        boolean boolean98 = objList77.removeElem((java.lang.Object) boolean97);
        // The following exception was thrown during execution in test generation
        try {
            objList0.add((int) (byte) 100, (java.lang.Object) boolean98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test729");
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
        DataStructures.commonscollections.TreeList<java.lang.Object> objList29 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean31 = objList29.removeElem((java.lang.Object) "hi!");
        boolean boolean33 = objList29.removeElem((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList34 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean36 = objList34.removeElem((java.lang.Object) "hi!");
        boolean boolean37 = objList29.removeElem((java.lang.Object) boolean36);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 100L };
        DataStructures.commonscollections.TreeList<java.lang.Object> objList40 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList40, objArray39);
        java.lang.Object obj43 = objList40.remove((int) (short) 0);
        boolean boolean44 = objList29.removeElem(obj43);
        boolean boolean46 = objList29.removeElem((java.lang.Object) 1.0f);
        boolean boolean47 = objList1.removeElem((java.lang.Object) 1.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList49 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean51 = objList49.removeElem((java.lang.Object) "hi!");
        boolean boolean53 = objList49.removeElem((java.lang.Object) true);
        boolean boolean55 = objList49.removeElem((java.lang.Object) 4);
        objList49.add(0, (java.lang.Object) (-100));
        DataStructures.commonscollections.TreeList<java.lang.Object> objList59 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean61 = objList59.removeElem((java.lang.Object) "");
        boolean boolean63 = objList59.removeElem((java.lang.Object) 0L);
        boolean boolean65 = objList59.removeElem((java.lang.Object) (-5));
        objList59.add(0, (java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList69 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean71 = objList69.removeElem((java.lang.Object) "");
        boolean boolean73 = objList69.removeElem((java.lang.Object) 0L);
        boolean boolean75 = objList69.removeElem((java.lang.Object) (-5));
        boolean boolean77 = objList69.removeElem((java.lang.Object) (-8));
        boolean boolean78 = objList59.removeElem((java.lang.Object) objList69);
        boolean boolean79 = objList49.removeElem((java.lang.Object) objList59);
        DataStructures.commonscollections.TreeList<java.lang.Object> objList80 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
        boolean boolean82 = objList80.removeElem((java.lang.Object) "");
        boolean boolean84 = objList80.removeElem((java.lang.Object) 1L);
        boolean boolean86 = objList80.removeElem((java.lang.Object) (-1.0d));
        boolean boolean87 = objList59.removeElem((java.lang.Object) objList80);
        // The following exception was thrown during execution in test generation
        try {
            objList1.add(6, (java.lang.Object) boolean87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

