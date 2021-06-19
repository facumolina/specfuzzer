package testers;

import gassert.BasicMethods;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicMethodsTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test001");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 100);
        int int6 = basicMethods1.abs(4);
        BasicMethods basicMethods7 = new BasicMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods7.addElementToSet(intSet36, (int) (short) 100);
        basicMethods1.addElementToSet(intSet36, (int) '4');
        BasicMethods basicMethods42 = new BasicMethods();
        BasicMethods basicMethods43 = new BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        basicMethods42.incrementNumberAtIndex(intArray44, 1);
        basicMethods1.incrementNumberAtIndex(intArray44, 0);
        basicMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int54 = basicMethods0.abs(0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test002");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        basicMethods41.incrementNumberAtIndex(intArray43, 1);
        basicMethods0.incrementNumberAtIndex(intArray43, 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-6), 9, (-6), (-8), 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        basicMethods0.addElementToSet(intSet57, (-7));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test003");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        BasicMethods basicMethods43 = new BasicMethods();
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 100);
        int int49 = basicMethods44.abs(4);
        BasicMethods basicMethods50 = new BasicMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        basicMethods50.addElementToSet(intSet79, (int) (short) 100);
        basicMethods44.addElementToSet(intSet79, (int) '4');
        BasicMethods basicMethods85 = new BasicMethods();
        BasicMethods basicMethods86 = new BasicMethods();
        int[] intArray87 = new int[] {};
        basicMethods86.incrementNumberAtIndex(intArray87, (int) (byte) 1);
        basicMethods85.incrementNumberAtIndex(intArray87, 1);
        basicMethods44.incrementNumberAtIndex(intArray87, 0);
        basicMethods43.incrementNumberAtIndex(intArray87, (-1));
        basicMethods0.incrementNumberAtIndex(intArray87, (int) (byte) 100);
        int int99 = basicMethods0.abs((int) '#');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test004");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int41 = basicMethods0.getMin(0, (-19));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test005");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int10 = basicMethods0.getMin((-8), 100);
        int int13 = basicMethods0.getMin(0, (-6));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test006");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 100);
        int int6 = basicMethods1.abs(4);
        BasicMethods basicMethods7 = new BasicMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods7.addElementToSet(intSet36, (int) (short) 100);
        basicMethods1.addElementToSet(intSet36, (int) '4');
        BasicMethods basicMethods42 = new BasicMethods();
        BasicMethods basicMethods43 = new BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        basicMethods42.incrementNumberAtIndex(intArray44, 1);
        basicMethods1.incrementNumberAtIndex(intArray44, 0);
        basicMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = basicMethods0.getMin((int) ' ', (-19));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test007");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        int int55 = basicMethods0.abs(5);
        int int57 = basicMethods0.abs(5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test008");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int int47 = basicMethods39.getMin((-1), 2);
        BasicMethods basicMethods48 = new BasicMethods();
        int int51 = basicMethods48.getMin(0, 100);
        int int53 = basicMethods48.abs(4);
        BasicMethods basicMethods54 = new BasicMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        basicMethods54.addElementToSet(intSet83, (int) (short) 100);
        basicMethods48.addElementToSet(intSet83, (int) '4');
        basicMethods39.addElementToSet(intSet83, 8);
        basicMethods0.addElementToSet(intSet83, (-5));
        int int94 = basicMethods0.abs((-10));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test009");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(100, (int) (byte) 1);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        BasicMethods basicMethods26 = new BasicMethods();
        int int29 = basicMethods26.getMin(0, 0);
        int int31 = basicMethods26.abs((-2));
        int[] intArray38 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods26.incrementNumberAtIndex(intArray38, 4);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        basicMethods26.addElementToSet(intSet61, 6);
        basicMethods13.addElementToSet(intSet61, (-100));
        basicMethods0.addElementToSet(intSet61, 10);
        BasicMethods basicMethods69 = new BasicMethods();
        int int72 = basicMethods69.getMin(0, 0);
        int int74 = basicMethods69.abs((int) (short) 0);
        int[] intArray79 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods69.incrementNumberAtIndex(intArray79, 0);
        BasicMethods basicMethods82 = new BasicMethods();
        int int85 = basicMethods82.getMin(0, 0);
        int int87 = basicMethods82.abs((int) (short) 0);
        int[] intArray92 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods82.incrementNumberAtIndex(intArray92, 0);
        basicMethods69.incrementNumberAtIndex(intArray92, 10);
        basicMethods0.incrementNumberAtIndex(intArray92, 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test010");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        BasicMethods basicMethods28 = new BasicMethods();
        int int31 = basicMethods28.getMin(0, 100);
        int int33 = basicMethods28.abs(4);
        BasicMethods basicMethods34 = new BasicMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        basicMethods34.addElementToSet(intSet63, (int) (short) 100);
        basicMethods28.addElementToSet(intSet63, (int) '4');
        BasicMethods basicMethods69 = new BasicMethods();
        BasicMethods basicMethods70 = new BasicMethods();
        int[] intArray71 = new int[] {};
        basicMethods70.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        basicMethods69.incrementNumberAtIndex(intArray71, 1);
        basicMethods28.incrementNumberAtIndex(intArray71, 0);
        basicMethods0.incrementNumberAtIndex(intArray71, 5);
        int int82 = basicMethods0.getMin((-100), (-11));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test011");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-18), 0);
        BasicMethods basicMethods15 = new BasicMethods();
        int int18 = basicMethods15.getMin(0, 100);
        int int20 = basicMethods15.abs(4);
        BasicMethods basicMethods21 = new BasicMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        basicMethods21.addElementToSet(intSet50, (int) (short) 100);
        basicMethods15.addElementToSet(intSet50, (int) '4');
        BasicMethods basicMethods56 = new BasicMethods();
        BasicMethods basicMethods57 = new BasicMethods();
        int[] intArray58 = new int[] {};
        basicMethods57.incrementNumberAtIndex(intArray58, (int) (byte) 1);
        basicMethods56.incrementNumberAtIndex(intArray58, 1);
        basicMethods15.incrementNumberAtIndex(intArray58, 0);
        basicMethods0.incrementNumberAtIndex(intArray58, (-6));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test012");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 0);
        int int46 = basicMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods41.incrementNumberAtIndex(intArray53, 4);
        basicMethods0.incrementNumberAtIndex(intArray53, 10);
        BasicMethods basicMethods58 = new BasicMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        basicMethods58.addElementToSet(intSet87, (int) (short) 100);
        basicMethods0.addElementToSet(intSet87, (-3));
        int int94 = basicMethods0.abs(10);
        int int96 = basicMethods0.abs(0);
        int int99 = basicMethods0.getMin((int) (byte) 100, 4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test013");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        int int41 = basicMethods0.getMin(100, 4);
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((-2));
        int[] intArray54 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods42.incrementNumberAtIndex(intArray54, 4);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods42.addElementToSet(intSet77, 6);
        BasicMethods basicMethods81 = new BasicMethods();
        int int84 = basicMethods81.getMin(0, 0);
        int int86 = basicMethods81.abs((-2));
        int[] intArray93 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods81.incrementNumberAtIndex(intArray93, 4);
        basicMethods42.incrementNumberAtIndex(intArray93, (-32));
        basicMethods0.incrementNumberAtIndex(intArray93, (-3));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test014");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        BasicMethods basicMethods4 = new BasicMethods();
        int int7 = basicMethods4.getMin(0, 0);
        int int9 = basicMethods4.abs((int) (short) 0);
        int[] intArray14 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods4.incrementNumberAtIndex(intArray14, 0);
        BasicMethods basicMethods17 = new BasicMethods();
        int int20 = basicMethods17.getMin(0, 0);
        int int22 = basicMethods17.abs((int) (short) 0);
        int[] intArray27 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods17.incrementNumberAtIndex(intArray27, 0);
        basicMethods4.incrementNumberAtIndex(intArray27, 2);
        int[] intArray32 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray32, 7);
        int int36 = basicMethods4.abs((-1));
        BasicMethods basicMethods37 = new BasicMethods();
        int int40 = basicMethods37.getMin(0, 0);
        int int42 = basicMethods37.abs((-2));
        int int45 = basicMethods37.getMin((-1), 2);
        int int48 = basicMethods37.getMin(1, 7);
        int int51 = basicMethods37.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods37.addElementToSet(intSet72, (int) (short) 1);
        BasicMethods basicMethods76 = new BasicMethods();
        int[] intArray77 = new int[] {};
        basicMethods76.incrementNumberAtIndex(intArray77, (int) (byte) 1);
        basicMethods37.incrementNumberAtIndex(intArray77, 1);
        basicMethods4.incrementNumberAtIndex(intArray77, 3);
        basicMethods0.incrementNumberAtIndex(intArray77, (int) (short) 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test015");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int13 = basicMethods0.abs(0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test016");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        int int7 = basicMethods0.abs((-5));
        int int10 = basicMethods0.getMin(9, 4);
        BasicMethods basicMethods11 = new BasicMethods();
        int int14 = basicMethods11.getMin(0, 0);
        int int16 = basicMethods11.abs((-2));
        int[] intArray23 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods11.incrementNumberAtIndex(intArray23, 4);
        basicMethods0.incrementNumberAtIndex(intArray23, (-19));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test017");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int41 = basicMethods0.getMin(10, (-6));
        int int44 = basicMethods0.getMin(9, (int) (short) 1);
        BasicMethods basicMethods45 = new BasicMethods();
        int int48 = basicMethods45.getMin(0, 0);
        int int50 = basicMethods45.abs((-2));
        int int53 = basicMethods45.getMin((-1), 2);
        int int56 = basicMethods45.getMin(1, 7);
        int int59 = basicMethods45.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        basicMethods45.addElementToSet(intSet80, (int) (short) 1);
        BasicMethods basicMethods84 = new BasicMethods();
        int[] intArray85 = new int[] {};
        basicMethods84.incrementNumberAtIndex(intArray85, (int) (byte) 1);
        basicMethods45.incrementNumberAtIndex(intArray85, 1);
        basicMethods0.incrementNumberAtIndex(intArray85, (-32));
        int int93 = basicMethods0.abs((-5));
        int int96 = basicMethods0.getMin((-34), 8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test018");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((int) '#', 1);
        int int12 = basicMethods0.getMin((-3), 2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test019");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        basicMethods1.incrementNumberAtIndex(intArray25, 0);
        basicMethods0.incrementNumberAtIndex(intArray25, 0);
        int int33 = basicMethods0.abs(0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test020");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray7, 8);
        BasicMethods basicMethods12 = new BasicMethods();
        int int15 = basicMethods12.getMin(0, 100);
        int int17 = basicMethods12.abs(4);
        BasicMethods basicMethods18 = new BasicMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        basicMethods18.addElementToSet(intSet47, (int) (short) 100);
        basicMethods12.addElementToSet(intSet47, (int) '4');
        BasicMethods basicMethods53 = new BasicMethods();
        BasicMethods basicMethods54 = new BasicMethods();
        int[] intArray55 = new int[] {};
        basicMethods54.incrementNumberAtIndex(intArray55, (int) (byte) 1);
        basicMethods53.incrementNumberAtIndex(intArray55, 1);
        basicMethods12.incrementNumberAtIndex(intArray55, 0);
        BasicMethods basicMethods62 = new BasicMethods();
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet91 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        basicMethods62.addElementToSet(intSet91, (int) (short) 100);
        basicMethods12.addElementToSet(intSet91, (int) (short) -1);
        basicMethods0.addElementToSet(intSet91, (int) (short) 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test021");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs((-1));
        int int12 = basicMethods0.getMin(6, 6);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        BasicMethods basicMethods26 = new BasicMethods();
        int int29 = basicMethods26.getMin(0, 0);
        int int31 = basicMethods26.abs((int) (short) 0);
        int[] intArray36 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods26.incrementNumberAtIndex(intArray36, 0);
        basicMethods13.incrementNumberAtIndex(intArray36, 2);
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 100);
        int int46 = basicMethods41.abs(4);
        BasicMethods basicMethods47 = new BasicMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        basicMethods47.addElementToSet(intSet76, (int) (short) 100);
        basicMethods41.addElementToSet(intSet76, (int) '4');
        BasicMethods basicMethods82 = new BasicMethods();
        BasicMethods basicMethods83 = new BasicMethods();
        int[] intArray84 = new int[] {};
        basicMethods83.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        basicMethods82.incrementNumberAtIndex(intArray84, 1);
        basicMethods41.incrementNumberAtIndex(intArray84, 0);
        basicMethods13.incrementNumberAtIndex(intArray84, 5);
        basicMethods0.incrementNumberAtIndex(intArray84, (-9));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test022");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = basicMethods0.getMin((-7), (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test023");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = basicMethods0.abs((int) (short) 100);
        int int34 = basicMethods0.abs((int) (short) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test024");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        BasicMethods basicMethods7 = new BasicMethods();
        BasicMethods basicMethods8 = new BasicMethods();
        int int11 = basicMethods8.getMin(0, 0);
        int int13 = basicMethods8.abs((-2));
        int int16 = basicMethods8.getMin((-1), 2);
        int int19 = basicMethods8.getMin(1, 7);
        int int22 = basicMethods8.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods8.addElementToSet(intSet43, (int) (short) 1);
        basicMethods7.addElementToSet(intSet43, 7);
        basicMethods0.addElementToSet(intSet43, (-100));
        int int53 = basicMethods0.getMin((-9), (-100));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test025");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs((-1));
        int int12 = basicMethods0.getMin(6, 6);
        int int14 = basicMethods0.abs((-19));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test026");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        int int15 = basicMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods1.addElementToSet(intSet36, (int) (short) 1);
        basicMethods0.addElementToSet(intSet36, 7);
        int int43 = basicMethods0.abs((-18));
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 0);
        int int49 = basicMethods44.abs((-2));
        int int52 = basicMethods44.getMin((-1), 2);
        BasicMethods basicMethods53 = new BasicMethods();
        int int56 = basicMethods53.getMin(0, 100);
        int int58 = basicMethods53.abs(4);
        BasicMethods basicMethods59 = new BasicMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        basicMethods59.addElementToSet(intSet88, (int) (short) 100);
        basicMethods53.addElementToSet(intSet88, (int) '4');
        basicMethods44.addElementToSet(intSet88, 8);
        basicMethods0.addElementToSet(intSet88, (-11));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test027");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs(100);
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods10.incrementNumberAtIndex(intArray20, 0);
        BasicMethods basicMethods23 = new BasicMethods();
        int int26 = basicMethods23.getMin(0, 0);
        int int28 = basicMethods23.abs((-2));
        int[] intArray35 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods23.incrementNumberAtIndex(intArray35, 4);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods23.addElementToSet(intSet58, 6);
        basicMethods10.addElementToSet(intSet58, (-100));
        basicMethods6.addElementToSet(intSet58, (int) (short) -1);
        basicMethods0.addElementToSet(intSet58, 3);
        BasicMethods basicMethods68 = new BasicMethods();
        int int71 = basicMethods68.getMin(0, 0);
        int int73 = basicMethods68.abs((int) (short) 0);
        int[] intArray78 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods68.incrementNumberAtIndex(intArray78, 0);
        BasicMethods basicMethods81 = new BasicMethods();
        int int84 = basicMethods81.getMin(0, 0);
        int int86 = basicMethods81.abs((int) (short) 0);
        int[] intArray91 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods81.incrementNumberAtIndex(intArray91, 0);
        basicMethods68.incrementNumberAtIndex(intArray91, 10);
        basicMethods0.incrementNumberAtIndex(intArray91, (int) '#');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test028");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((-67));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test029");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = basicMethods0.getMin((-9), (int) '4');
        int int19 = basicMethods0.abs((int) (short) 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test030");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int int47 = basicMethods39.getMin((-1), 2);
        int int50 = basicMethods39.getMin(1, 7);
        BasicMethods basicMethods51 = new BasicMethods();
        int int54 = basicMethods51.getMin(0, 0);
        int int56 = basicMethods51.abs((-2));
        int[] intArray63 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods51.incrementNumberAtIndex(intArray63, 4);
        basicMethods39.incrementNumberAtIndex(intArray63, 0);
        basicMethods0.incrementNumberAtIndex(intArray63, (int) (byte) 1);
        int int72 = basicMethods0.getMin(0, (-19));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test031");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs((-9));
        int int8 = basicMethods0.getMin((-1), (int) (short) -1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test032");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        BasicMethods basicMethods28 = new BasicMethods();
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int int37 = basicMethods29.getMin((-1), 2);
        int int40 = basicMethods29.getMin(1, 7);
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 0);
        int int46 = basicMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods41.incrementNumberAtIndex(intArray53, 4);
        basicMethods29.incrementNumberAtIndex(intArray53, 0);
        basicMethods28.incrementNumberAtIndex(intArray53, 0);
        basicMethods0.incrementNumberAtIndex(intArray53, (-100));
        int int63 = basicMethods0.abs((-9));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test033");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int9 = basicMethods0.abs((-9));
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((-2));
        int int17 = basicMethods10.abs(0);
        BasicMethods basicMethods18 = new BasicMethods();
        int int21 = basicMethods18.getMin(0, 0);
        int int23 = basicMethods18.abs((-2));
        int int26 = basicMethods18.getMin((-1), 2);
        BasicMethods basicMethods27 = new BasicMethods();
        int int30 = basicMethods27.getMin(0, 100);
        int int32 = basicMethods27.abs(4);
        BasicMethods basicMethods33 = new BasicMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        basicMethods33.addElementToSet(intSet62, (int) (short) 100);
        basicMethods27.addElementToSet(intSet62, (int) '4');
        basicMethods18.addElementToSet(intSet62, 8);
        basicMethods10.addElementToSet(intSet62, 1);
        basicMethods0.addElementToSet(intSet62, 9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test034");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs((-18));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test035");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        int int55 = basicMethods0.abs((-19));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test036");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int int30 = basicMethods0.getMin((-131), (-36));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test037");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int6 = basicMethods0.getMin((-9), 1);
        int int8 = basicMethods0.abs(2);
        BasicMethods basicMethods9 = new BasicMethods();
        BasicMethods basicMethods10 = new BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        basicMethods9.incrementNumberAtIndex(intArray11, 1);
        BasicMethods basicMethods16 = new BasicMethods();
        BasicMethods basicMethods17 = new BasicMethods();
        int int20 = basicMethods17.getMin(0, 0);
        int int22 = basicMethods17.abs((-2));
        int int25 = basicMethods17.getMin((-1), 2);
        int int28 = basicMethods17.getMin(1, 7);
        int int31 = basicMethods17.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        basicMethods17.addElementToSet(intSet52, (int) (short) 1);
        basicMethods16.addElementToSet(intSet52, 7);
        basicMethods9.addElementToSet(intSet52, (-100));
        basicMethods0.addElementToSet(intSet52, (int) '#');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test038");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        BasicMethods basicMethods8 = new BasicMethods();
        int int11 = basicMethods8.getMin(0, 0);
        int int13 = basicMethods8.abs((int) (short) 0);
        int[] intArray19 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods8.incrementNumberAtIndex(intArray19, (-3));
        BasicMethods basicMethods22 = new BasicMethods();
        int int25 = basicMethods22.getMin(0, 0);
        int int27 = basicMethods22.abs((int) (short) 0);
        int[] intArray32 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods22.incrementNumberAtIndex(intArray32, 0);
        BasicMethods basicMethods35 = new BasicMethods();
        int int38 = basicMethods35.getMin(0, 0);
        int int40 = basicMethods35.abs((-2));
        int[] intArray47 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods35.incrementNumberAtIndex(intArray47, 4);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        basicMethods35.addElementToSet(intSet70, 6);
        basicMethods22.addElementToSet(intSet70, (-100));
        basicMethods8.addElementToSet(intSet70, (-5));
        basicMethods0.addElementToSet(intSet70, (int) '#');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test039");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        int int7 = basicMethods0.abs((-5));
        BasicMethods basicMethods8 = new BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray9, 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test040");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int10 = basicMethods0.getMin((-2), 100);
        int int12 = basicMethods0.abs(0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test041");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(6, 10);
        int int14 = basicMethods0.abs((-3));
        int int16 = basicMethods0.abs(7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test042");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        int int45 = basicMethods0.getMin((-19), 100);
        int int47 = basicMethods0.abs((-131));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test043");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        int int7 = basicMethods0.abs(4);
        int int9 = basicMethods0.abs(100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test044");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        int int15 = basicMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods1.addElementToSet(intSet36, (int) (short) 1);
        basicMethods0.addElementToSet(intSet36, 7);
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((-2));
        int int50 = basicMethods42.getMin((-1), 2);
        BasicMethods basicMethods51 = new BasicMethods();
        int int54 = basicMethods51.getMin(0, 100);
        int int56 = basicMethods51.abs(4);
        BasicMethods basicMethods57 = new BasicMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        basicMethods57.addElementToSet(intSet86, (int) (short) 100);
        basicMethods51.addElementToSet(intSet86, (int) '4');
        basicMethods42.addElementToSet(intSet86, 8);
        basicMethods0.addElementToSet(intSet86, (-34));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test045");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((int) '#', 1);
        int int12 = basicMethods0.getMin(6, 0);
        int int14 = basicMethods0.abs((int) '4');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test046");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        int int59 = basicMethods0.getMin((-3), 1);
        int int62 = basicMethods0.getMin((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test047");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int int29 = basicMethods0.abs((int) (short) 10);
        int int32 = basicMethods0.getMin(3, 4);
        int int34 = basicMethods0.abs((-4));
        BasicMethods basicMethods35 = new BasicMethods();
        int[] intArray36 = new int[] {};
        basicMethods35.incrementNumberAtIndex(intArray36, (int) (byte) 1);
        int int40 = basicMethods35.abs((int) ' ');
        BasicMethods basicMethods41 = new BasicMethods();
        int[] intArray42 = new int[] {};
        basicMethods41.incrementNumberAtIndex(intArray42, (int) (byte) 1);
        BasicMethods basicMethods45 = new BasicMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        basicMethods45.addElementToSet(intSet74, (int) (short) 100);
        basicMethods41.addElementToSet(intSet74, (int) (short) -1);
        BasicMethods basicMethods80 = new BasicMethods();
        int int83 = basicMethods80.getMin(0, 0);
        int int85 = basicMethods80.abs((int) (short) 0);
        int[] intArray90 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods80.incrementNumberAtIndex(intArray90, 0);
        basicMethods41.incrementNumberAtIndex(intArray90, (-1));
        basicMethods35.incrementNumberAtIndex(intArray90, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray90, (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test048");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(6, 10);
        int int14 = basicMethods0.abs((-3));
        BasicMethods basicMethods15 = new BasicMethods();
        int int18 = basicMethods15.getMin(0, 0);
        int int20 = basicMethods15.abs((-2));
        int[] intArray27 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods15.incrementNumberAtIndex(intArray27, 4);
        basicMethods0.incrementNumberAtIndex(intArray27, 1);
        int int33 = basicMethods0.abs(0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test049");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        int int45 = basicMethods0.getMin((-19), 100);
        int int48 = basicMethods0.getMin((-5), 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test050");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = basicMethods0.abs((-1));
        BasicMethods basicMethods33 = new BasicMethods();
        BasicMethods basicMethods34 = new BasicMethods();
        BasicMethods basicMethods35 = new BasicMethods();
        int[] intArray36 = new int[] {};
        basicMethods35.incrementNumberAtIndex(intArray36, (int) (byte) 1);
        basicMethods34.incrementNumberAtIndex(intArray36, 1);
        int int43 = basicMethods34.getMin((-100), 9);
        int int46 = basicMethods34.getMin(6, 10);
        int int48 = basicMethods34.abs((-3));
        BasicMethods basicMethods49 = new BasicMethods();
        int int52 = basicMethods49.getMin(0, 0);
        int int54 = basicMethods49.abs((-2));
        int[] intArray61 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods49.incrementNumberAtIndex(intArray61, 4);
        basicMethods34.incrementNumberAtIndex(intArray61, 1);
        basicMethods33.incrementNumberAtIndex(intArray61, 5);
        basicMethods0.incrementNumberAtIndex(intArray61, (int) (byte) 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test051");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int13 = basicMethods0.abs(9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test052");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        BasicMethods basicMethods8 = new BasicMethods();
        int int11 = basicMethods8.getMin(0, 0);
        int int13 = basicMethods8.abs((-2));
        int int16 = basicMethods8.getMin((-1), 2);
        BasicMethods basicMethods17 = new BasicMethods();
        int int20 = basicMethods17.getMin(0, 100);
        int int22 = basicMethods17.abs(4);
        BasicMethods basicMethods23 = new BasicMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        basicMethods23.addElementToSet(intSet52, (int) (short) 100);
        basicMethods17.addElementToSet(intSet52, (int) '4');
        basicMethods8.addElementToSet(intSet52, 8);
        basicMethods0.addElementToSet(intSet52, 1);
        int int64 = basicMethods0.getMin((-35), 4);
        int int67 = basicMethods0.getMin(100, (-35));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test053");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        int int14 = basicMethods0.abs((int) 'a');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test054");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 10);
        int int29 = basicMethods0.abs((-67));
        int[] intArray30 = null;
        basicMethods0.incrementNumberAtIndex(intArray30, (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test055");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        int int55 = basicMethods0.abs(5);
        int int58 = basicMethods0.getMin((int) (byte) 10, 8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test056");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        int int15 = basicMethods0.getMin((-34), 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test057");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = basicMethods0.getMin((int) (byte) 100, 0);
        int int75 = basicMethods0.getMin((-1), (-3));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test058");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(0, (-1));
        BasicMethods basicMethods12 = new BasicMethods();
        int int15 = basicMethods12.getMin(0, 0);
        int int17 = basicMethods12.abs((-2));
        int int20 = basicMethods12.getMin((-1), 2);
        int int23 = basicMethods12.getMin(0, (-1));
        int int26 = basicMethods12.getMin((int) 'a', (-5));
        BasicMethods basicMethods27 = new BasicMethods();
        int[] intArray28 = new int[] {};
        basicMethods27.incrementNumberAtIndex(intArray28, (int) (byte) 1);
        BasicMethods basicMethods31 = new BasicMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        basicMethods31.addElementToSet(intSet60, (int) (short) 100);
        basicMethods27.addElementToSet(intSet60, (int) (short) -1);
        basicMethods12.addElementToSet(intSet60, (-10));
        basicMethods0.addElementToSet(intSet60, (-7));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test059");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs((int) '4');
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test060");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int9 = basicMethods0.abs((-9));
        int int12 = basicMethods0.getMin(5, 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test061");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), (-5));
        int int10 = basicMethods0.abs((-20));
        int int13 = basicMethods0.getMin(100, 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test062");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int8 = basicMethods0.getMin((-35), (-19));
        int int11 = basicMethods0.getMin(8, (-9));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test063");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        BasicMethods basicMethods28 = new BasicMethods();
        BasicMethods basicMethods29 = new BasicMethods();
        int[] intArray30 = new int[] {};
        basicMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        basicMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = basicMethods28.getMin((int) '#', 1);
        int int40 = basicMethods28.getMin(6, 0);
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((-2));
        int int50 = basicMethods42.getMin((-1), 2);
        int int53 = basicMethods42.getMin(1, 7);
        int int56 = basicMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods42.addElementToSet(intSet77, (int) (short) 1);
        basicMethods41.addElementToSet(intSet77, 7);
        basicMethods28.addElementToSet(intSet77, 0);
        basicMethods0.addElementToSet(intSet77, (-34));
        int int88 = basicMethods0.abs((-31));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test064");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        int int55 = basicMethods0.abs(5);
        int[] intArray61 = new int[] { (-1), (byte) -1, 0, (-67), 9 };
        basicMethods0.incrementNumberAtIndex(intArray61, 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test065");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs((-1));
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods10.incrementNumberAtIndex(intArray20, 0);
        BasicMethods basicMethods23 = new BasicMethods();
        int int26 = basicMethods23.getMin(0, 0);
        int int28 = basicMethods23.abs((int) (short) 0);
        int[] intArray33 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods23.incrementNumberAtIndex(intArray33, 0);
        basicMethods10.incrementNumberAtIndex(intArray33, 2);
        BasicMethods basicMethods38 = new BasicMethods();
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods38.incrementNumberAtIndex(intArray40, 1);
        int int47 = basicMethods38.getMin((int) '#', 1);
        int int50 = basicMethods38.getMin(6, 0);
        BasicMethods basicMethods51 = new BasicMethods();
        BasicMethods basicMethods52 = new BasicMethods();
        int int55 = basicMethods52.getMin(0, 0);
        int int57 = basicMethods52.abs((-2));
        int int60 = basicMethods52.getMin((-1), 2);
        int int63 = basicMethods52.getMin(1, 7);
        int int66 = basicMethods52.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        basicMethods52.addElementToSet(intSet87, (int) (short) 1);
        basicMethods51.addElementToSet(intSet87, 7);
        basicMethods38.addElementToSet(intSet87, 0);
        basicMethods10.addElementToSet(intSet87, (-34));
        basicMethods0.addElementToSet(intSet87, (-36));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test066");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 10);
        int int29 = basicMethods0.abs((-67));
        int int31 = basicMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test067");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        BasicMethods basicMethods7 = new BasicMethods();
        BasicMethods basicMethods8 = new BasicMethods();
        int int11 = basicMethods8.getMin(0, 100);
        int int13 = basicMethods8.abs(4);
        BasicMethods basicMethods14 = new BasicMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods14.addElementToSet(intSet43, (int) (short) 100);
        basicMethods8.addElementToSet(intSet43, (int) '4');
        BasicMethods basicMethods49 = new BasicMethods();
        BasicMethods basicMethods50 = new BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, (int) (byte) 1);
        basicMethods49.incrementNumberAtIndex(intArray51, 1);
        basicMethods8.incrementNumberAtIndex(intArray51, 0);
        basicMethods7.incrementNumberAtIndex(intArray51, (-1));
        basicMethods0.incrementNumberAtIndex(intArray51, 10);
        int int63 = basicMethods0.abs(8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test068");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test069");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), (-5));
        int int10 = basicMethods0.abs((-6));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test070");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray7, 8);
        int int14 = basicMethods0.getMin(8, (-131));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test071");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = basicMethods0.abs((-1));
        BasicMethods basicMethods33 = new BasicMethods();
        int int36 = basicMethods33.getMin(0, 100);
        int int38 = basicMethods33.abs(4);
        BasicMethods basicMethods39 = new BasicMethods();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        basicMethods39.addElementToSet(intSet68, (int) (short) 100);
        basicMethods33.addElementToSet(intSet68, (int) '4');
        BasicMethods basicMethods74 = new BasicMethods();
        BasicMethods basicMethods75 = new BasicMethods();
        int[] intArray76 = new int[] {};
        basicMethods75.incrementNumberAtIndex(intArray76, (int) (byte) 1);
        basicMethods74.incrementNumberAtIndex(intArray76, 1);
        basicMethods33.incrementNumberAtIndex(intArray76, 0);
        basicMethods0.incrementNumberAtIndex(intArray76, 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test072");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs((-9));
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods10.incrementNumberAtIndex(intArray20, 0);
        BasicMethods basicMethods23 = new BasicMethods();
        int int26 = basicMethods23.getMin(0, 0);
        int int28 = basicMethods23.abs((-2));
        int[] intArray35 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods23.incrementNumberAtIndex(intArray35, 4);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods23.addElementToSet(intSet58, 6);
        basicMethods10.addElementToSet(intSet58, (-100));
        basicMethods6.addElementToSet(intSet58, (int) (short) -1);
        basicMethods0.addElementToSet(intSet58, (-11));
        int int69 = basicMethods0.abs((int) (short) 1);
        int int71 = basicMethods0.abs(3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test073");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 100);
        int int11 = basicMethods6.abs(4);
        BasicMethods basicMethods12 = new BasicMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        basicMethods12.addElementToSet(intSet41, (int) (short) 100);
        basicMethods6.addElementToSet(intSet41, (int) '4');
        basicMethods0.addElementToSet(intSet41, 9);
        BasicMethods basicMethods49 = new BasicMethods();
        int int52 = basicMethods49.getMin(0, 0);
        int int54 = basicMethods49.abs((int) (short) 0);
        int[] intArray59 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods49.incrementNumberAtIndex(intArray59, 0);
        basicMethods0.incrementNumberAtIndex(intArray59, (-259));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test074");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int43 = basicMethods0.getMin((-9), 0);
        int int45 = basicMethods0.abs((-131));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test075");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-9), (int) (byte) 1);
        int int11 = basicMethods0.abs((-11));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test076");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        int int15 = basicMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods1.addElementToSet(intSet36, (int) (short) 1);
        basicMethods0.addElementToSet(intSet36, 7);
        int int43 = basicMethods0.abs((-18));
        int int46 = basicMethods0.getMin((-5), (-36));
        int int49 = basicMethods0.getMin((-11), (int) (short) 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test077");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((int) '#', 1);
        int int12 = basicMethods0.getMin(6, 0);
        int int15 = basicMethods0.getMin((-259), (-131));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test078");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        BasicMethods basicMethods28 = new BasicMethods();
        BasicMethods basicMethods29 = new BasicMethods();
        int[] intArray30 = new int[] {};
        basicMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        basicMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = basicMethods28.getMin((int) '#', 1);
        int int40 = basicMethods28.getMin(6, 0);
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((-2));
        int int50 = basicMethods42.getMin((-1), 2);
        int int53 = basicMethods42.getMin(1, 7);
        int int56 = basicMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods42.addElementToSet(intSet77, (int) (short) 1);
        basicMethods41.addElementToSet(intSet77, 7);
        basicMethods28.addElementToSet(intSet77, 0);
        basicMethods0.addElementToSet(intSet77, (-34));
        int int89 = basicMethods0.getMin(1, (int) (short) 0);
        int int91 = basicMethods0.abs((-131));
        int int94 = basicMethods0.getMin((-100), (int) (short) 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test079");
        BasicMethods basicMethods0 = new BasicMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        basicMethods0.addElementToSet(intSet29, (int) (short) 100);
        int int35 = basicMethods0.getMin(6, (-8));
        BasicMethods basicMethods36 = new BasicMethods();
        int int39 = basicMethods36.getMin(0, 0);
        int int41 = basicMethods36.abs((int) (short) 0);
        int[] intArray46 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods36.incrementNumberAtIndex(intArray46, 0);
        BasicMethods basicMethods49 = new BasicMethods();
        int int52 = basicMethods49.getMin(0, 0);
        int int54 = basicMethods49.abs((int) (short) 0);
        int[] intArray59 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods49.incrementNumberAtIndex(intArray59, 0);
        basicMethods36.incrementNumberAtIndex(intArray59, 10);
        basicMethods0.incrementNumberAtIndex(intArray59, 3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test080");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        int int45 = basicMethods0.getMin((-19), 100);
        int int47 = basicMethods0.abs(9);
        int int49 = basicMethods0.abs(100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test081");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int int30 = basicMethods0.getMin(100, 10);
        BasicMethods basicMethods31 = new BasicMethods();
        BasicMethods basicMethods32 = new BasicMethods();
        int int35 = basicMethods32.getMin(0, 0);
        int int37 = basicMethods32.abs((-2));
        int int40 = basicMethods32.getMin((-1), 2);
        int int43 = basicMethods32.getMin(1, 7);
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 0);
        int int49 = basicMethods44.abs((-2));
        int[] intArray56 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods44.incrementNumberAtIndex(intArray56, 4);
        basicMethods32.incrementNumberAtIndex(intArray56, 0);
        basicMethods31.incrementNumberAtIndex(intArray56, 0);
        basicMethods0.incrementNumberAtIndex(intArray56, (int) '4');
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test082");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        BasicMethods basicMethods43 = new BasicMethods();
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 100);
        int int49 = basicMethods44.abs(4);
        BasicMethods basicMethods50 = new BasicMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        basicMethods50.addElementToSet(intSet79, (int) (short) 100);
        basicMethods44.addElementToSet(intSet79, (int) '4');
        BasicMethods basicMethods85 = new BasicMethods();
        BasicMethods basicMethods86 = new BasicMethods();
        int[] intArray87 = new int[] {};
        basicMethods86.incrementNumberAtIndex(intArray87, (int) (byte) 1);
        basicMethods85.incrementNumberAtIndex(intArray87, 1);
        basicMethods44.incrementNumberAtIndex(intArray87, 0);
        basicMethods43.incrementNumberAtIndex(intArray87, (-1));
        basicMethods0.incrementNumberAtIndex(intArray87, (int) (byte) 100);
        int int99 = basicMethods0.abs((-5));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test083");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int43 = basicMethods0.getMin((-9), 0);
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 0);
        int int49 = basicMethods44.abs((int) (short) 0);
        int int51 = basicMethods44.abs((-1));
        int int54 = basicMethods44.getMin((-8), 100);
        int int57 = basicMethods44.getMin((-35), (int) 'a');
        BasicMethods basicMethods58 = new BasicMethods();
        int int61 = basicMethods58.getMin(0, 0);
        int int63 = basicMethods58.abs((int) (short) 0);
        int[] intArray68 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods58.incrementNumberAtIndex(intArray68, 0);
        BasicMethods basicMethods71 = new BasicMethods();
        int int74 = basicMethods71.getMin(0, 0);
        int int76 = basicMethods71.abs((int) (short) 0);
        int[] intArray81 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods71.incrementNumberAtIndex(intArray81, 0);
        basicMethods58.incrementNumberAtIndex(intArray81, 2);
        int[] intArray86 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray86, 7);
        basicMethods44.incrementNumberAtIndex(intArray86, (-19));
        basicMethods0.incrementNumberAtIndex(intArray86, 1);
        int int94 = basicMethods0.abs((-3));
        int int96 = basicMethods0.abs((-9));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test084");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        BasicMethods basicMethods9 = new BasicMethods();
        int int12 = basicMethods9.getMin(0, 100);
        int int14 = basicMethods9.abs(4);
        BasicMethods basicMethods15 = new BasicMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        basicMethods15.addElementToSet(intSet44, (int) (short) 100);
        basicMethods9.addElementToSet(intSet44, (int) '4');
        basicMethods0.addElementToSet(intSet44, 8);
        int int53 = basicMethods0.abs((-3));
        int int55 = basicMethods0.abs((-35));
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        basicMethods0.addElementToSet(intSet56, (-100));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test085");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int43 = basicMethods0.getMin((-9), 0);
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 100);
        int int49 = basicMethods44.abs(4);
        BasicMethods basicMethods50 = new BasicMethods();
        int int53 = basicMethods50.getMin(0, 100);
        int int55 = basicMethods50.abs(4);
        BasicMethods basicMethods56 = new BasicMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        basicMethods56.addElementToSet(intSet85, (int) (short) 100);
        basicMethods50.addElementToSet(intSet85, (int) '4');
        basicMethods44.addElementToSet(intSet85, 9);
        basicMethods0.addElementToSet(intSet85, (-131));
        int int97 = basicMethods0.getMin((-132), (-36));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test086");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        int int16 = basicMethods0.getMin(100, (-31));
        BasicMethods basicMethods17 = new BasicMethods();
        int[] intArray18 = new int[] {};
        basicMethods17.incrementNumberAtIndex(intArray18, (int) (byte) 1);
        int int22 = basicMethods17.abs(8);
        int int25 = basicMethods17.getMin((int) (byte) -1, 100);
        BasicMethods basicMethods26 = new BasicMethods();
        int int29 = basicMethods26.getMin(0, 0);
        int int31 = basicMethods26.abs((int) (short) 0);
        int[] intArray36 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods26.incrementNumberAtIndex(intArray36, 0);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((int) (short) 0);
        int[] intArray49 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods39.incrementNumberAtIndex(intArray49, 0);
        basicMethods26.incrementNumberAtIndex(intArray49, 2);
        BasicMethods basicMethods54 = new BasicMethods();
        BasicMethods basicMethods55 = new BasicMethods();
        int int58 = basicMethods55.getMin(0, 0);
        int int60 = basicMethods55.abs((-2));
        int int63 = basicMethods55.getMin((-1), 2);
        int int66 = basicMethods55.getMin(1, 7);
        BasicMethods basicMethods67 = new BasicMethods();
        int int70 = basicMethods67.getMin(0, 0);
        int int72 = basicMethods67.abs((-2));
        int[] intArray79 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods67.incrementNumberAtIndex(intArray79, 4);
        basicMethods55.incrementNumberAtIndex(intArray79, 0);
        basicMethods54.incrementNumberAtIndex(intArray79, 0);
        basicMethods26.incrementNumberAtIndex(intArray79, (-100));
        basicMethods17.incrementNumberAtIndex(intArray79, (-34));
        basicMethods0.incrementNumberAtIndex(intArray79, (-6));
        int int94 = basicMethods0.getMin((-8), 5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test087");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-18), 0);
        BasicMethods basicMethods15 = new BasicMethods();
        int int18 = basicMethods15.getMin(0, 0);
        int int20 = basicMethods15.abs((-2));
        int int23 = basicMethods15.getMin((-1), 2);
        int int26 = basicMethods15.getMin(1, 7);
        int int29 = basicMethods15.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        basicMethods15.addElementToSet(intSet50, (int) (short) 1);
        BasicMethods basicMethods54 = new BasicMethods();
        int[] intArray55 = new int[] {};
        basicMethods54.incrementNumberAtIndex(intArray55, (int) (byte) 1);
        basicMethods15.incrementNumberAtIndex(intArray55, 1);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        basicMethods15.addElementToSet(intSet68, 7);
        BasicMethods basicMethods72 = new BasicMethods();
        BasicMethods basicMethods73 = new BasicMethods();
        int[] intArray74 = new int[] {};
        basicMethods73.incrementNumberAtIndex(intArray74, (int) (byte) 1);
        basicMethods72.incrementNumberAtIndex(intArray74, 1);
        basicMethods15.incrementNumberAtIndex(intArray74, 100);
        basicMethods0.incrementNumberAtIndex(intArray74, (int) (byte) 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test088");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        int int16 = basicMethods0.abs((int) (short) 1);
        int int18 = basicMethods0.abs((-1));
        int int20 = basicMethods0.abs(6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test089");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 10);
        BasicMethods basicMethods28 = new BasicMethods();
        int int31 = basicMethods28.getMin(0, 0);
        int int33 = basicMethods28.abs((-2));
        int int36 = basicMethods28.getMin((-1), 2);
        int int39 = basicMethods28.getMin(0, (-1));
        int int42 = basicMethods28.getMin((int) 'a', (-5));
        BasicMethods basicMethods43 = new BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        BasicMethods basicMethods47 = new BasicMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        basicMethods47.addElementToSet(intSet76, (int) (short) 100);
        basicMethods43.addElementToSet(intSet76, (int) (short) -1);
        basicMethods28.addElementToSet(intSet76, (-10));
        basicMethods0.addElementToSet(intSet76, (int) '#');
        int int87 = basicMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test090");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int int29 = basicMethods0.abs((int) (short) 10);
        int int31 = basicMethods0.abs(1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test091");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        int int15 = basicMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods1.addElementToSet(intSet36, (int) (short) 1);
        basicMethods0.addElementToSet(intSet36, 7);
        int int43 = basicMethods0.abs((-18));
        int int46 = basicMethods0.getMin(1, 5);
        int int49 = basicMethods0.getMin((int) '#', (-259));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test092");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = basicMethods0.abs(9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test093");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(6, 10);
        int int15 = basicMethods0.getMin((int) (byte) 10, 7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test094");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 0);
        int int46 = basicMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods41.incrementNumberAtIndex(intArray53, 4);
        basicMethods0.incrementNumberAtIndex(intArray53, 10);
        int int60 = basicMethods0.getMin((int) (byte) 0, (-3));
        int int62 = basicMethods0.abs((-11));
        int int65 = basicMethods0.getMin((-132), (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test095");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int8 = basicMethods0.getMin((-35), (-19));
        int int11 = basicMethods0.getMin((-1), (-67));
        BasicMethods basicMethods12 = new BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        int int17 = basicMethods12.abs(8);
        int int20 = basicMethods12.getMin((int) (byte) -1, 100);
        BasicMethods basicMethods21 = new BasicMethods();
        int int24 = basicMethods21.getMin(0, 0);
        int int26 = basicMethods21.abs((-2));
        int int29 = basicMethods21.getMin((-1), 2);
        BasicMethods basicMethods30 = new BasicMethods();
        int int33 = basicMethods30.getMin(0, 100);
        int int35 = basicMethods30.abs(4);
        BasicMethods basicMethods36 = new BasicMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        basicMethods36.addElementToSet(intSet65, (int) (short) 100);
        basicMethods30.addElementToSet(intSet65, (int) '4');
        basicMethods21.addElementToSet(intSet65, 8);
        basicMethods12.addElementToSet(intSet65, 10);
        basicMethods0.addElementToSet(intSet65, (int) (short) -1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test096");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        basicMethods41.incrementNumberAtIndex(intArray43, 1);
        basicMethods0.incrementNumberAtIndex(intArray43, 0);
        BasicMethods basicMethods50 = new BasicMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        basicMethods50.addElementToSet(intSet79, (int) (short) 100);
        basicMethods0.addElementToSet(intSet79, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        basicMethods0.addElementToSet(intSet85, (int) (byte) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test097");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = basicMethods0.getMin((int) (byte) 100, 0);
        int int75 = basicMethods0.getMin((-7), 5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test098");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        int int55 = basicMethods0.abs(5);
        int int57 = basicMethods0.abs((-100));
        int int59 = basicMethods0.abs(0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test099");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = basicMethods0.abs((-1));
        BasicMethods basicMethods33 = new BasicMethods();
        int[] intArray34 = new int[] {};
        basicMethods33.incrementNumberAtIndex(intArray34, (int) (byte) 1);
        BasicMethods basicMethods37 = new BasicMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods37.addElementToSet(intSet66, (int) (short) 100);
        basicMethods33.addElementToSet(intSet66, (int) (short) -1);
        BasicMethods basicMethods72 = new BasicMethods();
        int int75 = basicMethods72.getMin(0, 0);
        int int77 = basicMethods72.abs((int) (short) 0);
        int[] intArray82 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods72.incrementNumberAtIndex(intArray82, 0);
        basicMethods33.incrementNumberAtIndex(intArray82, (-1));
        basicMethods0.incrementNumberAtIndex(intArray82, (-100));
        int int90 = basicMethods0.abs((-67));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test100");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 10);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        basicMethods0.addElementToSet(intSet28, 100);
        int int33 = basicMethods0.getMin((int) (byte) 1, (-8));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test101");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        BasicMethods basicMethods2 = new BasicMethods();
        int[] intArray3 = new int[] {};
        basicMethods2.incrementNumberAtIndex(intArray3, (int) (byte) 1);
        basicMethods1.incrementNumberAtIndex(intArray3, 1);
        int int10 = basicMethods1.getMin((-100), 9);
        int int13 = basicMethods1.getMin(6, 10);
        int int15 = basicMethods1.abs((-3));
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((-2));
        int[] intArray28 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods16.incrementNumberAtIndex(intArray28, 4);
        basicMethods1.incrementNumberAtIndex(intArray28, 1);
        basicMethods0.incrementNumberAtIndex(intArray28, 5);
        int int36 = basicMethods0.abs((int) 'a');
        BasicMethods basicMethods37 = new BasicMethods();
        int[] intArray38 = new int[] {};
        basicMethods37.incrementNumberAtIndex(intArray38, (int) (byte) 1);
        BasicMethods basicMethods41 = new BasicMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        basicMethods41.addElementToSet(intSet70, (int) (short) 100);
        basicMethods37.addElementToSet(intSet70, (int) (short) -1);
        basicMethods0.addElementToSet(intSet70, (int) ' ');
        int int79 = basicMethods0.abs(10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test102");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int42 = basicMethods0.abs((-4));
        int int45 = basicMethods0.getMin(100, 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test103");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int10 = basicMethods0.abs(0);
        int int12 = basicMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test104");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-3));
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 100);
        int int11 = basicMethods6.abs((-9));
        BasicMethods basicMethods12 = new BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods16.incrementNumberAtIndex(intArray26, 0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods29.addElementToSet(intSet64, 6);
        basicMethods16.addElementToSet(intSet64, (-100));
        basicMethods12.addElementToSet(intSet64, (int) (short) -1);
        basicMethods6.addElementToSet(intSet64, (-11));
        basicMethods0.addElementToSet(intSet64, (-3));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test105");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-1), (int) (short) 100);
        int int11 = basicMethods0.abs(8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test106");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int42 = basicMethods0.abs((-8));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test107");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        BasicMethods basicMethods57 = new BasicMethods();
        BasicMethods basicMethods58 = new BasicMethods();
        int[] intArray59 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray59, (int) (byte) 1);
        basicMethods57.incrementNumberAtIndex(intArray59, 1);
        basicMethods0.incrementNumberAtIndex(intArray59, 100);
        int int67 = basicMethods0.abs((-35));
        int int70 = basicMethods0.getMin((-4), 4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test108");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        BasicMethods basicMethods8 = new BasicMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        basicMethods8.addElementToSet(intSet37, (int) (short) 100);
        int int42 = basicMethods8.abs((-8));
        BasicMethods basicMethods43 = new BasicMethods();
        BasicMethods basicMethods44 = new BasicMethods();
        int int47 = basicMethods44.getMin(0, 0);
        int int49 = basicMethods44.abs((-2));
        int int52 = basicMethods44.getMin((-1), 2);
        int int55 = basicMethods44.getMin(1, 7);
        int int58 = basicMethods44.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        basicMethods44.addElementToSet(intSet79, (int) (short) 1);
        basicMethods43.addElementToSet(intSet79, 7);
        basicMethods8.addElementToSet(intSet79, 9);
        basicMethods0.addElementToSet(intSet79, 9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test109");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        BasicMethods basicMethods9 = new BasicMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        basicMethods9.addElementToSet(intSet38, (int) (short) 100);
        int int43 = basicMethods9.abs((-8));
        BasicMethods basicMethods44 = new BasicMethods();
        BasicMethods basicMethods45 = new BasicMethods();
        int int48 = basicMethods45.getMin(0, 0);
        int int50 = basicMethods45.abs((-2));
        int int53 = basicMethods45.getMin((-1), 2);
        int int56 = basicMethods45.getMin(1, 7);
        int int59 = basicMethods45.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        basicMethods45.addElementToSet(intSet80, (int) (short) 1);
        basicMethods44.addElementToSet(intSet80, 7);
        basicMethods9.addElementToSet(intSet80, 9);
        basicMethods0.addElementToSet(intSet80, 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test110");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int6 = basicMethods0.getMin((-9), 1);
        int int8 = basicMethods0.abs(2);
        int int11 = basicMethods0.getMin((int) (short) -1, (int) (short) 100);
        BasicMethods basicMethods12 = new BasicMethods();
        int int15 = basicMethods12.getMin(0, 0);
        int int17 = basicMethods12.abs((int) (short) 0);
        int[] intArray22 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods12.incrementNumberAtIndex(intArray22, 0);
        BasicMethods basicMethods25 = new BasicMethods();
        int int28 = basicMethods25.getMin(0, 0);
        int int30 = basicMethods25.abs((int) (short) 0);
        int[] intArray35 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods25.incrementNumberAtIndex(intArray35, 0);
        basicMethods12.incrementNumberAtIndex(intArray35, 2);
        int[] intArray40 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray40, 7);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (short) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test111");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        int int16 = basicMethods0.getMin((-3), (int) '#');
        int int18 = basicMethods0.abs((-8));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test112");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs((int) (short) 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test113");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs(8);
        int int8 = basicMethods0.getMin((int) (byte) -1, 100);
        BasicMethods basicMethods9 = new BasicMethods();
        int int12 = basicMethods9.getMin(0, 0);
        int int14 = basicMethods9.abs((-2));
        int int17 = basicMethods9.getMin((-1), 2);
        BasicMethods basicMethods18 = new BasicMethods();
        int int21 = basicMethods18.getMin(0, 100);
        int int23 = basicMethods18.abs(4);
        BasicMethods basicMethods24 = new BasicMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods24.addElementToSet(intSet53, (int) (short) 100);
        basicMethods18.addElementToSet(intSet53, (int) '4');
        basicMethods9.addElementToSet(intSet53, 8);
        basicMethods0.addElementToSet(intSet53, 10);
        java.util.HashSet<java.lang.Integer> intSet63 = null;
        basicMethods0.addElementToSet(intSet63, 9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test114");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 0);
        int int11 = basicMethods6.abs(100);
        BasicMethods basicMethods12 = new BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods16.incrementNumberAtIndex(intArray26, 0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods29.addElementToSet(intSet64, 6);
        basicMethods16.addElementToSet(intSet64, (-100));
        basicMethods12.addElementToSet(intSet64, (int) (short) -1);
        basicMethods6.addElementToSet(intSet64, 3);
        basicMethods0.addElementToSet(intSet64, 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test115");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int9 = basicMethods0.abs((-32));
        int int12 = basicMethods0.getMin((-34), 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test116");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = basicMethods0.getMin((-9), (int) '4');
        int int19 = basicMethods0.abs((int) '#');
        BasicMethods basicMethods20 = new BasicMethods();
        int int23 = basicMethods20.getMin(0, 0);
        int int25 = basicMethods20.abs((-2));
        int int27 = basicMethods20.abs(0);
        BasicMethods basicMethods28 = new BasicMethods();
        int int31 = basicMethods28.getMin(0, 0);
        int int33 = basicMethods28.abs((-2));
        int int36 = basicMethods28.getMin((-1), 2);
        BasicMethods basicMethods37 = new BasicMethods();
        int int40 = basicMethods37.getMin(0, 100);
        int int42 = basicMethods37.abs(4);
        BasicMethods basicMethods43 = new BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods43.addElementToSet(intSet72, (int) (short) 100);
        basicMethods37.addElementToSet(intSet72, (int) '4');
        basicMethods28.addElementToSet(intSet72, 8);
        basicMethods20.addElementToSet(intSet72, 1);
        basicMethods0.addElementToSet(intSet72, 10);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        basicMethods0.addElementToSet(intSet84, (-19));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test117");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((int) '#', 1);
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods10.incrementNumberAtIndex(intArray20, 0);
        BasicMethods basicMethods23 = new BasicMethods();
        BasicMethods basicMethods24 = new BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, (int) (byte) 1);
        basicMethods23.incrementNumberAtIndex(intArray25, 1);
        BasicMethods basicMethods30 = new BasicMethods();
        int int33 = basicMethods30.getMin(0, 0);
        int int35 = basicMethods30.abs((-2));
        int[] intArray42 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods30.incrementNumberAtIndex(intArray42, 4);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        basicMethods30.addElementToSet(intSet65, 6);
        basicMethods23.addElementToSet(intSet65, (-3));
        basicMethods10.addElementToSet(intSet65, 100);
        basicMethods0.addElementToSet(intSet65, (-67));
        int int76 = basicMethods0.abs(7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test118");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        BasicMethods basicMethods15 = new BasicMethods();
        int[] intArray16 = new int[] {};
        basicMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        basicMethods14.incrementNumberAtIndex(intArray16, 1);
        BasicMethods basicMethods21 = new BasicMethods();
        BasicMethods basicMethods22 = new BasicMethods();
        int int25 = basicMethods22.getMin(0, 100);
        int int27 = basicMethods22.abs(4);
        BasicMethods basicMethods28 = new BasicMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        basicMethods28.addElementToSet(intSet57, (int) (short) 100);
        basicMethods22.addElementToSet(intSet57, (int) '4');
        BasicMethods basicMethods63 = new BasicMethods();
        BasicMethods basicMethods64 = new BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        basicMethods63.incrementNumberAtIndex(intArray65, 1);
        basicMethods22.incrementNumberAtIndex(intArray65, 0);
        basicMethods21.incrementNumberAtIndex(intArray65, (-1));
        basicMethods14.incrementNumberAtIndex(intArray65, 10);
        basicMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        basicMethods0.addElementToSet(intSet80, (int) (byte) -1);
        int int85 = basicMethods0.abs(0);
        int int87 = basicMethods0.abs(1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test119");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 100);
        int int11 = basicMethods6.abs(4);
        BasicMethods basicMethods12 = new BasicMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        basicMethods12.addElementToSet(intSet41, (int) (short) 100);
        basicMethods6.addElementToSet(intSet41, (int) '4');
        basicMethods0.addElementToSet(intSet41, 9);
        BasicMethods basicMethods49 = new BasicMethods();
        int int52 = basicMethods49.getMin(0, 100);
        int int54 = basicMethods49.abs(4);
        BasicMethods basicMethods55 = new BasicMethods();
        int int58 = basicMethods55.getMin(0, 100);
        int int60 = basicMethods55.abs(4);
        BasicMethods basicMethods61 = new BasicMethods();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        basicMethods61.addElementToSet(intSet90, (int) (short) 100);
        basicMethods55.addElementToSet(intSet90, (int) '4');
        basicMethods49.addElementToSet(intSet90, 9);
        basicMethods0.addElementToSet(intSet90, (int) (byte) 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test120");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs(9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test121");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((int) '#', 1);
        int int11 = basicMethods0.abs(2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test122");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int6 = basicMethods0.getMin((-9), 1);
        int int8 = basicMethods0.abs(2);
        int int11 = basicMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int14 = basicMethods0.getMin(100, (int) (short) 10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test123");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        int int45 = basicMethods0.getMin((-19), 100);
        int int47 = basicMethods0.abs(4);
        BasicMethods basicMethods48 = new BasicMethods();
        BasicMethods basicMethods49 = new BasicMethods();
        int int52 = basicMethods49.getMin(0, 0);
        int int54 = basicMethods49.abs((-2));
        int int57 = basicMethods49.getMin((-1), 2);
        int int60 = basicMethods49.getMin(1, 7);
        int int63 = basicMethods49.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        basicMethods49.addElementToSet(intSet84, (int) (short) 1);
        basicMethods48.addElementToSet(intSet84, 7);
        basicMethods0.addElementToSet(intSet84, (int) (short) 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test124");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        BasicMethods basicMethods4 = new BasicMethods();
        BasicMethods basicMethods5 = new BasicMethods();
        int[] intArray6 = new int[] {};
        basicMethods5.incrementNumberAtIndex(intArray6, (int) (byte) 1);
        basicMethods4.incrementNumberAtIndex(intArray6, 1);
        int int13 = basicMethods4.getMin((int) '#', 1);
        BasicMethods basicMethods14 = new BasicMethods();
        int int17 = basicMethods14.getMin(0, 0);
        int int19 = basicMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods14.incrementNumberAtIndex(intArray24, 0);
        BasicMethods basicMethods27 = new BasicMethods();
        BasicMethods basicMethods28 = new BasicMethods();
        int[] intArray29 = new int[] {};
        basicMethods28.incrementNumberAtIndex(intArray29, (int) (byte) 1);
        basicMethods27.incrementNumberAtIndex(intArray29, 1);
        BasicMethods basicMethods34 = new BasicMethods();
        int int37 = basicMethods34.getMin(0, 0);
        int int39 = basicMethods34.abs((-2));
        int[] intArray46 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods34.incrementNumberAtIndex(intArray46, 4);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        basicMethods34.addElementToSet(intSet69, 6);
        basicMethods27.addElementToSet(intSet69, (-3));
        basicMethods14.addElementToSet(intSet69, 100);
        basicMethods4.addElementToSet(intSet69, (-67));
        basicMethods0.addElementToSet(intSet69, (int) (short) 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test125");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs(8);
        int int8 = basicMethods0.getMin((-1), (-100));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test126");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 0);
        int int11 = basicMethods6.abs((int) (short) 0);
        int[] intArray16 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods6.incrementNumberAtIndex(intArray16, 0);
        basicMethods0.incrementNumberAtIndex(intArray16, (-4));
        BasicMethods basicMethods21 = new BasicMethods();
        int int24 = basicMethods21.getMin(0, 0);
        int int26 = basicMethods21.abs((-2));
        int int29 = basicMethods21.getMin((int) (short) -1, (int) (short) 100);
        int int31 = basicMethods21.abs(0);
        BasicMethods basicMethods32 = new BasicMethods();
        int int35 = basicMethods32.getMin(0, 0);
        int int37 = basicMethods32.abs((int) (short) 0);
        BasicMethods basicMethods38 = new BasicMethods();
        int[] intArray39 = new int[] {};
        basicMethods38.incrementNumberAtIndex(intArray39, (int) (byte) 1);
        BasicMethods basicMethods42 = new BasicMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        basicMethods42.addElementToSet(intSet71, (int) (short) 100);
        basicMethods38.addElementToSet(intSet71, (int) (short) -1);
        BasicMethods basicMethods77 = new BasicMethods();
        int int80 = basicMethods77.getMin(0, 0);
        int int82 = basicMethods77.abs((int) (short) 0);
        int[] intArray87 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods77.incrementNumberAtIndex(intArray87, 0);
        basicMethods38.incrementNumberAtIndex(intArray87, (-1));
        basicMethods32.incrementNumberAtIndex(intArray87, 0);
        basicMethods21.incrementNumberAtIndex(intArray87, (-1));
        basicMethods0.incrementNumberAtIndex(intArray87, (-131));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test127");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        BasicMethods basicMethods28 = new BasicMethods();
        BasicMethods basicMethods29 = new BasicMethods();
        int[] intArray30 = new int[] {};
        basicMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        basicMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = basicMethods28.getMin((int) '#', 1);
        int int40 = basicMethods28.getMin(6, 0);
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((-2));
        int int50 = basicMethods42.getMin((-1), 2);
        int int53 = basicMethods42.getMin(1, 7);
        int int56 = basicMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods42.addElementToSet(intSet77, (int) (short) 1);
        basicMethods41.addElementToSet(intSet77, 7);
        basicMethods28.addElementToSet(intSet77, 0);
        basicMethods0.addElementToSet(intSet77, (-34));
        int int89 = basicMethods0.getMin(1, (int) (short) 0);
        int int91 = basicMethods0.abs((-131));
        int int94 = basicMethods0.getMin((-1), (int) 'a');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test128");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int41 = basicMethods0.getMin(10, (-6));
        int int43 = basicMethods0.abs((-35));
        BasicMethods basicMethods44 = new BasicMethods();
        BasicMethods basicMethods45 = new BasicMethods();
        int int48 = basicMethods45.getMin(0, 0);
        int int50 = basicMethods45.abs((-2));
        int int53 = basicMethods45.getMin((-1), 2);
        int int56 = basicMethods45.getMin(1, 7);
        BasicMethods basicMethods57 = new BasicMethods();
        int int60 = basicMethods57.getMin(0, 0);
        int int62 = basicMethods57.abs((-2));
        int[] intArray69 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods57.incrementNumberAtIndex(intArray69, 4);
        basicMethods45.incrementNumberAtIndex(intArray69, 0);
        basicMethods44.incrementNumberAtIndex(intArray69, 0);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 6, (-1), 1, 7, 1, (-3), 6, (-2) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        basicMethods44.addElementToSet(intSet85, (int) (short) -1);
        basicMethods0.addElementToSet(intSet85, (-11));
        int int93 = basicMethods0.getMin((-5), (-31));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test129");
        BasicMethods basicMethods0 = new BasicMethods();
        int int2 = basicMethods0.abs((int) (short) 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test130");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = basicMethods0.getMin((-8), (-32));
        int int74 = basicMethods0.abs((-259));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test131");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = basicMethods0.abs((-1));
        int int34 = basicMethods0.abs((-31));
        int int36 = basicMethods0.abs(7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test132");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods39.incrementNumberAtIndex(intArray51, 4);
        basicMethods0.incrementNumberAtIndex(intArray51, (-32));
        int int58 = basicMethods0.getMin(0, (-32));
        int int61 = basicMethods0.getMin(1, (-515));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test133");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        int int55 = basicMethods0.abs(5);
        int int58 = basicMethods0.getMin(0, (-131));
        int int60 = basicMethods0.abs((int) (short) 10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test134");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        BasicMethods basicMethods10 = new BasicMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        basicMethods10.addElementToSet(intSet39, (int) (short) 100);
        basicMethods6.addElementToSet(intSet39, (int) (short) -1);
        BasicMethods basicMethods45 = new BasicMethods();
        int int48 = basicMethods45.getMin(0, 0);
        int int50 = basicMethods45.abs((int) (short) 0);
        int[] intArray55 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods45.incrementNumberAtIndex(intArray55, 0);
        basicMethods6.incrementNumberAtIndex(intArray55, (-1));
        basicMethods0.incrementNumberAtIndex(intArray55, 0);
        int int63 = basicMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test135");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        int int58 = basicMethods0.abs((-7));
        int int60 = basicMethods0.abs((int) (byte) -1);
        int int63 = basicMethods0.getMin(100, (-10));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test136");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        BasicMethods basicMethods15 = new BasicMethods();
        int[] intArray16 = new int[] {};
        basicMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        basicMethods14.incrementNumberAtIndex(intArray16, 1);
        BasicMethods basicMethods21 = new BasicMethods();
        BasicMethods basicMethods22 = new BasicMethods();
        int int25 = basicMethods22.getMin(0, 100);
        int int27 = basicMethods22.abs(4);
        BasicMethods basicMethods28 = new BasicMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        basicMethods28.addElementToSet(intSet57, (int) (short) 100);
        basicMethods22.addElementToSet(intSet57, (int) '4');
        BasicMethods basicMethods63 = new BasicMethods();
        BasicMethods basicMethods64 = new BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        basicMethods63.incrementNumberAtIndex(intArray65, 1);
        basicMethods22.incrementNumberAtIndex(intArray65, 0);
        basicMethods21.incrementNumberAtIndex(intArray65, (-1));
        basicMethods14.incrementNumberAtIndex(intArray65, 10);
        basicMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        int int80 = basicMethods0.getMin((-35), (-8));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test137");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs((-1));
        int int7 = basicMethods0.abs((-10));
        int int9 = basicMethods0.abs(1);
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((-2));
        int[] intArray22 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods10.incrementNumberAtIndex(intArray22, 4);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods10.addElementToSet(intSet45, 6);
        BasicMethods basicMethods49 = new BasicMethods();
        int int52 = basicMethods49.getMin(0, 0);
        int int54 = basicMethods49.abs((-2));
        int[] intArray61 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods49.incrementNumberAtIndex(intArray61, 4);
        basicMethods10.incrementNumberAtIndex(intArray61, (-32));
        basicMethods0.incrementNumberAtIndex(intArray61, (-3));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test138");
        BasicMethods basicMethods0 = new BasicMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        basicMethods0.addElementToSet(intSet29, (int) (short) 100);
        int int35 = basicMethods0.getMin((int) ' ', (-6));
        BasicMethods basicMethods36 = new BasicMethods();
        int int39 = basicMethods36.getMin(0, 100);
        int int41 = basicMethods36.abs(4);
        BasicMethods basicMethods42 = new BasicMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        basicMethods42.addElementToSet(intSet71, (int) (short) 100);
        basicMethods36.addElementToSet(intSet71, (int) '4');
        BasicMethods basicMethods77 = new BasicMethods();
        int int80 = basicMethods77.getMin(0, 0);
        int int82 = basicMethods77.abs((-2));
        int[] intArray89 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods77.incrementNumberAtIndex(intArray89, 4);
        basicMethods36.incrementNumberAtIndex(intArray89, 10);
        basicMethods0.incrementNumberAtIndex(intArray89, 6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test139");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs(2);
        BasicMethods basicMethods10 = new BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        BasicMethods basicMethods14 = new BasicMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods14.addElementToSet(intSet43, (int) (short) 100);
        basicMethods10.addElementToSet(intSet43, (int) (short) -1);
        basicMethods0.addElementToSet(intSet43, 10);
        int int53 = basicMethods0.getMin((-11), (-9));
        int int55 = basicMethods0.abs((-18));
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-34) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods0.addElementToSet(intSet58, 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test140");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods39.incrementNumberAtIndex(intArray51, 4);
        basicMethods0.incrementNumberAtIndex(intArray51, (-32));
        BasicMethods basicMethods56 = new BasicMethods();
        int int59 = basicMethods56.getMin(0, 0);
        int int61 = basicMethods56.abs((int) (short) 0);
        int[] intArray66 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods56.incrementNumberAtIndex(intArray66, 0);
        BasicMethods basicMethods69 = new BasicMethods();
        int int72 = basicMethods69.getMin(0, 0);
        int int74 = basicMethods69.abs((int) (short) 0);
        int[] intArray79 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods69.incrementNumberAtIndex(intArray79, 0);
        basicMethods56.incrementNumberAtIndex(intArray79, 2);
        int[] intArray84 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray84, 7);
        basicMethods0.incrementNumberAtIndex(intArray84, (int) (byte) 100);
        int int91 = basicMethods0.getMin(0, (-67));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test141");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        basicMethods41.incrementNumberAtIndex(intArray43, 1);
        basicMethods0.incrementNumberAtIndex(intArray43, 0);
        int int51 = basicMethods0.abs((-9));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test142");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = basicMethods0.abs(4);
        int int73 = basicMethods0.abs(0);
        int int76 = basicMethods0.getMin((-8), 9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test143");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 0);
        int int46 = basicMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods41.incrementNumberAtIndex(intArray53, 4);
        basicMethods0.incrementNumberAtIndex(intArray53, 10);
        BasicMethods basicMethods58 = new BasicMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        basicMethods58.addElementToSet(intSet87, (int) (short) 100);
        basicMethods0.addElementToSet(intSet87, (-3));
        int int95 = basicMethods0.getMin(10, (-3));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test144");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((int) '#', 1);
        int int12 = basicMethods0.getMin(6, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        BasicMethods basicMethods14 = new BasicMethods();
        int int17 = basicMethods14.getMin(0, 0);
        int int19 = basicMethods14.abs((-2));
        int int22 = basicMethods14.getMin((-1), 2);
        int int25 = basicMethods14.getMin(1, 7);
        int int28 = basicMethods14.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        basicMethods14.addElementToSet(intSet49, (int) (short) 1);
        basicMethods13.addElementToSet(intSet49, 7);
        basicMethods0.addElementToSet(intSet49, 0);
        int int59 = basicMethods0.getMin(3, 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test145");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs((-1));
        java.util.HashSet<java.lang.Integer> intSet6 = null;
        basicMethods0.addElementToSet(intSet6, (int) (short) -1);
        int int11 = basicMethods0.getMin((int) (byte) 0, (-10));
        BasicMethods basicMethods12 = new BasicMethods();
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int int21 = basicMethods13.getMin((-1), 2);
        int int24 = basicMethods13.getMin(1, 7);
        BasicMethods basicMethods25 = new BasicMethods();
        int int28 = basicMethods25.getMin(0, 0);
        int int30 = basicMethods25.abs((-2));
        int[] intArray37 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods25.incrementNumberAtIndex(intArray37, 4);
        basicMethods13.incrementNumberAtIndex(intArray37, 0);
        basicMethods12.incrementNumberAtIndex(intArray37, 0);
        BasicMethods basicMethods44 = new BasicMethods();
        BasicMethods basicMethods45 = new BasicMethods();
        BasicMethods basicMethods46 = new BasicMethods();
        int[] intArray47 = new int[] {};
        basicMethods46.incrementNumberAtIndex(intArray47, (int) (byte) 1);
        basicMethods45.incrementNumberAtIndex(intArray47, 1);
        int int54 = basicMethods45.getMin((-100), 9);
        int int57 = basicMethods45.getMin(6, 10);
        int int59 = basicMethods45.abs((-3));
        BasicMethods basicMethods60 = new BasicMethods();
        int int63 = basicMethods60.getMin(0, 0);
        int int65 = basicMethods60.abs((-2));
        int[] intArray72 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods60.incrementNumberAtIndex(intArray72, 4);
        basicMethods45.incrementNumberAtIndex(intArray72, 1);
        basicMethods44.incrementNumberAtIndex(intArray72, 5);
        basicMethods12.incrementNumberAtIndex(intArray72, (-7));
        basicMethods0.incrementNumberAtIndex(intArray72, 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test146");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 10);
        int int29 = basicMethods0.abs((-259));
        int int32 = basicMethods0.getMin((-35), 9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test147");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int9 = basicMethods0.abs((-6));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test148");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        int int17 = basicMethods14.getMin(0, 0);
        int int19 = basicMethods14.abs((-2));
        int int22 = basicMethods14.getMin((-1), 2);
        int int25 = basicMethods14.getMin(1, 7);
        int int28 = basicMethods14.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        basicMethods14.addElementToSet(intSet49, (int) (short) 1);
        BasicMethods basicMethods53 = new BasicMethods();
        int[] intArray54 = new int[] {};
        basicMethods53.incrementNumberAtIndex(intArray54, (int) (byte) 1);
        basicMethods14.incrementNumberAtIndex(intArray54, 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        basicMethods14.addElementToSet(intSet67, 7);
        basicMethods0.addElementToSet(intSet67, (-36));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        basicMethods0.addElementToSet(intSet73, (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test149");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs(100);
        int int8 = basicMethods0.getMin((int) (short) -1, (-35));
        BasicMethods basicMethods9 = new BasicMethods();
        BasicMethods basicMethods10 = new BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        basicMethods9.incrementNumberAtIndex(intArray11, 1);
        int int18 = basicMethods9.getMin((-100), 9);
        int int21 = basicMethods9.getMin(100, (int) (byte) 1);
        BasicMethods basicMethods22 = new BasicMethods();
        int int25 = basicMethods22.getMin(0, 0);
        int int27 = basicMethods22.abs((int) (short) 0);
        int[] intArray32 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods22.incrementNumberAtIndex(intArray32, 0);
        BasicMethods basicMethods35 = new BasicMethods();
        int int38 = basicMethods35.getMin(0, 0);
        int int40 = basicMethods35.abs((-2));
        int[] intArray47 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods35.incrementNumberAtIndex(intArray47, 4);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        basicMethods35.addElementToSet(intSet70, 6);
        basicMethods22.addElementToSet(intSet70, (-100));
        basicMethods9.addElementToSet(intSet70, 10);
        basicMethods0.addElementToSet(intSet70, (-10));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test150");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(100, (int) (byte) 1);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        BasicMethods basicMethods26 = new BasicMethods();
        int int29 = basicMethods26.getMin(0, 0);
        int int31 = basicMethods26.abs((-2));
        int[] intArray38 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods26.incrementNumberAtIndex(intArray38, 4);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        basicMethods26.addElementToSet(intSet61, 6);
        basicMethods13.addElementToSet(intSet61, (-100));
        basicMethods0.addElementToSet(intSet61, 10);
        int int71 = basicMethods0.getMin((-515), (-1));
        int int74 = basicMethods0.getMin((-6), (int) 'a');
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test151");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int10 = basicMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        BasicMethods basicMethods11 = new BasicMethods();
        int int14 = basicMethods11.getMin(0, 0);
        int int16 = basicMethods11.abs((-2));
        int int19 = basicMethods11.getMin((-1), 2);
        BasicMethods basicMethods20 = new BasicMethods();
        int int23 = basicMethods20.getMin(0, 100);
        int int25 = basicMethods20.abs(4);
        BasicMethods basicMethods26 = new BasicMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        basicMethods26.addElementToSet(intSet55, (int) (short) 100);
        basicMethods20.addElementToSet(intSet55, (int) '4');
        basicMethods11.addElementToSet(intSet55, 8);
        basicMethods0.addElementToSet(intSet55, (int) ' ');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test152");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        java.util.HashSet<java.lang.Integer> intSet12 = null;
        basicMethods0.addElementToSet(intSet12, 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test153");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs((-1));
        int int7 = basicMethods0.abs((-10));
        int int9 = basicMethods0.abs((-4));
        int int11 = basicMethods0.abs((int) (short) -1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test154");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 100);
        int int6 = basicMethods1.abs(4);
        BasicMethods basicMethods7 = new BasicMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods7.addElementToSet(intSet36, (int) (short) 100);
        basicMethods1.addElementToSet(intSet36, (int) '4');
        BasicMethods basicMethods42 = new BasicMethods();
        BasicMethods basicMethods43 = new BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        basicMethods42.incrementNumberAtIndex(intArray44, 1);
        basicMethods1.incrementNumberAtIndex(intArray44, 0);
        basicMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = basicMethods0.getMin(100, 1);
        BasicMethods basicMethods56 = new BasicMethods();
        int int59 = basicMethods56.getMin(0, 0);
        int int61 = basicMethods56.abs((int) (short) 0);
        int[] intArray66 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods56.incrementNumberAtIndex(intArray66, 0);
        BasicMethods basicMethods69 = new BasicMethods();
        int int72 = basicMethods69.getMin(0, 0);
        int int74 = basicMethods69.abs((int) (short) 0);
        int[] intArray79 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods69.incrementNumberAtIndex(intArray79, 0);
        basicMethods56.incrementNumberAtIndex(intArray79, 2);
        basicMethods0.incrementNumberAtIndex(intArray79, (-18));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test155");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-1), (int) (short) 100);
        int int11 = basicMethods0.abs((-34));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test156");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        int int41 = basicMethods0.getMin(100, 4);
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((int) (short) 0);
        BasicMethods basicMethods48 = new BasicMethods();
        int[] intArray49 = new int[] {};
        basicMethods48.incrementNumberAtIndex(intArray49, (int) (byte) 1);
        basicMethods42.incrementNumberAtIndex(intArray49, 8);
        basicMethods0.incrementNumberAtIndex(intArray49, 0);
        int int58 = basicMethods0.getMin((-100), (-131));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test157");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs(2);
        BasicMethods basicMethods10 = new BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, (int) (byte) 1);
        BasicMethods basicMethods14 = new BasicMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods14.addElementToSet(intSet43, (int) (short) 100);
        basicMethods10.addElementToSet(intSet43, (int) (short) -1);
        basicMethods0.addElementToSet(intSet43, 10);
        int int53 = basicMethods0.getMin((-11), (-9));
        int int55 = basicMethods0.abs((-18));
        int int58 = basicMethods0.getMin((-3), 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test158");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = basicMethods0.getMin((-9), (int) '4');
        int int19 = basicMethods0.abs((int) '#');
        int int21 = basicMethods0.abs((-10));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test159");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        int int58 = basicMethods0.abs(5);
        int int60 = basicMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test160");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs((-1));
        int int7 = basicMethods0.abs((-10));
        int int10 = basicMethods0.getMin(1, (-35));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test161");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods39.incrementNumberAtIndex(intArray51, 4);
        basicMethods0.incrementNumberAtIndex(intArray51, (-32));
        int int58 = basicMethods0.getMin(7, 3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test162");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int int47 = basicMethods39.getMin((-1), 2);
        int int50 = basicMethods39.getMin(1, 7);
        BasicMethods basicMethods51 = new BasicMethods();
        int int54 = basicMethods51.getMin(0, 0);
        int int56 = basicMethods51.abs((-2));
        int[] intArray63 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods51.incrementNumberAtIndex(intArray63, 4);
        basicMethods39.incrementNumberAtIndex(intArray63, 0);
        basicMethods0.incrementNumberAtIndex(intArray63, (int) (byte) 1);
        int int71 = basicMethods0.abs(6);
        int int73 = basicMethods0.abs((-131));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test163");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int[] intArray28 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray28, 7);
        int int32 = basicMethods0.abs((-1));
        BasicMethods basicMethods33 = new BasicMethods();
        int[] intArray34 = new int[] {};
        basicMethods33.incrementNumberAtIndex(intArray34, (int) (byte) 1);
        BasicMethods basicMethods37 = new BasicMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods37.addElementToSet(intSet66, (int) (short) 100);
        basicMethods33.addElementToSet(intSet66, (int) (short) -1);
        BasicMethods basicMethods72 = new BasicMethods();
        int int75 = basicMethods72.getMin(0, 0);
        int int77 = basicMethods72.abs((int) (short) 0);
        int[] intArray82 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods72.incrementNumberAtIndex(intArray82, 0);
        basicMethods33.incrementNumberAtIndex(intArray82, (-1));
        basicMethods0.incrementNumberAtIndex(intArray82, (-100));
        int int91 = basicMethods0.getMin((-7), (int) (short) 0);
        int int94 = basicMethods0.getMin((int) '4', 6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test164");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        basicMethods1.incrementNumberAtIndex(intArray25, 0);
        basicMethods0.incrementNumberAtIndex(intArray25, 0);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 6, (-1), 1, 7, 1, (-3), 6, (-2) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        basicMethods0.addElementToSet(intSet41, (int) (short) -1);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-66), (-20), (-10), 100, 9, (-100), 10, 100, 100, 100, 100, 9, 0, (-3), 3, (-35), (-515), 100, (-100), 4, (-4), (-10), 7, 3, 1, (-36), (-2), 6, 10, 7, (-8), 3, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        basicMethods0.addElementToSet(intSet79, (int) (byte) 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test165");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 0);
        int int11 = basicMethods6.abs(100);
        BasicMethods basicMethods12 = new BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods16.incrementNumberAtIndex(intArray26, 0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods29.addElementToSet(intSet64, 6);
        basicMethods16.addElementToSet(intSet64, (-100));
        basicMethods12.addElementToSet(intSet64, (int) (short) -1);
        basicMethods6.addElementToSet(intSet64, 3);
        basicMethods0.addElementToSet(intSet64, 0);
        BasicMethods basicMethods76 = new BasicMethods();
        int int79 = basicMethods76.getMin(0, 0);
        int int81 = basicMethods76.abs((-2));
        BasicMethods basicMethods82 = new BasicMethods();
        int int85 = basicMethods82.getMin(0, 0);
        int int87 = basicMethods82.abs((int) (short) 0);
        int[] intArray92 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods82.incrementNumberAtIndex(intArray92, 0);
        basicMethods76.incrementNumberAtIndex(intArray92, (-4));
        basicMethods0.incrementNumberAtIndex(intArray92, (-36));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test166");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        BasicMethods basicMethods15 = new BasicMethods();
        int[] intArray16 = new int[] {};
        basicMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        basicMethods14.incrementNumberAtIndex(intArray16, 1);
        BasicMethods basicMethods21 = new BasicMethods();
        BasicMethods basicMethods22 = new BasicMethods();
        int int25 = basicMethods22.getMin(0, 100);
        int int27 = basicMethods22.abs(4);
        BasicMethods basicMethods28 = new BasicMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        basicMethods28.addElementToSet(intSet57, (int) (short) 100);
        basicMethods22.addElementToSet(intSet57, (int) '4');
        BasicMethods basicMethods63 = new BasicMethods();
        BasicMethods basicMethods64 = new BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        basicMethods63.incrementNumberAtIndex(intArray65, 1);
        basicMethods22.incrementNumberAtIndex(intArray65, 0);
        basicMethods21.incrementNumberAtIndex(intArray65, (-1));
        basicMethods14.incrementNumberAtIndex(intArray65, 10);
        basicMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        int int80 = basicMethods0.getMin((-9), (-1));
        int int83 = basicMethods0.getMin((-66), (int) 'a');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test167");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 100);
        int int6 = basicMethods1.abs(4);
        BasicMethods basicMethods7 = new BasicMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods7.addElementToSet(intSet36, (int) (short) 100);
        basicMethods1.addElementToSet(intSet36, (int) '4');
        BasicMethods basicMethods42 = new BasicMethods();
        BasicMethods basicMethods43 = new BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        basicMethods42.incrementNumberAtIndex(intArray44, 1);
        basicMethods1.incrementNumberAtIndex(intArray44, 0);
        basicMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = basicMethods0.getMin((-32), (-1));
        BasicMethods basicMethods56 = new BasicMethods();
        int int59 = basicMethods56.getMin(0, 0);
        int int61 = basicMethods56.abs((-2));
        int int64 = basicMethods56.getMin((-1), (-5));
        BasicMethods basicMethods65 = new BasicMethods();
        int int68 = basicMethods65.getMin(0, 0);
        int int70 = basicMethods65.abs((int) (short) 0);
        int[] intArray75 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods65.incrementNumberAtIndex(intArray75, 0);
        BasicMethods basicMethods78 = new BasicMethods();
        int int81 = basicMethods78.getMin(0, 0);
        int int83 = basicMethods78.abs((int) (short) 0);
        int[] intArray88 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods78.incrementNumberAtIndex(intArray88, 0);
        basicMethods65.incrementNumberAtIndex(intArray88, 2);
        int[] intArray93 = new int[] {};
        basicMethods65.incrementNumberAtIndex(intArray93, 7);
        basicMethods56.incrementNumberAtIndex(intArray93, 7);
        basicMethods0.incrementNumberAtIndex(intArray93, (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test168");
        BasicMethods basicMethods0 = new BasicMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        basicMethods0.addElementToSet(intSet29, (int) (short) 100);
        int int34 = basicMethods0.abs((-8));
        BasicMethods basicMethods35 = new BasicMethods();
        BasicMethods basicMethods36 = new BasicMethods();
        int int39 = basicMethods36.getMin(0, 0);
        int int41 = basicMethods36.abs((-2));
        int int44 = basicMethods36.getMin((-1), 2);
        int int47 = basicMethods36.getMin(1, 7);
        int int50 = basicMethods36.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        basicMethods36.addElementToSet(intSet71, (int) (short) 1);
        basicMethods35.addElementToSet(intSet71, 7);
        basicMethods0.addElementToSet(intSet71, 9);
        int int80 = basicMethods0.abs((-8));
        int int83 = basicMethods0.getMin((int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test169");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = basicMethods0.abs(4);
        int int73 = basicMethods0.abs(0);
        int int76 = basicMethods0.getMin(4, (int) (byte) 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test170");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        int int7 = basicMethods0.abs((-5));
        BasicMethods basicMethods8 = new BasicMethods();
        int int11 = basicMethods8.getMin(0, 0);
        int int13 = basicMethods8.abs((-2));
        int int16 = basicMethods8.getMin((-1), 2);
        int int19 = basicMethods8.getMin(1, 7);
        int int22 = basicMethods8.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods8.addElementToSet(intSet43, (int) (short) 1);
        int int49 = basicMethods8.getMin(100, 4);
        BasicMethods basicMethods50 = new BasicMethods();
        int int53 = basicMethods50.getMin(0, 0);
        int int55 = basicMethods50.abs((int) (short) 0);
        BasicMethods basicMethods56 = new BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, (int) (byte) 1);
        basicMethods50.incrementNumberAtIndex(intArray57, 8);
        basicMethods8.incrementNumberAtIndex(intArray57, 0);
        basicMethods0.incrementNumberAtIndex(intArray57, (-7));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test171");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int7 = basicMethods0.abs((-1));
        int int10 = basicMethods0.getMin((-8), 100);
        int int13 = basicMethods0.getMin((-35), (int) 'a');
        BasicMethods basicMethods14 = new BasicMethods();
        int int17 = basicMethods14.getMin(0, 0);
        int int19 = basicMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods14.incrementNumberAtIndex(intArray24, 0);
        BasicMethods basicMethods27 = new BasicMethods();
        int int30 = basicMethods27.getMin(0, 0);
        int int32 = basicMethods27.abs((int) (short) 0);
        int[] intArray37 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods27.incrementNumberAtIndex(intArray37, 0);
        basicMethods14.incrementNumberAtIndex(intArray37, 2);
        int[] intArray42 = new int[] {};
        basicMethods14.incrementNumberAtIndex(intArray42, 7);
        basicMethods0.incrementNumberAtIndex(intArray42, (-19));
        int int49 = basicMethods0.getMin(7, (int) (byte) 100);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test172");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        int int46 = basicMethods0.abs(1);
        int int48 = basicMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test173");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs(2);
        int int12 = basicMethods0.getMin((-31), (-7));
        int int15 = basicMethods0.getMin((-515), 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test174");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        int int41 = basicMethods0.getMin(100, 4);
        BasicMethods basicMethods42 = new BasicMethods();
        BasicMethods basicMethods43 = new BasicMethods();
        int int46 = basicMethods43.getMin(0, 100);
        int int48 = basicMethods43.abs(4);
        BasicMethods basicMethods49 = new BasicMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        basicMethods49.addElementToSet(intSet78, (int) (short) 100);
        basicMethods43.addElementToSet(intSet78, (int) '4');
        BasicMethods basicMethods84 = new BasicMethods();
        BasicMethods basicMethods85 = new BasicMethods();
        int[] intArray86 = new int[] {};
        basicMethods85.incrementNumberAtIndex(intArray86, (int) (byte) 1);
        basicMethods84.incrementNumberAtIndex(intArray86, 1);
        basicMethods43.incrementNumberAtIndex(intArray86, 0);
        basicMethods42.incrementNumberAtIndex(intArray86, (-1));
        basicMethods0.incrementNumberAtIndex(intArray86, (-9));
        int int99 = basicMethods0.getMin((-32), 2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test175");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        int int17 = basicMethods14.getMin(0, 0);
        int int19 = basicMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods14.incrementNumberAtIndex(intArray24, 0);
        BasicMethods basicMethods27 = new BasicMethods();
        int int30 = basicMethods27.getMin(0, 0);
        int int32 = basicMethods27.abs((-2));
        int[] intArray39 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods27.incrementNumberAtIndex(intArray39, 4);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        basicMethods27.addElementToSet(intSet62, 6);
        basicMethods14.addElementToSet(intSet62, (-100));
        basicMethods0.addElementToSet(intSet62, (-5));
        int int71 = basicMethods0.abs(4);
        int int74 = basicMethods0.getMin(5, (int) (short) 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test176");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 0);
        int int11 = basicMethods6.abs(100);
        BasicMethods basicMethods12 = new BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, (int) (byte) 1);
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods16.incrementNumberAtIndex(intArray26, 0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods29.addElementToSet(intSet64, 6);
        basicMethods16.addElementToSet(intSet64, (-100));
        basicMethods12.addElementToSet(intSet64, (int) (short) -1);
        basicMethods6.addElementToSet(intSet64, 3);
        basicMethods0.addElementToSet(intSet64, 0);
        int int77 = basicMethods0.abs(10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test177");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        BasicMethods basicMethods57 = new BasicMethods();
        BasicMethods basicMethods58 = new BasicMethods();
        int[] intArray59 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray59, (int) (byte) 1);
        basicMethods57.incrementNumberAtIndex(intArray59, 1);
        basicMethods0.incrementNumberAtIndex(intArray59, 100);
        int int67 = basicMethods0.abs((-35));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        basicMethods0.addElementToSet(intSet68, (-31));
        int int73 = basicMethods0.getMin((-1), 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test178");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int6 = basicMethods0.getMin((-9), 1);
        int int8 = basicMethods0.abs(2);
        int int11 = basicMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int14 = basicMethods0.getMin((-11), (-3));
        BasicMethods basicMethods15 = new BasicMethods();
        int int18 = basicMethods15.getMin(0, 0);
        int int20 = basicMethods15.abs((int) (short) 0);
        int[] intArray26 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods15.incrementNumberAtIndex(intArray26, (-3));
        BasicMethods basicMethods29 = new BasicMethods();
        BasicMethods basicMethods30 = new BasicMethods();
        int[] intArray31 = new int[] {};
        basicMethods30.incrementNumberAtIndex(intArray31, (int) (byte) 1);
        basicMethods29.incrementNumberAtIndex(intArray31, 1);
        BasicMethods basicMethods36 = new BasicMethods();
        BasicMethods basicMethods37 = new BasicMethods();
        int int40 = basicMethods37.getMin(0, 100);
        int int42 = basicMethods37.abs(4);
        BasicMethods basicMethods43 = new BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods43.addElementToSet(intSet72, (int) (short) 100);
        basicMethods37.addElementToSet(intSet72, (int) '4');
        BasicMethods basicMethods78 = new BasicMethods();
        BasicMethods basicMethods79 = new BasicMethods();
        int[] intArray80 = new int[] {};
        basicMethods79.incrementNumberAtIndex(intArray80, (int) (byte) 1);
        basicMethods78.incrementNumberAtIndex(intArray80, 1);
        basicMethods37.incrementNumberAtIndex(intArray80, 0);
        basicMethods36.incrementNumberAtIndex(intArray80, (-1));
        basicMethods29.incrementNumberAtIndex(intArray80, 10);
        basicMethods15.incrementNumberAtIndex(intArray80, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray80, (int) '#');
        int int97 = basicMethods0.getMin((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test179");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int8 = basicMethods0.getMin((-35), (-19));
        int int10 = basicMethods0.abs((int) (byte) 10);
        int[] intArray11 = null;
        basicMethods0.incrementNumberAtIndex(intArray11, (int) (short) -1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test180");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs(2);
        int int12 = basicMethods0.getMin((-31), (-7));
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        BasicMethods basicMethods26 = new BasicMethods();
        int int29 = basicMethods26.getMin(0, 0);
        int int31 = basicMethods26.abs((int) (short) 0);
        int[] intArray36 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods26.incrementNumberAtIndex(intArray36, 0);
        basicMethods13.incrementNumberAtIndex(intArray36, 2);
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 100);
        int int46 = basicMethods41.abs(4);
        BasicMethods basicMethods47 = new BasicMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        basicMethods47.addElementToSet(intSet76, (int) (short) 100);
        basicMethods41.addElementToSet(intSet76, (int) '4');
        BasicMethods basicMethods82 = new BasicMethods();
        BasicMethods basicMethods83 = new BasicMethods();
        int[] intArray84 = new int[] {};
        basicMethods83.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        basicMethods82.incrementNumberAtIndex(intArray84, 1);
        basicMethods41.incrementNumberAtIndex(intArray84, 0);
        basicMethods13.incrementNumberAtIndex(intArray84, 5);
        basicMethods0.incrementNumberAtIndex(intArray84, (-8));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test181");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = basicMethods0.abs(4);
        int int73 = basicMethods0.abs(0);
        BasicMethods basicMethods74 = new BasicMethods();
        int int77 = basicMethods74.getMin(0, 0);
        int int79 = basicMethods74.abs((int) (short) 0);
        int[] intArray84 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods74.incrementNumberAtIndex(intArray84, 0);
        basicMethods0.incrementNumberAtIndex(intArray84, (-11));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test182");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = basicMethods0.getMin((-8), (-32));
        int int75 = basicMethods0.getMin((int) 'a', (-19));
        int int78 = basicMethods0.getMin((int) '4', (-66));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test183");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        BasicMethods basicMethods14 = new BasicMethods();
        int[] intArray15 = new int[] {};
        basicMethods14.incrementNumberAtIndex(intArray15, (int) (byte) 1);
        basicMethods13.incrementNumberAtIndex(intArray15, 1);
        BasicMethods basicMethods20 = new BasicMethods();
        int int23 = basicMethods20.getMin(0, 0);
        int int25 = basicMethods20.abs((-2));
        int[] intArray32 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods20.incrementNumberAtIndex(intArray32, 4);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        basicMethods20.addElementToSet(intSet55, 6);
        basicMethods13.addElementToSet(intSet55, (-3));
        basicMethods0.addElementToSet(intSet55, 100);
        int int65 = basicMethods0.getMin((int) '#', (-35));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test184");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        int int59 = basicMethods0.getMin((-3), 1);
        int int61 = basicMethods0.abs((-3));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test185");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-1), (int) (short) 100);
        int int12 = basicMethods0.getMin((int) (byte) 10, 8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test186");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        basicMethods0.addElementToSet(intSet53, 7);
        int int59 = basicMethods0.getMin((-18), (-67));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test187");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 0);
        int int46 = basicMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods41.incrementNumberAtIndex(intArray53, 4);
        basicMethods0.incrementNumberAtIndex(intArray53, 10);
        int int60 = basicMethods0.getMin((int) (byte) 0, (-3));
        int int63 = basicMethods0.getMin((int) '4', (-20));
        int int65 = basicMethods0.abs((int) (short) -1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test188");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        int int15 = basicMethods0.getMin((-31), 0);
        int int17 = basicMethods0.abs((-19));
        int int20 = basicMethods0.getMin(0, (-19));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test189");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        BasicMethods basicMethods4 = new BasicMethods();
        BasicMethods basicMethods5 = new BasicMethods();
        int int8 = basicMethods5.getMin(0, 0);
        int int10 = basicMethods5.abs((-2));
        int[] intArray17 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods5.incrementNumberAtIndex(intArray17, 4);
        basicMethods4.incrementNumberAtIndex(intArray17, (int) (short) 1);
        basicMethods0.incrementNumberAtIndex(intArray17, 8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test190");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        int int15 = basicMethods0.abs((-7));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test191");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int43 = basicMethods0.getMin((-36), (-20));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test192");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = basicMethods0.getMin((int) (byte) 100, 0);
        int int75 = basicMethods0.getMin((int) (short) 0, 7);
        BasicMethods basicMethods76 = new BasicMethods();
        int int79 = basicMethods76.getMin(0, 0);
        int int81 = basicMethods76.abs((int) (short) 0);
        BasicMethods basicMethods82 = new BasicMethods();
        int[] intArray83 = new int[] {};
        basicMethods82.incrementNumberAtIndex(intArray83, (int) (byte) 1);
        basicMethods76.incrementNumberAtIndex(intArray83, 8);
        basicMethods0.incrementNumberAtIndex(intArray83, (-36));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test193");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        BasicMethods basicMethods9 = new BasicMethods();
        int int12 = basicMethods9.getMin(0, 100);
        int int14 = basicMethods9.abs(4);
        BasicMethods basicMethods15 = new BasicMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        basicMethods15.addElementToSet(intSet44, (int) (short) 100);
        basicMethods9.addElementToSet(intSet44, (int) '4');
        basicMethods0.addElementToSet(intSet44, 8);
        int int54 = basicMethods0.getMin((int) (byte) -1, 2);
        int int57 = basicMethods0.getMin((-7), 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test194");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int[] intArray13 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods1.incrementNumberAtIndex(intArray13, 4);
        basicMethods0.incrementNumberAtIndex(intArray13, (int) (short) 1);
        int int19 = basicMethods0.abs((-19));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test195");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs((-9));
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 0);
        int int11 = basicMethods6.abs((-2));
        int int13 = basicMethods6.abs(0);
        int int15 = basicMethods6.abs(2);
        BasicMethods basicMethods16 = new BasicMethods();
        int[] intArray17 = new int[] {};
        basicMethods16.incrementNumberAtIndex(intArray17, (int) (byte) 1);
        BasicMethods basicMethods20 = new BasicMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        basicMethods20.addElementToSet(intSet49, (int) (short) 100);
        basicMethods16.addElementToSet(intSet49, (int) (short) -1);
        basicMethods6.addElementToSet(intSet49, 10);
        basicMethods0.addElementToSet(intSet49, (-35));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test196");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin((int) (short) 0, (int) (byte) 1);
        int int13 = basicMethods0.abs((-2));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test197");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray6 = null;
        basicMethods0.incrementNumberAtIndex(intArray6, (int) (byte) 1);
        BasicMethods basicMethods9 = new BasicMethods();
        int int12 = basicMethods9.getMin(0, 0);
        int int14 = basicMethods9.abs((-2));
        int int17 = basicMethods9.getMin((-1), 2);
        int int20 = basicMethods9.getMin(1, 7);
        int int23 = basicMethods9.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        basicMethods9.addElementToSet(intSet44, (int) (short) 1);
        basicMethods0.addElementToSet(intSet44, 1);
        BasicMethods basicMethods50 = new BasicMethods();
        BasicMethods basicMethods51 = new BasicMethods();
        int[] intArray52 = new int[] {};
        basicMethods51.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        basicMethods50.incrementNumberAtIndex(intArray52, 1);
        basicMethods0.incrementNumberAtIndex(intArray52, 10);
        int int60 = basicMethods0.abs(0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test198");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int41 = basicMethods0.getMin(10, (-6));
        int int43 = basicMethods0.abs((-35));
        int int45 = basicMethods0.abs((-5));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test199");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        BasicMethods basicMethods15 = new BasicMethods();
        int[] intArray16 = new int[] {};
        basicMethods15.incrementNumberAtIndex(intArray16, (int) (byte) 1);
        basicMethods14.incrementNumberAtIndex(intArray16, 1);
        BasicMethods basicMethods21 = new BasicMethods();
        BasicMethods basicMethods22 = new BasicMethods();
        int int25 = basicMethods22.getMin(0, 100);
        int int27 = basicMethods22.abs(4);
        BasicMethods basicMethods28 = new BasicMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        basicMethods28.addElementToSet(intSet57, (int) (short) 100);
        basicMethods22.addElementToSet(intSet57, (int) '4');
        BasicMethods basicMethods63 = new BasicMethods();
        BasicMethods basicMethods64 = new BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, (int) (byte) 1);
        basicMethods63.incrementNumberAtIndex(intArray65, 1);
        basicMethods22.incrementNumberAtIndex(intArray65, 0);
        basicMethods21.incrementNumberAtIndex(intArray65, (-1));
        basicMethods14.incrementNumberAtIndex(intArray65, 10);
        basicMethods0.incrementNumberAtIndex(intArray65, (int) (byte) -1);
        int int80 = basicMethods0.getMin((-9), (-1));
        int int83 = basicMethods0.getMin((-3), (-32));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test200");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs((-1));
        int int12 = basicMethods0.getMin(6, 6);
        int int14 = basicMethods0.abs(100);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test201");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = basicMethods0.abs(4);
        int int73 = basicMethods0.abs(0);
        int int76 = basicMethods0.getMin((-1), 2);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-32), (-18), (-18), 4, (-20), 9, (-2) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        basicMethods0.addElementToSet(intSet85, (int) (byte) 0);
        int int90 = basicMethods0.abs((-1));
        int int92 = basicMethods0.abs((-67));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test202");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 10);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        basicMethods0.addElementToSet(intSet28, 100);
        int int33 = basicMethods0.getMin((-66), (int) (short) -1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test203");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-9), (int) (byte) 1);
        int int12 = basicMethods0.getMin((-131), (int) (short) 100);
        BasicMethods basicMethods13 = new BasicMethods();
        int[] intArray14 = new int[] {};
        basicMethods13.incrementNumberAtIndex(intArray14, (int) (byte) 1);
        int int18 = basicMethods13.abs((-1));
        int int20 = basicMethods13.abs((-10));
        BasicMethods basicMethods21 = new BasicMethods();
        int int24 = basicMethods21.getMin(0, 0);
        int int26 = basicMethods21.abs((-2));
        int int28 = basicMethods21.abs(0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int int37 = basicMethods29.getMin((-1), 2);
        BasicMethods basicMethods38 = new BasicMethods();
        int int41 = basicMethods38.getMin(0, 100);
        int int43 = basicMethods38.abs(4);
        BasicMethods basicMethods44 = new BasicMethods();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        basicMethods44.addElementToSet(intSet73, (int) (short) 100);
        basicMethods38.addElementToSet(intSet73, (int) '4');
        basicMethods29.addElementToSet(intSet73, 8);
        basicMethods21.addElementToSet(intSet73, 1);
        basicMethods13.addElementToSet(intSet73, 8);
        basicMethods0.addElementToSet(intSet73, 7);
        int int89 = basicMethods0.getMin((-1), (-35));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test204");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray40, 1);
        int int47 = basicMethods0.getMin((-66), 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test205");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        int int29 = basicMethods0.abs((int) (short) 10);
        int int32 = basicMethods0.getMin((int) (short) -1, 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test206");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        basicMethods0.incrementNumberAtIndex(intArray23, 2);
        BasicMethods basicMethods28 = new BasicMethods();
        BasicMethods basicMethods29 = new BasicMethods();
        int[] intArray30 = new int[] {};
        basicMethods29.incrementNumberAtIndex(intArray30, (int) (byte) 1);
        basicMethods28.incrementNumberAtIndex(intArray30, 1);
        int int37 = basicMethods28.getMin((int) '#', 1);
        int int40 = basicMethods28.getMin(6, 0);
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 0);
        int int47 = basicMethods42.abs((-2));
        int int50 = basicMethods42.getMin((-1), 2);
        int int53 = basicMethods42.getMin(1, 7);
        int int56 = basicMethods42.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods42.addElementToSet(intSet77, (int) (short) 1);
        basicMethods41.addElementToSet(intSet77, 7);
        basicMethods28.addElementToSet(intSet77, 0);
        basicMethods0.addElementToSet(intSet77, (-34));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        basicMethods0.addElementToSet(intSet87, (int) (short) 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test207");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-1), (int) (short) 100);
        int int11 = basicMethods0.abs((int) (short) 100);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test208");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int10 = basicMethods0.abs(0);
        int int13 = basicMethods0.getMin(8, 2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test209");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(100, (int) (byte) 1);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((int) (short) 0);
        int[] intArray23 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods13.incrementNumberAtIndex(intArray23, 0);
        BasicMethods basicMethods26 = new BasicMethods();
        int int29 = basicMethods26.getMin(0, 0);
        int int31 = basicMethods26.abs((-2));
        int[] intArray38 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods26.incrementNumberAtIndex(intArray38, 4);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        basicMethods26.addElementToSet(intSet61, 6);
        basicMethods13.addElementToSet(intSet61, (-100));
        basicMethods0.addElementToSet(intSet61, 10);
        int int71 = basicMethods0.getMin((-515), (-1));
        int int74 = basicMethods0.getMin(0, 100);
        int int76 = basicMethods0.abs((-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test210");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        BasicMethods basicMethods12 = new BasicMethods();
        int int15 = basicMethods12.getMin(0, 0);
        int int17 = basicMethods12.abs((-2));
        int[] intArray24 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods12.incrementNumberAtIndex(intArray24, 4);
        basicMethods0.incrementNumberAtIndex(intArray24, 0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int int36 = basicMethods29.abs(0);
        int int38 = basicMethods29.abs(2);
        BasicMethods basicMethods39 = new BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        BasicMethods basicMethods43 = new BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods43.addElementToSet(intSet72, (int) (short) 100);
        basicMethods39.addElementToSet(intSet72, (int) (short) -1);
        basicMethods29.addElementToSet(intSet72, 10);
        basicMethods0.addElementToSet(intSet72, 100);
        int int83 = basicMethods0.abs((-36));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test211");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int6 = basicMethods0.getMin((-9), 1);
        int int8 = basicMethods0.abs((-259));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test212");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 100);
        int int15 = basicMethods10.abs(4);
        BasicMethods basicMethods16 = new BasicMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods16.addElementToSet(intSet45, (int) (short) 100);
        basicMethods10.addElementToSet(intSet45, (int) '4');
        basicMethods1.addElementToSet(intSet45, 8);
        basicMethods0.addElementToSet(intSet45, (-5));
        int int57 = basicMethods0.getMin((-32), 3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test213");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        BasicMethods basicMethods42 = new BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, (int) (byte) 1);
        basicMethods41.incrementNumberAtIndex(intArray43, 1);
        basicMethods0.incrementNumberAtIndex(intArray43, 0);
        BasicMethods basicMethods50 = new BasicMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        basicMethods50.addElementToSet(intSet79, (int) (short) 100);
        basicMethods0.addElementToSet(intSet79, (int) (short) -1);
        int int87 = basicMethods0.getMin((int) (short) 0, 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test214");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        int int42 = basicMethods0.abs((int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        basicMethods0.addElementToSet(intSet43, (-10));
        int int47 = basicMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test215");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        int int16 = basicMethods0.abs((int) (short) 1);
        BasicMethods basicMethods17 = new BasicMethods();
        int int20 = basicMethods17.getMin(0, 0);
        int int22 = basicMethods17.abs((int) (short) 0);
        int[] intArray28 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods17.incrementNumberAtIndex(intArray28, (-3));
        BasicMethods basicMethods31 = new BasicMethods();
        int int34 = basicMethods31.getMin(0, 0);
        int int36 = basicMethods31.abs((-2));
        int int39 = basicMethods31.getMin((-1), 2);
        int int42 = basicMethods31.getMin(1, 7);
        int int45 = basicMethods31.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods31.addElementToSet(intSet66, (int) (short) 1);
        BasicMethods basicMethods70 = new BasicMethods();
        int[] intArray71 = new int[] {};
        basicMethods70.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        basicMethods31.incrementNumberAtIndex(intArray71, 1);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 5, (-19), (-36), 0, (-7), (-4), (-19) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        basicMethods31.addElementToSet(intSet84, 7);
        basicMethods17.addElementToSet(intSet84, (-36));
        basicMethods0.addElementToSet(intSet84, 10);
        int int93 = basicMethods0.abs(6);
        int int96 = basicMethods0.getMin((-20), (-32));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test216");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs((-1));
        int int12 = basicMethods0.getMin((-19), 0);
        int int14 = basicMethods0.abs((int) (short) 100);
        int int16 = basicMethods0.abs(7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test217");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int71 = basicMethods0.abs(4);
        int int73 = basicMethods0.abs(0);
        int int76 = basicMethods0.getMin((-1), 2);
        int int78 = basicMethods0.abs(0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test218");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        BasicMethods basicMethods12 = new BasicMethods();
        int int15 = basicMethods12.getMin(0, 0);
        int int17 = basicMethods12.abs((-2));
        int[] intArray24 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods12.incrementNumberAtIndex(intArray24, 4);
        basicMethods0.incrementNumberAtIndex(intArray24, 0);
        int int31 = basicMethods0.getMin(10, (-8));
        BasicMethods basicMethods32 = new BasicMethods();
        BasicMethods basicMethods33 = new BasicMethods();
        int int36 = basicMethods33.getMin(0, 0);
        int int38 = basicMethods33.abs((-2));
        int int41 = basicMethods33.getMin((-1), 2);
        BasicMethods basicMethods42 = new BasicMethods();
        int int45 = basicMethods42.getMin(0, 100);
        int int47 = basicMethods42.abs(4);
        BasicMethods basicMethods48 = new BasicMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods48.addElementToSet(intSet77, (int) (short) 100);
        basicMethods42.addElementToSet(intSet77, (int) '4');
        basicMethods33.addElementToSet(intSet77, 8);
        basicMethods32.addElementToSet(intSet77, (-5));
        basicMethods0.addElementToSet(intSet77, 100);
        int int91 = basicMethods0.getMin((-11), (-131));
        int int93 = basicMethods0.abs((-7));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test219");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs((-9));
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        BasicMethods basicMethods10 = new BasicMethods();
        int int13 = basicMethods10.getMin(0, 0);
        int int15 = basicMethods10.abs((int) (short) 0);
        int[] intArray20 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods10.incrementNumberAtIndex(intArray20, 0);
        BasicMethods basicMethods23 = new BasicMethods();
        int int26 = basicMethods23.getMin(0, 0);
        int int28 = basicMethods23.abs((-2));
        int[] intArray35 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods23.incrementNumberAtIndex(intArray35, 4);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods23.addElementToSet(intSet58, 6);
        basicMethods10.addElementToSet(intSet58, (-100));
        basicMethods6.addElementToSet(intSet58, (int) (short) -1);
        basicMethods0.addElementToSet(intSet58, (-11));
        int int69 = basicMethods0.abs((int) (short) 1);
        int int72 = basicMethods0.getMin((-515), 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test220");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        BasicMethods basicMethods4 = new BasicMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods4.addElementToSet(intSet33, (int) (short) 100);
        basicMethods0.addElementToSet(intSet33, (int) (short) -1);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((int) (short) 0);
        int[] intArray49 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods39.incrementNumberAtIndex(intArray49, 0);
        basicMethods0.incrementNumberAtIndex(intArray49, (-1));
        int int55 = basicMethods0.abs((int) (byte) 100);
        int int58 = basicMethods0.getMin((-131), (-20));
        int int61 = basicMethods0.getMin((-100), (int) '4');
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test221");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs((-4));
        int int7 = basicMethods0.abs((-67));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test222");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, 6);
        int int40 = basicMethods0.abs((-35));
        int int42 = basicMethods0.abs((-4));
        int int45 = basicMethods0.getMin((int) (short) 10, (-8));
        int int47 = basicMethods0.abs(0);
        int int50 = basicMethods0.getMin(0, 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test223");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 100);
        int int6 = basicMethods1.abs(4);
        BasicMethods basicMethods7 = new BasicMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods7.addElementToSet(intSet36, (int) (short) 100);
        basicMethods1.addElementToSet(intSet36, (int) '4');
        BasicMethods basicMethods42 = new BasicMethods();
        BasicMethods basicMethods43 = new BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, (int) (byte) 1);
        basicMethods42.incrementNumberAtIndex(intArray44, 1);
        basicMethods1.incrementNumberAtIndex(intArray44, 0);
        basicMethods0.incrementNumberAtIndex(intArray44, (-1));
        int int55 = basicMethods0.getMin((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test224");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int7 = basicMethods0.abs(0);
        int int9 = basicMethods0.abs(2);
        int int12 = basicMethods0.getMin((int) (byte) 10, (int) (short) 1);
        int int15 = basicMethods0.getMin(0, (-8));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test225");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int int8 = basicMethods0.getMin((-35), (-19));
        int int11 = basicMethods0.getMin((-1), (-67));
        int int13 = basicMethods0.abs((int) '4');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test226");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin(1, 7);
        int int14 = basicMethods0.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods0.addElementToSet(intSet35, (int) (short) 1);
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int int47 = basicMethods39.getMin((-1), 2);
        BasicMethods basicMethods48 = new BasicMethods();
        int int51 = basicMethods48.getMin(0, 100);
        int int53 = basicMethods48.abs(4);
        BasicMethods basicMethods54 = new BasicMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        basicMethods54.addElementToSet(intSet83, (int) (short) 100);
        basicMethods48.addElementToSet(intSet83, (int) '4');
        basicMethods39.addElementToSet(intSet83, 8);
        basicMethods0.addElementToSet(intSet83, (-5));
        int int95 = basicMethods0.getMin((-131), 7);
        int int97 = basicMethods0.abs((-1));
        int int99 = basicMethods0.abs(3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test227");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        BasicMethods basicMethods6 = new BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, (int) (byte) 1);
        BasicMethods basicMethods10 = new BasicMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        basicMethods10.addElementToSet(intSet39, (int) (short) 100);
        basicMethods6.addElementToSet(intSet39, (int) (short) -1);
        BasicMethods basicMethods45 = new BasicMethods();
        int int48 = basicMethods45.getMin(0, 0);
        int int50 = basicMethods45.abs((int) (short) 0);
        int[] intArray55 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods45.incrementNumberAtIndex(intArray55, 0);
        basicMethods6.incrementNumberAtIndex(intArray55, (-1));
        basicMethods0.incrementNumberAtIndex(intArray55, 0);
        int int63 = basicMethods0.abs(1);
        BasicMethods basicMethods64 = new BasicMethods();
        BasicMethods basicMethods65 = new BasicMethods();
        int int68 = basicMethods65.getMin(0, 0);
        int int70 = basicMethods65.abs((-2));
        int[] intArray77 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods65.incrementNumberAtIndex(intArray77, 4);
        basicMethods64.incrementNumberAtIndex(intArray77, (int) (short) 1);
        basicMethods0.incrementNumberAtIndex(intArray77, 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test228");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int int8 = basicMethods0.getMin((-1), 2);
        int int11 = basicMethods0.getMin((int) (short) 0, (int) (byte) 1);
        int int13 = basicMethods0.abs((int) (short) 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test229");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs(8);
        int int8 = basicMethods0.getMin((int) (byte) -1, 100);
        BasicMethods basicMethods9 = new BasicMethods();
        int[] intArray10 = new int[] {};
        basicMethods9.incrementNumberAtIndex(intArray10, (int) (byte) 1);
        BasicMethods basicMethods13 = new BasicMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        basicMethods13.addElementToSet(intSet42, (int) (short) 100);
        basicMethods9.addElementToSet(intSet42, (int) (short) -1);
        BasicMethods basicMethods48 = new BasicMethods();
        int int51 = basicMethods48.getMin(0, 0);
        int int53 = basicMethods48.abs((int) (short) 0);
        int[] intArray58 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods48.incrementNumberAtIndex(intArray58, 0);
        basicMethods9.incrementNumberAtIndex(intArray58, (-1));
        basicMethods0.incrementNumberAtIndex(intArray58, (-8));
        int int67 = basicMethods0.getMin((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test230");
        BasicMethods basicMethods0 = new BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, (int) (byte) 1);
        int int5 = basicMethods0.abs((-1));
        BasicMethods basicMethods6 = new BasicMethods();
        int int9 = basicMethods6.getMin(0, 0);
        int int11 = basicMethods6.abs((int) (short) 0);
        int[] intArray17 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods6.incrementNumberAtIndex(intArray17, (-3));
        int int22 = basicMethods6.getMin(100, (-31));
        BasicMethods basicMethods23 = new BasicMethods();
        BasicMethods basicMethods24 = new BasicMethods();
        BasicMethods basicMethods25 = new BasicMethods();
        int[] intArray26 = new int[] {};
        basicMethods25.incrementNumberAtIndex(intArray26, (int) (byte) 1);
        basicMethods24.incrementNumberAtIndex(intArray26, 1);
        int int33 = basicMethods24.getMin((-100), 9);
        int int36 = basicMethods24.getMin(6, 10);
        int int38 = basicMethods24.abs((-3));
        BasicMethods basicMethods39 = new BasicMethods();
        int int42 = basicMethods39.getMin(0, 0);
        int int44 = basicMethods39.abs((-2));
        int[] intArray51 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods39.incrementNumberAtIndex(intArray51, 4);
        basicMethods24.incrementNumberAtIndex(intArray51, 1);
        basicMethods23.incrementNumberAtIndex(intArray51, 5);
        basicMethods6.incrementNumberAtIndex(intArray51, (-3));
        basicMethods0.incrementNumberAtIndex(intArray51, 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test231");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        BasicMethods basicMethods13 = new BasicMethods();
        int int16 = basicMethods13.getMin(0, 0);
        int int18 = basicMethods13.abs((-2));
        int[] intArray25 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods13.incrementNumberAtIndex(intArray25, 4);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        basicMethods13.addElementToSet(intSet48, 6);
        basicMethods0.addElementToSet(intSet48, (-100));
        BasicMethods basicMethods54 = new BasicMethods();
        int int57 = basicMethods54.getMin(0, 0);
        int int59 = basicMethods54.abs((int) (short) 0);
        int[] intArray65 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods54.incrementNumberAtIndex(intArray65, (-3));
        basicMethods0.incrementNumberAtIndex(intArray65, 100);
        int int72 = basicMethods0.getMin((int) (byte) 100, 0);
        int int74 = basicMethods0.abs((int) (byte) 1);
        int int77 = basicMethods0.getMin((int) '4', (-2));
        int int79 = basicMethods0.abs((-35));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test232");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray11 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods0.incrementNumberAtIndex(intArray11, (-3));
        BasicMethods basicMethods14 = new BasicMethods();
        int int17 = basicMethods14.getMin(0, 0);
        int int19 = basicMethods14.abs((int) (short) 0);
        int[] intArray24 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods14.incrementNumberAtIndex(intArray24, 0);
        BasicMethods basicMethods27 = new BasicMethods();
        int int30 = basicMethods27.getMin(0, 0);
        int int32 = basicMethods27.abs((-2));
        int[] intArray39 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods27.incrementNumberAtIndex(intArray39, 4);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        basicMethods27.addElementToSet(intSet62, 6);
        basicMethods14.addElementToSet(intSet62, (-100));
        basicMethods0.addElementToSet(intSet62, (-5));
        int int71 = basicMethods0.abs(4);
        int int73 = basicMethods0.abs(4);
        int int75 = basicMethods0.abs(1);
        int int78 = basicMethods0.getMin((int) 'a', (-10));
        int int80 = basicMethods0.abs(5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test233");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((-2));
        int[] intArray12 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods0.incrementNumberAtIndex(intArray12, 4);
        int int17 = basicMethods0.getMin((-9), (int) '4');
        int int19 = basicMethods0.abs((int) '#');
        BasicMethods basicMethods20 = new BasicMethods();
        int int23 = basicMethods20.getMin(0, 0);
        int int25 = basicMethods20.abs((-2));
        int[] intArray32 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods20.incrementNumberAtIndex(intArray32, 4);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        basicMethods20.addElementToSet(intSet55, 6);
        basicMethods0.addElementToSet(intSet55, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test234");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 0);
        int int5 = basicMethods0.abs((int) (short) 0);
        int[] intArray10 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods0.incrementNumberAtIndex(intArray10, 0);
        int int15 = basicMethods0.getMin((-31), 0);
        int int17 = basicMethods0.abs((-19));
        int int20 = basicMethods0.getMin(1, 6);
        int int23 = basicMethods0.getMin((int) (short) 100, 100);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test235");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int int4 = basicMethods1.getMin(0, 0);
        int int6 = basicMethods1.abs((-2));
        int int9 = basicMethods1.getMin((-1), 2);
        int int12 = basicMethods1.getMin(1, 7);
        int int15 = basicMethods1.getMin((-32), (int) (byte) 10);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, (-32), 10, 4, 2, (-1), (-5), (-3), (-3), 5, 100, (-1), 1, (-100), 3, 7, (-2), (-19), (-19) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods1.addElementToSet(intSet36, (int) (short) 1);
        basicMethods0.addElementToSet(intSet36, 7);
        int int43 = basicMethods0.abs((-18));
        int int46 = basicMethods0.getMin(1, 5);
        BasicMethods basicMethods47 = new BasicMethods();
        int int50 = basicMethods47.getMin(0, 0);
        int int52 = basicMethods47.abs((-2));
        int[] intArray59 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods47.incrementNumberAtIndex(intArray59, 4);
        basicMethods0.incrementNumberAtIndex(intArray59, (-9));
        int int66 = basicMethods0.getMin(10, 8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test236");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, (int) (byte) 1);
        basicMethods0.incrementNumberAtIndex(intArray2, 1);
        int int9 = basicMethods0.getMin((-100), 9);
        int int12 = basicMethods0.getMin(6, 10);
        int int15 = basicMethods0.getMin((int) (byte) 100, (-11));
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((int) (short) 0);
        int[] intArray26 = new int[] { (-1), 1, (-7), (-7) };
        basicMethods16.incrementNumberAtIndex(intArray26, 0);
        BasicMethods basicMethods29 = new BasicMethods();
        int int32 = basicMethods29.getMin(0, 0);
        int int34 = basicMethods29.abs((-2));
        int[] intArray41 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods29.incrementNumberAtIndex(intArray41, 4);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-8), (-6), (-10), 0, 8, 1, 1, (-6), (-2), (-2), (-8), (-7), 1, (-5), (-6), (-1), (-10), (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods29.addElementToSet(intSet64, 6);
        basicMethods16.addElementToSet(intSet64, (-100));
        BasicMethods basicMethods70 = new BasicMethods();
        int int73 = basicMethods70.getMin(0, 0);
        int int75 = basicMethods70.abs((int) (short) 0);
        int[] intArray81 = new int[] { (short) 10, 100, (-100), 0, 1 };
        basicMethods70.incrementNumberAtIndex(intArray81, (-3));
        basicMethods16.incrementNumberAtIndex(intArray81, 100);
        basicMethods0.incrementNumberAtIndex(intArray81, (int) ' ');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test237");
        BasicMethods basicMethods0 = new BasicMethods();
        BasicMethods basicMethods1 = new BasicMethods();
        BasicMethods basicMethods2 = new BasicMethods();
        int[] intArray3 = new int[] {};
        basicMethods2.incrementNumberAtIndex(intArray3, (int) (byte) 1);
        basicMethods1.incrementNumberAtIndex(intArray3, 1);
        int int10 = basicMethods1.getMin((-100), 9);
        int int13 = basicMethods1.getMin(6, 10);
        int int15 = basicMethods1.abs((-3));
        BasicMethods basicMethods16 = new BasicMethods();
        int int19 = basicMethods16.getMin(0, 0);
        int int21 = basicMethods16.abs((-2));
        int[] intArray28 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods16.incrementNumberAtIndex(intArray28, 4);
        basicMethods1.incrementNumberAtIndex(intArray28, 1);
        basicMethods0.incrementNumberAtIndex(intArray28, 5);
        int int37 = basicMethods0.getMin((-67), (-18));
        int int39 = basicMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test238");
        BasicMethods basicMethods0 = new BasicMethods();
        int int3 = basicMethods0.getMin(0, 100);
        int int5 = basicMethods0.abs(4);
        BasicMethods basicMethods6 = new BasicMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        basicMethods6.addElementToSet(intSet35, (int) (short) 100);
        basicMethods0.addElementToSet(intSet35, (int) '4');
        BasicMethods basicMethods41 = new BasicMethods();
        int int44 = basicMethods41.getMin(0, 0);
        int int46 = basicMethods41.abs((-2));
        int[] intArray53 = new int[] { '#', (-4), 1, 10, (short) -1, 0 };
        basicMethods41.incrementNumberAtIndex(intArray53, 4);
        basicMethods0.incrementNumberAtIndex(intArray53, 10);
        BasicMethods basicMethods58 = new BasicMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        basicMethods58.addElementToSet(intSet87, (int) (short) 100);
        basicMethods0.addElementToSet(intSet87, (-3));
        int int94 = basicMethods0.abs(10);
        int int96 = basicMethods0.abs(0);
        int[] intArray97 = null;
        basicMethods0.incrementNumberAtIndex(intArray97, (-35));
    }
}

