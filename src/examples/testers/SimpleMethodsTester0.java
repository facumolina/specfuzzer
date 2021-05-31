package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimpleMethodsTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test001");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 100);
        int int6 = simpleMethods1.abs(4);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods7.addElementToSet(intSet36, (int) (short) 100);
        simpleMethods1.addElementToSet(intSet36, (int) '4');
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray44 = new int[] {};
        simpleMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        simpleMethods42.incrementNumberAtIndex(intArray44, 1);
        simpleMethods1.incrementNumberAtIndex(intArray44, 0);
        simpleMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int54 = simpleMethods0.abs(0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test002");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] {};
        simpleMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        simpleMethods41.incrementNumberAtIndex(intArray43, 1);
        simpleMethods0.incrementNumberAtIndex(intArray43, 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-6), 9, (-6), (-8), 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods0.addElementToSet(intSet57, (-7));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test003");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 100);
        int int49 = simpleMethods44.abs(4);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods50.addElementToSet(intSet79, (int) (short) 100);
        simpleMethods44.addElementToSet(intSet79, (int) '4');
        gassert.SimpleMethods simpleMethods85 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray87 = new int[] {};
        simpleMethods86.incrementNumberAtIndex(intArray87, (int) (byte) 1);
        simpleMethods85.incrementNumberAtIndex(intArray87, 1);
        simpleMethods44.incrementNumberAtIndex(intArray87, 0);
        simpleMethods43.incrementNumberAtIndex(intArray87, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray87, (int) (byte) 100);
        int int99 = simpleMethods0.abs((int) '#');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test004");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int41 = simpleMethods0.getMin(0, (-19));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test005");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.getMin((-8), 100);
        int int13 = simpleMethods0.getMin(0, (-6));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test006");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 100);
        int int6 = simpleMethods1.abs(4);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods7.addElementToSet(intSet36, (int) (short) 100);
        simpleMethods1.addElementToSet(intSet36, (int) '4');
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray44 = new int[] {};
        simpleMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        simpleMethods42.incrementNumberAtIndex(intArray44, 1);
        simpleMethods1.incrementNumberAtIndex(intArray44, 0);
        simpleMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = simpleMethods0.getMin((int) ' ', (-19));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test007");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        int int55 = simpleMethods0.abs(5);
        int int57 = simpleMethods0.abs(5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test008");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int int47 = simpleMethods39.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        int int51 = simpleMethods48.getMin(0, 100);
        int int53 = simpleMethods48.abs(4);
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods54.addElementToSet(intSet83, (int) (short) 100);
        simpleMethods48.addElementToSet(intSet83, (int) '4');
        simpleMethods39.addElementToSet(intSet83, 8);
        simpleMethods0.addElementToSet(intSet83, (-5));
        int int94 = simpleMethods0.abs((-10));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test009");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(100, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        int int29 = simpleMethods26.getMin(0, 0);
        int int31 = simpleMethods26.abs((-2));
        int[] intArray38 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods26.incrementNumberAtIndex(intArray38, 4);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods26.addElementToSet(intSet61, 6);
        simpleMethods13.addElementToSet(intSet61, (-100));
        simpleMethods0.addElementToSet(intSet61, 10);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int int72 = simpleMethods69.getMin(0, 0);
        int int74 = simpleMethods69.abs((int) (short) 0);
        int[] intArray79 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods69.incrementNumberAtIndex(intArray79, 0);
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        int int85 = simpleMethods82.getMin(0, 0);
        int int87 = simpleMethods82.abs((int) (short) 0);
        int[] intArray92 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods82.incrementNumberAtIndex(intArray92, 0);
        simpleMethods69.incrementNumberAtIndex(intArray92, 10);
        simpleMethods0.incrementNumberAtIndex(intArray92, 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test010");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        int int31 = simpleMethods28.getMin(0, 100);
        int int33 = simpleMethods28.abs(4);
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods34.addElementToSet(intSet63, (int) (short) 100);
        simpleMethods28.addElementToSet(intSet63, (int) '4');
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods70 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] {};
        simpleMethods70.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods69.incrementNumberAtIndex(intArray71, 1);
        simpleMethods28.incrementNumberAtIndex(intArray71, 0);
        simpleMethods0.incrementNumberAtIndex(intArray71, 5);
        int int82 = simpleMethods0.getMin((-100), (-11));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test011");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-18), 0);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int int18 = simpleMethods15.getMin(0, 100);
        int int20 = simpleMethods15.abs(4);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods21.addElementToSet(intSet50, (int) (short) 100);
        simpleMethods15.addElementToSet(intSet50, (int) '4');
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        int[] intArray58 = new int[] {};
        simpleMethods57.incrementNumberAtIndex(intArray58, (int) (byte) 1);
        simpleMethods56.incrementNumberAtIndex(intArray58, 1);
        simpleMethods15.incrementNumberAtIndex(intArray58, 0);
        simpleMethods0.incrementNumberAtIndex(intArray58, (-6));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test012");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 0);
        int int46 = simpleMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods41.incrementNumberAtIndex(intArray53, 4);
        simpleMethods0.incrementNumberAtIndex(intArray53, 10);
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods58.addElementToSet(intSet87, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet87, (-3));
        int int94 = simpleMethods0.abs(10);
        int int96 = simpleMethods0.abs(0);
        int int99 = simpleMethods0.getMin((int) (byte) 100, 4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test013");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        int int41 = simpleMethods0.getMin(100, 4);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((-2));
        int[] intArray54 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods42.incrementNumberAtIndex(intArray54, 4);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods42.addElementToSet(intSet77, 6);
        gassert.SimpleMethods simpleMethods81 = new gassert.SimpleMethods();
        int int84 = simpleMethods81.getMin(0, 0);
        int int86 = simpleMethods81.abs((-2));
        int[] intArray93 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods81.incrementNumberAtIndex(intArray93, 4);
        simpleMethods42.incrementNumberAtIndex(intArray93, (-32));
        simpleMethods0.incrementNumberAtIndex(intArray93, (-3));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test014");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        gassert.SimpleMethods simpleMethods4 = new gassert.SimpleMethods();
        int int7 = simpleMethods4.getMin(0, 0);
        int int9 = simpleMethods4.abs((int) (short) 0);
        int[] intArray14 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods4.incrementNumberAtIndex(intArray14, 0);
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int int20 = simpleMethods17.getMin(0, 0);
        int int22 = simpleMethods17.abs((int) (short) 0);
        int[] intArray27 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods17.incrementNumberAtIndex(intArray27, 0);
        simpleMethods4.incrementNumberAtIndex(intArray27, 2);
        int[] intArray32 = new int[] {};
        simpleMethods4.incrementNumberAtIndex(intArray32, 7);
        int int36 = simpleMethods4.abs((-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int40 = simpleMethods37.getMin(0, 0);
        int int42 = simpleMethods37.abs((-2));
        int int45 = simpleMethods37.getMin((-1), 2);
        int int48 = simpleMethods37.getMin(1, 7);
        int int51 = simpleMethods37.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods37.addElementToSet(intSet72, (int) (short) 1);
        gassert.SimpleMethods simpleMethods76 = new gassert.SimpleMethods();
        int[] intArray77 = new int[] {};
        simpleMethods76.incrementNumberAtIndex(intArray77, (int) (byte) 1);
        simpleMethods37.incrementNumberAtIndex(intArray77, 1);
        simpleMethods4.incrementNumberAtIndex(intArray77, 3);
        simpleMethods0.incrementNumberAtIndex(intArray77, (int) (short) 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test015");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int13 = simpleMethods0.abs(0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test016");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        int int7 = simpleMethods0.abs((-5));
        int int10 = simpleMethods0.getMin(9, 4);
        gassert.SimpleMethods simpleMethods11 = new gassert.SimpleMethods();
        int int14 = simpleMethods11.getMin(0, 0);
        int int16 = simpleMethods11.abs((-2));
        int[] intArray23 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods11.incrementNumberAtIndex(intArray23, 4);
        simpleMethods0.incrementNumberAtIndex(intArray23, (-19));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test017");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int41 = simpleMethods0.getMin(10, (-6));
        int int44 = simpleMethods0.getMin(9, (int) (short) 1);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int int48 = simpleMethods45.getMin(0, 0);
        int int50 = simpleMethods45.abs((-2));
        int int53 = simpleMethods45.getMin((-1), 2);
        int int56 = simpleMethods45.getMin(1, 7);
        int int59 = simpleMethods45.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods45.addElementToSet(intSet80, (int) (short) 1);
        gassert.SimpleMethods simpleMethods84 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] {};
        simpleMethods84.incrementNumberAtIndex(intArray85, (int) (byte) 1);
        simpleMethods45.incrementNumberAtIndex(intArray85, 1);
        simpleMethods0.incrementNumberAtIndex(intArray85, (-32));
        int int93 = simpleMethods0.abs((-5));
        int int96 = simpleMethods0.getMin((-34), 8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test018");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((int) '#', 1);
        int int12 = simpleMethods0.getMin((-3), 2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test019");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        simpleMethods1.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        int int33 = simpleMethods0.abs(0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test020");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray7, 8);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int15 = simpleMethods12.getMin(0, 100);
        int int17 = simpleMethods12.abs(4);
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods18.addElementToSet(intSet47, (int) (short) 100);
        simpleMethods12.addElementToSet(intSet47, (int) '4');
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int[] intArray55 = new int[] {};
        simpleMethods54.incrementNumberAtIndex(intArray55, (int) (byte) 1);
        simpleMethods53.incrementNumberAtIndex(intArray55, 1);
        simpleMethods12.incrementNumberAtIndex(intArray55, 0);
        gassert.SimpleMethods simpleMethods62 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet91 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        simpleMethods62.addElementToSet(intSet91, (int) (short) 100);
        simpleMethods12.addElementToSet(intSet91, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet91, (int) (short) 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test021");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.getMin(6, 6);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        int int29 = simpleMethods26.getMin(0, 0);
        int int31 = simpleMethods26.abs((int) (short) 0);
        int[] intArray36 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods26.incrementNumberAtIndex(intArray36, 0);
        simpleMethods13.incrementNumberAtIndex(intArray36, 2);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 100);
        int int46 = simpleMethods41.abs(4);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods47.addElementToSet(intSet76, (int) (short) 100);
        simpleMethods41.addElementToSet(intSet76, (int) '4');
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray84 = new int[] {};
        simpleMethods83.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        simpleMethods82.incrementNumberAtIndex(intArray84, 1);
        simpleMethods41.incrementNumberAtIndex(intArray84, 0);
        simpleMethods13.incrementNumberAtIndex(intArray84, 5);
        simpleMethods0.incrementNumberAtIndex(intArray84, (-9));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test022");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = simpleMethods0.getMin((-7), (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test023");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = simpleMethods0.abs((int) (short) 100);
        int int34 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test024");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int11 = simpleMethods8.getMin(0, 0);
        int int13 = simpleMethods8.abs((-2));
        int int16 = simpleMethods8.getMin((-1), 2);
        int int19 = simpleMethods8.getMin(1, 7);
        int int22 = simpleMethods8.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods8.addElementToSet(intSet43, (int) (short) 1);
        simpleMethods7.addElementToSet(intSet43, 7);
        simpleMethods0.addElementToSet(intSet43, (-100));
        int int53 = simpleMethods0.getMin((-9), (-100));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test025");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.getMin(6, 6);
        int int14 = simpleMethods0.abs((-19));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test026");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        int int15 = simpleMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods1.addElementToSet(intSet36, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet36, 7);
        int int43 = simpleMethods0.abs((-18));
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 0);
        int int49 = simpleMethods44.abs((-2));
        int int52 = simpleMethods44.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        int int56 = simpleMethods53.getMin(0, 100);
        int int58 = simpleMethods53.abs(4);
        gassert.SimpleMethods simpleMethods59 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods59.addElementToSet(intSet88, (int) (short) 100);
        simpleMethods53.addElementToSet(intSet88, (int) '4');
        simpleMethods44.addElementToSet(intSet88, 8);
        simpleMethods0.addElementToSet(intSet88, (-11));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test027");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs(100);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods10.incrementNumberAtIndex(intArray20, 0);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        int int26 = simpleMethods23.getMin(0, 0);
        int int28 = simpleMethods23.abs((-2));
        int[] intArray35 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods23.incrementNumberAtIndex(intArray35, 4);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods23.addElementToSet(intSet58, 6);
        simpleMethods10.addElementToSet(intSet58, (-100));
        simpleMethods6.addElementToSet(intSet58, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet58, 3);
        gassert.SimpleMethods simpleMethods68 = new gassert.SimpleMethods();
        int int71 = simpleMethods68.getMin(0, 0);
        int int73 = simpleMethods68.abs((int) (short) 0);
        int[] intArray78 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods68.incrementNumberAtIndex(intArray78, 0);
        gassert.SimpleMethods simpleMethods81 = new gassert.SimpleMethods();
        int int84 = simpleMethods81.getMin(0, 0);
        int int86 = simpleMethods81.abs((int) (short) 0);
        int[] intArray91 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods81.incrementNumberAtIndex(intArray91, 0);
        simpleMethods68.incrementNumberAtIndex(intArray91, 10);
        simpleMethods0.incrementNumberAtIndex(intArray91, (int) '#');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test028");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((-67));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test029");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = simpleMethods0.getMin((-9), (int) '4');
        int int19 = simpleMethods0.abs((int) (short) 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test030");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int int47 = simpleMethods39.getMin((-1), 2);
        int int50 = simpleMethods39.getMin(1, 7);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        int int54 = simpleMethods51.getMin(0, 0);
        int int56 = simpleMethods51.abs((-2));
        int[] intArray63 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods51.incrementNumberAtIndex(intArray63, 4);
        simpleMethods39.incrementNumberAtIndex(intArray63, 0);
        simpleMethods0.incrementNumberAtIndex(intArray63, (int) (byte) 1);
        int int72 = simpleMethods0.getMin(0, (-19));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test031");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.getMin((-1), (int) (short) -1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test032");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int int37 = simpleMethods29.getMin((-1), 2);
        int int40 = simpleMethods29.getMin(1, 7);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 0);
        int int46 = simpleMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods41.incrementNumberAtIndex(intArray53, 4);
        simpleMethods29.incrementNumberAtIndex(intArray53, 0);
        simpleMethods28.incrementNumberAtIndex(intArray53, 0);
        simpleMethods0.incrementNumberAtIndex(intArray53, (-100));
        int int63 = simpleMethods0.abs((-9));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test033");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int9 = simpleMethods0.abs((-9));
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((-2));
        int int17 = simpleMethods10.abs(0);
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        int int21 = simpleMethods18.getMin(0, 0);
        int int23 = simpleMethods18.abs((-2));
        int int26 = simpleMethods18.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods27 = new gassert.SimpleMethods();
        int int30 = simpleMethods27.getMin(0, 100);
        int int32 = simpleMethods27.abs(4);
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods33.addElementToSet(intSet62, (int) (short) 100);
        simpleMethods27.addElementToSet(intSet62, (int) '4');
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods10.addElementToSet(intSet62, 1);
        simpleMethods0.addElementToSet(intSet62, 9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test034");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs((-18));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test035");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        int int55 = simpleMethods0.abs((-19));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test036");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int int30 = simpleMethods0.getMin((-131), (-36));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test037");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-9), 1);
        int int8 = simpleMethods0.abs(2);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray11 = new int[] {};
        simpleMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        simpleMethods9.incrementNumberAtIndex(intArray11, 1);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int int20 = simpleMethods17.getMin(0, 0);
        int int22 = simpleMethods17.abs((-2));
        int int25 = simpleMethods17.getMin((-1), 2);
        int int28 = simpleMethods17.getMin(1, 7);
        int int31 = simpleMethods17.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods17.addElementToSet(intSet52, (int) (short) 1);
        simpleMethods16.addElementToSet(intSet52, 7);
        simpleMethods9.addElementToSet(intSet52, (-100));
        simpleMethods0.addElementToSet(intSet52, (int) '#');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test038");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int11 = simpleMethods8.getMin(0, 0);
        int int13 = simpleMethods8.abs((int) (short) 0);
        int[] intArray19 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods8.incrementNumberAtIndex(intArray19, (-3));
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        int int25 = simpleMethods22.getMin(0, 0);
        int int27 = simpleMethods22.abs((int) (short) 0);
        int[] intArray32 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods22.incrementNumberAtIndex(intArray32, 0);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        int int38 = simpleMethods35.getMin(0, 0);
        int int40 = simpleMethods35.abs((-2));
        int[] intArray47 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods35.incrementNumberAtIndex(intArray47, 4);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods35.addElementToSet(intSet70, 6);
        simpleMethods22.addElementToSet(intSet70, (-100));
        simpleMethods8.addElementToSet(intSet70, (-5));
        simpleMethods0.addElementToSet(intSet70, (int) '#');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test039");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        int int7 = simpleMethods0.abs((-5));
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] {};
        simpleMethods8.incrementNumberAtIndex(intArray9, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray9, 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test040");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.getMin((-2), 100);
        int int12 = simpleMethods0.abs(0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test041");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(6, 10);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test042");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int45 = simpleMethods0.getMin((-19), 100);
        int int47 = simpleMethods0.abs((-131));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test043");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        int int7 = simpleMethods0.abs(4);
        int int9 = simpleMethods0.abs(100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test044");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        int int15 = simpleMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods1.addElementToSet(intSet36, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet36, 7);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((-2));
        int int50 = simpleMethods42.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        int int54 = simpleMethods51.getMin(0, 100);
        int int56 = simpleMethods51.abs(4);
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods57.addElementToSet(intSet86, (int) (short) 100);
        simpleMethods51.addElementToSet(intSet86, (int) '4');
        simpleMethods42.addElementToSet(intSet86, 8);
        simpleMethods0.addElementToSet(intSet86, (-34));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test045");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((int) '#', 1);
        int int12 = simpleMethods0.getMin(6, 0);
        int int14 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test046");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        int int59 = simpleMethods0.getMin((-3), 1);
        int int62 = simpleMethods0.getMin((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test047");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int int29 = simpleMethods0.abs((int) (short) 10);
        int int32 = simpleMethods0.getMin(3, 4);
        int int34 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] {};
        simpleMethods35.incrementNumberAtIndex(intArray36, (int) (byte) 1);
        int int40 = simpleMethods35.abs((int) ' ');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] {};
        simpleMethods41.incrementNumberAtIndex(intArray42, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods45.addElementToSet(intSet74, (int) (short) 100);
        simpleMethods41.addElementToSet(intSet74, (int) (short) -1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int83 = simpleMethods80.getMin(0, 0);
        int int85 = simpleMethods80.abs((int) (short) 0);
        int[] intArray90 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods80.incrementNumberAtIndex(intArray90, 0);
        simpleMethods41.incrementNumberAtIndex(intArray90, (-1));
        simpleMethods35.incrementNumberAtIndex(intArray90, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray90, (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test048");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(6, 10);
        int int14 = simpleMethods0.abs((-3));
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int int18 = simpleMethods15.getMin(0, 0);
        int int20 = simpleMethods15.abs((-2));
        int[] intArray27 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods15.incrementNumberAtIndex(intArray27, 4);
        simpleMethods0.incrementNumberAtIndex(intArray27, 1);
        int int33 = simpleMethods0.abs(0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test049");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int45 = simpleMethods0.getMin((-19), 100);
        int int48 = simpleMethods0.getMin((-5), 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test050");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = simpleMethods0.abs((-1));
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] {};
        simpleMethods35.incrementNumberAtIndex(intArray36, (int) (byte) 1);
        simpleMethods34.incrementNumberAtIndex(intArray36, 1);
        int int43 = simpleMethods34.getMin((-100), 9);
        int int46 = simpleMethods34.getMin(6, 10);
        int int48 = simpleMethods34.abs((-3));
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int int52 = simpleMethods49.getMin(0, 0);
        int int54 = simpleMethods49.abs((-2));
        int[] intArray61 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods49.incrementNumberAtIndex(intArray61, 4);
        simpleMethods34.incrementNumberAtIndex(intArray61, 1);
        simpleMethods33.incrementNumberAtIndex(intArray61, 5);
        simpleMethods0.incrementNumberAtIndex(intArray61, (int) (byte) 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test051");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int13 = simpleMethods0.abs(9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test052");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int11 = simpleMethods8.getMin(0, 0);
        int int13 = simpleMethods8.abs((-2));
        int int16 = simpleMethods8.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int int20 = simpleMethods17.getMin(0, 100);
        int int22 = simpleMethods17.abs(4);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods23.addElementToSet(intSet52, (int) (short) 100);
        simpleMethods17.addElementToSet(intSet52, (int) '4');
        simpleMethods8.addElementToSet(intSet52, 8);
        simpleMethods0.addElementToSet(intSet52, 1);
        int int64 = simpleMethods0.getMin((-35), 4);
        int int67 = simpleMethods0.getMin(100, (-35));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test053");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        int int14 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test054");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 10);
        int int29 = simpleMethods0.abs((-67));
        int[] intArray30 = null;
        simpleMethods0.incrementNumberAtIndex(intArray30, (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test055");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        int int55 = simpleMethods0.abs(5);
        int int58 = simpleMethods0.getMin((int) (byte) 10, 8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test056");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        int int15 = simpleMethods0.getMin((-34), 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test057");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int75 = simpleMethods0.getMin((-1), (-3));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test058");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(0, (-1));
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int15 = simpleMethods12.getMin(0, 0);
        int int17 = simpleMethods12.abs((-2));
        int int20 = simpleMethods12.getMin((-1), 2);
        int int23 = simpleMethods12.getMin(0, (-1));
        int int26 = simpleMethods12.getMin((int) 'a', (-5));
        gassert.SimpleMethods simpleMethods27 = new gassert.SimpleMethods();
        int[] intArray28 = new int[] {};
        simpleMethods27.incrementNumberAtIndex(intArray28, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods31 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods31.addElementToSet(intSet60, (int) (short) 100);
        simpleMethods27.addElementToSet(intSet60, (int) (short) -1);
        simpleMethods12.addElementToSet(intSet60, (-10));
        simpleMethods0.addElementToSet(intSet60, (-7));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test059");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test060");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int9 = simpleMethods0.abs((-9));
        int int12 = simpleMethods0.getMin(5, 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test061");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), (-5));
        int int10 = simpleMethods0.abs((-20));
        int int13 = simpleMethods0.getMin(100, 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test062");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int8 = simpleMethods0.getMin((-35), (-19));
        int int11 = simpleMethods0.getMin(8, (-9));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test063");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int[] intArray30 = new int[] {};
        simpleMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        simpleMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = simpleMethods28.getMin((int) '#', 1);
        int int40 = simpleMethods28.getMin(6, 0);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((-2));
        int int50 = simpleMethods42.getMin((-1), 2);
        int int53 = simpleMethods42.getMin(1, 7);
        int int56 = simpleMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods42.addElementToSet(intSet77, (int) (short) 1);
        simpleMethods41.addElementToSet(intSet77, 7);
        simpleMethods28.addElementToSet(intSet77, 0);
        simpleMethods0.addElementToSet(intSet77, (-34));
        int int88 = simpleMethods0.abs((-31));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test064");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        int int55 = simpleMethods0.abs(5);
        int[] intArray61 = new int[] { (-1), (byte) -1, 0, (-67), 9 };
        simpleMethods0.incrementNumberAtIndex(intArray61, 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test065");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs((-1));
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods10.incrementNumberAtIndex(intArray20, 0);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        int int26 = simpleMethods23.getMin(0, 0);
        int int28 = simpleMethods23.abs((int) (short) 0);
        int[] intArray33 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods23.incrementNumberAtIndex(intArray33, 0);
        simpleMethods10.incrementNumberAtIndex(intArray33, 2);
        gassert.SimpleMethods simpleMethods38 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods38.incrementNumberAtIndex(intArray40, 1);
        int int47 = simpleMethods38.getMin((int) '#', 1);
        int int50 = simpleMethods38.getMin(6, 0);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        int int55 = simpleMethods52.getMin(0, 0);
        int int57 = simpleMethods52.abs((-2));
        int int60 = simpleMethods52.getMin((-1), 2);
        int int63 = simpleMethods52.getMin(1, 7);
        int int66 = simpleMethods52.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods52.addElementToSet(intSet87, (int) (short) 1);
        simpleMethods51.addElementToSet(intSet87, 7);
        simpleMethods38.addElementToSet(intSet87, 0);
        simpleMethods10.addElementToSet(intSet87, (-34));
        simpleMethods0.addElementToSet(intSet87, (-36));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test066");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 10);
        int int29 = simpleMethods0.abs((-67));
        int int31 = simpleMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test067");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int11 = simpleMethods8.getMin(0, 100);
        int int13 = simpleMethods8.abs(4);
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods14.addElementToSet(intSet43, (int) (short) 100);
        simpleMethods8.addElementToSet(intSet43, (int) '4');
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        int[] intArray51 = new int[] {};
        simpleMethods50.incrementNumberAtIndex(intArray51, (int) (byte) 1);
        simpleMethods49.incrementNumberAtIndex(intArray51, 1);
        simpleMethods8.incrementNumberAtIndex(intArray51, 0);
        simpleMethods7.incrementNumberAtIndex(intArray51, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray51, 10);
        int int63 = simpleMethods0.abs(8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test068");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test069");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), (-5));
        int int10 = simpleMethods0.abs((-6));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test070");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray7, 8);
        int int14 = simpleMethods0.getMin(8, (-131));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test071");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = simpleMethods0.abs((-1));
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        int int36 = simpleMethods33.getMin(0, 100);
        int int38 = simpleMethods33.abs(4);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods39.addElementToSet(intSet68, (int) (short) 100);
        simpleMethods33.addElementToSet(intSet68, (int) '4');
        gassert.SimpleMethods simpleMethods74 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods75 = new gassert.SimpleMethods();
        int[] intArray76 = new int[] {};
        simpleMethods75.incrementNumberAtIndex(intArray76, (int) (byte) 1);
        simpleMethods74.incrementNumberAtIndex(intArray76, 1);
        simpleMethods33.incrementNumberAtIndex(intArray76, 0);
        simpleMethods0.incrementNumberAtIndex(intArray76, 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test072");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs((-9));
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods10.incrementNumberAtIndex(intArray20, 0);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        int int26 = simpleMethods23.getMin(0, 0);
        int int28 = simpleMethods23.abs((-2));
        int[] intArray35 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods23.incrementNumberAtIndex(intArray35, 4);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods23.addElementToSet(intSet58, 6);
        simpleMethods10.addElementToSet(intSet58, (-100));
        simpleMethods6.addElementToSet(intSet58, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet58, (-11));
        int int69 = simpleMethods0.abs((int) (short) 1);
        int int71 = simpleMethods0.abs(3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test073");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 100);
        int int11 = simpleMethods6.abs(4);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods12.addElementToSet(intSet41, (int) (short) 100);
        simpleMethods6.addElementToSet(intSet41, (int) '4');
        simpleMethods0.addElementToSet(intSet41, 9);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int int52 = simpleMethods49.getMin(0, 0);
        int int54 = simpleMethods49.abs((int) (short) 0);
        int[] intArray59 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods49.incrementNumberAtIndex(intArray59, 0);
        simpleMethods0.incrementNumberAtIndex(intArray59, (-259));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test074");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int43 = simpleMethods0.getMin((-9), 0);
        int int45 = simpleMethods0.abs((-131));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test075");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-9), (int) (byte) 1);
        int int11 = simpleMethods0.abs((-11));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test076");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        int int15 = simpleMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods1.addElementToSet(intSet36, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet36, 7);
        int int43 = simpleMethods0.abs((-18));
        int int46 = simpleMethods0.getMin((-5), (-36));
        int int49 = simpleMethods0.getMin((-11), (int) (short) 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test077");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((int) '#', 1);
        int int12 = simpleMethods0.getMin(6, 0);
        int int15 = simpleMethods0.getMin((-259), (-131));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test078");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int[] intArray30 = new int[] {};
        simpleMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        simpleMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = simpleMethods28.getMin((int) '#', 1);
        int int40 = simpleMethods28.getMin(6, 0);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((-2));
        int int50 = simpleMethods42.getMin((-1), 2);
        int int53 = simpleMethods42.getMin(1, 7);
        int int56 = simpleMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods42.addElementToSet(intSet77, (int) (short) 1);
        simpleMethods41.addElementToSet(intSet77, 7);
        simpleMethods28.addElementToSet(intSet77, 0);
        simpleMethods0.addElementToSet(intSet77, (-34));
        int int89 = simpleMethods0.getMin(1, (int) (short) 0);
        int int91 = simpleMethods0.abs((-131));
        int int94 = simpleMethods0.getMin((-100), (int) (short) 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test079");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods0.addElementToSet(intSet29, (int) (short) 100);
        int int35 = simpleMethods0.getMin(6, (-8));
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        int int39 = simpleMethods36.getMin(0, 0);
        int int41 = simpleMethods36.abs((int) (short) 0);
        int[] intArray46 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods36.incrementNumberAtIndex(intArray46, 0);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int int52 = simpleMethods49.getMin(0, 0);
        int int54 = simpleMethods49.abs((int) (short) 0);
        int[] intArray59 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods49.incrementNumberAtIndex(intArray59, 0);
        simpleMethods36.incrementNumberAtIndex(intArray59, 10);
        simpleMethods0.incrementNumberAtIndex(intArray59, 3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test080");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int45 = simpleMethods0.getMin((-19), 100);
        int int47 = simpleMethods0.abs(9);
        int int49 = simpleMethods0.abs(100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test081");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int int30 = simpleMethods0.getMin(100, 10);
        gassert.SimpleMethods simpleMethods31 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        int int35 = simpleMethods32.getMin(0, 0);
        int int37 = simpleMethods32.abs((-2));
        int int40 = simpleMethods32.getMin((-1), 2);
        int int43 = simpleMethods32.getMin(1, 7);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 0);
        int int49 = simpleMethods44.abs((-2));
        int[] intArray56 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods44.incrementNumberAtIndex(intArray56, 4);
        simpleMethods32.incrementNumberAtIndex(intArray56, 0);
        simpleMethods31.incrementNumberAtIndex(intArray56, 0);
        simpleMethods0.incrementNumberAtIndex(intArray56, (int) '4');
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test082");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 100);
        int int49 = simpleMethods44.abs(4);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods50.addElementToSet(intSet79, (int) (short) 100);
        simpleMethods44.addElementToSet(intSet79, (int) '4');
        gassert.SimpleMethods simpleMethods85 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray87 = new int[] {};
        simpleMethods86.incrementNumberAtIndex(intArray87, (int) (byte) 1);
        simpleMethods85.incrementNumberAtIndex(intArray87, 1);
        simpleMethods44.incrementNumberAtIndex(intArray87, 0);
        simpleMethods43.incrementNumberAtIndex(intArray87, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray87, (int) (byte) 100);
        int int99 = simpleMethods0.abs((-5));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test083");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int43 = simpleMethods0.getMin((-9), 0);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 0);
        int int49 = simpleMethods44.abs((int) (short) 0);
        int int51 = simpleMethods44.abs((-1));
        int int54 = simpleMethods44.getMin((-8), 100);
        int int57 = simpleMethods44.getMin((-35), (int) 'a');
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        int int61 = simpleMethods58.getMin(0, 0);
        int int63 = simpleMethods58.abs((int) (short) 0);
        int[] intArray68 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods58.incrementNumberAtIndex(intArray68, 0);
        gassert.SimpleMethods simpleMethods71 = new gassert.SimpleMethods();
        int int74 = simpleMethods71.getMin(0, 0);
        int int76 = simpleMethods71.abs((int) (short) 0);
        int[] intArray81 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods71.incrementNumberAtIndex(intArray81, 0);
        simpleMethods58.incrementNumberAtIndex(intArray81, 2);
        int[] intArray86 = new int[] {};
        simpleMethods58.incrementNumberAtIndex(intArray86, 7);
        simpleMethods44.incrementNumberAtIndex(intArray86, (-19));
        simpleMethods0.incrementNumberAtIndex(intArray86, 1);
        int int94 = simpleMethods0.abs((-3));
        int int96 = simpleMethods0.abs((-9));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test084");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        int int12 = simpleMethods9.getMin(0, 100);
        int int14 = simpleMethods9.abs(4);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods15.addElementToSet(intSet44, (int) (short) 100);
        simpleMethods9.addElementToSet(intSet44, (int) '4');
        simpleMethods0.addElementToSet(intSet44, 8);
        int int53 = simpleMethods0.abs((-3));
        int int55 = simpleMethods0.abs((-35));
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods0.addElementToSet(intSet56, (-100));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test085");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int43 = simpleMethods0.getMin((-9), 0);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 100);
        int int49 = simpleMethods44.abs(4);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        int int53 = simpleMethods50.getMin(0, 100);
        int int55 = simpleMethods50.abs(4);
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods56.addElementToSet(intSet85, (int) (short) 100);
        simpleMethods50.addElementToSet(intSet85, (int) '4');
        simpleMethods44.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (-131));
        int int97 = simpleMethods0.getMin((-132), (-36));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test086");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        int int16 = simpleMethods0.getMin(100, (-31));
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int[] intArray18 = new int[] {};
        simpleMethods17.incrementNumberAtIndex(intArray18, (int) (byte) 1);
        int int22 = simpleMethods17.abs(8);
        int int25 = simpleMethods17.getMin((int) (byte) -1, 100);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        int int29 = simpleMethods26.getMin(0, 0);
        int int31 = simpleMethods26.abs((int) (short) 0);
        int[] intArray36 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods26.incrementNumberAtIndex(intArray36, 0);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((int) (short) 0);
        int[] intArray49 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods39.incrementNumberAtIndex(intArray49, 0);
        simpleMethods26.incrementNumberAtIndex(intArray49, 2);
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        int int58 = simpleMethods55.getMin(0, 0);
        int int60 = simpleMethods55.abs((-2));
        int int63 = simpleMethods55.getMin((-1), 2);
        int int66 = simpleMethods55.getMin(1, 7);
        gassert.SimpleMethods simpleMethods67 = new gassert.SimpleMethods();
        int int70 = simpleMethods67.getMin(0, 0);
        int int72 = simpleMethods67.abs((-2));
        int[] intArray79 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods67.incrementNumberAtIndex(intArray79, 4);
        simpleMethods55.incrementNumberAtIndex(intArray79, 0);
        simpleMethods54.incrementNumberAtIndex(intArray79, 0);
        simpleMethods26.incrementNumberAtIndex(intArray79, (-100));
        simpleMethods17.incrementNumberAtIndex(intArray79, (-34));
        simpleMethods0.incrementNumberAtIndex(intArray79, (-6));
        int int94 = simpleMethods0.getMin((-8), 5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test087");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-18), 0);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int int18 = simpleMethods15.getMin(0, 0);
        int int20 = simpleMethods15.abs((-2));
        int int23 = simpleMethods15.getMin((-1), 2);
        int int26 = simpleMethods15.getMin(1, 7);
        int int29 = simpleMethods15.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods15.addElementToSet(intSet50, (int) (short) 1);
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int[] intArray55 = new int[] {};
        simpleMethods54.incrementNumberAtIndex(intArray55, (int) (byte) 1);
        simpleMethods15.incrementNumberAtIndex(intArray55, 1);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods15.addElementToSet(intSet68, 7);
        gassert.SimpleMethods simpleMethods72 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods73 = new gassert.SimpleMethods();
        int[] intArray74 = new int[] {};
        simpleMethods73.incrementNumberAtIndex(intArray74, (int) (byte) 1);
        simpleMethods72.incrementNumberAtIndex(intArray74, 1);
        simpleMethods15.incrementNumberAtIndex(intArray74, 100);
        simpleMethods0.incrementNumberAtIndex(intArray74, (int) (byte) 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test088");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test089");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 10);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        int int31 = simpleMethods28.getMin(0, 0);
        int int33 = simpleMethods28.abs((-2));
        int int36 = simpleMethods28.getMin((-1), 2);
        int int39 = simpleMethods28.getMin(0, (-1));
        int int42 = simpleMethods28.getMin((int) 'a', (-5));
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray44 = new int[] {};
        simpleMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods47.addElementToSet(intSet76, (int) (short) 100);
        simpleMethods43.addElementToSet(intSet76, (int) (short) -1);
        simpleMethods28.addElementToSet(intSet76, (-10));
        simpleMethods0.addElementToSet(intSet76, (int) '#');
        int int87 = simpleMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test090");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int int29 = simpleMethods0.abs((int) (short) 10);
        int int31 = simpleMethods0.abs(1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test091");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        int int15 = simpleMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods1.addElementToSet(intSet36, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet36, 7);
        int int43 = simpleMethods0.abs((-18));
        int int46 = simpleMethods0.getMin(1, 5);
        int int49 = simpleMethods0.getMin((int) '#', (-259));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test092");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = simpleMethods0.abs(9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test093");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(6, 10);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test094");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 0);
        int int46 = simpleMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods41.incrementNumberAtIndex(intArray53, 4);
        simpleMethods0.incrementNumberAtIndex(intArray53, 10);
        int int60 = simpleMethods0.getMin((int) (byte) 0, (-3));
        int int62 = simpleMethods0.abs((-11));
        int int65 = simpleMethods0.getMin((-132), (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test095");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int8 = simpleMethods0.getMin((-35), (-19));
        int int11 = simpleMethods0.getMin((-1), (-67));
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int[] intArray13 = new int[] {};
        simpleMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        int int17 = simpleMethods12.abs(8);
        int int20 = simpleMethods12.getMin((int) (byte) -1, 100);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        int int24 = simpleMethods21.getMin(0, 0);
        int int26 = simpleMethods21.abs((-2));
        int int29 = simpleMethods21.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int int33 = simpleMethods30.getMin(0, 100);
        int int35 = simpleMethods30.abs(4);
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods36.addElementToSet(intSet65, (int) (short) 100);
        simpleMethods30.addElementToSet(intSet65, (int) '4');
        simpleMethods21.addElementToSet(intSet65, 8);
        simpleMethods12.addElementToSet(intSet65, 10);
        simpleMethods0.addElementToSet(intSet65, (int) (short) -1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test096");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] {};
        simpleMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        simpleMethods41.incrementNumberAtIndex(intArray43, 1);
        simpleMethods0.incrementNumberAtIndex(intArray43, 0);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods50.addElementToSet(intSet79, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet79, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (int) (byte) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test097");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int75 = simpleMethods0.getMin((-7), 5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test098");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        int int55 = simpleMethods0.abs(5);
        int int57 = simpleMethods0.abs((-100));
        int int59 = simpleMethods0.abs(0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test099");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = simpleMethods0.abs((-1));
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        int[] intArray34 = new int[] {};
        simpleMethods33.incrementNumberAtIndex(intArray34, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods37.addElementToSet(intSet66, (int) (short) 100);
        simpleMethods33.addElementToSet(intSet66, (int) (short) -1);
        gassert.SimpleMethods simpleMethods72 = new gassert.SimpleMethods();
        int int75 = simpleMethods72.getMin(0, 0);
        int int77 = simpleMethods72.abs((int) (short) 0);
        int[] intArray82 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods72.incrementNumberAtIndex(intArray82, 0);
        simpleMethods33.incrementNumberAtIndex(intArray82, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray82, (-100));
        int int90 = simpleMethods0.abs((-67));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test100");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 10);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods0.addElementToSet(intSet28, 100);
        int int33 = simpleMethods0.getMin((int) (byte) 1, (-8));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test101");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods2 = new gassert.SimpleMethods();
        int[] intArray3 = new int[] {};
        simpleMethods2.incrementNumberAtIndex(intArray3, (int) (byte) 1);
        simpleMethods1.incrementNumberAtIndex(intArray3, 1);
        int int10 = simpleMethods1.getMin((-100), 9);
        int int13 = simpleMethods1.getMin(6, 10);
        int int15 = simpleMethods1.abs((-3));
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((-2));
        int[] intArray28 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods16.incrementNumberAtIndex(intArray28, 4);
        simpleMethods1.incrementNumberAtIndex(intArray28, 1);
        simpleMethods0.incrementNumberAtIndex(intArray28, 5);
        int int36 = simpleMethods0.abs((int) 'a');
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int[] intArray38 = new int[] {};
        simpleMethods37.incrementNumberAtIndex(intArray38, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods41.addElementToSet(intSet70, (int) (short) 100);
        simpleMethods37.addElementToSet(intSet70, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet70, (int) ' ');
        int int79 = simpleMethods0.abs(10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test102");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int42 = simpleMethods0.abs((-4));
        int int45 = simpleMethods0.getMin(100, 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test103");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test104");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-3));
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 100);
        int int11 = simpleMethods6.abs((-9));
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int[] intArray13 = new int[] {};
        simpleMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods16.incrementNumberAtIndex(intArray26, 0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods29.addElementToSet(intSet64, 6);
        simpleMethods16.addElementToSet(intSet64, (-100));
        simpleMethods12.addElementToSet(intSet64, (int) (short) -1);
        simpleMethods6.addElementToSet(intSet64, (-11));
        simpleMethods0.addElementToSet(intSet64, (-3));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test105");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int11 = simpleMethods0.abs(8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test106");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int42 = simpleMethods0.abs((-8));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test107");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        int[] intArray59 = new int[] {};
        simpleMethods58.incrementNumberAtIndex(intArray59, (int) (byte) 1);
        simpleMethods57.incrementNumberAtIndex(intArray59, 1);
        simpleMethods0.incrementNumberAtIndex(intArray59, 100);
        int int67 = simpleMethods0.abs((-35));
        int int70 = simpleMethods0.getMin((-4), 4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test108");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods8.addElementToSet(intSet37, (int) (short) 100);
        int int42 = simpleMethods8.abs((-8));
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int int47 = simpleMethods44.getMin(0, 0);
        int int49 = simpleMethods44.abs((-2));
        int int52 = simpleMethods44.getMin((-1), 2);
        int int55 = simpleMethods44.getMin(1, 7);
        int int58 = simpleMethods44.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods44.addElementToSet(intSet79, (int) (short) 1);
        simpleMethods43.addElementToSet(intSet79, 7);
        simpleMethods8.addElementToSet(intSet79, 9);
        simpleMethods0.addElementToSet(intSet79, 9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test109");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods9.addElementToSet(intSet38, (int) (short) 100);
        int int43 = simpleMethods9.abs((-8));
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int int48 = simpleMethods45.getMin(0, 0);
        int int50 = simpleMethods45.abs((-2));
        int int53 = simpleMethods45.getMin((-1), 2);
        int int56 = simpleMethods45.getMin(1, 7);
        int int59 = simpleMethods45.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods45.addElementToSet(intSet80, (int) (short) 1);
        simpleMethods44.addElementToSet(intSet80, 7);
        simpleMethods9.addElementToSet(intSet80, 9);
        simpleMethods0.addElementToSet(intSet80, 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test110");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-9), 1);
        int int8 = simpleMethods0.abs(2);
        int int11 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int15 = simpleMethods12.getMin(0, 0);
        int int17 = simpleMethods12.abs((int) (short) 0);
        int[] intArray22 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods12.incrementNumberAtIndex(intArray22, 0);
        gassert.SimpleMethods simpleMethods25 = new gassert.SimpleMethods();
        int int28 = simpleMethods25.getMin(0, 0);
        int int30 = simpleMethods25.abs((int) (short) 0);
        int[] intArray35 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods25.incrementNumberAtIndex(intArray35, 0);
        simpleMethods12.incrementNumberAtIndex(intArray35, 2);
        int[] intArray40 = new int[] {};
        simpleMethods12.incrementNumberAtIndex(intArray40, 7);
        simpleMethods0.incrementNumberAtIndex(intArray40, (int) (short) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test111");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        int int16 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.abs((-8));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test112");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs((int) (short) 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test113");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.getMin((int) (byte) -1, 100);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        int int12 = simpleMethods9.getMin(0, 0);
        int int14 = simpleMethods9.abs((-2));
        int int17 = simpleMethods9.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        int int21 = simpleMethods18.getMin(0, 100);
        int int23 = simpleMethods18.abs(4);
        gassert.SimpleMethods simpleMethods24 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods24.addElementToSet(intSet53, (int) (short) 100);
        simpleMethods18.addElementToSet(intSet53, (int) '4');
        simpleMethods9.addElementToSet(intSet53, 8);
        simpleMethods0.addElementToSet(intSet53, 10);
        java.util.HashSet<java.lang.Integer> intSet63 = null;
        simpleMethods0.addElementToSet(intSet63, 9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test114");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 0);
        int int11 = simpleMethods6.abs(100);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int[] intArray13 = new int[] {};
        simpleMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods16.incrementNumberAtIndex(intArray26, 0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods29.addElementToSet(intSet64, 6);
        simpleMethods16.addElementToSet(intSet64, (-100));
        simpleMethods12.addElementToSet(intSet64, (int) (short) -1);
        simpleMethods6.addElementToSet(intSet64, 3);
        simpleMethods0.addElementToSet(intSet64, 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test115");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int9 = simpleMethods0.abs((-32));
        int int12 = simpleMethods0.getMin((-34), 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test116");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = simpleMethods0.getMin((-9), (int) '4');
        int int19 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods20 = new gassert.SimpleMethods();
        int int23 = simpleMethods20.getMin(0, 0);
        int int25 = simpleMethods20.abs((-2));
        int int27 = simpleMethods20.abs(0);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        int int31 = simpleMethods28.getMin(0, 0);
        int int33 = simpleMethods28.abs((-2));
        int int36 = simpleMethods28.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int40 = simpleMethods37.getMin(0, 100);
        int int42 = simpleMethods37.abs(4);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods43.addElementToSet(intSet72, (int) (short) 100);
        simpleMethods37.addElementToSet(intSet72, (int) '4');
        simpleMethods28.addElementToSet(intSet72, 8);
        simpleMethods20.addElementToSet(intSet72, 1);
        simpleMethods0.addElementToSet(intSet72, 10);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        simpleMethods0.addElementToSet(intSet84, (-19));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test117");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((int) '#', 1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods10.incrementNumberAtIndex(intArray20, 0);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods24 = new gassert.SimpleMethods();
        int[] intArray25 = new int[] {};
        simpleMethods24.incrementNumberAtIndex(intArray25, (int) (byte) 1);
        simpleMethods23.incrementNumberAtIndex(intArray25, 1);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int int33 = simpleMethods30.getMin(0, 0);
        int int35 = simpleMethods30.abs((-2));
        int[] intArray42 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods30.incrementNumberAtIndex(intArray42, 4);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods30.addElementToSet(intSet65, 6);
        simpleMethods23.addElementToSet(intSet65, (-3));
        simpleMethods10.addElementToSet(intSet65, 100);
        simpleMethods0.addElementToSet(intSet65, (-67));
        int int76 = simpleMethods0.abs(7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test118");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] {};
        simpleMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        simpleMethods14.incrementNumberAtIndex(intArray16, 1);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        int int25 = simpleMethods22.getMin(0, 100);
        int int27 = simpleMethods22.abs(4);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods28.addElementToSet(intSet57, (int) (short) 100);
        simpleMethods22.addElementToSet(intSet57, (int) '4');
        gassert.SimpleMethods simpleMethods63 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        int[] intArray65 = new int[] {};
        simpleMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        simpleMethods63.incrementNumberAtIndex(intArray65, 1);
        simpleMethods22.incrementNumberAtIndex(intArray65, 0);
        simpleMethods21.incrementNumberAtIndex(intArray65, (-1));
        simpleMethods14.incrementNumberAtIndex(intArray65, 10);
        simpleMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods0.addElementToSet(intSet80, (int) (byte) -1);
        int int85 = simpleMethods0.abs(0);
        int int87 = simpleMethods0.abs(1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test119");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 100);
        int int11 = simpleMethods6.abs(4);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods12.addElementToSet(intSet41, (int) (short) 100);
        simpleMethods6.addElementToSet(intSet41, (int) '4');
        simpleMethods0.addElementToSet(intSet41, 9);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int int52 = simpleMethods49.getMin(0, 100);
        int int54 = simpleMethods49.abs(4);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        int int58 = simpleMethods55.getMin(0, 100);
        int int60 = simpleMethods55.abs(4);
        gassert.SimpleMethods simpleMethods61 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods61.addElementToSet(intSet90, (int) (short) 100);
        simpleMethods55.addElementToSet(intSet90, (int) '4');
        simpleMethods49.addElementToSet(intSet90, 9);
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test120");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs(9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test121");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((int) '#', 1);
        int int11 = simpleMethods0.abs(2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test122");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-9), 1);
        int int8 = simpleMethods0.abs(2);
        int int11 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int14 = simpleMethods0.getMin(100, (int) (short) 10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test123");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int45 = simpleMethods0.getMin((-19), 100);
        int int47 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int int52 = simpleMethods49.getMin(0, 0);
        int int54 = simpleMethods49.abs((-2));
        int int57 = simpleMethods49.getMin((-1), 2);
        int int60 = simpleMethods49.getMin(1, 7);
        int int63 = simpleMethods49.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods49.addElementToSet(intSet84, (int) (short) 1);
        simpleMethods48.addElementToSet(intSet84, 7);
        simpleMethods0.addElementToSet(intSet84, (int) (short) 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test124");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        gassert.SimpleMethods simpleMethods4 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        int[] intArray6 = new int[] {};
        simpleMethods5.incrementNumberAtIndex(intArray6, (int) (byte) 1);
        simpleMethods4.incrementNumberAtIndex(intArray6, 1);
        int int13 = simpleMethods4.getMin((int) '#', 1);
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int int17 = simpleMethods14.getMin(0, 0);
        int int19 = simpleMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods14.incrementNumberAtIndex(intArray24, 0);
        gassert.SimpleMethods simpleMethods27 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        int[] intArray29 = new int[] {};
        simpleMethods28.incrementNumberAtIndex(intArray29, (int) (byte) 1);
        simpleMethods27.incrementNumberAtIndex(intArray29, 1);
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int int37 = simpleMethods34.getMin(0, 0);
        int int39 = simpleMethods34.abs((-2));
        int[] intArray46 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods34.incrementNumberAtIndex(intArray46, 4);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods34.addElementToSet(intSet69, 6);
        simpleMethods27.addElementToSet(intSet69, (-3));
        simpleMethods14.addElementToSet(intSet69, 100);
        simpleMethods4.addElementToSet(intSet69, (-67));
        simpleMethods0.addElementToSet(intSet69, (int) (short) 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test125");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.getMin((-1), (-100));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test126");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 0);
        int int11 = simpleMethods6.abs((int) (short) 0);
        int[] intArray16 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods6.incrementNumberAtIndex(intArray16, 0);
        simpleMethods0.incrementNumberAtIndex(intArray16, (-4));
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        int int24 = simpleMethods21.getMin(0, 0);
        int int26 = simpleMethods21.abs((-2));
        int int29 = simpleMethods21.getMin((int) (short) -1, (int) (short) 100);
        int int31 = simpleMethods21.abs(0);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        int int35 = simpleMethods32.getMin(0, 0);
        int int37 = simpleMethods32.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods38 = new gassert.SimpleMethods();
        int[] intArray39 = new int[] {};
        simpleMethods38.incrementNumberAtIndex(intArray39, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods42.addElementToSet(intSet71, (int) (short) 100);
        simpleMethods38.addElementToSet(intSet71, (int) (short) -1);
        gassert.SimpleMethods simpleMethods77 = new gassert.SimpleMethods();
        int int80 = simpleMethods77.getMin(0, 0);
        int int82 = simpleMethods77.abs((int) (short) 0);
        int[] intArray87 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods77.incrementNumberAtIndex(intArray87, 0);
        simpleMethods38.incrementNumberAtIndex(intArray87, (-1));
        simpleMethods32.incrementNumberAtIndex(intArray87, 0);
        simpleMethods21.incrementNumberAtIndex(intArray87, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray87, (-131));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test127");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int[] intArray30 = new int[] {};
        simpleMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        simpleMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = simpleMethods28.getMin((int) '#', 1);
        int int40 = simpleMethods28.getMin(6, 0);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((-2));
        int int50 = simpleMethods42.getMin((-1), 2);
        int int53 = simpleMethods42.getMin(1, 7);
        int int56 = simpleMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods42.addElementToSet(intSet77, (int) (short) 1);
        simpleMethods41.addElementToSet(intSet77, 7);
        simpleMethods28.addElementToSet(intSet77, 0);
        simpleMethods0.addElementToSet(intSet77, (-34));
        int int89 = simpleMethods0.getMin(1, (int) (short) 0);
        int int91 = simpleMethods0.abs((-131));
        int int94 = simpleMethods0.getMin((-1), (int) 'a');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test128");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int41 = simpleMethods0.getMin(10, (-6));
        int int43 = simpleMethods0.abs((-35));
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int int48 = simpleMethods45.getMin(0, 0);
        int int50 = simpleMethods45.abs((-2));
        int int53 = simpleMethods45.getMin((-1), 2);
        int int56 = simpleMethods45.getMin(1, 7);
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        int int60 = simpleMethods57.getMin(0, 0);
        int int62 = simpleMethods57.abs((-2));
        int[] intArray69 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods57.incrementNumberAtIndex(intArray69, 4);
        simpleMethods45.incrementNumberAtIndex(intArray69, 0);
        simpleMethods44.incrementNumberAtIndex(intArray69, 0);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 6, (-1), 1, 7, 1, (-3), 6, (-2) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods44.addElementToSet(intSet85, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet85, (-11));
        int int93 = simpleMethods0.getMin((-5), (-31));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test129");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (short) 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test130");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = simpleMethods0.getMin((-8), (-32));
        int int74 = simpleMethods0.abs((-259));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test131");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = simpleMethods0.abs((-1));
        int int34 = simpleMethods0.abs((-31));
        int int36 = simpleMethods0.abs(7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test132");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods39.incrementNumberAtIndex(intArray51, 4);
        simpleMethods0.incrementNumberAtIndex(intArray51, (-32));
        int int58 = simpleMethods0.getMin(0, (-32));
        int int61 = simpleMethods0.getMin(1, (-515));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test133");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        int int55 = simpleMethods0.abs(5);
        int int58 = simpleMethods0.getMin(0, (-131));
        int int60 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test134");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods10.addElementToSet(intSet39, (int) (short) 100);
        simpleMethods6.addElementToSet(intSet39, (int) (short) -1);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int int48 = simpleMethods45.getMin(0, 0);
        int int50 = simpleMethods45.abs((int) (short) 0);
        int[] intArray55 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods45.incrementNumberAtIndex(intArray55, 0);
        simpleMethods6.incrementNumberAtIndex(intArray55, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray55, 0);
        int int63 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test135");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        int int58 = simpleMethods0.abs((-7));
        int int60 = simpleMethods0.abs((int) (byte) -1);
        int int63 = simpleMethods0.getMin(100, (-10));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test136");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] {};
        simpleMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        simpleMethods14.incrementNumberAtIndex(intArray16, 1);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        int int25 = simpleMethods22.getMin(0, 100);
        int int27 = simpleMethods22.abs(4);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods28.addElementToSet(intSet57, (int) (short) 100);
        simpleMethods22.addElementToSet(intSet57, (int) '4');
        gassert.SimpleMethods simpleMethods63 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        int[] intArray65 = new int[] {};
        simpleMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        simpleMethods63.incrementNumberAtIndex(intArray65, 1);
        simpleMethods22.incrementNumberAtIndex(intArray65, 0);
        simpleMethods21.incrementNumberAtIndex(intArray65, (-1));
        simpleMethods14.incrementNumberAtIndex(intArray65, 10);
        simpleMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        int int80 = simpleMethods0.getMin((-35), (-8));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test137");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs((-1));
        int int7 = simpleMethods0.abs((-10));
        int int9 = simpleMethods0.abs(1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((-2));
        int[] intArray22 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods10.incrementNumberAtIndex(intArray22, 4);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods10.addElementToSet(intSet45, 6);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int int52 = simpleMethods49.getMin(0, 0);
        int int54 = simpleMethods49.abs((-2));
        int[] intArray61 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods49.incrementNumberAtIndex(intArray61, 4);
        simpleMethods10.incrementNumberAtIndex(intArray61, (-32));
        simpleMethods0.incrementNumberAtIndex(intArray61, (-3));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test138");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods0.addElementToSet(intSet29, (int) (short) 100);
        int int35 = simpleMethods0.getMin((int) ' ', (-6));
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        int int39 = simpleMethods36.getMin(0, 100);
        int int41 = simpleMethods36.abs(4);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods42.addElementToSet(intSet71, (int) (short) 100);
        simpleMethods36.addElementToSet(intSet71, (int) '4');
        gassert.SimpleMethods simpleMethods77 = new gassert.SimpleMethods();
        int int80 = simpleMethods77.getMin(0, 0);
        int int82 = simpleMethods77.abs((-2));
        int[] intArray89 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods77.incrementNumberAtIndex(intArray89, 4);
        simpleMethods36.incrementNumberAtIndex(intArray89, 10);
        simpleMethods0.incrementNumberAtIndex(intArray89, 6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test139");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs(2);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray11 = new int[] {};
        simpleMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods14.addElementToSet(intSet43, (int) (short) 100);
        simpleMethods10.addElementToSet(intSet43, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet43, 10);
        int int53 = simpleMethods0.getMin((-11), (-9));
        int int55 = simpleMethods0.abs((-18));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-34) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods0.addElementToSet(intSet58, 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test140");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods39.incrementNumberAtIndex(intArray51, 4);
        simpleMethods0.incrementNumberAtIndex(intArray51, (-32));
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        int int59 = simpleMethods56.getMin(0, 0);
        int int61 = simpleMethods56.abs((int) (short) 0);
        int[] intArray66 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods56.incrementNumberAtIndex(intArray66, 0);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int int72 = simpleMethods69.getMin(0, 0);
        int int74 = simpleMethods69.abs((int) (short) 0);
        int[] intArray79 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods69.incrementNumberAtIndex(intArray79, 0);
        simpleMethods56.incrementNumberAtIndex(intArray79, 2);
        int[] intArray84 = new int[] {};
        simpleMethods56.incrementNumberAtIndex(intArray84, 7);
        simpleMethods0.incrementNumberAtIndex(intArray84, (int) (byte) 100);
        int int91 = simpleMethods0.getMin(0, (-67));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test141");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] {};
        simpleMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        simpleMethods41.incrementNumberAtIndex(intArray43, 1);
        simpleMethods0.incrementNumberAtIndex(intArray43, 0);
        int int51 = simpleMethods0.abs((-9));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test142");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = simpleMethods0.abs(4);
        int int73 = simpleMethods0.abs(0);
        int int76 = simpleMethods0.getMin((-8), 9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test143");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 0);
        int int46 = simpleMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods41.incrementNumberAtIndex(intArray53, 4);
        simpleMethods0.incrementNumberAtIndex(intArray53, 10);
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods58.addElementToSet(intSet87, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet87, (-3));
        int int95 = simpleMethods0.getMin(10, (-3));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test144");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((int) '#', 1);
        int int12 = simpleMethods0.getMin(6, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int int17 = simpleMethods14.getMin(0, 0);
        int int19 = simpleMethods14.abs((-2));
        int int22 = simpleMethods14.getMin((-1), 2);
        int int25 = simpleMethods14.getMin(1, 7);
        int int28 = simpleMethods14.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods14.addElementToSet(intSet49, (int) (short) 1);
        simpleMethods13.addElementToSet(intSet49, 7);
        simpleMethods0.addElementToSet(intSet49, 0);
        int int59 = simpleMethods0.getMin(3, 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test145");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs((-1));
        java.util.HashSet<java.lang.Integer> intSet6 = null;
        simpleMethods0.addElementToSet(intSet6, (int) (short) -1);
        int int11 = simpleMethods0.getMin((int) (byte) 0, (-10));
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int int21 = simpleMethods13.getMin((-1), 2);
        int int24 = simpleMethods13.getMin(1, 7);
        gassert.SimpleMethods simpleMethods25 = new gassert.SimpleMethods();
        int int28 = simpleMethods25.getMin(0, 0);
        int int30 = simpleMethods25.abs((-2));
        int[] intArray37 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods25.incrementNumberAtIndex(intArray37, 4);
        simpleMethods13.incrementNumberAtIndex(intArray37, 0);
        simpleMethods12.incrementNumberAtIndex(intArray37, 0);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        int[] intArray47 = new int[] {};
        simpleMethods46.incrementNumberAtIndex(intArray47, (int) (byte) 1);
        simpleMethods45.incrementNumberAtIndex(intArray47, 1);
        int int54 = simpleMethods45.getMin((-100), 9);
        int int57 = simpleMethods45.getMin(6, 10);
        int int59 = simpleMethods45.abs((-3));
        gassert.SimpleMethods simpleMethods60 = new gassert.SimpleMethods();
        int int63 = simpleMethods60.getMin(0, 0);
        int int65 = simpleMethods60.abs((-2));
        int[] intArray72 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods60.incrementNumberAtIndex(intArray72, 4);
        simpleMethods45.incrementNumberAtIndex(intArray72, 1);
        simpleMethods44.incrementNumberAtIndex(intArray72, 5);
        simpleMethods12.incrementNumberAtIndex(intArray72, (-7));
        simpleMethods0.incrementNumberAtIndex(intArray72, 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test146");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 10);
        int int29 = simpleMethods0.abs((-259));
        int int32 = simpleMethods0.getMin((-35), 9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test147");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int9 = simpleMethods0.abs((-6));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test148");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int int17 = simpleMethods14.getMin(0, 0);
        int int19 = simpleMethods14.abs((-2));
        int int22 = simpleMethods14.getMin((-1), 2);
        int int25 = simpleMethods14.getMin(1, 7);
        int int28 = simpleMethods14.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods14.addElementToSet(intSet49, (int) (short) 1);
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        int[] intArray54 = new int[] {};
        simpleMethods53.incrementNumberAtIndex(intArray54, (int) (byte) 1);
        simpleMethods14.incrementNumberAtIndex(intArray54, 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods14.addElementToSet(intSet67, 7);
        simpleMethods0.addElementToSet(intSet67, (-36));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test149");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.getMin((int) (short) -1, (-35));
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray11 = new int[] {};
        simpleMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        simpleMethods9.incrementNumberAtIndex(intArray11, 1);
        int int18 = simpleMethods9.getMin((-100), 9);
        int int21 = simpleMethods9.getMin(100, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        int int25 = simpleMethods22.getMin(0, 0);
        int int27 = simpleMethods22.abs((int) (short) 0);
        int[] intArray32 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods22.incrementNumberAtIndex(intArray32, 0);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        int int38 = simpleMethods35.getMin(0, 0);
        int int40 = simpleMethods35.abs((-2));
        int[] intArray47 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods35.incrementNumberAtIndex(intArray47, 4);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods35.addElementToSet(intSet70, 6);
        simpleMethods22.addElementToSet(intSet70, (-100));
        simpleMethods9.addElementToSet(intSet70, 10);
        simpleMethods0.addElementToSet(intSet70, (-10));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test150");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(100, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        int int29 = simpleMethods26.getMin(0, 0);
        int int31 = simpleMethods26.abs((-2));
        int[] intArray38 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods26.incrementNumberAtIndex(intArray38, 4);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods26.addElementToSet(intSet61, 6);
        simpleMethods13.addElementToSet(intSet61, (-100));
        simpleMethods0.addElementToSet(intSet61, 10);
        int int71 = simpleMethods0.getMin((-515), (-1));
        int int74 = simpleMethods0.getMin((-6), (int) 'a');
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test151");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        gassert.SimpleMethods simpleMethods11 = new gassert.SimpleMethods();
        int int14 = simpleMethods11.getMin(0, 0);
        int int16 = simpleMethods11.abs((-2));
        int int19 = simpleMethods11.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods20 = new gassert.SimpleMethods();
        int int23 = simpleMethods20.getMin(0, 100);
        int int25 = simpleMethods20.abs(4);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods26.addElementToSet(intSet55, (int) (short) 100);
        simpleMethods20.addElementToSet(intSet55, (int) '4');
        simpleMethods11.addElementToSet(intSet55, 8);
        simpleMethods0.addElementToSet(intSet55, (int) ' ');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test152");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        java.util.HashSet<java.lang.Integer> intSet12 = null;
        simpleMethods0.addElementToSet(intSet12, 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test153");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs((-1));
        int int7 = simpleMethods0.abs((-10));
        int int9 = simpleMethods0.abs((-4));
        int int11 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test154");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 100);
        int int6 = simpleMethods1.abs(4);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods7.addElementToSet(intSet36, (int) (short) 100);
        simpleMethods1.addElementToSet(intSet36, (int) '4');
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray44 = new int[] {};
        simpleMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        simpleMethods42.incrementNumberAtIndex(intArray44, 1);
        simpleMethods1.incrementNumberAtIndex(intArray44, 0);
        simpleMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = simpleMethods0.getMin(100, 1);
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        int int59 = simpleMethods56.getMin(0, 0);
        int int61 = simpleMethods56.abs((int) (short) 0);
        int[] intArray66 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods56.incrementNumberAtIndex(intArray66, 0);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int int72 = simpleMethods69.getMin(0, 0);
        int int74 = simpleMethods69.abs((int) (short) 0);
        int[] intArray79 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods69.incrementNumberAtIndex(intArray79, 0);
        simpleMethods56.incrementNumberAtIndex(intArray79, 2);
        simpleMethods0.incrementNumberAtIndex(intArray79, (-18));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test155");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int11 = simpleMethods0.abs((-34));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test156");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        int int41 = simpleMethods0.getMin(100, 4);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        int[] intArray49 = new int[] {};
        simpleMethods48.incrementNumberAtIndex(intArray49, (int) (byte) 1);
        simpleMethods42.incrementNumberAtIndex(intArray49, 8);
        simpleMethods0.incrementNumberAtIndex(intArray49, 0);
        int int58 = simpleMethods0.getMin((-100), (-131));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test157");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs(2);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray11 = new int[] {};
        simpleMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods14.addElementToSet(intSet43, (int) (short) 100);
        simpleMethods10.addElementToSet(intSet43, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet43, 10);
        int int53 = simpleMethods0.getMin((-11), (-9));
        int int55 = simpleMethods0.abs((-18));
        int int58 = simpleMethods0.getMin((-3), 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test158");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = simpleMethods0.getMin((-9), (int) '4');
        int int19 = simpleMethods0.abs((int) '#');
        int int21 = simpleMethods0.abs((-10));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test159");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        int int58 = simpleMethods0.abs(5);
        int int60 = simpleMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test160");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs((-1));
        int int7 = simpleMethods0.abs((-10));
        int int10 = simpleMethods0.getMin(1, (-35));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test161");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods39.incrementNumberAtIndex(intArray51, 4);
        simpleMethods0.incrementNumberAtIndex(intArray51, (-32));
        int int58 = simpleMethods0.getMin(7, 3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test162");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int int47 = simpleMethods39.getMin((-1), 2);
        int int50 = simpleMethods39.getMin(1, 7);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        int int54 = simpleMethods51.getMin(0, 0);
        int int56 = simpleMethods51.abs((-2));
        int[] intArray63 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods51.incrementNumberAtIndex(intArray63, 4);
        simpleMethods39.incrementNumberAtIndex(intArray63, 0);
        simpleMethods0.incrementNumberAtIndex(intArray63, (int) (byte) 1);
        int int71 = simpleMethods0.abs(6);
        int int73 = simpleMethods0.abs((-131));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test163");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = simpleMethods0.abs((-1));
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        int[] intArray34 = new int[] {};
        simpleMethods33.incrementNumberAtIndex(intArray34, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods37.addElementToSet(intSet66, (int) (short) 100);
        simpleMethods33.addElementToSet(intSet66, (int) (short) -1);
        gassert.SimpleMethods simpleMethods72 = new gassert.SimpleMethods();
        int int75 = simpleMethods72.getMin(0, 0);
        int int77 = simpleMethods72.abs((int) (short) 0);
        int[] intArray82 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods72.incrementNumberAtIndex(intArray82, 0);
        simpleMethods33.incrementNumberAtIndex(intArray82, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray82, (-100));
        int int91 = simpleMethods0.getMin((-7), (int) (short) 0);
        int int94 = simpleMethods0.getMin((int) '4', 6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test164");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        simpleMethods1.incrementNumberAtIndex(intArray25, 0);
        simpleMethods0.incrementNumberAtIndex(intArray25, 0);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 6, (-1), 1, 7, 1, (-3), 6, (-2) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods0.addElementToSet(intSet41, (int) (short) -1);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-66), (-20), (-10), 100, 9, (-100), 10, 100, 100, 100, 100, 9, 0, (-3), 3, (-35), (-515), 100, (-100), 4, (-4), (-10), 7, 3, 1, (-36), (-2), 6, 10, 7, (-8), 3, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods0.addElementToSet(intSet79, (int) (byte) 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test165");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 0);
        int int11 = simpleMethods6.abs(100);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int[] intArray13 = new int[] {};
        simpleMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods16.incrementNumberAtIndex(intArray26, 0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods29.addElementToSet(intSet64, 6);
        simpleMethods16.addElementToSet(intSet64, (-100));
        simpleMethods12.addElementToSet(intSet64, (int) (short) -1);
        simpleMethods6.addElementToSet(intSet64, 3);
        simpleMethods0.addElementToSet(intSet64, 0);
        gassert.SimpleMethods simpleMethods76 = new gassert.SimpleMethods();
        int int79 = simpleMethods76.getMin(0, 0);
        int int81 = simpleMethods76.abs((-2));
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        int int85 = simpleMethods82.getMin(0, 0);
        int int87 = simpleMethods82.abs((int) (short) 0);
        int[] intArray92 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods82.incrementNumberAtIndex(intArray92, 0);
        simpleMethods76.incrementNumberAtIndex(intArray92, (-4));
        simpleMethods0.incrementNumberAtIndex(intArray92, (-36));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test166");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] {};
        simpleMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        simpleMethods14.incrementNumberAtIndex(intArray16, 1);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        int int25 = simpleMethods22.getMin(0, 100);
        int int27 = simpleMethods22.abs(4);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods28.addElementToSet(intSet57, (int) (short) 100);
        simpleMethods22.addElementToSet(intSet57, (int) '4');
        gassert.SimpleMethods simpleMethods63 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        int[] intArray65 = new int[] {};
        simpleMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        simpleMethods63.incrementNumberAtIndex(intArray65, 1);
        simpleMethods22.incrementNumberAtIndex(intArray65, 0);
        simpleMethods21.incrementNumberAtIndex(intArray65, (-1));
        simpleMethods14.incrementNumberAtIndex(intArray65, 10);
        simpleMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        int int80 = simpleMethods0.getMin((-9), (-1));
        int int83 = simpleMethods0.getMin((-66), (int) 'a');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test167");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 100);
        int int6 = simpleMethods1.abs(4);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods7.addElementToSet(intSet36, (int) (short) 100);
        simpleMethods1.addElementToSet(intSet36, (int) '4');
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray44 = new int[] {};
        simpleMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        simpleMethods42.incrementNumberAtIndex(intArray44, 1);
        simpleMethods1.incrementNumberAtIndex(intArray44, 0);
        simpleMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = simpleMethods0.getMin((-32), (-1));
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        int int59 = simpleMethods56.getMin(0, 0);
        int int61 = simpleMethods56.abs((-2));
        int int64 = simpleMethods56.getMin((-1), (-5));
        gassert.SimpleMethods simpleMethods65 = new gassert.SimpleMethods();
        int int68 = simpleMethods65.getMin(0, 0);
        int int70 = simpleMethods65.abs((int) (short) 0);
        int[] intArray75 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods65.incrementNumberAtIndex(intArray75, 0);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int int81 = simpleMethods78.getMin(0, 0);
        int int83 = simpleMethods78.abs((int) (short) 0);
        int[] intArray88 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods78.incrementNumberAtIndex(intArray88, 0);
        simpleMethods65.incrementNumberAtIndex(intArray88, 2);
        int[] intArray93 = new int[] {};
        simpleMethods65.incrementNumberAtIndex(intArray93, 7);
        simpleMethods56.incrementNumberAtIndex(intArray93, 7);
        simpleMethods0.incrementNumberAtIndex(intArray93, (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test168");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods0.addElementToSet(intSet29, (int) (short) 100);
        int int34 = simpleMethods0.abs((-8));
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        int int39 = simpleMethods36.getMin(0, 0);
        int int41 = simpleMethods36.abs((-2));
        int int44 = simpleMethods36.getMin((-1), 2);
        int int47 = simpleMethods36.getMin(1, 7);
        int int50 = simpleMethods36.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods36.addElementToSet(intSet71, (int) (short) 1);
        simpleMethods35.addElementToSet(intSet71, 7);
        simpleMethods0.addElementToSet(intSet71, 9);
        int int80 = simpleMethods0.abs((-8));
        int int83 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test169");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = simpleMethods0.abs(4);
        int int73 = simpleMethods0.abs(0);
        int int76 = simpleMethods0.getMin(4, (int) (byte) 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test170");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        int int7 = simpleMethods0.abs((-5));
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int11 = simpleMethods8.getMin(0, 0);
        int int13 = simpleMethods8.abs((-2));
        int int16 = simpleMethods8.getMin((-1), 2);
        int int19 = simpleMethods8.getMin(1, 7);
        int int22 = simpleMethods8.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods8.addElementToSet(intSet43, (int) (short) 1);
        int int49 = simpleMethods8.getMin(100, 4);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        int int53 = simpleMethods50.getMin(0, 0);
        int int55 = simpleMethods50.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        int[] intArray57 = new int[] {};
        simpleMethods56.incrementNumberAtIndex(intArray57, (int) (byte) 1);
        simpleMethods50.incrementNumberAtIndex(intArray57, 8);
        simpleMethods8.incrementNumberAtIndex(intArray57, 0);
        simpleMethods0.incrementNumberAtIndex(intArray57, (-7));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test171");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int7 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.getMin((-8), 100);
        int int13 = simpleMethods0.getMin((-35), (int) 'a');
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int int17 = simpleMethods14.getMin(0, 0);
        int int19 = simpleMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods14.incrementNumberAtIndex(intArray24, 0);
        gassert.SimpleMethods simpleMethods27 = new gassert.SimpleMethods();
        int int30 = simpleMethods27.getMin(0, 0);
        int int32 = simpleMethods27.abs((int) (short) 0);
        int[] intArray37 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods27.incrementNumberAtIndex(intArray37, 0);
        simpleMethods14.incrementNumberAtIndex(intArray37, 2);
        int[] intArray42 = new int[] {};
        simpleMethods14.incrementNumberAtIndex(intArray42, 7);
        simpleMethods0.incrementNumberAtIndex(intArray42, (-19));
        int int49 = simpleMethods0.getMin(7, (int) (byte) 100);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test172");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        int int46 = simpleMethods0.abs(1);
        int int48 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test173");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.getMin((-31), (-7));
        int int15 = simpleMethods0.getMin((-515), 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test174");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        int int41 = simpleMethods0.getMin(100, 4);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int int46 = simpleMethods43.getMin(0, 100);
        int int48 = simpleMethods43.abs(4);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods49.addElementToSet(intSet78, (int) (short) 100);
        simpleMethods43.addElementToSet(intSet78, (int) '4');
        gassert.SimpleMethods simpleMethods84 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods85 = new gassert.SimpleMethods();
        int[] intArray86 = new int[] {};
        simpleMethods85.incrementNumberAtIndex(intArray86, (int) (byte) 1);
        simpleMethods84.incrementNumberAtIndex(intArray86, 1);
        simpleMethods43.incrementNumberAtIndex(intArray86, 0);
        simpleMethods42.incrementNumberAtIndex(intArray86, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray86, (-9));
        int int99 = simpleMethods0.getMin((-32), 2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test175");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int int17 = simpleMethods14.getMin(0, 0);
        int int19 = simpleMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods14.incrementNumberAtIndex(intArray24, 0);
        gassert.SimpleMethods simpleMethods27 = new gassert.SimpleMethods();
        int int30 = simpleMethods27.getMin(0, 0);
        int int32 = simpleMethods27.abs((-2));
        int[] intArray39 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods27.incrementNumberAtIndex(intArray39, 4);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods27.addElementToSet(intSet62, 6);
        simpleMethods14.addElementToSet(intSet62, (-100));
        simpleMethods0.addElementToSet(intSet62, (-5));
        int int71 = simpleMethods0.abs(4);
        int int74 = simpleMethods0.getMin(5, (int) (short) 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test176");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 0);
        int int11 = simpleMethods6.abs(100);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int[] intArray13 = new int[] {};
        simpleMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods16.incrementNumberAtIndex(intArray26, 0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods29.addElementToSet(intSet64, 6);
        simpleMethods16.addElementToSet(intSet64, (-100));
        simpleMethods12.addElementToSet(intSet64, (int) (short) -1);
        simpleMethods6.addElementToSet(intSet64, 3);
        simpleMethods0.addElementToSet(intSet64, 0);
        int int77 = simpleMethods0.abs(10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test177");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        int[] intArray59 = new int[] {};
        simpleMethods58.incrementNumberAtIndex(intArray59, (int) (byte) 1);
        simpleMethods57.incrementNumberAtIndex(intArray59, 1);
        simpleMethods0.incrementNumberAtIndex(intArray59, 100);
        int int67 = simpleMethods0.abs((-35));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (-31));
        int int73 = simpleMethods0.getMin((-1), 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test178");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-9), 1);
        int int8 = simpleMethods0.abs(2);
        int int11 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int14 = simpleMethods0.getMin((-11), (-3));
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int int18 = simpleMethods15.getMin(0, 0);
        int int20 = simpleMethods15.abs((int) (short) 0);
        int[] intArray26 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods15.incrementNumberAtIndex(intArray26, (-3));
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray31 = new int[] {};
        simpleMethods30.incrementNumberAtIndex(intArray31, (int) (byte) 1);
        simpleMethods29.incrementNumberAtIndex(intArray31, 1);
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int40 = simpleMethods37.getMin(0, 100);
        int int42 = simpleMethods37.abs(4);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods43.addElementToSet(intSet72, (int) (short) 100);
        simpleMethods37.addElementToSet(intSet72, (int) '4');
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods79 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] {};
        simpleMethods79.incrementNumberAtIndex(intArray80, (int) (byte) 1);
        simpleMethods78.incrementNumberAtIndex(intArray80, 1);
        simpleMethods37.incrementNumberAtIndex(intArray80, 0);
        simpleMethods36.incrementNumberAtIndex(intArray80, (-1));
        simpleMethods29.incrementNumberAtIndex(intArray80, 10);
        simpleMethods15.incrementNumberAtIndex(intArray80, (int) (byte) -1);
        simpleMethods0.incrementNumberAtIndex(intArray80, (int) '#');
        int int97 = simpleMethods0.getMin((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test179");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int8 = simpleMethods0.getMin((-35), (-19));
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int[] intArray11 = null;
        simpleMethods0.incrementNumberAtIndex(intArray11, (int) (short) -1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test180");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.getMin((-31), (-7));
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        int int29 = simpleMethods26.getMin(0, 0);
        int int31 = simpleMethods26.abs((int) (short) 0);
        int[] intArray36 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods26.incrementNumberAtIndex(intArray36, 0);
        simpleMethods13.incrementNumberAtIndex(intArray36, 2);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 100);
        int int46 = simpleMethods41.abs(4);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods47.addElementToSet(intSet76, (int) (short) 100);
        simpleMethods41.addElementToSet(intSet76, (int) '4');
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray84 = new int[] {};
        simpleMethods83.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        simpleMethods82.incrementNumberAtIndex(intArray84, 1);
        simpleMethods41.incrementNumberAtIndex(intArray84, 0);
        simpleMethods13.incrementNumberAtIndex(intArray84, 5);
        simpleMethods0.incrementNumberAtIndex(intArray84, (-8));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test181");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = simpleMethods0.abs(4);
        int int73 = simpleMethods0.abs(0);
        gassert.SimpleMethods simpleMethods74 = new gassert.SimpleMethods();
        int int77 = simpleMethods74.getMin(0, 0);
        int int79 = simpleMethods74.abs((int) (short) 0);
        int[] intArray84 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods74.incrementNumberAtIndex(intArray84, 0);
        simpleMethods0.incrementNumberAtIndex(intArray84, (-11));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test182");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = simpleMethods0.getMin((-8), (-32));
        int int75 = simpleMethods0.getMin((int) 'a', (-19));
        int int78 = simpleMethods0.getMin((int) '4', (-66));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test183");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray15 = new int[] {};
        simpleMethods14.incrementNumberAtIndex(intArray15, (int) (byte) 1);
        simpleMethods13.incrementNumberAtIndex(intArray15, 1);
        gassert.SimpleMethods simpleMethods20 = new gassert.SimpleMethods();
        int int23 = simpleMethods20.getMin(0, 0);
        int int25 = simpleMethods20.abs((-2));
        int[] intArray32 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods20.incrementNumberAtIndex(intArray32, 4);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods20.addElementToSet(intSet55, 6);
        simpleMethods13.addElementToSet(intSet55, (-3));
        simpleMethods0.addElementToSet(intSet55, 100);
        int int65 = simpleMethods0.getMin((int) '#', (-35));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test184");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        int int59 = simpleMethods0.getMin((-3), 1);
        int int61 = simpleMethods0.abs((-3));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test185");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test186");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods0.addElementToSet(intSet53, 7);
        int int59 = simpleMethods0.getMin((-18), (-67));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test187");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 0);
        int int46 = simpleMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods41.incrementNumberAtIndex(intArray53, 4);
        simpleMethods0.incrementNumberAtIndex(intArray53, 10);
        int int60 = simpleMethods0.getMin((int) (byte) 0, (-3));
        int int63 = simpleMethods0.getMin((int) '4', (-20));
        int int65 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test188");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        int int15 = simpleMethods0.getMin((-31), 0);
        int int17 = simpleMethods0.abs((-19));
        int int20 = simpleMethods0.getMin(0, (-19));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test189");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods4 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        int int8 = simpleMethods5.getMin(0, 0);
        int int10 = simpleMethods5.abs((-2));
        int[] intArray17 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods5.incrementNumberAtIndex(intArray17, 4);
        simpleMethods4.incrementNumberAtIndex(intArray17, (int) (short) 1);
        simpleMethods0.incrementNumberAtIndex(intArray17, 8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test190");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        int int15 = simpleMethods0.abs((-7));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test191");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int43 = simpleMethods0.getMin((-36), (-20));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test192");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int75 = simpleMethods0.getMin((int) (short) 0, 7);
        gassert.SimpleMethods simpleMethods76 = new gassert.SimpleMethods();
        int int79 = simpleMethods76.getMin(0, 0);
        int int81 = simpleMethods76.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        int[] intArray83 = new int[] {};
        simpleMethods82.incrementNumberAtIndex(intArray83, (int) (byte) 1);
        simpleMethods76.incrementNumberAtIndex(intArray83, 8);
        simpleMethods0.incrementNumberAtIndex(intArray83, (-36));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test193");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        int int12 = simpleMethods9.getMin(0, 100);
        int int14 = simpleMethods9.abs(4);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods15.addElementToSet(intSet44, (int) (short) 100);
        simpleMethods9.addElementToSet(intSet44, (int) '4');
        simpleMethods0.addElementToSet(intSet44, 8);
        int int54 = simpleMethods0.getMin((int) (byte) -1, 2);
        int int57 = simpleMethods0.getMin((-7), 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test194");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int[] intArray13 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods1.incrementNumberAtIndex(intArray13, 4);
        simpleMethods0.incrementNumberAtIndex(intArray13, (int) (short) 1);
        int int19 = simpleMethods0.abs((-19));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test195");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs((-9));
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 0);
        int int11 = simpleMethods6.abs((-2));
        int int13 = simpleMethods6.abs(0);
        int int15 = simpleMethods6.abs(2);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int[] intArray17 = new int[] {};
        simpleMethods16.incrementNumberAtIndex(intArray17, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods20 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods20.addElementToSet(intSet49, (int) (short) 100);
        simpleMethods16.addElementToSet(intSet49, (int) (short) -1);
        simpleMethods6.addElementToSet(intSet49, 10);
        simpleMethods0.addElementToSet(intSet49, (-35));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test196");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 1);
        int int13 = simpleMethods0.abs((-2));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test197");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray6 = null;
        simpleMethods0.incrementNumberAtIndex(intArray6, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        int int12 = simpleMethods9.getMin(0, 0);
        int int14 = simpleMethods9.abs((-2));
        int int17 = simpleMethods9.getMin((-1), 2);
        int int20 = simpleMethods9.getMin(1, 7);
        int int23 = simpleMethods9.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods9.addElementToSet(intSet44, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet44, 1);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        int[] intArray52 = new int[] {};
        simpleMethods51.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        simpleMethods50.incrementNumberAtIndex(intArray52, 1);
        simpleMethods0.incrementNumberAtIndex(intArray52, 10);
        int int60 = simpleMethods0.abs(0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test198");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int41 = simpleMethods0.getMin(10, (-6));
        int int43 = simpleMethods0.abs((-35));
        int int45 = simpleMethods0.abs((-5));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test199");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] {};
        simpleMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        simpleMethods14.incrementNumberAtIndex(intArray16, 1);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        int int25 = simpleMethods22.getMin(0, 100);
        int int27 = simpleMethods22.abs(4);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods28.addElementToSet(intSet57, (int) (short) 100);
        simpleMethods22.addElementToSet(intSet57, (int) '4');
        gassert.SimpleMethods simpleMethods63 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        int[] intArray65 = new int[] {};
        simpleMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        simpleMethods63.incrementNumberAtIndex(intArray65, 1);
        simpleMethods22.incrementNumberAtIndex(intArray65, 0);
        simpleMethods21.incrementNumberAtIndex(intArray65, (-1));
        simpleMethods14.incrementNumberAtIndex(intArray65, 10);
        simpleMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        int int80 = simpleMethods0.getMin((-9), (-1));
        int int83 = simpleMethods0.getMin((-3), (-32));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test200");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.getMin(6, 6);
        int int14 = simpleMethods0.abs(100);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test201");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = simpleMethods0.abs(4);
        int int73 = simpleMethods0.abs(0);
        int int76 = simpleMethods0.getMin((-1), 2);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-32), (-18), (-18), 4, (-20), 9, (-2) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods0.addElementToSet(intSet85, (int) (byte) 0);
        int int90 = simpleMethods0.abs((-1));
        int int92 = simpleMethods0.abs((-67));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test202");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 10);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods0.addElementToSet(intSet28, 100);
        int int33 = simpleMethods0.getMin((-66), (int) (short) -1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test203");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-9), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-131), (int) (short) 100);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int[] intArray14 = new int[] {};
        simpleMethods13.incrementNumberAtIndex(intArray14, (int) (byte) 1);
        int int18 = simpleMethods13.abs((-1));
        int int20 = simpleMethods13.abs((-10));
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        int int24 = simpleMethods21.getMin(0, 0);
        int int26 = simpleMethods21.abs((-2));
        int int28 = simpleMethods21.abs(0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int int37 = simpleMethods29.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods38 = new gassert.SimpleMethods();
        int int41 = simpleMethods38.getMin(0, 100);
        int int43 = simpleMethods38.abs(4);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods44.addElementToSet(intSet73, (int) (short) 100);
        simpleMethods38.addElementToSet(intSet73, (int) '4');
        simpleMethods29.addElementToSet(intSet73, 8);
        simpleMethods21.addElementToSet(intSet73, 1);
        simpleMethods13.addElementToSet(intSet73, 8);
        simpleMethods0.addElementToSet(intSet73, 7);
        int int89 = simpleMethods0.getMin((-1), (-35));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test204");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray40, 1);
        int int47 = simpleMethods0.getMin((-66), 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test205");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        int int29 = simpleMethods0.abs((int) (short) 10);
        int int32 = simpleMethods0.getMin((int) (short) -1, 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test206");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        simpleMethods0.incrementNumberAtIndex(intArray23, 2);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int[] intArray30 = new int[] {};
        simpleMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        simpleMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = simpleMethods28.getMin((int) '#', 1);
        int int40 = simpleMethods28.getMin(6, 0);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 0);
        int int47 = simpleMethods42.abs((-2));
        int int50 = simpleMethods42.getMin((-1), 2);
        int int53 = simpleMethods42.getMin(1, 7);
        int int56 = simpleMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods42.addElementToSet(intSet77, (int) (short) 1);
        simpleMethods41.addElementToSet(intSet77, 7);
        simpleMethods28.addElementToSet(intSet77, 0);
        simpleMethods0.addElementToSet(intSet77, (-34));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, (int) (short) 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test207");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int11 = simpleMethods0.abs((int) (short) 100);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test208");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int10 = simpleMethods0.abs(0);
        int int13 = simpleMethods0.getMin(8, 2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test209");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(100, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods13.incrementNumberAtIndex(intArray23, 0);
        gassert.SimpleMethods simpleMethods26 = new gassert.SimpleMethods();
        int int29 = simpleMethods26.getMin(0, 0);
        int int31 = simpleMethods26.abs((-2));
        int[] intArray38 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods26.incrementNumberAtIndex(intArray38, 4);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods26.addElementToSet(intSet61, 6);
        simpleMethods13.addElementToSet(intSet61, (-100));
        simpleMethods0.addElementToSet(intSet61, 10);
        int int71 = simpleMethods0.getMin((-515), (-1));
        int int74 = simpleMethods0.getMin(0, 100);
        int int76 = simpleMethods0.abs((-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test210");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int15 = simpleMethods12.getMin(0, 0);
        int int17 = simpleMethods12.abs((-2));
        int[] intArray24 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods12.incrementNumberAtIndex(intArray24, 4);
        simpleMethods0.incrementNumberAtIndex(intArray24, 0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int int36 = simpleMethods29.abs(0);
        int int38 = simpleMethods29.abs(2);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] {};
        simpleMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods43.addElementToSet(intSet72, (int) (short) 100);
        simpleMethods39.addElementToSet(intSet72, (int) (short) -1);
        simpleMethods29.addElementToSet(intSet72, 10);
        simpleMethods0.addElementToSet(intSet72, 100);
        int int83 = simpleMethods0.abs((-36));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test211");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-9), 1);
        int int8 = simpleMethods0.abs((-259));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test212");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 100);
        int int15 = simpleMethods10.abs(4);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods16.addElementToSet(intSet45, (int) (short) 100);
        simpleMethods10.addElementToSet(intSet45, (int) '4');
        simpleMethods1.addElementToSet(intSet45, 8);
        simpleMethods0.addElementToSet(intSet45, (-5));
        int int57 = simpleMethods0.getMin((-32), 3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test213");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] {};
        simpleMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        simpleMethods41.incrementNumberAtIndex(intArray43, 1);
        simpleMethods0.incrementNumberAtIndex(intArray43, 0);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods50.addElementToSet(intSet79, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet79, (int) (short) -1);
        int int87 = simpleMethods0.getMin((int) (short) 0, 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test214");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = simpleMethods0.abs((int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods0.addElementToSet(intSet43, (-10));
        int int47 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test215");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int int20 = simpleMethods17.getMin(0, 0);
        int int22 = simpleMethods17.abs((int) (short) 0);
        int[] intArray28 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods17.incrementNumberAtIndex(intArray28, (-3));
        gassert.SimpleMethods simpleMethods31 = new gassert.SimpleMethods();
        int int34 = simpleMethods31.getMin(0, 0);
        int int36 = simpleMethods31.abs((-2));
        int int39 = simpleMethods31.getMin((-1), 2);
        int int42 = simpleMethods31.getMin(1, 7);
        int int45 = simpleMethods31.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods31.addElementToSet(intSet66, (int) (short) 1);
        gassert.SimpleMethods simpleMethods70 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] {};
        simpleMethods70.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods31.incrementNumberAtIndex(intArray71, 1);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods31.addElementToSet(intSet84, 7);
        simpleMethods17.addElementToSet(intSet84, (-36));
        simpleMethods0.addElementToSet(intSet84, 10);
        int int93 = simpleMethods0.abs(6);
        int int96 = simpleMethods0.getMin((-20), (-32));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test216");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.getMin((-19), 0);
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test217");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = simpleMethods0.abs(4);
        int int73 = simpleMethods0.abs(0);
        int int76 = simpleMethods0.getMin((-1), 2);
        int int78 = simpleMethods0.abs(0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test218");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int15 = simpleMethods12.getMin(0, 0);
        int int17 = simpleMethods12.abs((-2));
        int[] intArray24 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods12.incrementNumberAtIndex(intArray24, 4);
        simpleMethods0.incrementNumberAtIndex(intArray24, 0);
        int int31 = simpleMethods0.getMin(10, (-8));
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        int int36 = simpleMethods33.getMin(0, 0);
        int int38 = simpleMethods33.abs((-2));
        int int41 = simpleMethods33.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int45 = simpleMethods42.getMin(0, 100);
        int int47 = simpleMethods42.abs(4);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods48.addElementToSet(intSet77, (int) (short) 100);
        simpleMethods42.addElementToSet(intSet77, (int) '4');
        simpleMethods33.addElementToSet(intSet77, 8);
        simpleMethods32.addElementToSet(intSet77, (-5));
        simpleMethods0.addElementToSet(intSet77, 100);
        int int91 = simpleMethods0.getMin((-11), (-131));
        int int93 = simpleMethods0.abs((-7));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test219");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs((-9));
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int13 = simpleMethods10.getMin(0, 0);
        int int15 = simpleMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods10.incrementNumberAtIndex(intArray20, 0);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        int int26 = simpleMethods23.getMin(0, 0);
        int int28 = simpleMethods23.abs((-2));
        int[] intArray35 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods23.incrementNumberAtIndex(intArray35, 4);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods23.addElementToSet(intSet58, 6);
        simpleMethods10.addElementToSet(intSet58, (-100));
        simpleMethods6.addElementToSet(intSet58, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet58, (-11));
        int int69 = simpleMethods0.abs((int) (short) 1);
        int int72 = simpleMethods0.getMin((-515), 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test220");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods4 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods4.addElementToSet(intSet33, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet33, (int) (short) -1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((int) (short) 0);
        int[] intArray49 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods39.incrementNumberAtIndex(intArray49, 0);
        simpleMethods0.incrementNumberAtIndex(intArray49, (-1));
        int int55 = simpleMethods0.abs((int) (byte) 100);
        int int58 = simpleMethods0.getMin((-131), (-20));
        int int61 = simpleMethods0.getMin((-100), (int) '4');
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test221");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs((-4));
        int int7 = simpleMethods0.abs((-67));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test222");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, 6);
        int int40 = simpleMethods0.abs((-35));
        int int42 = simpleMethods0.abs((-4));
        int int45 = simpleMethods0.getMin((int) (short) 10, (-8));
        int int47 = simpleMethods0.abs(0);
        int int50 = simpleMethods0.getMin(0, 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test223");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 100);
        int int6 = simpleMethods1.abs(4);
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods7.addElementToSet(intSet36, (int) (short) 100);
        simpleMethods1.addElementToSet(intSet36, (int) '4');
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray44 = new int[] {};
        simpleMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        simpleMethods42.incrementNumberAtIndex(intArray44, 1);
        simpleMethods1.incrementNumberAtIndex(intArray44, 0);
        simpleMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test224");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int7 = simpleMethods0.abs(0);
        int int9 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, (-8));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test225");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int int8 = simpleMethods0.getMin((-35), (-19));
        int int11 = simpleMethods0.getMin((-1), (-67));
        int int13 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test226");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin(1, 7);
        int int14 = simpleMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods0.addElementToSet(intSet35, (int) (short) 1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int int47 = simpleMethods39.getMin((-1), 2);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        int int51 = simpleMethods48.getMin(0, 100);
        int int53 = simpleMethods48.abs(4);
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods54.addElementToSet(intSet83, (int) (short) 100);
        simpleMethods48.addElementToSet(intSet83, (int) '4');
        simpleMethods39.addElementToSet(intSet83, 8);
        simpleMethods0.addElementToSet(intSet83, (-5));
        int int95 = simpleMethods0.getMin((-131), 7);
        int int97 = simpleMethods0.abs((-1));
        int int99 = simpleMethods0.abs(3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test227");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int[] intArray7 = new int[] {};
        simpleMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods10.addElementToSet(intSet39, (int) (short) 100);
        simpleMethods6.addElementToSet(intSet39, (int) (short) -1);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int int48 = simpleMethods45.getMin(0, 0);
        int int50 = simpleMethods45.abs((int) (short) 0);
        int[] intArray55 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods45.incrementNumberAtIndex(intArray55, 0);
        simpleMethods6.incrementNumberAtIndex(intArray55, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray55, 0);
        int int63 = simpleMethods0.abs(1);
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods65 = new gassert.SimpleMethods();
        int int68 = simpleMethods65.getMin(0, 0);
        int int70 = simpleMethods65.abs((-2));
        int[] intArray77 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods65.incrementNumberAtIndex(intArray77, 4);
        simpleMethods64.incrementNumberAtIndex(intArray77, (int) (short) 1);
        simpleMethods0.incrementNumberAtIndex(intArray77, 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test228");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.getMin((-1), 2);
        int int11 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 1);
        int int13 = simpleMethods0.abs((int) (short) 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test229");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.getMin((int) (byte) -1, 100);
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] {};
        simpleMethods9.incrementNumberAtIndex(intArray10, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods13.addElementToSet(intSet42, (int) (short) 100);
        simpleMethods9.addElementToSet(intSet42, (int) (short) -1);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        int int51 = simpleMethods48.getMin(0, 0);
        int int53 = simpleMethods48.abs((int) (short) 0);
        int[] intArray58 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods48.incrementNumberAtIndex(intArray58, 0);
        simpleMethods9.incrementNumberAtIndex(intArray58, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray58, (-8));
        int int67 = simpleMethods0.getMin((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test230");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray1 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = simpleMethods0.abs((-1));
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int9 = simpleMethods6.getMin(0, 0);
        int int11 = simpleMethods6.abs((int) (short) 0);
        int[] intArray17 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods6.incrementNumberAtIndex(intArray17, (-3));
        int int22 = simpleMethods6.getMin(100, (-31));
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods24 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods25 = new gassert.SimpleMethods();
        int[] intArray26 = new int[] {};
        simpleMethods25.incrementNumberAtIndex(intArray26, (int) (byte) 1);
        simpleMethods24.incrementNumberAtIndex(intArray26, 1);
        int int33 = simpleMethods24.getMin((-100), 9);
        int int36 = simpleMethods24.getMin(6, 10);
        int int38 = simpleMethods24.abs((-3));
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int int42 = simpleMethods39.getMin(0, 0);
        int int44 = simpleMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods39.incrementNumberAtIndex(intArray51, 4);
        simpleMethods24.incrementNumberAtIndex(intArray51, 1);
        simpleMethods23.incrementNumberAtIndex(intArray51, 5);
        simpleMethods6.incrementNumberAtIndex(intArray51, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray51, 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test231");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        int int16 = simpleMethods13.getMin(0, 0);
        int int18 = simpleMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods13.addElementToSet(intSet48, 6);
        simpleMethods0.addElementToSet(intSet48, (-100));
        gassert.SimpleMethods simpleMethods54 = new gassert.SimpleMethods();
        int int57 = simpleMethods54.getMin(0, 0);
        int int59 = simpleMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods54.incrementNumberAtIndex(intArray65, (-3));
        simpleMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int74 = simpleMethods0.abs((int) (byte) 1);
        int int77 = simpleMethods0.getMin((int) '4', (-2));
        int int79 = simpleMethods0.abs((-35));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test232");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods0.incrementNumberAtIndex(intArray11, (-3));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int int17 = simpleMethods14.getMin(0, 0);
        int int19 = simpleMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods14.incrementNumberAtIndex(intArray24, 0);
        gassert.SimpleMethods simpleMethods27 = new gassert.SimpleMethods();
        int int30 = simpleMethods27.getMin(0, 0);
        int int32 = simpleMethods27.abs((-2));
        int[] intArray39 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods27.incrementNumberAtIndex(intArray39, 4);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods27.addElementToSet(intSet62, 6);
        simpleMethods14.addElementToSet(intSet62, (-100));
        simpleMethods0.addElementToSet(intSet62, (-5));
        int int71 = simpleMethods0.abs(4);
        int int73 = simpleMethods0.abs(4);
        int int75 = simpleMethods0.abs(1);
        int int78 = simpleMethods0.getMin((int) 'a', (-10));
        int int80 = simpleMethods0.abs(5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test233");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = simpleMethods0.getMin((-9), (int) '4');
        int int19 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods20 = new gassert.SimpleMethods();
        int int23 = simpleMethods20.getMin(0, 0);
        int int25 = simpleMethods20.abs((-2));
        int[] intArray32 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods20.incrementNumberAtIndex(intArray32, 4);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods20.addElementToSet(intSet55, 6);
        simpleMethods0.addElementToSet(intSet55, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test234");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int5 = simpleMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods0.incrementNumberAtIndex(intArray10, 0);
        int int15 = simpleMethods0.getMin((-31), 0);
        int int17 = simpleMethods0.abs((-19));
        int int20 = simpleMethods0.getMin(1, 6);
        int int23 = simpleMethods0.getMin((int) (short) 100, 100);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test235");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int int4 = simpleMethods1.getMin(0, 0);
        int int6 = simpleMethods1.abs((-2));
        int int9 = simpleMethods1.getMin((-1), 2);
        int int12 = simpleMethods1.getMin(1, 7);
        int int15 = simpleMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods1.addElementToSet(intSet36, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet36, 7);
        int int43 = simpleMethods0.abs((-18));
        int int46 = simpleMethods0.getMin(1, 5);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int int50 = simpleMethods47.getMin(0, 0);
        int int52 = simpleMethods47.abs((-2));
        int[] intArray59 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods47.incrementNumberAtIndex(intArray59, 4);
        simpleMethods0.incrementNumberAtIndex(intArray59, (-9));
        int int66 = simpleMethods0.getMin(10, 8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test236");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] {};
        simpleMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = simpleMethods0.getMin((-100), 9);
        int int12 = simpleMethods0.getMin(6, 10);
        int int15 = simpleMethods0.getMin((int) (byte) 100, (-11));
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        simpleMethods16.incrementNumberAtIndex(intArray26, 0);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        int int32 = simpleMethods29.getMin(0, 0);
        int int34 = simpleMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods29.addElementToSet(intSet64, 6);
        simpleMethods16.addElementToSet(intSet64, (-100));
        gassert.SimpleMethods simpleMethods70 = new gassert.SimpleMethods();
        int int73 = simpleMethods70.getMin(0, 0);
        int int75 = simpleMethods70.abs((int) (short) 0);
        int[] intArray81 = new int[] { (short) 10, 100, (-100), 0, 1 };
        simpleMethods70.incrementNumberAtIndex(intArray81, (-3));
        simpleMethods16.incrementNumberAtIndex(intArray81, 100);
        simpleMethods0.incrementNumberAtIndex(intArray81, (int) ' ');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test237");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods2 = new gassert.SimpleMethods();
        int[] intArray3 = new int[] {};
        simpleMethods2.incrementNumberAtIndex(intArray3, (int) (byte) 1);
        simpleMethods1.incrementNumberAtIndex(intArray3, 1);
        int int10 = simpleMethods1.getMin((-100), 9);
        int int13 = simpleMethods1.getMin(6, 10);
        int int15 = simpleMethods1.abs((-3));
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int int19 = simpleMethods16.getMin(0, 0);
        int int21 = simpleMethods16.abs((-2));
        int[] intArray28 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods16.incrementNumberAtIndex(intArray28, 4);
        simpleMethods1.incrementNumberAtIndex(intArray28, 1);
        simpleMethods0.incrementNumberAtIndex(intArray28, 5);
        int int37 = simpleMethods0.getMin((-67), (-18));
        int int39 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test238");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 100);
        int int5 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods6.addElementToSet(intSet35, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet35, (int) '4');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int44 = simpleMethods41.getMin(0, 0);
        int int46 = simpleMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        simpleMethods41.incrementNumberAtIndex(intArray53, 4);
        simpleMethods0.incrementNumberAtIndex(intArray53, 10);
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods58.addElementToSet(intSet87, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet87, (-3));
        int int94 = simpleMethods0.abs(10);
        int int96 = simpleMethods0.abs(0);
        int[] intArray97 = null;
        simpleMethods0.incrementNumberAtIndex(intArray97, (-35));
    }
}

