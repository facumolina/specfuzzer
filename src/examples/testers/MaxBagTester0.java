package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaxBagTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test001");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.cozy.MaxBag maxBag1 = new DataStructures.cozy.MaxBag(intList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test002");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, (-5), 100, (-3), 7, (-3), 9, 1, 9, 4, (-2), 1, (-3), 6, 8 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        maxBag19.clear();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test003");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) (-4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test004");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test005");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Integer int9 = maxBag0.getMax();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test006");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test007");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        maxBag17.clear();
        java.lang.Integer int21 = maxBag17.getMax();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test008");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-4));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test009");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 7, (-2), 9, 9, 7, 100, (-3), 100, (-10), (-3), 3, (-1), 1, 10, (-100), (-1), (-5), (-9), 5, 7, 1, (-6), 6 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList24);
        java.lang.Integer int27 = maxBag26.getMax();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test010");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test011");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test012");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        maxBag19.clear();
        maxBag19.clear();
        maxBag19.add((java.lang.Integer) (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test013");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test014");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        java.lang.Integer int20 = maxBag17.getMax();
        java.lang.Integer int21 = maxBag17.getMax();
        maxBag17.clear();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test015");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int32 = maxBag31.getMax();
        java.lang.Integer int33 = maxBag31.getMax();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test016");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        java.lang.Integer int31 = maxBag29.getMax();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test017");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 4);
        maxBag0.add((java.lang.Integer) (-9));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test018");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test019");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Integer int11 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test020");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.add((java.lang.Integer) 7);
        maxBag22.add((java.lang.Integer) 8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test021");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        maxBag18.add((java.lang.Integer) 0);
        maxBag18.add((java.lang.Integer) 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test022");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test023");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        java.lang.Integer int24 = maxBag21.getMax();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test024");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.add((java.lang.Integer) 7);
        maxBag22.add((java.lang.Integer) 1);
        maxBag22.add((java.lang.Integer) 5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test025");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.clear();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test026");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        maxBag30.add((java.lang.Integer) (-2));
        maxBag30.add((java.lang.Integer) 4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test027");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) 0);
        maxBag23.clear();
        maxBag23.clear();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test028");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 0);
        maxBag20.add((java.lang.Integer) (-7));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test029");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 10);
        maxBag20.clear();
        java.lang.Integer int29 = maxBag20.getMax();
        java.lang.Integer int30 = maxBag20.getMax();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test030");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) 0);
        maxBag23.add((java.lang.Integer) (-9));
        java.lang.Integer int28 = maxBag23.getMax();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test031");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-10));
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test032");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        maxBag21.clear();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test033");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test034");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.add((java.lang.Integer) 0);
        maxBag17.add((java.lang.Integer) 2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test035");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) (-2));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test036");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test037");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int19 = maxBag18.getMax();
        java.lang.Integer int20 = maxBag18.getMax();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test038");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-2));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test039");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.clear();
        java.lang.Integer int24 = maxBag22.getMax();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test040");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) (-6));
        java.lang.Integer int32 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) (-4));
        java.lang.Integer int35 = maxBag29.getMax();
        java.lang.Integer int36 = maxBag29.getMax();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test041");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-4));
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test042");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) (-6));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test043");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        maxBag30.clear();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test044");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) (-2));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test045");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test046");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        maxBag19.clear();
        java.lang.Integer int21 = maxBag19.getMax();
        maxBag19.add((java.lang.Integer) (-6));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test047");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test048");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.clear();
        java.lang.Integer int24 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-10));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test049");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test050");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 4);
        java.lang.Integer int4 = maxBag0.getMax();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test051");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) (-100));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test052");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.clear();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test053");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.add((java.lang.Integer) 7);
        maxBag22.add((java.lang.Integer) 1);
        maxBag22.add((java.lang.Integer) (-7));
        java.lang.Integer int29 = maxBag22.getMax();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test054");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test055");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test056");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.add((java.lang.Integer) 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test057");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) (-6));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test058");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) (-6));
        java.lang.Integer int32 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) (-4));
        maxBag29.clear();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test059");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test060");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        maxBag18.add((java.lang.Integer) 5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test061");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test062");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        maxBag31.add((java.lang.Integer) 100);
        java.lang.Integer int34 = maxBag31.getMax();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test063");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 7, (-2), 9, 9, 7, 100, (-3), 100, (-10), (-3), 3, (-1), 1, 10, (-100), (-1), (-5), (-9), 5, 7, 1, (-6), 6 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList24);
        DataStructures.cozy.MaxBag maxBag27 = new DataStructures.cozy.MaxBag(intList24);
        DataStructures.cozy.MaxBag maxBag28 = new DataStructures.cozy.MaxBag(intList24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test064");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int25 = maxBag24.getMax();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test065");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 10);
        maxBag20.add((java.lang.Integer) (-9));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test066");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-4));
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.clear();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test067");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.add((java.lang.Integer) 9);
        maxBag20.add((java.lang.Integer) 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test068");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 6, 1, 10, (-3), 8, (-4), 6, (-7), 10, 1, 6, 10 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        DataStructures.cozy.MaxBag maxBag16 = new DataStructures.cozy.MaxBag(intList14);
        maxBag16.clear();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test069");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.clear();
        maxBag20.clear();
        java.lang.Integer int27 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-2));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test070");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) 8);
        maxBag23.clear();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test071");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test072");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int24 = maxBag23.getMax();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test073");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.clear();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test074");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-7));
        java.lang.Integer int26 = maxBag20.getMax();
        java.lang.Integer int27 = maxBag20.getMax();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test075");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test076");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-9));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test077");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.add((java.lang.Integer) 9);
        maxBag20.clear();
        java.lang.Integer int28 = maxBag20.getMax();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test078");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, (-5), 100, (-3), 7, (-3), 9, 1, 9, 4, (-2), 1, (-3), 6, 8 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.clear();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test079");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test080");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) (-6));
        maxBag29.add((java.lang.Integer) 9);
        java.lang.Integer int34 = maxBag29.getMax();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test081");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) 100);
        java.lang.Integer int26 = maxBag20.getMax();
        java.lang.Integer int27 = maxBag20.getMax();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test082");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        maxBag31.add((java.lang.Integer) 100);
        maxBag31.add((java.lang.Integer) 100);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test083");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.add((java.lang.Integer) 7);
        maxBag22.add((java.lang.Integer) 1);
        maxBag22.clear();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test084");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 1);
        java.lang.Integer int7 = maxBag0.getMax();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test085");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 6, 4, (-4), (-3), 10, (-100), 9, 0, (-4), (-5), (-1), 1, (-8) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        DataStructures.cozy.MaxBag maxBag16 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test086");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test087");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 7);
        java.lang.Integer int11 = maxBag0.getMax();
        java.lang.Integer int12 = maxBag0.getMax();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test088");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        maxBag20.add((java.lang.Integer) 3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test089");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-7));
        maxBag20.add((java.lang.Integer) 3);
        java.lang.Integer int28 = maxBag20.getMax();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test090");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int4 = maxBag0.getMax();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test091");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.clear();
        java.lang.Integer int24 = maxBag20.getMax();
        maxBag20.clear();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test092");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int23 = maxBag22.getMax();
        maxBag22.add((java.lang.Integer) (-9));
        java.lang.Integer int26 = maxBag22.getMax();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test093");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, (-5), 100, (-3), 7, (-3), 9, 1, 9, 4, (-2), 1, (-3), 6, 8 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int25 = maxBag24.getMax();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test094");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.clear();
        java.lang.Integer int26 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) 0);
        maxBag20.clear();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test095");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test096");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test097");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, (-5), 100, (-3), 7, (-3), 9, 1, 9, 4, (-2), 1, (-3), 6, 8 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag25 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag27 = new DataStructures.cozy.MaxBag(intList17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test098");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) 0);
        maxBag23.add((java.lang.Integer) (-2));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test099");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 6, 4, (-4), (-3), 10, (-100), 9, 0, (-4), (-5), (-1), 1, (-8) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        DataStructures.cozy.MaxBag maxBag16 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList14);
        maxBag17.clear();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test100");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        maxBag20.add((java.lang.Integer) 0);
        java.lang.Integer int23 = maxBag20.getMax();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test101");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test102");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        java.lang.Integer int20 = maxBag17.getMax();
        maxBag17.clear();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test103");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-8));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test104");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        maxBag20.clear();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test105");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int18 = maxBag17.getMax();
        java.lang.Integer int19 = maxBag17.getMax();
        maxBag17.clear();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test106");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 6, 4, (-4), (-3), 10, (-100), 9, 0, (-4), (-5), (-1), 1, (-8) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        DataStructures.cozy.MaxBag maxBag16 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList14);
        maxBag17.add((java.lang.Integer) (-7));
        maxBag17.add((java.lang.Integer) 5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test107");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int4 = maxBag0.getMax();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test108");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList15);
        maxBag24.clear();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test109");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        maxBag17.add((java.lang.Integer) (-8));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test110");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        maxBag17.clear();
        maxBag17.clear();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test111");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        java.lang.Integer int20 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) 1);
        maxBag17.clear();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test112");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.clear();
        maxBag20.clear();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test113");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int23 = maxBag22.getMax();
        maxBag22.add((java.lang.Integer) 9);
        maxBag22.clear();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test114");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test115");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 10);
        java.lang.Integer int28 = maxBag20.getMax();
        maxBag20.clear();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test116");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 7, (-2), 9, 9, 7, 100, (-3), 100, (-10), (-3), 3, (-1), 1, 10, (-100), (-1), (-5), (-9), 5, 7, 1, (-6), 6 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList24);
        DataStructures.cozy.MaxBag maxBag27 = new DataStructures.cozy.MaxBag(intList24);
        maxBag27.add((java.lang.Integer) (-7));
        maxBag27.clear();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test117");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int18 = maxBag17.getMax();
        java.lang.Integer int19 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test118");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        maxBag19.clear();
        maxBag19.add((java.lang.Integer) 0);
        maxBag19.clear();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test119");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test120");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test121");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test122");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test123");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.clear();
        maxBag29.clear();
        maxBag29.add((java.lang.Integer) (-8));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test124");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-7));
        maxBag20.clear();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test125");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        maxBag19.clear();
        maxBag19.clear();
        maxBag19.clear();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test126");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        maxBag19.clear();
        java.lang.Integer int21 = maxBag19.getMax();
        maxBag19.clear();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test127");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        java.lang.Integer int20 = maxBag17.getMax();
        java.lang.Integer int21 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) (-10));
        maxBag17.add((java.lang.Integer) 2);
        maxBag17.add((java.lang.Integer) (-3));
        maxBag17.clear();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test128");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test129");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test130");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test131");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        java.lang.Integer int13 = maxBag0.getMax();
        java.lang.Integer int14 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test132");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 7, (-2), 9, 9, 7, 100, (-3), 100, (-10), (-3), 3, (-1), 1, 10, (-100), (-1), (-5), (-9), 5, 7, 1, (-6), 6 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList24);
        DataStructures.cozy.MaxBag maxBag27 = new DataStructures.cozy.MaxBag(intList24);
        maxBag27.add((java.lang.Integer) (-7));
        java.lang.Integer int30 = maxBag27.getMax();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test133");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, 0, (-5), 100, (-3), 7, (-3), 9, 1, 9, 4, (-2), 1, (-3), 6, 8 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        maxBag24.clear();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test134");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) (-6));
        java.lang.Integer int32 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) (-4));
        java.lang.Integer int35 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test135");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.add((java.lang.Integer) (-9));
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Integer int11 = maxBag0.getMax();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test136");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) 2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test137");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test138");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) (-9));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test139");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test140");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.clear();
        maxBag22.clear();
        maxBag22.add((java.lang.Integer) 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test141");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        java.lang.Integer int13 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-10));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test142");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        maxBag19.clear();
        java.lang.Integer int21 = maxBag19.getMax();
        java.lang.Integer int22 = maxBag19.getMax();
        maxBag19.clear();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test143");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.add((java.lang.Integer) 4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test144");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.add((java.lang.Integer) 0);
        maxBag17.add((java.lang.Integer) 100);
        java.lang.Integer int22 = maxBag17.getMax();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test145");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        maxBag31.clear();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test146");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.clear();
        maxBag29.clear();
        java.lang.Integer int32 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test147");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 5);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) (-5));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test148");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test149");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) 10);
        maxBag20.clear();
        maxBag20.clear();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test150");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test151");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) (-1));
        java.lang.Integer int32 = maxBag29.getMax();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test152");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        maxBag19.clear();
        maxBag19.clear();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test153");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag32 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int33 = maxBag32.getMax();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test154");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test155");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 6, 1, 10, (-3), 8, (-4), 6, (-7), 10, 1, 6, 10 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        DataStructures.cozy.MaxBag maxBag16 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList14);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList14);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test156");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test157");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Integer int11 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.add((java.lang.Integer) 4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test158");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) 0);
        maxBag23.add((java.lang.Integer) (-9));
        maxBag23.clear();
        java.lang.Integer int29 = maxBag23.getMax();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test159");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) 2);
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test160");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-3));
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Integer int9 = maxBag0.getMax();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test161");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int18 = maxBag17.getMax();
        maxBag17.clear();
        java.lang.Integer int20 = maxBag17.getMax();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test162");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        maxBag29.add((java.lang.Integer) (-1));
        maxBag29.clear();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test163");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag25 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag27 = new DataStructures.cozy.MaxBag(intList17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test164");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        maxBag20.clear();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) 5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test165");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 6);
        maxBag0.clear();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test166");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int18 = maxBag17.getMax();
        java.lang.Integer int19 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) (-4));
        maxBag17.clear();
        maxBag17.clear();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test167");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 5);
        maxBag21.add((java.lang.Integer) (-100));
        java.lang.Integer int31 = maxBag21.getMax();
        java.lang.Integer int32 = maxBag21.getMax();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test168");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 3);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test169");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag32 = new DataStructures.cozy.MaxBag(intList27);
        maxBag32.clear();
        java.lang.Integer int34 = maxBag32.getMax();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test170");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int20 = maxBag19.getMax();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test171");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int32 = maxBag31.getMax();
        maxBag31.clear();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test172");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int23 = maxBag22.getMax();
        maxBag22.add((java.lang.Integer) 9);
        maxBag22.add((java.lang.Integer) (-2));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test173");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int23 = maxBag22.getMax();
        maxBag22.clear();
        maxBag22.clear();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test174");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag25 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int26 = maxBag25.getMax();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test175");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) (-2));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test176");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-7));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test177");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.clear();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test178");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test179");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test180");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) 5);
        java.lang.Integer int9 = maxBag0.getMax();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test181");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) (-6));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test182");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        maxBag31.add((java.lang.Integer) 100);
        maxBag31.clear();
        maxBag31.add((java.lang.Integer) 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test183");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test184");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag25 = new DataStructures.cozy.MaxBag(intList17);
        maxBag25.clear();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test185");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) (-6));
        java.lang.Integer int24 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) 10);
        maxBag20.add((java.lang.Integer) (-2));
        maxBag20.add((java.lang.Integer) (-7));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test186");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 4);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test187");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int5 = maxBag0.getMax();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-8));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test188");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        maxBag19.clear();
        maxBag19.clear();
        maxBag19.add((java.lang.Integer) (-3));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test189");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        maxBag18.add((java.lang.Integer) 0);
        java.lang.Integer int21 = maxBag18.getMax();
        maxBag18.add((java.lang.Integer) 2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test190");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 100);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test191");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.clear();
        maxBag29.clear();
        java.lang.Integer int33 = maxBag29.getMax();
        java.lang.Integer int34 = maxBag29.getMax();
        java.lang.Integer int35 = maxBag29.getMax();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test192");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        java.lang.Integer int20 = maxBag17.getMax();
        java.lang.Integer int21 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) (-10));
        maxBag17.add((java.lang.Integer) (-3));
        java.lang.Integer int26 = maxBag17.getMax();
        maxBag17.clear();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test193");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.clear();
        java.lang.Integer int26 = maxBag20.getMax();
        java.lang.Integer int27 = maxBag20.getMax();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test194");
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 7, (-2), 9, 9, 7, 100, (-3), 100, (-10), (-3), 3, (-1), 1, 10, (-100), (-1), (-5), (-9), 5, 7, 1, (-6), 6 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        DataStructures.cozy.MaxBag maxBag26 = new DataStructures.cozy.MaxBag(intList24);
        maxBag26.clear();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test195");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int11 = maxBag0.getMax();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test196");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.add((java.lang.Integer) 5);
        java.lang.Integer int20 = maxBag17.getMax();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test197");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag32 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag33 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag34 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int35 = maxBag34.getMax();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test198");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) (-1));
        maxBag20.clear();
        maxBag20.add((java.lang.Integer) (-9));
        maxBag20.add((java.lang.Integer) 100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test199");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList15);
        java.lang.Integer int24 = maxBag23.getMax();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test200");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        maxBag20.add((java.lang.Integer) (-2));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test201");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) (-6));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test202");
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 6, 4, (-4), (-3), 10, (-100), 9, 0, (-4), (-5), (-1), 1, (-8) };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        DataStructures.cozy.MaxBag maxBag16 = new DataStructures.cozy.MaxBag(intList14);
        maxBag16.add((java.lang.Integer) 100);
        java.lang.Integer int19 = maxBag16.getMax();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test203");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        java.lang.Integer int14 = maxBag0.getMax();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test204");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test205");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag24 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag25 = new DataStructures.cozy.MaxBag(intList17);
        maxBag25.add((java.lang.Integer) 5);
        java.lang.Integer int28 = maxBag25.getMax();
        maxBag25.clear();
        maxBag25.add((java.lang.Integer) 4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test206");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        maxBag21.add((java.lang.Integer) 1);
        maxBag21.add((java.lang.Integer) 6);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test207");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.clear();
        java.lang.Integer int32 = maxBag29.getMax();
        java.lang.Integer int33 = maxBag29.getMax();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test208");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        maxBag17.clear();
        java.lang.Integer int19 = maxBag17.getMax();
        java.lang.Integer int20 = maxBag17.getMax();
        java.lang.Integer int21 = maxBag17.getMax();
        maxBag17.add((java.lang.Integer) (-10));
        maxBag17.add((java.lang.Integer) 8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test209");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) 8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test210");
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-10), 1, 8, 10, 0, (-5), 9, (-5), (-1), 10, (-7), (-7), (-7), (-6) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        DataStructures.cozy.MaxBag maxBag17 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag18 = new DataStructures.cozy.MaxBag(intList15);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList15);
        maxBag19.clear();
        java.lang.Integer int21 = maxBag19.getMax();
        maxBag19.clear();
        maxBag19.add((java.lang.Integer) (-9));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test211");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.clear();
        maxBag20.clear();
        maxBag20.clear();
        java.lang.Integer int27 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) 7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test212");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-3));
        java.lang.Integer int12 = maxBag0.getMax();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test213");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test214");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        java.lang.Integer int21 = maxBag20.getMax();
        java.lang.Integer int22 = maxBag20.getMax();
        java.lang.Integer int23 = maxBag20.getMax();
        maxBag20.add((java.lang.Integer) 3);
        maxBag20.add((java.lang.Integer) (-3));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test215");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Integer int11 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test216");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test217");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        maxBag22.add((java.lang.Integer) 7);
        maxBag22.clear();
        maxBag22.add((java.lang.Integer) (-100));
        java.lang.Integer int28 = maxBag22.getMax();
        maxBag22.clear();
        java.lang.Integer int30 = maxBag22.getMax();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test218");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test219");
        DataStructures.cozy.MaxBag maxBag0 = new DataStructures.cozy.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int3 = maxBag0.getMax();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.add((java.lang.Integer) (-8));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-4));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test220");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 10, 4, 4, 1, (-1), (-9), (-3), (-6), (-3), 7, (-8), (-7), 100, 1, 100, 10, 100, 9, 0, 10, 2, 9, (-10), (-100), (-7), (-7) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        DataStructures.cozy.MaxBag maxBag29 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag30 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag31 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag32 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag33 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag34 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag35 = new DataStructures.cozy.MaxBag(intList27);
        DataStructures.cozy.MaxBag maxBag36 = new DataStructures.cozy.MaxBag(intList27);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test221");
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        DataStructures.cozy.MaxBag maxBag19 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag20 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag21 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag22 = new DataStructures.cozy.MaxBag(intList17);
        DataStructures.cozy.MaxBag maxBag23 = new DataStructures.cozy.MaxBag(intList17);
        maxBag23.add((java.lang.Integer) 0);
        maxBag23.clear();
        java.lang.Integer int27 = maxBag23.getMax();
        java.lang.Integer int28 = maxBag23.getMax();
    }
}

