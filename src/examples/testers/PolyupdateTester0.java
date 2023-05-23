package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PolyupdateTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test001");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test002");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-9));
        polyupdate0.add3(0, (int) (short) 0, (int) (short) -1, 100);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test003");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, 12, (int) '#', (-10));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test004");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        polyupdate18.clear();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test005");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        int int27 = polyupdate21.sm();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test006");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3((-4), (-1), (-8), (int) (byte) 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test007");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-6));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test008");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.add3(10, (-7), (-2), 8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test009");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        polyupdate25.add3(100, (int) ' ', (-1), (int) (short) 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test010");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 10);
        polyupdate27.a((int) (short) 1);
        polyupdate27.a((int) (byte) 10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test011");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        int int10 = polyupdate0.sm();
        polyupdate0.a((int) (short) -1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test012");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        int int8 = polyupdate0.sm();
        polyupdate0.a((int) (byte) 10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test013");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        polyupdate21.a((int) 'a');
        polyupdate21.clear();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test014");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.a(100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test015");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.add3((-100), 2, (int) ' ', 104);
        polyupdate21.clear();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test016");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.clear();
        polyupdate21.a((int) '4');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test017");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 10);
        polyupdate27.clear();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test018");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test019");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        polyupdate22.clear();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test020");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a((-10));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test021");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        polyupdate22.add3((int) '#', (int) '#', (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test022");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3((-100), (-1), (int) (short) 0, (int) '#');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test023");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        polyupdate22.add3((int) (short) 10, (int) '#', (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test024");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(7, (int) (byte) 0, 7, (-5));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test025");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.add3((int) (short) -1, 100, (int) (byte) -1, 29);
        polyupdate0.a((int) '#');
        polyupdate0.clear();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test026");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        int int24 = polyupdate23.sm();
        int int25 = polyupdate23.sm();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test027");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-5));
        polyupdate22.a((int) (byte) 100);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test028");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.a((int) (short) 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test029");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a(20);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test030");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 10);
        polyupdate27.add3(20, (int) (byte) 100, (-4), (-4));
        int int33 = polyupdate27.sm();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test031");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.clear();
        polyupdate21.add3((-100), (int) (byte) 10, (int) (byte) 1, 0);
        int int33 = polyupdate21.sm();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test032");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        int int24 = polyupdate23.sm();
        polyupdate23.a(0);
        polyupdate23.clear();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test033");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        polyupdate0.a(5);
        polyupdate0.a((int) (byte) -1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test034");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test035");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(3, (int) (short) 10, (-3), (int) (short) 10);
        int int9 = polyupdate0.sm();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test036");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 6);
        int int25 = polyupdate24.sm();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test037");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        int int9 = polyupdate0.sm();
        polyupdate0.add3((-3), (-1), 9, (int) (short) 0);
        int int15 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test038");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) -1);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test039");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, (-5));
        polyupdate24.add3(206, (int) (byte) 100, 0, 81);
        polyupdate24.clear();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test040");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(0);
        polyupdate0.a(0);
        polyupdate0.clear();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test041");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        polyupdate0.add3(501, 81, 9, 212);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test042");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a(7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test043");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a((-10));
        polyupdate0.a((-2));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test044");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 9);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 81);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test045");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3((-10), (-1), 8, 3);
        polyupdate0.add3(4, 134, 100, 20);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test046");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(2, (int) (byte) 100, (-3), 0);
        polyupdate0.clear();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test047");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test048");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.add3(112, 103, 112, 81);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test049");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 9);
        polyupdate20.clear();
        polyupdate20.a(112);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test050");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test051");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test052");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        polyupdate0.add3(0, 0, 0, 307);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test053");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        int int29 = polyupdate21.sm();
        polyupdate21.a(212);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test054");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(0, 8, 4, 1);
        polyupdate0.a(9);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test055");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        polyupdate0.a(1);
        polyupdate0.clear();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test056");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(26, (int) (short) 10, 3, 20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test057");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        int int28 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.a((int) (short) 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test058");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.add3((int) ' ', 2, (int) (byte) 0, 7);
        polyupdate23.a(20);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test059");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test060");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) -1);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 12);
        polyupdate29.a((-3));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test061");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        polyupdate25.add3(7, 20, 134, (-6));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test062");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        polyupdate0.a(5);
        polyupdate0.clear();
        int int13 = polyupdate0.sm();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test063");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.clear();
        int int28 = polyupdate21.sm();
        polyupdate21.clear();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test064");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.clear();
        int int21 = polyupdate19.sm();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test065");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(100);
        polyupdate0.add3(10, (-100), 100, 307);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test066");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        int int23 = polyupdate22.sm();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test067");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.a((int) 'a');
        polyupdate21.add3(1, 1, 0, (int) (short) 100);
        polyupdate21.a(112);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test068");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        polyupdate21.clear();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test069");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (-7));
        polyupdate27.a((-1));
        polyupdate27.clear();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test070");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 6);
        polyupdate24.a((int) ' ');
        polyupdate24.clear();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test071");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 9);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 10);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, (-3));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test072");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.add3(501, 100, 614, (int) ' ');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test073");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        polyupdate21.a((int) (byte) -1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test074");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.a((int) 'a');
        polyupdate21.add3(1, 1, 0, (int) (short) 100);
        polyupdate21.add3((int) (short) -1, (int) (byte) 0, 8, 0);
        int int39 = polyupdate21.sm();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test075");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a(12);
        polyupdate0.add3(3, (int) (byte) 10, (-1), 81);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test076");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (-7));
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 108);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test077");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        polyupdate22.add3((int) 'a', (int) (short) 0, 29, (int) ' ');
        polyupdate22.a(0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test078");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-9));
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        int int13 = polyupdate0.sm();
        int int14 = polyupdate0.sm();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test079");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-9));
        polyupdate0.add3(0, 8, 0, (int) (byte) -1);
        int int15 = polyupdate0.sm();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test080");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3((-1), 206, 100, 5);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test081");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        int int24 = polyupdate23.sm();
        polyupdate23.a(0);
        polyupdate23.add3((int) (byte) -1, 501, 20, 212);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test082");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        polyupdate0.clear();
        polyupdate0.add3(9, 111, (int) ' ', 108);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test083");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a((int) (byte) 100);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(81, (int) (short) 10, (-5), (int) '4');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test084");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 10);
        polyupdate29.add3((int) ' ', 100, (int) (short) 100, 29);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test085");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test086");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate27.a((int) (byte) -1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test087");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.add3(8, (int) (short) 0, (-1), (-10));
        polyupdate21.clear();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test088");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (-7));
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 28);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test089");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.clear();
        polyupdate0.a(206);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test090");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 7);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test091");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.a((-4));
        int int13 = polyupdate0.sm();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test092");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        polyupdate0.add3((int) (byte) 0, 104, 1, 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test093");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, (-6), 29, 100, (-3), 10, 0, 10, 7, 5, (-7), (-3), (-9), (-1), (-2), 10, (-10), 1, 3, 2, 100, 3, 100, (-5), 6, (-1), 3, 6, 104, 6, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        DataStructures.cozy.Polyupdate polyupdate35 = new DataStructures.cozy.Polyupdate(intList32, 0);
        DataStructures.cozy.Polyupdate polyupdate37 = new DataStructures.cozy.Polyupdate(intList32, (-6));
        DataStructures.cozy.Polyupdate polyupdate39 = new DataStructures.cozy.Polyupdate(intList32, (-3));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test094");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test095");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(0);
        polyupdate0.add3((int) ' ', (int) (byte) 100, 8, 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test096");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        polyupdate0.clear();
        polyupdate0.a(307);
        int int6 = polyupdate0.sm();
        polyupdate0.a(307);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test097");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.a((int) 'a');
        polyupdate21.add3(1, 1, 0, (int) (short) 100);
        int int34 = polyupdate21.sm();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test098");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.a(307);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test099");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.a((-5));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test100");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        polyupdate24.add3((int) 'a', (-5), 0, 4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test101");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        polyupdate20.clear();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test102");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 10);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 206);
        DataStructures.cozy.Polyupdate polyupdate31 = new DataStructures.cozy.Polyupdate(intList16, 212);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test103");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 112);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, 103);
        polyupdate26.a(134);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test104");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 10);
        polyupdate27.add3(20, (int) (byte) 100, (-4), (-4));
        polyupdate27.add3(44, (int) (byte) 10, 4, 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test105");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        polyupdate0.clear();
        polyupdate0.a(307);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test106");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test107");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-6));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 285);
        int int25 = polyupdate24.sm();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test108");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.a((-4));
        polyupdate0.clear();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test109");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3((int) (byte) -1, 8, 112, (-7));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test110");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, (-100));
        polyupdate24.add3((-7), 8, 390, 8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test111");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(0, 8, 4, 1);
        int int9 = polyupdate0.sm();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test112");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 10);
        polyupdate27.add3(0, (int) ' ', 307, 112);
        polyupdate27.clear();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test113");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test114");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test115");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) '#', 0, (-89), 212);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test116");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3((-3), (int) ' ', 29, (int) (short) 10);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test117");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-9));
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        int int13 = polyupdate0.sm();
        polyupdate0.add3(0, 9, 3, 163);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test118");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-6));
        polyupdate21.a((-3));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test119");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        int int8 = polyupdate0.sm();
        polyupdate0.a(81);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test120");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3((-10), (-1), 8, 3);
        polyupdate0.add3(1, 12, (-1), (-1));
        polyupdate0.add3(4, (int) (short) -1, (int) (byte) 1, 104);
        int int19 = polyupdate0.sm();
        int int20 = polyupdate0.sm();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test121");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        int int19 = polyupdate18.sm();
        int int20 = polyupdate18.sm();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test122");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        polyupdate18.clear();
        polyupdate18.add3(111, (int) (byte) 100, 1, (int) (byte) 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test123");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (int) '#');
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 285);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test124");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 111);
        polyupdate27.a(614);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test125");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-6));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 285);
        polyupdate24.add3(103, 20, 1, 44);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test126");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        int int19 = polyupdate18.sm();
        polyupdate18.clear();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test127");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 134);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test128");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-6));
        polyupdate21.a(44);
        polyupdate21.add3(1, 100, 6, (int) (byte) -1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test129");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        int int28 = polyupdate27.sm();
        int int29 = polyupdate27.sm();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test130");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.a((int) 'a');
        polyupdate21.add3(1, 1, 0, (int) (short) 100);
        polyupdate21.add3((int) (short) -1, (int) (byte) 0, 8, 0);
        polyupdate21.a((-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test131");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.add3((-10), 5, 103, 10);
        polyupdate19.add3(7, 108, (int) '4', 20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test132");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.a((-1));
        int int22 = polyupdate19.sm();
        int int23 = polyupdate19.sm();
        polyupdate19.clear();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test133");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, 9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test134");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 9);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 10);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 112);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test135");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(100);
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test136");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test137");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 226);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test138");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.add3((int) (short) -1, 100, (int) (byte) -1, 29);
        int int15 = polyupdate0.sm();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test139");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 8);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 103);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test140");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(0, 8, 4, 1);
        polyupdate0.a(81);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test141");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-6));
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 0);
        int int24 = polyupdate23.sm();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test142");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(100);
        int int5 = polyupdate0.sm();
        polyupdate0.add3(4, 104, (-7), 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test143");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 7);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 134);
        int int28 = polyupdate27.sm();
        polyupdate27.add3((int) (short) 1, 10, 307, (int) '4');
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test144");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        polyupdate18.clear();
        polyupdate18.clear();
        polyupdate18.add3((-100), 100, 10, 226);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test145");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3((int) (short) 10, (int) ' ', 100, 100);
        polyupdate0.a(134);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test146");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.a((-4));
        polyupdate0.a(100);
        polyupdate0.clear();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test147");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.clear();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test148");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-5));
        int int14 = polyupdate0.sm();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test149");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-9));
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        int int13 = polyupdate0.sm();
        polyupdate0.a((-6));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test150");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) -1);
        polyupdate23.a(8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test151");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        polyupdate22.add3((int) 'a', (int) (short) 0, 29, (int) ' ');
        int int28 = polyupdate22.sm();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test152");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 10);
        polyupdate27.add3(0, (int) ' ', 307, 112);
        polyupdate27.a((int) (short) 1);
        polyupdate27.add3((int) ' ', 81, 0, (-4));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test153");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test154");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 226);
        int int25 = polyupdate24.sm();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test155");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a((-10));
        polyupdate0.a(614);
        polyupdate0.a(1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test156");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 0);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (int) ' ');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test157");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a((int) (byte) 100);
        polyupdate0.a(9);
        int int12 = polyupdate0.sm();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test158");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 29);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test159");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-89));
        polyupdate21.add3(13, 226, 1, (-1));
        polyupdate21.clear();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test160");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.a((-4));
        polyupdate0.a(100);
        polyupdate0.add3(0, 112, 1, 307);
        polyupdate0.clear();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test161");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a((int) '4');
        int int6 = polyupdate0.sm();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test162");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 0);
        polyupdate0.a(0);
        int int14 = polyupdate0.sm();
        int int15 = polyupdate0.sm();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test163");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(0);
        polyupdate0.clear();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test164");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (-7));
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, (-1));
        polyupdate29.clear();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test165");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        polyupdate20.a((int) (short) 0);
        polyupdate20.clear();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test166");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a(206);
        polyupdate0.add3((int) (byte) 10, 81, 285, 206);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test167");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        polyupdate21.add3(4, (int) (byte) 1, 206, (int) (byte) 100);
        int int34 = polyupdate21.sm();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test168");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        polyupdate22.add3(2, 20, (-7), 5);
        polyupdate22.clear();
        polyupdate22.a(163);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test169");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a((int) (byte) 100);
        int int10 = polyupdate0.sm();
        polyupdate0.a((int) (short) 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test170");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.clear();
        polyupdate21.clear();
        polyupdate21.add3(244, 7, 102, 108);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test171");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.add3((-7), (-6), 2, (int) (short) 100);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test172");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        polyupdate0.a(127);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test173");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a(9);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test174");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-6));
        int int22 = polyupdate21.sm();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test175");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        int int24 = polyupdate23.sm();
        polyupdate23.clear();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test176");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(8, 8, (-89), 205);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test177");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 12);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (int) '#');
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test178");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 10);
        polyupdate27.add3((int) (byte) 10, (int) (short) 1, 81, 3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test179");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        int int25 = polyupdate23.sm();
        polyupdate23.add3((-9), 200, 205, 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test180");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-89));
        polyupdate21.add3(13, 226, 1, (-1));
        polyupdate21.add3((int) ' ', (-2), (int) 'a', 23);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test181");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        int int24 = polyupdate23.sm();
        polyupdate23.add3(102, 3, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test182");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        polyupdate21.a((int) 'a');
        int int31 = polyupdate21.sm();
        polyupdate21.a(112);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test183");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 7);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 134);
        int int28 = polyupdate27.sm();
        polyupdate27.a((int) (byte) 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test184");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(0, 8, 4, 1);
        polyupdate0.a(9);
        polyupdate0.a(226);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test185");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.clear();
        polyupdate21.add3((-1), (-100), (int) (short) 10, (-100));
        polyupdate21.add3((-4), 44, 31, 9);
        polyupdate21.clear();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test186");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.a((int) 'a');
        polyupdate21.add3(4, (int) (byte) 1, 206, (int) (byte) 100);
        polyupdate21.a((int) (byte) -1);
        int int36 = polyupdate21.sm();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test187");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.a(10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test188");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a((-10));
        polyupdate0.clear();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test189");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, (-6), 29, 100, (-3), 10, 0, 10, 7, 5, (-7), (-3), (-9), (-1), (-2), 10, (-10), 1, 3, 2, 100, 3, 100, (-5), 6, (-1), 3, 6, 104, 6, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        DataStructures.cozy.Polyupdate polyupdate35 = new DataStructures.cozy.Polyupdate(intList32, 0);
        polyupdate35.add3(200, (int) (byte) 1, 158, 29);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test190");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.a((int) 'a');
        polyupdate21.add3(1, 1, 0, (int) (short) 100);
        polyupdate21.add3((int) (short) -1, (int) (byte) 0, 8, 0);
        polyupdate21.clear();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test191");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 0);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 28);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, (-2));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test192");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) -1);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 12);
        polyupdate29.a(9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test193");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        polyupdate18.a((-3));
        polyupdate18.clear();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test194");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a(9);
        polyupdate0.clear();
        polyupdate0.add3(206, 31, (int) (short) 1, 390);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test195");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3((-9), 10, (-1), 28);
        polyupdate0.clear();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test196");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 7);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 134);
        int int28 = polyupdate27.sm();
        polyupdate27.add3(111, 2, 29, 29);
        polyupdate27.clear();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test197");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(102, 44, (int) (short) 100, 614);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test198");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 100);
        int int27 = polyupdate26.sm();
        polyupdate26.clear();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test199");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        polyupdate0.a((-5));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test200");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 10);
        polyupdate27.clear();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test201");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 285);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, 31);
        DataStructures.cozy.Polyupdate polyupdate28 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate30 = new DataStructures.cozy.Polyupdate(intList15, 200);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test202");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) -1);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, 7);
        polyupdate29.a((-5));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test203");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 9);
        polyupdate20.clear();
        polyupdate20.clear();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test204");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        int int3 = polyupdate0.sm();
        polyupdate0.add3(0, 8, 4, 1);
        polyupdate0.a(9);
        int int11 = polyupdate0.sm();
        int int12 = polyupdate0.sm();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test205");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        polyupdate21.add3(9, 1, 100, (-6));
        polyupdate21.a((int) 'a');
        polyupdate21.add3(1, 1, 0, (int) (short) 100);
        polyupdate21.clear();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test206");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(100);
        polyupdate0.add3(163, (int) (short) 0, (int) (byte) 0, 20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test207");
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, (-6), 29, 100, (-3), 10, 0, 10, 7, 5, (-7), (-3), (-9), (-1), (-2), 10, (-10), 1, 3, 2, 100, 3, 100, (-5), 6, (-1), 3, 6, 104, 6, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        DataStructures.cozy.Polyupdate polyupdate35 = new DataStructures.cozy.Polyupdate(intList32, 0);
        DataStructures.cozy.Polyupdate polyupdate37 = new DataStructures.cozy.Polyupdate(intList32, 104);
        DataStructures.cozy.Polyupdate polyupdate39 = new DataStructures.cozy.Polyupdate(intList32, 134);
        polyupdate39.clear();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test208");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        polyupdate25.add3(0, 12, 20, (-10));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test209");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, (-100));
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate28 = new DataStructures.cozy.Polyupdate(intList15, 20);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test210");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        polyupdate24.add3(311, 112, 44, (int) (short) 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test211");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 226);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, 614);
        DataStructures.cozy.Polyupdate polyupdate28 = new DataStructures.cozy.Polyupdate(intList15, 20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test212");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        int int28 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.a((-89));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test213");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 7, 0, 104, (-100), (-2), (-2), 3, 100, 0, 103, (-4), 5, (-3), 1 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test214");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (-4));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test215");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(3, (int) (short) 10, (-3), (int) (short) 10);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test216");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.a((-4));
        polyupdate0.a(614);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test217");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-6));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 285);
        polyupdate24.a(1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test218");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-5));
        polyupdate22.add3(9, 226, 310, (-8));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test219");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(134);
        polyupdate0.clear();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test220");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (-7));
        polyupdate27.clear();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test221");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, (-3));
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate27.clear();
        polyupdate27.clear();
        int int30 = polyupdate27.sm();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test222");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.add3((int) '#', 134, 5, 12);
        int int29 = polyupdate23.sm();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test223");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a((int) (byte) 100);
        polyupdate0.a(9);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test224");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.add3((int) ' ', 2, (int) (byte) 0, 7);
        polyupdate23.add3(6, 111, 13, 206);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test225");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test226");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, 200);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test227");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a(206);
        polyupdate0.add3(28, (-2), (-3), 1);
        polyupdate0.clear();
        polyupdate0.a(23);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test228");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(20);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test229");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.a((-1));
        polyupdate19.clear();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test230");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        int int24 = polyupdate23.sm();
        polyupdate23.a(0);
        polyupdate23.add3(158, 3, (int) (byte) 0, 102);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test231");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.clear();
        polyupdate0.add3((int) (byte) -1, 28, 103, 4);
        polyupdate0.add3(285, 81, 2, (int) '4');
        polyupdate0.a(226);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test232");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 9);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-4));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test233");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        int int21 = polyupdate20.sm();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test234");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a(4);
        polyupdate0.clear();
        polyupdate0.a((-4));
        polyupdate0.a(100);
        polyupdate0.a(163);
        polyupdate0.clear();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test235");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-6));
        polyupdate22.add3(100, (int) (short) 10, (int) '4', 200);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test236");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 7);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (-8));
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate31 = new DataStructures.cozy.Polyupdate(intList16, 163);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test237");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test238");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(100, 307, 44, 28);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(0, 501, (-1), (int) (byte) 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test239");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.a((-3));
        polyupdate0.add3((-7), 100, (int) '#', 6);
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test240");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 8);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 103);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, 31);
        DataStructures.cozy.Polyupdate polyupdate29 = new DataStructures.cozy.Polyupdate(intList16, (-3));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test241");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        int int28 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3((int) (byte) -1, (int) '4', 100, 134);
        int int36 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test242");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(1);
        polyupdate0.a((-9));
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test243");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 226);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (-5));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test244");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, 1);
        DataStructures.cozy.Polyupdate polyupdate28 = new DataStructures.cozy.Polyupdate(intList15, (int) '#');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test245");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        polyupdate19.a(103);
        polyupdate19.add3(3, 12, (int) (byte) 10, 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test246");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, 3);
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, 7);
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 6);
        polyupdate24.a((int) ' ');
        int int27 = polyupdate24.sm();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test247");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate28 = new DataStructures.cozy.Polyupdate(intList15, 285);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test248");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 0);
        polyupdate0.a(0);
        int int14 = polyupdate0.sm();
        polyupdate0.a(23);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test249");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 1);
        polyupdate26.a((int) (short) 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test250");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (byte) 1);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        polyupdate23.clear();
        polyupdate23.add3(4, (-1), (-1), (int) (byte) 10);
        polyupdate23.add3((-3), 31, 0, 127);
        int int35 = polyupdate23.sm();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test251");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-1));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 501);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 1);
        polyupdate26.clear();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test252");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(5);
        polyupdate0.add3((int) (short) 10, 100, (int) 'a', (int) (byte) -1);
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 0);
        polyupdate0.clear();
        polyupdate0.add3(0, 127, 26, 7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test253");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 285);
        int int25 = polyupdate24.sm();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test254");
        DataStructures.cozy.Polyupdate polyupdate0 = new DataStructures.cozy.Polyupdate();
        polyupdate0.add3(4, (-9), 6, 9);
        polyupdate0.a(8);
        polyupdate0.a(9);
        polyupdate0.a((-1));
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test255");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, (-5));
        int int25 = polyupdate24.sm();
        polyupdate24.a(100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test256");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        DataStructures.cozy.Polyupdate polyupdate23 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate25 = new DataStructures.cozy.Polyupdate(intList16, 20);
        DataStructures.cozy.Polyupdate polyupdate27 = new DataStructures.cozy.Polyupdate(intList16, (int) '4');
        int int28 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3((int) (byte) -1, (int) '4', 100, 134);
        polyupdate27.clear();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test257");
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        DataStructures.cozy.Polyupdate polyupdate19 = new DataStructures.cozy.Polyupdate(intList16, 0);
        DataStructures.cozy.Polyupdate polyupdate21 = new DataStructures.cozy.Polyupdate(intList16, (int) (short) 100);
        polyupdate21.add3(5, 8, 100, (int) (short) 0);
        polyupdate21.clear();
        polyupdate21.a(10);
        polyupdate21.clear();
        polyupdate21.add3(163, (-7), (int) (byte) 10, 108);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test258");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        DataStructures.cozy.Polyupdate polyupdate24 = new DataStructures.cozy.Polyupdate(intList15, 226);
        DataStructures.cozy.Polyupdate polyupdate26 = new DataStructures.cozy.Polyupdate(intList15, 127);
        DataStructures.cozy.Polyupdate polyupdate28 = new DataStructures.cozy.Polyupdate(intList15, (-2));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test259");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.Polyupdate polyupdate2 = new DataStructures.cozy.Polyupdate(intList0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PolyupdateTester0.test260");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 100, 10, (-6), (-6), (-6), (-1), (-3), 10, 1, 4, 9, (-6), (-9), 8 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.Polyupdate polyupdate18 = new DataStructures.cozy.Polyupdate(intList15, (int) (byte) 0);
        DataStructures.cozy.Polyupdate polyupdate20 = new DataStructures.cozy.Polyupdate(intList15, (-3));
        DataStructures.cozy.Polyupdate polyupdate22 = new DataStructures.cozy.Polyupdate(intList15, (-2));
        int int23 = polyupdate22.sm();
        polyupdate22.add3(111, (-4), (int) (short) -1, 44);
        polyupdate22.a(108);
    }
}

