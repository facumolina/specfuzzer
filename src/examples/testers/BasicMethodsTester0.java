package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicMethodsTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test001");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        int int11 = basicMethods0.getMin((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test002");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int52 = basicMethods0.abs((int) (short) 10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test003");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, (-7));
        int int36 = basicMethods0.getMin(8, (-1));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test004");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        double double6 = basicMethods0.sum_doubles((double) (-8), (double) 100L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test005");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((-8));
        int int7 = basicMethods0.abs((int) '#');
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        basicMethods0.addElementToSet(intSet34, (-5));
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int int41 = basicMethods38.getMin((-100), 0);
        int int43 = basicMethods38.abs((int) '4');
        int int46 = basicMethods38.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods47 = new gassert.BasicMethods();
        int int50 = basicMethods47.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods51 = new gassert.BasicMethods();
        int[] intArray52 = new int[] {};
        basicMethods51.incrementNumberAtIndex(intArray52, 6);
        gassert.BasicMethods basicMethods55 = new gassert.BasicMethods();
        int[] intArray56 = new int[] {};
        basicMethods55.incrementNumberAtIndex(intArray56, 6);
        gassert.BasicMethods basicMethods59 = new gassert.BasicMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        basicMethods59.addElementToSet(intSet71, (-10));
        basicMethods55.addElementToSet(intSet71, 7);
        basicMethods51.addElementToSet(intSet71, (-5));
        basicMethods47.addElementToSet(intSet71, 2);
        basicMethods38.addElementToSet(intSet71, (-100));
        basicMethods0.addElementToSet(intSet71, (-3));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test006");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        int int10 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods11 = new gassert.BasicMethods();
        int int14 = basicMethods11.getMin((-1), (int) (byte) 1);
        int[] intArray20 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods11.incrementNumberAtIndex(intArray20, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray20, 100);
        int int27 = basicMethods0.getMin(52, 32);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test007");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        basicMethods10.addElementToSet(intSet22, (-10));
        basicMethods6.addElementToSet(intSet22, 7);
        basicMethods0.addElementToSet(intSet22, 10);
        double double32 = basicMethods0.sum_doubles((double) (short) -1, (double) 97);
        gassert.BasicMethods basicMethods33 = new gassert.BasicMethods();
        int int36 = basicMethods33.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods33.addElementToSet(intSet66, 8);
        double double72 = basicMethods33.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods73 = new gassert.BasicMethods();
        int[] intArray74 = new int[] {};
        basicMethods73.incrementNumberAtIndex(intArray74, 6);
        basicMethods33.incrementNumberAtIndex(intArray74, (int) (byte) 100);
        basicMethods0.incrementNumberAtIndex(intArray74, (-6));
        double double83 = basicMethods0.sum_doubles((double) (-5), 10.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test008");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(52, (int) ' ');
        double double39 = basicMethods0.sum_doubles(0.0d, (double) (byte) 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test009");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int25 = basicMethods0.abs(2);
        int int27 = basicMethods0.abs(32);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test010");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        int int5 = basicMethods0.abs(100);
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-100), 0);
        int int11 = basicMethods6.abs((-8));
        int int13 = basicMethods6.abs((int) '#');
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods6.addElementToSet(intSet40, (-5));
        basicMethods0.addElementToSet(intSet40, (int) (short) 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test011");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray9 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods4.incrementNumberAtIndex(intArray9, (-8));
        basicMethods0.incrementNumberAtIndex(intArray9, 9);
        int int15 = basicMethods0.abs(10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test012");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin(100, (-10));
        int int6 = basicMethods0.getMin(100, (-2));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test013");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        double double36 = basicMethods12.sum_doubles((double) (-6), (double) (-1L));
        int int39 = basicMethods12.getMin((int) (short) 1, (-3));
        double double42 = basicMethods12.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-1), (int) (byte) 1);
        int[] intArray52 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods43.incrementNumberAtIndex(intArray52, (int) (short) 0);
        basicMethods12.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        basicMethods57.incrementNumberAtIndex(intArray62, (-7));
        basicMethods12.incrementNumberAtIndex(intArray62, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        int int72 = basicMethods0.abs((int) 'a');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test014");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        double double6 = basicMethods0.sum_doubles(10.0d, (double) '#');
        gassert.BasicMethods basicMethods7 = new gassert.BasicMethods();
        int int10 = basicMethods7.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods11 = new gassert.BasicMethods();
        int[] intArray12 = new int[] {};
        basicMethods11.incrementNumberAtIndex(intArray12, 6);
        gassert.BasicMethods basicMethods15 = new gassert.BasicMethods();
        int[] intArray16 = new int[] {};
        basicMethods15.incrementNumberAtIndex(intArray16, 6);
        gassert.BasicMethods basicMethods19 = new gassert.BasicMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        basicMethods19.addElementToSet(intSet31, (-10));
        basicMethods15.addElementToSet(intSet31, 7);
        basicMethods11.addElementToSet(intSet31, (-5));
        basicMethods7.addElementToSet(intSet31, 2);
        int[] intArray46 = new int[] { (-100), (-2), (byte) 100, 52, (byte) 0 };
        basicMethods7.incrementNumberAtIndex(intArray46, 0);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        gassert.BasicMethods basicMethods53 = new gassert.BasicMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        basicMethods53.addElementToSet(intSet65, (-10));
        basicMethods49.addElementToSet(intSet65, 7);
        double double73 = basicMethods49.sum_doubles((double) (-6), (double) (-1L));
        int int76 = basicMethods49.getMin((int) (short) 1, (-3));
        double double79 = basicMethods49.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods80 = new gassert.BasicMethods();
        int int83 = basicMethods80.getMin((-1), (int) (byte) 1);
        int[] intArray89 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods80.incrementNumberAtIndex(intArray89, (int) (short) 0);
        basicMethods49.incrementNumberAtIndex(intArray89, (int) (byte) 1);
        basicMethods7.incrementNumberAtIndex(intArray89, 0);
        basicMethods0.incrementNumberAtIndex(intArray89, (-10));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test015");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin(2, (int) (byte) 100);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet55 = null;
        basicMethods54.addElementToSet(intSet55, 0);
        int int59 = basicMethods54.abs((-8));
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int int63 = basicMethods60.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods64 = new gassert.BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, 6);
        basicMethods60.incrementNumberAtIndex(intArray65, (-7));
        basicMethods54.incrementNumberAtIndex(intArray65, (-100));
        basicMethods0.incrementNumberAtIndex(intArray65, (-1));
        int int76 = basicMethods0.getMin((int) (short) 1, 97);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test016");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        int int5 = basicMethods0.abs(100);
        int int8 = basicMethods0.getMin((int) ' ', 10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test017");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        double double27 = basicMethods0.sum_doubles((double) 1L, (double) 1L);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        int int31 = basicMethods28.getMin((-100), 0);
        int int33 = basicMethods28.abs((int) '4');
        int int36 = basicMethods28.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods37 = new gassert.BasicMethods();
        int int40 = basicMethods37.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods41 = new gassert.BasicMethods();
        int[] intArray42 = new int[] {};
        basicMethods41.incrementNumberAtIndex(intArray42, 6);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int[] intArray46 = new int[] {};
        basicMethods45.incrementNumberAtIndex(intArray46, 6);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        basicMethods49.addElementToSet(intSet61, (-10));
        basicMethods45.addElementToSet(intSet61, 7);
        basicMethods41.addElementToSet(intSet61, (-5));
        basicMethods37.addElementToSet(intSet61, 2);
        basicMethods28.addElementToSet(intSet61, (-100));
        basicMethods0.addElementToSet(intSet61, (-100));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test018");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        int int42 = basicMethods0.getMin(5, 1);
        double double45 = basicMethods0.sum_doubles((double) (-4), (double) (-6));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test019");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int31 = basicMethods0.abs((-8));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test020");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(35, 0);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        int[] intArray15 = new int[] {};
        basicMethods14.incrementNumberAtIndex(intArray15, 6);
        gassert.BasicMethods basicMethods18 = new gassert.BasicMethods();
        int[] intArray19 = new int[] {};
        basicMethods18.incrementNumberAtIndex(intArray19, 6);
        gassert.BasicMethods basicMethods22 = new gassert.BasicMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        basicMethods22.addElementToSet(intSet34, (-10));
        basicMethods18.addElementToSet(intSet34, 7);
        basicMethods14.addElementToSet(intSet34, (-5));
        basicMethods10.addElementToSet(intSet34, 2);
        int int46 = basicMethods10.getMin(52, (int) ' ');
        int int49 = basicMethods10.getMin(100, (int) (byte) 100);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int int53 = basicMethods50.getMin((-100), 0);
        int int55 = basicMethods50.abs(0);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        basicMethods56.addElementToSet(intSet68, (-10));
        basicMethods50.addElementToSet(intSet68, 2);
        basicMethods10.addElementToSet(intSet68, 0);
        basicMethods0.addElementToSet(intSet68, (int) (short) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test021");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin(2, (int) (byte) 100);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet55 = null;
        basicMethods54.addElementToSet(intSet55, 0);
        int int59 = basicMethods54.abs((-8));
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int int63 = basicMethods60.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods64 = new gassert.BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, 6);
        basicMethods60.incrementNumberAtIndex(intArray65, (-7));
        basicMethods54.incrementNumberAtIndex(intArray65, (-100));
        basicMethods0.incrementNumberAtIndex(intArray65, (-1));
        double double76 = basicMethods0.sum_doubles(0.0d, (double) 32);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test022");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int32 = basicMethods0.getMin((-9), (int) (short) -1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test023");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        basicMethods6.addElementToSet(intSet18, (-10));
        basicMethods0.addElementToSet(intSet18, 2);
        int int26 = basicMethods0.getMin((-6), 7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test024");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((-8));
        int int7 = basicMethods0.abs((int) '#');
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        basicMethods0.addElementToSet(intSet34, (-5));
        int int39 = basicMethods0.abs((-100));
        int int41 = basicMethods0.abs(0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test025");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int14 = basicMethods0.abs((int) (short) 1);
        int int16 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods17 = new gassert.BasicMethods();
        int int20 = basicMethods17.getMin((-100), 0);
        int int22 = basicMethods17.abs((-8));
        int int24 = basicMethods17.abs((int) '#');
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        basicMethods17.addElementToSet(intSet51, (-5));
        basicMethods0.addElementToSet(intSet51, 10);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-100), 0);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray66 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods61.incrementNumberAtIndex(intArray66, (-8));
        basicMethods57.incrementNumberAtIndex(intArray66, 9);
        basicMethods0.incrementNumberAtIndex(intArray66, (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test026");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int52 = basicMethods0.abs(1);
        double double55 = basicMethods0.sum_doubles((double) 32, (double) 3);
        double double58 = basicMethods0.sum_doubles((double) 100, (double) (-100));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test027");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        basicMethods6.incrementNumberAtIndex(intArray11, (-7));
        basicMethods0.incrementNumberAtIndex(intArray11, (-100));
        int[] intArray21 = new int[] { (-9), 'a', '4' };
        basicMethods0.incrementNumberAtIndex(intArray21, (-6));
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        basicMethods0.addElementToSet(intSet24, (int) (byte) 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test028");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 10 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods0.addElementToSet(intSet28, (-10));
        int int33 = basicMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test029");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        double double11 = basicMethods0.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods12.addElementToSet(intSet45, 8);
        double double51 = basicMethods12.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int int55 = basicMethods52.getMin((-100), 0);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray61 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods56.incrementNumberAtIndex(intArray61, (-8));
        basicMethods52.incrementNumberAtIndex(intArray61, 9);
        basicMethods12.incrementNumberAtIndex(intArray61, 0);
        basicMethods0.incrementNumberAtIndex(intArray61, 0);
        int int71 = basicMethods0.abs((-4));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test030");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int int7 = basicMethods4.getMin((-100), 0);
        int int9 = basicMethods4.abs((int) '4');
        int int12 = basicMethods4.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods13 = new gassert.BasicMethods();
        int int16 = basicMethods13.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods17 = new gassert.BasicMethods();
        int[] intArray18 = new int[] {};
        basicMethods17.incrementNumberAtIndex(intArray18, 6);
        gassert.BasicMethods basicMethods21 = new gassert.BasicMethods();
        int[] intArray22 = new int[] {};
        basicMethods21.incrementNumberAtIndex(intArray22, 6);
        gassert.BasicMethods basicMethods25 = new gassert.BasicMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        basicMethods25.addElementToSet(intSet37, (-10));
        basicMethods21.addElementToSet(intSet37, 7);
        basicMethods17.addElementToSet(intSet37, (-5));
        basicMethods13.addElementToSet(intSet37, 2);
        basicMethods4.addElementToSet(intSet37, (-100));
        basicMethods0.addElementToSet(intSet37, 2);
        int[] intArray51 = null;
        basicMethods0.incrementNumberAtIndex(intArray51, (-6));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test031");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        basicMethods0.incrementNumberAtIndex(intArray5, (-7));
        int int12 = basicMethods0.getMin((-9), 35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test032");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 9);
        basicMethods0.incrementNumberAtIndex(intArray49, 0);
        int int57 = basicMethods0.abs(1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test033");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet12 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet12, intArray11);
        basicMethods0.addElementToSet(intSet12, (-10));
        java.util.HashSet<java.lang.Integer> intSet16 = null;
        basicMethods0.addElementToSet(intSet16, 7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test034");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(3, (int) (short) 100);
        double double12 = basicMethods0.sum_doubles((double) 0L, 96.0d);
        double double15 = basicMethods0.sum_doubles((double) '#', (double) 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test035");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        int int33 = basicMethods0.getMin(3, 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test036");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int24 = basicMethods0.getMin(6, (int) (byte) 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test037");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        double double39 = basicMethods0.sum_doubles((double) (-6), (double) '#');
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int int47 = basicMethods44.getMin((-100), 0);
        int int49 = basicMethods44.abs((int) '4');
        int int52 = basicMethods44.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods53 = new gassert.BasicMethods();
        int int56 = basicMethods53.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int[] intArray58 = new int[] {};
        basicMethods57.incrementNumberAtIndex(intArray58, 6);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        gassert.BasicMethods basicMethods65 = new gassert.BasicMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods65.addElementToSet(intSet77, (-10));
        basicMethods61.addElementToSet(intSet77, 7);
        basicMethods57.addElementToSet(intSet77, (-5));
        basicMethods53.addElementToSet(intSet77, 2);
        basicMethods44.addElementToSet(intSet77, (-100));
        basicMethods40.addElementToSet(intSet77, 2);
        basicMethods0.addElementToSet(intSet77, 6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test038");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        double double11 = basicMethods0.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods12.addElementToSet(intSet45, 8);
        double double51 = basicMethods12.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int int55 = basicMethods52.getMin((-100), 0);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray61 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods56.incrementNumberAtIndex(intArray61, (-8));
        basicMethods52.incrementNumberAtIndex(intArray61, 9);
        basicMethods12.incrementNumberAtIndex(intArray61, 0);
        basicMethods0.incrementNumberAtIndex(intArray61, 0);
        double double72 = basicMethods0.sum_doubles((double) 3, (double) 52);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test039");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        gassert.BasicMethods basicMethods1 = new gassert.BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, 6);
        gassert.BasicMethods basicMethods5 = new gassert.BasicMethods();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet17 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        basicMethods5.addElementToSet(intSet17, (-10));
        basicMethods1.addElementToSet(intSet17, 7);
        int int24 = basicMethods1.abs(0);
        int int27 = basicMethods1.getMin(0, (int) (short) 0);
        int int29 = basicMethods1.abs((int) (byte) 1);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-9), 35, (-100), 100, (-6), 10, (-100), (-7), (-8), 0, 0, 0, (-1), 4, 10 };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        basicMethods1.addElementToSet(intSet46, (int) (byte) 0);
        basicMethods0.addElementToSet(intSet46, (-1));
        int int53 = basicMethods0.abs(2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test040");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int14 = basicMethods0.abs((int) (short) 1);
        double double17 = basicMethods0.sum_doubles(106.0d, (double) (short) 1);
        int int20 = basicMethods0.getMin(2, (int) (byte) 1);
        int int22 = basicMethods0.abs((-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test041");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        double double36 = basicMethods12.sum_doubles((double) (-6), (double) (-1L));
        int int39 = basicMethods12.getMin((int) (short) 1, (-3));
        double double42 = basicMethods12.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-1), (int) (byte) 1);
        int[] intArray52 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods43.incrementNumberAtIndex(intArray52, (int) (short) 0);
        basicMethods12.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        basicMethods57.incrementNumberAtIndex(intArray62, (-7));
        basicMethods12.incrementNumberAtIndex(intArray62, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        int int72 = basicMethods0.abs((int) (byte) 1);
        int int74 = basicMethods0.abs(9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test042");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) '4');
        int int50 = basicMethods0.getMin((int) (byte) -1, 32);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test043");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        gassert.BasicMethods basicMethods34 = new gassert.BasicMethods();
        int int37 = basicMethods34.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int[] intArray39 = new int[] {};
        basicMethods38.incrementNumberAtIndex(intArray39, 6);
        basicMethods34.incrementNumberAtIndex(intArray39, (-7));
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int int47 = basicMethods44.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods44.addElementToSet(intSet77, 8);
        double double83 = basicMethods44.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods84 = new gassert.BasicMethods();
        int[] intArray85 = new int[] {};
        basicMethods84.incrementNumberAtIndex(intArray85, 6);
        basicMethods44.incrementNumberAtIndex(intArray85, (int) (byte) 100);
        basicMethods34.incrementNumberAtIndex(intArray85, 2);
        basicMethods0.incrementNumberAtIndex(intArray85, 0);
        int int96 = basicMethods0.getMin((-4), (-10));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test044");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int52 = basicMethods0.abs(1);
        int int55 = basicMethods0.getMin(97, (int) (short) 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test045");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        int int61 = basicMethods0.abs((int) 'a');
        double double64 = basicMethods0.sum_doubles(26.0d, (-2.0d));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test046");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(35, 0);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods10.addElementToSet(intSet43, 8);
        int int48 = basicMethods10.abs((int) (short) 100);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int int52 = basicMethods49.getMin((-100), 0);
        int int54 = basicMethods49.abs((int) '4');
        int int57 = basicMethods49.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods58 = new gassert.BasicMethods();
        int int61 = basicMethods58.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods62 = new gassert.BasicMethods();
        int[] intArray63 = new int[] {};
        basicMethods62.incrementNumberAtIndex(intArray63, 6);
        gassert.BasicMethods basicMethods66 = new gassert.BasicMethods();
        int[] intArray67 = new int[] {};
        basicMethods66.incrementNumberAtIndex(intArray67, 6);
        gassert.BasicMethods basicMethods70 = new gassert.BasicMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        basicMethods70.addElementToSet(intSet82, (-10));
        basicMethods66.addElementToSet(intSet82, 7);
        basicMethods62.addElementToSet(intSet82, (-5));
        basicMethods58.addElementToSet(intSet82, 2);
        basicMethods49.addElementToSet(intSet82, (-100));
        basicMethods10.addElementToSet(intSet82, (-9));
        basicMethods0.addElementToSet(intSet82, (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test047");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin((int) (short) -1, 10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test048");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int50 = basicMethods0.getMin((int) 'a', (int) '#');
        int int53 = basicMethods0.getMin((-6), (int) 'a');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test049");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 9);
        basicMethods0.incrementNumberAtIndex(intArray49, 0);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int int59 = basicMethods56.getMin((-100), 0);
        int int61 = basicMethods56.abs((int) '4');
        gassert.BasicMethods basicMethods62 = new gassert.BasicMethods();
        int[] intArray63 = new int[] {};
        basicMethods62.incrementNumberAtIndex(intArray63, 6);
        gassert.BasicMethods basicMethods66 = new gassert.BasicMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        basicMethods66.addElementToSet(intSet78, (-10));
        basicMethods62.addElementToSet(intSet78, 7);
        basicMethods56.addElementToSet(intSet78, 10);
        basicMethods0.addElementToSet(intSet78, (int) (byte) 0);
        double double90 = basicMethods0.sum_doubles((double) 32, (double) (byte) 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test050");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int15 = basicMethods0.getMin((int) '#', 4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test051");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int15 = basicMethods0.getMin(7, (-8));
        int int18 = basicMethods0.getMin((-1), (-5));
        gassert.BasicMethods basicMethods19 = new gassert.BasicMethods();
        int int22 = basicMethods19.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        basicMethods19.addElementToSet(intSet52, 8);
        double double58 = basicMethods19.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods59 = new gassert.BasicMethods();
        int[] intArray60 = new int[] {};
        basicMethods59.incrementNumberAtIndex(intArray60, 6);
        basicMethods19.incrementNumberAtIndex(intArray60, (int) (byte) 100);
        gassert.BasicMethods basicMethods65 = new gassert.BasicMethods();
        int int68 = basicMethods65.getMin((-100), 0);
        gassert.BasicMethods basicMethods69 = new gassert.BasicMethods();
        int[] intArray74 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods69.incrementNumberAtIndex(intArray74, (-8));
        basicMethods65.incrementNumberAtIndex(intArray74, 97);
        basicMethods19.incrementNumberAtIndex(intArray74, 1);
        basicMethods0.incrementNumberAtIndex(intArray74, 5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test052");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin((int) (byte) 100, (-2));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test053");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        double double8 = basicMethods0.sum_doubles((double) 1, 2.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test054");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int32 = basicMethods0.abs((-1));
        gassert.BasicMethods basicMethods33 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet34 = null;
        basicMethods33.addElementToSet(intSet34, 0);
        int int38 = basicMethods33.abs((-8));
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        int int42 = basicMethods39.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, 6);
        basicMethods39.incrementNumberAtIndex(intArray44, (-7));
        basicMethods33.incrementNumberAtIndex(intArray44, (-100));
        int[] intArray54 = new int[] { (-9), 'a', '4' };
        basicMethods33.incrementNumberAtIndex(intArray54, (-6));
        basicMethods0.incrementNumberAtIndex(intArray54, (-7));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test055");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        gassert.BasicMethods basicMethods1 = new gassert.BasicMethods();
        int[] intArray2 = new int[] {};
        basicMethods1.incrementNumberAtIndex(intArray2, 6);
        gassert.BasicMethods basicMethods5 = new gassert.BasicMethods();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet17 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        basicMethods5.addElementToSet(intSet17, (-10));
        basicMethods1.addElementToSet(intSet17, 7);
        int int24 = basicMethods1.abs(0);
        int int27 = basicMethods1.getMin(0, (int) (short) 0);
        int int29 = basicMethods1.abs((int) (byte) 1);
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-9), 35, (-100), 100, (-6), 10, (-100), (-7), (-8), 0, 0, 0, (-1), 4, 10 };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        basicMethods1.addElementToSet(intSet46, (int) (byte) 0);
        basicMethods0.addElementToSet(intSet46, (-1));
        int int54 = basicMethods0.getMin((-1), (int) (byte) 100);
        int int56 = basicMethods0.abs(8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test056");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        double double36 = basicMethods0.sum_doubles((double) (-1), (double) 3);
        double double39 = basicMethods0.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 97);
        basicMethods0.incrementNumberAtIndex(intArray49, (int) (byte) 0);
        double double58 = basicMethods0.sum_doubles((double) (-6), (double) (-1.0f));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test057");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int32 = basicMethods0.abs((-1));
        java.util.HashSet<java.lang.Integer> intSet33 = null;
        basicMethods0.addElementToSet(intSet33, 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test058");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(3, (int) (short) 100);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-100), 0);
        int int15 = basicMethods10.abs(0);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods10.addElementToSet(intSet28, 2);
        gassert.BasicMethods basicMethods34 = new gassert.BasicMethods();
        int[] intArray35 = new int[] {};
        basicMethods34.incrementNumberAtIndex(intArray35, 6);
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        basicMethods38.addElementToSet(intSet50, (-10));
        basicMethods34.addElementToSet(intSet50, 7);
        double double58 = basicMethods34.sum_doubles((double) (-6), (double) (-1L));
        int int61 = basicMethods34.getMin((int) (short) 1, (-3));
        double double64 = basicMethods34.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods65 = new gassert.BasicMethods();
        int int68 = basicMethods65.getMin((-1), (int) (byte) 1);
        int[] intArray74 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods65.incrementNumberAtIndex(intArray74, (int) (short) 0);
        basicMethods34.incrementNumberAtIndex(intArray74, (int) (byte) 1);
        gassert.BasicMethods basicMethods79 = new gassert.BasicMethods();
        int int82 = basicMethods79.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods83 = new gassert.BasicMethods();
        int[] intArray84 = new int[] {};
        basicMethods83.incrementNumberAtIndex(intArray84, 6);
        basicMethods79.incrementNumberAtIndex(intArray84, (-7));
        basicMethods34.incrementNumberAtIndex(intArray84, (int) (byte) -1);
        basicMethods10.incrementNumberAtIndex(intArray84, (-7));
        basicMethods0.incrementNumberAtIndex(intArray84, (int) '4');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test059");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(3, (int) (short) 100);
        double double12 = basicMethods0.sum_doubles((double) 0L, 96.0d);
        double double15 = basicMethods0.sum_doubles((double) 100L, (double) (-100));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test060");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-100), 0);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray66 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods61.incrementNumberAtIndex(intArray66, (-8));
        basicMethods57.incrementNumberAtIndex(intArray66, 97);
        basicMethods0.incrementNumberAtIndex(intArray66, (-7));
        double double75 = basicMethods0.sum_doubles((double) 0, (double) (-1L));
        int int78 = basicMethods0.getMin((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test061");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int29 = basicMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test062");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        int int8 = basicMethods0.getMin(10, (-2));
        gassert.BasicMethods basicMethods9 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        basicMethods9.addElementToSet(intSet10, 0);
        int int14 = basicMethods9.abs((-8));
        gassert.BasicMethods basicMethods15 = new gassert.BasicMethods();
        int int18 = basicMethods15.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods19 = new gassert.BasicMethods();
        int[] intArray20 = new int[] {};
        basicMethods19.incrementNumberAtIndex(intArray20, 6);
        basicMethods15.incrementNumberAtIndex(intArray20, (-7));
        basicMethods9.incrementNumberAtIndex(intArray20, (-100));
        int[] intArray30 = new int[] { (-9), 'a', '4' };
        basicMethods9.incrementNumberAtIndex(intArray30, (-6));
        gassert.BasicMethods basicMethods33 = new gassert.BasicMethods();
        int int36 = basicMethods33.getMin((-100), 0);
        int int38 = basicMethods33.abs((-8));
        int int40 = basicMethods33.abs((int) '#');
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        basicMethods33.addElementToSet(intSet67, (-5));
        basicMethods9.addElementToSet(intSet67, 3);
        basicMethods0.addElementToSet(intSet67, (-7));
        int int77 = basicMethods0.getMin((-8), 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test063");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin(2, (int) (byte) 100);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        int[] intArray55 = new int[] {};
        basicMethods54.incrementNumberAtIndex(intArray55, 6);
        gassert.BasicMethods basicMethods58 = new gassert.BasicMethods();
        int[] intArray59 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray59, 6);
        gassert.BasicMethods basicMethods62 = new gassert.BasicMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        basicMethods62.addElementToSet(intSet74, (-10));
        basicMethods58.addElementToSet(intSet74, 7);
        basicMethods54.addElementToSet(intSet74, (-5));
        basicMethods0.addElementToSet(intSet74, (int) (short) -1);
        int int85 = basicMethods0.abs(2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test064");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int14 = basicMethods0.abs((int) (short) 1);
        int int16 = basicMethods0.abs((int) '4');
        double double19 = basicMethods0.sum_doubles((double) 0, (double) 1L);
        double double22 = basicMethods0.sum_doubles((double) 10, (double) (short) 100);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test065");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray5 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods0.incrementNumberAtIndex(intArray5, (-8));
        int int9 = basicMethods0.abs(1);
        int int12 = basicMethods0.getMin(0, (int) (byte) 100);
        double double15 = basicMethods0.sum_doubles((double) (-6), 53.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test066");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        gassert.BasicMethods basicMethods51 = new gassert.BasicMethods();
        int[] intArray52 = new int[] {};
        basicMethods51.incrementNumberAtIndex(intArray52, 6);
        int int56 = basicMethods51.abs(100);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int[] intArray58 = new int[] {};
        basicMethods57.incrementNumberAtIndex(intArray58, 6);
        basicMethods51.incrementNumberAtIndex(intArray58, (-1));
        basicMethods0.incrementNumberAtIndex(intArray58, (int) (byte) 100);
        int int67 = basicMethods0.getMin(1, (int) (short) 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test067");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((-8));
        int int7 = basicMethods0.abs((int) '#');
        int int10 = basicMethods0.getMin((int) (short) 100, (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test068");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int49 = basicMethods0.abs(4);
        double double52 = basicMethods0.sum_doubles(0.0d, (double) (-2));
        int int55 = basicMethods0.getMin(8, (-10));
        double double58 = basicMethods0.sum_doubles((double) 0, 3.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test069");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        int int25 = basicMethods0.getMin((-4), 0);
        int int27 = basicMethods0.abs((int) (byte) 100);
        double double30 = basicMethods0.sum_doubles(96.0d, 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test070");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        double double25 = basicMethods0.sum_doubles((-95.0d), (double) 6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test071");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        basicMethods6.addElementToSet(intSet7, 0);
        int int11 = basicMethods6.abs((-8));
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        int[] intArray17 = new int[] {};
        basicMethods16.incrementNumberAtIndex(intArray17, 6);
        basicMethods12.incrementNumberAtIndex(intArray17, (-7));
        basicMethods6.incrementNumberAtIndex(intArray17, (-100));
        int[] intArray27 = new int[] { (-9), 'a', '4' };
        basicMethods6.incrementNumberAtIndex(intArray27, (-6));
        gassert.BasicMethods basicMethods30 = new gassert.BasicMethods();
        int int33 = basicMethods30.getMin((-100), 0);
        int int35 = basicMethods30.abs((-8));
        int int37 = basicMethods30.abs((int) '#');
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods30.addElementToSet(intSet64, (-5));
        basicMethods6.addElementToSet(intSet64, 3);
        basicMethods0.addElementToSet(intSet64, 0);
        double double74 = basicMethods0.sum_doubles(32.0d, (-89.0d));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test072");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        basicMethods0.incrementNumberAtIndex(intArray5, (-7));
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods10.addElementToSet(intSet43, 8);
        double double49 = basicMethods10.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        basicMethods10.incrementNumberAtIndex(intArray51, (int) (byte) 100);
        basicMethods0.incrementNumberAtIndex(intArray51, 2);
        int int59 = basicMethods0.abs((int) '4');
        int int61 = basicMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test073");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int6 = basicMethods0.getMin((int) (byte) 0, 3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test074");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int50 = basicMethods0.getMin((-1), (-3));
        int int53 = basicMethods0.getMin(0, 52);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test075");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        basicMethods6.incrementNumberAtIndex(intArray11, (-7));
        basicMethods0.incrementNumberAtIndex(intArray11, (-100));
        int int20 = basicMethods0.getMin((int) '#', 7);
        gassert.BasicMethods basicMethods21 = new gassert.BasicMethods();
        gassert.BasicMethods basicMethods22 = new gassert.BasicMethods();
        int[] intArray23 = new int[] {};
        basicMethods22.incrementNumberAtIndex(intArray23, 6);
        gassert.BasicMethods basicMethods26 = new gassert.BasicMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        basicMethods26.addElementToSet(intSet38, (-10));
        basicMethods22.addElementToSet(intSet38, 7);
        int int45 = basicMethods22.abs(0);
        int int48 = basicMethods22.getMin(0, (int) (short) 0);
        int int50 = basicMethods22.abs((int) (byte) 1);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-9), 35, (-100), 100, (-6), 10, (-100), (-7), (-8), 0, 0, 0, (-1), 4, 10 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        basicMethods22.addElementToSet(intSet67, (int) (byte) 0);
        basicMethods21.addElementToSet(intSet67, (-1));
        basicMethods0.addElementToSet(intSet67, 32);
        int int76 = basicMethods0.abs(6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test076");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int32 = basicMethods0.getMin((-4), (int) 'a');
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test077");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 9);
        basicMethods0.incrementNumberAtIndex(intArray49, 0);
        int int58 = basicMethods0.getMin((-1), 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test078");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        double double39 = basicMethods0.sum_doubles((double) (-6), (double) '#');
        int[] intArray40 = null;
        basicMethods0.incrementNumberAtIndex(intArray40, 35);
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int[] intArray44 = new int[] {};
        basicMethods43.incrementNumberAtIndex(intArray44, 6);
        gassert.BasicMethods basicMethods47 = new gassert.BasicMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        basicMethods47.addElementToSet(intSet59, (-10));
        basicMethods43.addElementToSet(intSet59, 7);
        int int66 = basicMethods43.abs(0);
        gassert.BasicMethods basicMethods67 = new gassert.BasicMethods();
        int[] intArray68 = new int[] {};
        basicMethods67.incrementNumberAtIndex(intArray68, 6);
        gassert.BasicMethods basicMethods71 = new gassert.BasicMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        basicMethods71.addElementToSet(intSet83, (-10));
        basicMethods67.addElementToSet(intSet83, 7);
        basicMethods43.addElementToSet(intSet83, (int) (short) 10);
        basicMethods0.addElementToSet(intSet83, 9);
        int int94 = basicMethods0.abs((int) (short) 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test079");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin(2, (int) (byte) 100);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet55 = null;
        basicMethods54.addElementToSet(intSet55, 0);
        int int59 = basicMethods54.abs((-8));
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int int63 = basicMethods60.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods64 = new gassert.BasicMethods();
        int[] intArray65 = new int[] {};
        basicMethods64.incrementNumberAtIndex(intArray65, 6);
        basicMethods60.incrementNumberAtIndex(intArray65, (-7));
        basicMethods54.incrementNumberAtIndex(intArray65, (-100));
        basicMethods0.incrementNumberAtIndex(intArray65, (-1));
        int int75 = basicMethods0.abs(10);
        double double78 = basicMethods0.sum_doubles((double) (-1.0f), 45.0d);
        gassert.BasicMethods basicMethods79 = new gassert.BasicMethods();
        int[] intArray80 = new int[] {};
        basicMethods79.incrementNumberAtIndex(intArray80, 6);
        basicMethods0.incrementNumberAtIndex(intArray80, (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test080");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) 0);
        int int50 = basicMethods0.getMin(5, 0);
        int int53 = basicMethods0.getMin((-1), 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test081");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        double double36 = basicMethods12.sum_doubles((double) (-6), (double) (-1L));
        int int39 = basicMethods12.getMin((int) (short) 1, (-3));
        double double42 = basicMethods12.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-1), (int) (byte) 1);
        int[] intArray52 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods43.incrementNumberAtIndex(intArray52, (int) (short) 0);
        basicMethods12.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        basicMethods57.incrementNumberAtIndex(intArray62, (-7));
        basicMethods12.incrementNumberAtIndex(intArray62, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        gassert.BasicMethods basicMethods71 = new gassert.BasicMethods();
        int[] intArray72 = new int[] {};
        basicMethods71.incrementNumberAtIndex(intArray72, 6);
        int int76 = basicMethods71.abs(100);
        gassert.BasicMethods basicMethods77 = new gassert.BasicMethods();
        int[] intArray78 = new int[] {};
        basicMethods77.incrementNumberAtIndex(intArray78, 6);
        basicMethods71.incrementNumberAtIndex(intArray78, (-1));
        basicMethods0.incrementNumberAtIndex(intArray78, (-7));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test082");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods9 = new gassert.BasicMethods();
        int int12 = basicMethods9.getMin((-100), 0);
        gassert.BasicMethods basicMethods13 = new gassert.BasicMethods();
        int[] intArray18 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods13.incrementNumberAtIndex(intArray18, (-8));
        basicMethods9.incrementNumberAtIndex(intArray18, 97);
        basicMethods0.incrementNumberAtIndex(intArray18, 4);
        gassert.BasicMethods basicMethods25 = new gassert.BasicMethods();
        int int28 = basicMethods25.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods29 = new gassert.BasicMethods();
        int[] intArray30 = new int[] {};
        basicMethods29.incrementNumberAtIndex(intArray30, 6);
        basicMethods25.incrementNumberAtIndex(intArray30, (-7));
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        int int38 = basicMethods35.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        basicMethods35.addElementToSet(intSet68, 8);
        double double74 = basicMethods35.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods75 = new gassert.BasicMethods();
        int[] intArray76 = new int[] {};
        basicMethods75.incrementNumberAtIndex(intArray76, 6);
        basicMethods35.incrementNumberAtIndex(intArray76, (int) (byte) 100);
        basicMethods25.incrementNumberAtIndex(intArray76, 2);
        basicMethods0.incrementNumberAtIndex(intArray76, (-9));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test083");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin((int) (short) 100, 1);
        int int55 = basicMethods0.abs(3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test084");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        double double36 = basicMethods0.sum_doubles((double) (-1), (double) 3);
        int int38 = basicMethods0.abs(3);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        basicMethods0.addElementToSet(intSet39, 32);
        int int43 = basicMethods0.abs(9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test085");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        double double25 = basicMethods0.sum_doubles((double) 100, 50.0d);
        gassert.BasicMethods basicMethods26 = new gassert.BasicMethods();
        int[] intArray27 = new int[] {};
        basicMethods26.incrementNumberAtIndex(intArray27, 6);
        gassert.BasicMethods basicMethods30 = new gassert.BasicMethods();
        int[] intArray31 = new int[] {};
        basicMethods30.incrementNumberAtIndex(intArray31, 6);
        gassert.BasicMethods basicMethods34 = new gassert.BasicMethods();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        basicMethods34.addElementToSet(intSet46, (-10));
        basicMethods30.addElementToSet(intSet46, 7);
        basicMethods26.addElementToSet(intSet46, (-5));
        basicMethods0.addElementToSet(intSet46, 9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test086");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int15 = basicMethods0.getMin(10, 2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test087");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((-8));
        int int7 = basicMethods0.abs((int) '#');
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        basicMethods0.addElementToSet(intSet34, (-5));
        int int39 = basicMethods0.abs((-100));
        int int41 = basicMethods0.abs((int) '#');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test088");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        basicMethods0.incrementNumberAtIndex(intArray5, (-7));
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods10.addElementToSet(intSet43, 8);
        double double49 = basicMethods10.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        basicMethods10.incrementNumberAtIndex(intArray51, (int) (byte) 100);
        basicMethods0.incrementNumberAtIndex(intArray51, 2);
        int int59 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int int63 = basicMethods60.getMin((-1), (int) (byte) 1);
        int[] intArray69 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods60.incrementNumberAtIndex(intArray69, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray69, 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test089");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        int int39 = basicMethods0.getMin((int) '4', 32);
        double double42 = basicMethods0.sum_doubles(106.0d, (double) 10.0f);
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-100), 0);
        int int48 = basicMethods43.abs((int) '4');
        int int51 = basicMethods43.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int int55 = basicMethods52.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, 6);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int[] intArray61 = new int[] {};
        basicMethods60.incrementNumberAtIndex(intArray61, 6);
        gassert.BasicMethods basicMethods64 = new gassert.BasicMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        basicMethods64.addElementToSet(intSet76, (-10));
        basicMethods60.addElementToSet(intSet76, 7);
        basicMethods56.addElementToSet(intSet76, (-5));
        basicMethods52.addElementToSet(intSet76, 2);
        basicMethods43.addElementToSet(intSet76, (-100));
        basicMethods0.addElementToSet(intSet76, (int) (short) 0);
        int int92 = basicMethods0.getMin((int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test090");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        basicMethods10.addElementToSet(intSet22, (-10));
        basicMethods6.addElementToSet(intSet22, 7);
        basicMethods0.addElementToSet(intSet22, 10);
        int int31 = basicMethods0.abs((int) '4');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test091");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        int int5 = basicMethods0.abs((-6));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test092");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        double double39 = basicMethods0.sum_doubles((double) (-6), (double) '#');
        int int41 = basicMethods0.abs((int) 'a');
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        int int45 = basicMethods42.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        int[] intArray47 = new int[] {};
        basicMethods46.incrementNumberAtIndex(intArray47, 6);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods54.addElementToSet(intSet66, (-10));
        basicMethods50.addElementToSet(intSet66, 7);
        basicMethods46.addElementToSet(intSet66, (-5));
        basicMethods42.addElementToSet(intSet66, 2);
        double double78 = basicMethods42.sum_doubles((double) (-1), (double) 3);
        double double81 = basicMethods42.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods82 = new gassert.BasicMethods();
        int int85 = basicMethods82.getMin((-100), 0);
        gassert.BasicMethods basicMethods86 = new gassert.BasicMethods();
        int[] intArray91 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods86.incrementNumberAtIndex(intArray91, (-8));
        basicMethods82.incrementNumberAtIndex(intArray91, 97);
        basicMethods42.incrementNumberAtIndex(intArray91, (int) (byte) 0);
        basicMethods0.incrementNumberAtIndex(intArray91, (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test093");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int2 = basicMethods0.abs((-100));
        double double5 = basicMethods0.sum_doubles((double) (-1.0f), (double) 10L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test094");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int31 = basicMethods0.abs((int) (short) 100);
        gassert.BasicMethods basicMethods32 = new gassert.BasicMethods();
        int int35 = basicMethods32.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods36 = new gassert.BasicMethods();
        int int39 = basicMethods36.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int[] intArray41 = new int[] {};
        basicMethods40.incrementNumberAtIndex(intArray41, 6);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray45 = new int[] {};
        basicMethods44.incrementNumberAtIndex(intArray45, 6);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        basicMethods48.addElementToSet(intSet60, (-10));
        basicMethods44.addElementToSet(intSet60, 7);
        basicMethods40.addElementToSet(intSet60, (-5));
        basicMethods36.addElementToSet(intSet60, 2);
        int[] intArray75 = new int[] { (-100), (-2), (byte) 100, 52, (byte) 0 };
        basicMethods36.incrementNumberAtIndex(intArray75, 0);
        basicMethods32.incrementNumberAtIndex(intArray75, (-3));
        basicMethods0.incrementNumberAtIndex(intArray75, 6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test095");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int[] intArray32 = new int[] {};
        basicMethods31.incrementNumberAtIndex(intArray32, 6);
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        basicMethods35.addElementToSet(intSet47, (-10));
        basicMethods31.addElementToSet(intSet47, 7);
        int int54 = basicMethods31.abs(0);
        int int57 = basicMethods31.getMin(0, (int) (short) 0);
        int int59 = basicMethods31.abs((int) (byte) 1);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-9), 35, (-100), 100, (-6), 10, (-100), (-7), (-8), 0, 0, 0, (-1), 4, 10 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        basicMethods31.addElementToSet(intSet76, (int) (byte) 0);
        basicMethods0.addElementToSet(intSet76, (-6));
        double double84 = basicMethods0.sum_doubles(116.0d, (double) 8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test096");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int26 = basicMethods0.getMin(0, (int) (short) 0);
        int int28 = basicMethods0.abs((int) (byte) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-9), 35, (-100), 100, (-6), 10, (-100), (-7), (-8), 0, 0, 0, (-1), 4, 10 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods0.addElementToSet(intSet45, (int) (byte) 0);
        int int51 = basicMethods0.getMin((-2), (-8));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test097");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        int int14 = basicMethods0.getMin((int) (byte) 0, 7);
        int int16 = basicMethods0.abs(97);
        double double19 = basicMethods0.sum_doubles((double) '4', (double) (short) 10);
        double double22 = basicMethods0.sum_doubles(110.0d, 100.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test098");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        int int38 = basicMethods0.abs((int) (short) 100);
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        int int42 = basicMethods39.getMin((-100), 0);
        int int44 = basicMethods39.abs((int) '4');
        int int47 = basicMethods39.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        int int51 = basicMethods48.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int[] intArray53 = new int[] {};
        basicMethods52.incrementNumberAtIndex(intArray53, 6);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, 6);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods60.addElementToSet(intSet72, (-10));
        basicMethods56.addElementToSet(intSet72, 7);
        basicMethods52.addElementToSet(intSet72, (-5));
        basicMethods48.addElementToSet(intSet72, 2);
        basicMethods39.addElementToSet(intSet72, (-100));
        basicMethods0.addElementToSet(intSet72, (-9));
        int int87 = basicMethods0.abs((-1));
        double double90 = basicMethods0.sum_doubles(35.0d, (double) (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test099");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        gassert.BasicMethods basicMethods34 = new gassert.BasicMethods();
        int int37 = basicMethods34.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int[] intArray39 = new int[] {};
        basicMethods38.incrementNumberAtIndex(intArray39, 6);
        basicMethods34.incrementNumberAtIndex(intArray39, (-7));
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int int47 = basicMethods44.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods44.addElementToSet(intSet77, 8);
        double double83 = basicMethods44.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods84 = new gassert.BasicMethods();
        int[] intArray85 = new int[] {};
        basicMethods84.incrementNumberAtIndex(intArray85, 6);
        basicMethods44.incrementNumberAtIndex(intArray85, (int) (byte) 100);
        basicMethods34.incrementNumberAtIndex(intArray85, 2);
        basicMethods0.incrementNumberAtIndex(intArray85, 0);
        int int95 = basicMethods0.abs((int) ' ');
        double double98 = basicMethods0.sum_doubles((double) 32, 96.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test100");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int33 = basicMethods0.getMin((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test101");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-100), 0);
        int int17 = basicMethods12.abs((int) '4');
        int int20 = basicMethods12.getMin(10, (int) (byte) -1);
        double double23 = basicMethods12.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int int27 = basicMethods24.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        basicMethods24.addElementToSet(intSet57, 8);
        basicMethods12.addElementToSet(intSet57, (-5));
        basicMethods0.addElementToSet(intSet57, (int) (byte) 100);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test102");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 0L, (double) (byte) 1);
        double double42 = basicMethods0.sum_doubles(47.0d, (double) 10);
        int int44 = basicMethods0.abs(6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test103");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        double double39 = basicMethods0.sum_doubles((double) (-100), (double) 5);
        int[] intArray42 = new int[] { (-5), (-5) };
        basicMethods0.incrementNumberAtIndex(intArray42, 100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test104");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int25 = basicMethods0.abs(2);
        int int28 = basicMethods0.getMin(97, (int) '4');
        double double31 = basicMethods0.sum_doubles((double) (byte) 100, 5.0d);
        int int33 = basicMethods0.abs((int) '#');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test105");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        double double39 = basicMethods0.sum_doubles((double) (-6), (double) '#');
        int[] intArray40 = null;
        basicMethods0.incrementNumberAtIndex(intArray40, 35);
        int int44 = basicMethods0.abs(5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test106");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin((int) (short) 100, 1);
        double double56 = basicMethods0.sum_doubles(128.0d, 5.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test107");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int[] intArray41 = new int[] {};
        basicMethods40.incrementNumberAtIndex(intArray41, 6);
        basicMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 100);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        int[] intArray47 = new int[] {};
        basicMethods46.incrementNumberAtIndex(intArray47, 6);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods54.addElementToSet(intSet66, (-10));
        basicMethods50.addElementToSet(intSet66, 7);
        basicMethods46.addElementToSet(intSet66, (-5));
        basicMethods0.addElementToSet(intSet66, (int) (short) 0);
        int int78 = basicMethods0.getMin(6, (-6));
        int int80 = basicMethods0.abs((int) (short) 100);
        int int83 = basicMethods0.getMin(97, (-4));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test108");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int[] intArray41 = new int[] {};
        basicMethods40.incrementNumberAtIndex(intArray41, 6);
        basicMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 100);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        int[] intArray47 = new int[] {};
        basicMethods46.incrementNumberAtIndex(intArray47, 6);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods54.addElementToSet(intSet66, (-10));
        basicMethods50.addElementToSet(intSet66, 7);
        basicMethods46.addElementToSet(intSet66, (-5));
        basicMethods0.addElementToSet(intSet66, (int) (short) 0);
        int int77 = basicMethods0.abs((-2));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test109");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int31 = basicMethods0.abs(6);
        int int34 = basicMethods0.getMin((-10), 8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test110");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int6 = basicMethods0.getMin((-100), (int) 'a');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test111");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int int5 = basicMethods0.abs((-10));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test112");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int26 = basicMethods0.abs((int) (short) 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test113");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray9 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods4.incrementNumberAtIndex(intArray9, (-8));
        basicMethods0.incrementNumberAtIndex(intArray9, 9);
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        int int17 = basicMethods14.getMin((-100), 0);
        int int19 = basicMethods14.abs((int) '4');
        gassert.BasicMethods basicMethods20 = new gassert.BasicMethods();
        int[] intArray21 = new int[] {};
        basicMethods20.incrementNumberAtIndex(intArray21, 6);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        basicMethods24.addElementToSet(intSet36, (-10));
        basicMethods20.addElementToSet(intSet36, 7);
        basicMethods14.addElementToSet(intSet36, 10);
        double double46 = basicMethods14.sum_doubles((double) (short) -1, (double) 97);
        gassert.BasicMethods basicMethods47 = new gassert.BasicMethods();
        int int50 = basicMethods47.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        basicMethods47.addElementToSet(intSet80, 8);
        double double86 = basicMethods47.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods87 = new gassert.BasicMethods();
        int[] intArray88 = new int[] {};
        basicMethods87.incrementNumberAtIndex(intArray88, 6);
        basicMethods47.incrementNumberAtIndex(intArray88, (int) (byte) 100);
        basicMethods14.incrementNumberAtIndex(intArray88, (-6));
        basicMethods0.incrementNumberAtIndex(intArray88, 100);
        int int98 = basicMethods0.abs(8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test114");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin((int) (short) -1, 3);
        gassert.BasicMethods basicMethods13 = new gassert.BasicMethods();
        int[] intArray14 = new int[] {};
        basicMethods13.incrementNumberAtIndex(intArray14, 6);
        gassert.BasicMethods basicMethods17 = new gassert.BasicMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        basicMethods17.addElementToSet(intSet29, (-10));
        basicMethods13.addElementToSet(intSet29, 7);
        double double37 = basicMethods13.sum_doubles((double) (-6), (double) (-1L));
        int int40 = basicMethods13.getMin((int) (short) 1, (-3));
        double double43 = basicMethods13.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray45 = new int[] {};
        basicMethods44.incrementNumberAtIndex(intArray45, 6);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        basicMethods48.addElementToSet(intSet60, (-10));
        basicMethods44.addElementToSet(intSet60, 7);
        int int67 = basicMethods44.abs(0);
        int int70 = basicMethods44.getMin(0, (int) (short) 0);
        int int72 = basicMethods44.abs((int) (byte) 1);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-9), 35, (-100), 100, (-6), 10, (-100), (-7), (-8), 0, 0, 0, (-1), 4, 10 };
        java.util.HashSet<java.lang.Integer> intSet89 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        basicMethods44.addElementToSet(intSet89, (int) (byte) 0);
        basicMethods13.addElementToSet(intSet89, (-6));
        basicMethods0.addElementToSet(intSet89, 52);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test115");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        basicMethods10.addElementToSet(intSet22, (-10));
        basicMethods6.addElementToSet(intSet22, 7);
        basicMethods0.addElementToSet(intSet22, 10);
        double double32 = basicMethods0.sum_doubles(0.0d, (double) 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test116");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        double double11 = basicMethods0.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-100), 0);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        int[] intArray21 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods16.incrementNumberAtIndex(intArray21, (-8));
        basicMethods12.incrementNumberAtIndex(intArray21, 9);
        basicMethods0.incrementNumberAtIndex(intArray21, (int) (byte) 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test117");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int33 = basicMethods0.getMin(100, 4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test118");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int int5 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        basicMethods6.addElementToSet(intSet18, (-10));
        gassert.BasicMethods basicMethods22 = new gassert.BasicMethods();
        int int25 = basicMethods22.getMin((-100), 0);
        gassert.BasicMethods basicMethods26 = new gassert.BasicMethods();
        int[] intArray31 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods26.incrementNumberAtIndex(intArray31, (-8));
        basicMethods22.incrementNumberAtIndex(intArray31, 9);
        basicMethods6.incrementNumberAtIndex(intArray31, 7);
        basicMethods0.incrementNumberAtIndex(intArray31, 100);
        int int42 = basicMethods0.getMin((int) (byte) 10, (-10));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test119");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        double double6 = basicMethods0.sum_doubles((double) 10.0f, (double) 10L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test120");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray9 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods4.incrementNumberAtIndex(intArray9, (-8));
        basicMethods0.incrementNumberAtIndex(intArray9, 97);
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        int int17 = basicMethods14.getMin((-100), 0);
        gassert.BasicMethods basicMethods18 = new gassert.BasicMethods();
        int int21 = basicMethods18.getMin((-100), 0);
        int int23 = basicMethods18.abs((int) '4');
        int int26 = basicMethods18.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods27 = new gassert.BasicMethods();
        int int30 = basicMethods27.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int[] intArray32 = new int[] {};
        basicMethods31.incrementNumberAtIndex(intArray32, 6);
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        int[] intArray36 = new int[] {};
        basicMethods35.incrementNumberAtIndex(intArray36, 6);
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        basicMethods39.addElementToSet(intSet51, (-10));
        basicMethods35.addElementToSet(intSet51, 7);
        basicMethods31.addElementToSet(intSet51, (-5));
        basicMethods27.addElementToSet(intSet51, 2);
        basicMethods18.addElementToSet(intSet51, (-100));
        basicMethods14.addElementToSet(intSet51, 2);
        basicMethods0.addElementToSet(intSet51, (-9));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test121");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        int int62 = basicMethods0.getMin(52, 2);
        int int65 = basicMethods0.getMin(10, (-10));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test122");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        basicMethods10.addElementToSet(intSet22, (-10));
        basicMethods6.addElementToSet(intSet22, 7);
        basicMethods0.addElementToSet(intSet22, 10);
        double double32 = basicMethods0.sum_doubles((double) '4', (double) 1L);
        int int35 = basicMethods0.getMin(7, (int) (short) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test123");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        int int39 = basicMethods0.getMin((int) (short) 0, 7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test124");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        int int25 = basicMethods0.getMin((-4), 0);
        int int27 = basicMethods0.abs((int) (byte) 100);
        int int29 = basicMethods0.abs((int) ' ');
        int int31 = basicMethods0.abs((int) (short) -1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test125");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        int int39 = basicMethods0.getMin((int) '4', 32);
        double double42 = basicMethods0.sum_doubles(106.0d, (double) 10.0f);
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-100), 0);
        int int48 = basicMethods43.abs((int) '4');
        int int51 = basicMethods43.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int int55 = basicMethods52.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, 6);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int[] intArray61 = new int[] {};
        basicMethods60.incrementNumberAtIndex(intArray61, 6);
        gassert.BasicMethods basicMethods64 = new gassert.BasicMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        basicMethods64.addElementToSet(intSet76, (-10));
        basicMethods60.addElementToSet(intSet76, 7);
        basicMethods56.addElementToSet(intSet76, (-5));
        basicMethods52.addElementToSet(intSet76, 2);
        basicMethods43.addElementToSet(intSet76, (-100));
        basicMethods0.addElementToSet(intSet76, (int) (short) 0);
        int int92 = basicMethods0.getMin(2, 10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test126");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        int int10 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods11 = new gassert.BasicMethods();
        int int14 = basicMethods11.getMin((-1), (int) (byte) 1);
        int[] intArray20 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods11.incrementNumberAtIndex(intArray20, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray20, 100);
        int int27 = basicMethods0.getMin(6, (-9));
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        int int31 = basicMethods28.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods32 = new gassert.BasicMethods();
        int[] intArray33 = new int[] {};
        basicMethods32.incrementNumberAtIndex(intArray33, 6);
        basicMethods28.incrementNumberAtIndex(intArray33, (-7));
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int int41 = basicMethods38.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        basicMethods38.addElementToSet(intSet71, 8);
        double double77 = basicMethods38.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods78 = new gassert.BasicMethods();
        int[] intArray79 = new int[] {};
        basicMethods78.incrementNumberAtIndex(intArray79, 6);
        basicMethods38.incrementNumberAtIndex(intArray79, (int) (byte) 100);
        basicMethods28.incrementNumberAtIndex(intArray79, 2);
        basicMethods0.incrementNumberAtIndex(intArray79, 8);
        int int89 = basicMethods0.abs(10);
        int int91 = basicMethods0.abs((int) (short) -1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test127");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        double double39 = basicMethods0.sum_doubles((double) 0, (double) 100.0f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test128");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int35 = basicMethods0.abs(7);
        double double38 = basicMethods0.sum_doubles(81.0d, 45.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test129");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-100), 0);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray66 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods61.incrementNumberAtIndex(intArray66, (-8));
        basicMethods57.incrementNumberAtIndex(intArray66, 97);
        basicMethods0.incrementNumberAtIndex(intArray66, (-7));
        double double75 = basicMethods0.sum_doubles((double) (short) 0, (double) (short) -1);
        int int78 = basicMethods0.getMin((int) (byte) 0, 6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test130");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int33 = basicMethods0.getMin((-2), (-3));
        double double36 = basicMethods0.sum_doubles((-89.0d), 124.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test131");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) 0);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet49 = null;
        basicMethods48.addElementToSet(intSet49, 0);
        int int53 = basicMethods48.abs((-8));
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        int int57 = basicMethods54.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods58 = new gassert.BasicMethods();
        int[] intArray59 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray59, 6);
        basicMethods54.incrementNumberAtIndex(intArray59, (-7));
        basicMethods48.incrementNumberAtIndex(intArray59, (-100));
        int[] intArray69 = new int[] { (-9), 'a', '4' };
        basicMethods48.incrementNumberAtIndex(intArray69, (-6));
        basicMethods0.incrementNumberAtIndex(intArray69, (int) (short) 1);
        int int76 = basicMethods0.getMin(6, 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test132");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int[] intArray39 = new int[] { (-100), (-2), (byte) 100, 52, (byte) 0 };
        basicMethods0.incrementNumberAtIndex(intArray39, 0);
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, 6);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods46.addElementToSet(intSet58, (-10));
        basicMethods42.addElementToSet(intSet58, 7);
        int int65 = basicMethods42.abs(0);
        gassert.BasicMethods basicMethods66 = new gassert.BasicMethods();
        int[] intArray67 = new int[] {};
        basicMethods66.incrementNumberAtIndex(intArray67, 6);
        gassert.BasicMethods basicMethods70 = new gassert.BasicMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        basicMethods70.addElementToSet(intSet82, (-10));
        basicMethods66.addElementToSet(intSet82, 7);
        basicMethods42.addElementToSet(intSet82, (int) (short) 10);
        basicMethods0.addElementToSet(intSet82, (-5));
        int int93 = basicMethods0.abs((int) (short) 100);
        int int96 = basicMethods0.getMin((int) (short) 0, 4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test133");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        double double53 = basicMethods0.sum_doubles((double) 6, (double) 5);
        int int55 = basicMethods0.abs(10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test134");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int26 = basicMethods0.getMin(0, (int) (short) 0);
        int int29 = basicMethods0.getMin(9, 52);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test135");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int50 = basicMethods0.getMin((int) 'a', (int) '#');
        double double53 = basicMethods0.sum_doubles((-2.0d), (double) 9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test136");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        double double62 = basicMethods0.sum_doubles(5.0d, 45.0d);
        double double65 = basicMethods0.sum_doubles((double) 52, 29.0d);
        int int67 = basicMethods0.abs(32);
        double double70 = basicMethods0.sum_doubles((double) 52, (double) ' ');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test137");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        int int42 = basicMethods0.getMin(100, 6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test138");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        double double36 = basicMethods0.sum_doubles((double) (-1), (double) 3);
        double double39 = basicMethods0.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 97);
        basicMethods0.incrementNumberAtIndex(intArray49, (int) (byte) 0);
        int int57 = basicMethods0.abs(100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test139");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int2 = basicMethods0.abs((-100));
        int int5 = basicMethods0.getMin((int) (byte) -1, (int) (short) 100);
        int int8 = basicMethods0.getMin((int) (byte) 0, 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test140");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        int int39 = basicMethods0.getMin((int) '4', 32);
        double double42 = basicMethods0.sum_doubles((double) 6, (double) 1.0f);
        double double45 = basicMethods0.sum_doubles((-10.0d), 42.0d);
        int int48 = basicMethods0.getMin(5, 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test141");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        int int14 = basicMethods0.getMin((int) (byte) 0, 7);
        int int16 = basicMethods0.abs(97);
        double double19 = basicMethods0.sum_doubles((double) 9, (-1.0d));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test142");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int26 = basicMethods0.getMin(0, (int) (short) 0);
        int int28 = basicMethods0.abs((int) (byte) 1);
        int int30 = basicMethods0.abs(0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test143");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        int int31 = basicMethods28.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        basicMethods28.addElementToSet(intSet61, 8);
        basicMethods0.addElementToSet(intSet61, 35);
        int int68 = basicMethods0.abs(1);
        int int71 = basicMethods0.getMin(0, 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test144");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        basicMethods6.incrementNumberAtIndex(intArray11, (-7));
        basicMethods0.incrementNumberAtIndex(intArray11, (-100));
        int int20 = basicMethods0.getMin((int) '#', 7);
        gassert.BasicMethods basicMethods21 = new gassert.BasicMethods();
        int[] intArray22 = new int[] {};
        basicMethods21.incrementNumberAtIndex(intArray22, 6);
        gassert.BasicMethods basicMethods25 = new gassert.BasicMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        basicMethods25.addElementToSet(intSet37, (-10));
        basicMethods21.addElementToSet(intSet37, 7);
        double double45 = basicMethods21.sum_doubles((double) (-6), (double) (-1L));
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 10 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        basicMethods21.addElementToSet(intSet49, (-10));
        basicMethods0.addElementToSet(intSet49, (int) (short) 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test145");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        basicMethods10.addElementToSet(intSet22, (-10));
        basicMethods6.addElementToSet(intSet22, 7);
        basicMethods0.addElementToSet(intSet22, 10);
        double double32 = basicMethods0.sum_doubles((double) (short) -1, (double) 97);
        gassert.BasicMethods basicMethods33 = new gassert.BasicMethods();
        int int36 = basicMethods33.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        basicMethods33.addElementToSet(intSet66, 8);
        double double72 = basicMethods33.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods73 = new gassert.BasicMethods();
        int[] intArray74 = new int[] {};
        basicMethods73.incrementNumberAtIndex(intArray74, 6);
        basicMethods33.incrementNumberAtIndex(intArray74, (int) (byte) 100);
        basicMethods0.incrementNumberAtIndex(intArray74, (-6));
        int int83 = basicMethods0.getMin((int) (short) 100, (-5));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test146");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        basicMethods6.incrementNumberAtIndex(intArray11, (-7));
        basicMethods0.incrementNumberAtIndex(intArray11, (-100));
        int int20 = basicMethods0.getMin((int) '#', 7);
        gassert.BasicMethods basicMethods21 = new gassert.BasicMethods();
        int[] intArray22 = new int[] {};
        basicMethods21.incrementNumberAtIndex(intArray22, 6);
        gassert.BasicMethods basicMethods25 = new gassert.BasicMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        basicMethods25.addElementToSet(intSet37, (-10));
        basicMethods21.addElementToSet(intSet37, 7);
        int int44 = basicMethods21.abs(0);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int[] intArray46 = new int[] {};
        basicMethods45.incrementNumberAtIndex(intArray46, 6);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        basicMethods49.addElementToSet(intSet61, (-10));
        basicMethods45.addElementToSet(intSet61, 7);
        basicMethods21.addElementToSet(intSet61, (int) (short) 10);
        basicMethods0.addElementToSet(intSet61, 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test147");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int25 = basicMethods0.abs(2);
        int int28 = basicMethods0.getMin(97, (int) '4');
        double double31 = basicMethods0.sum_doubles((double) (byte) 100, 5.0d);
        int int33 = basicMethods0.abs(7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test148");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin(2, (int) (byte) 100);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        int[] intArray55 = new int[] {};
        basicMethods54.incrementNumberAtIndex(intArray55, 6);
        int int59 = basicMethods54.abs(100);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        int[] intArray61 = new int[] {};
        basicMethods60.incrementNumberAtIndex(intArray61, 6);
        basicMethods54.incrementNumberAtIndex(intArray61, (-1));
        basicMethods0.incrementNumberAtIndex(intArray61, 7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test149");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        int int61 = basicMethods0.abs((int) (short) 1);
        double double64 = basicMethods0.sum_doubles((double) 'a', (double) 10);
        int int67 = basicMethods0.getMin(5, (-9));
        int int70 = basicMethods0.getMin((int) (short) -1, 5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test150");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int49 = basicMethods0.abs(100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test151");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        int int25 = basicMethods0.getMin((-4), 0);
        int int27 = basicMethods0.abs((int) (byte) 100);
        int int29 = basicMethods0.abs((int) ' ');
        int int32 = basicMethods0.getMin((-2), (-6));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test152");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        int int41 = basicMethods0.abs((-5));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test153");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        int int31 = basicMethods28.getMin((-100), 0);
        int int33 = basicMethods28.abs((int) '4');
        int int36 = basicMethods28.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods37 = new gassert.BasicMethods();
        int int40 = basicMethods37.getMin((-100), 0);
        gassert.BasicMethods basicMethods41 = new gassert.BasicMethods();
        int[] intArray46 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods41.incrementNumberAtIndex(intArray46, (-8));
        basicMethods37.incrementNumberAtIndex(intArray46, 97);
        basicMethods28.incrementNumberAtIndex(intArray46, 4);
        basicMethods0.incrementNumberAtIndex(intArray46, 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test154");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        double double11 = basicMethods0.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods12.addElementToSet(intSet45, 8);
        double double51 = basicMethods12.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int int55 = basicMethods52.getMin((-100), 0);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray61 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods56.incrementNumberAtIndex(intArray61, (-8));
        basicMethods52.incrementNumberAtIndex(intArray61, 9);
        basicMethods12.incrementNumberAtIndex(intArray61, 0);
        basicMethods0.incrementNumberAtIndex(intArray61, 0);
        double double72 = basicMethods0.sum_doubles((double) (short) -1, (double) (-10));
        int int74 = basicMethods0.abs(0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test155");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int25 = basicMethods0.abs(2);
        int int28 = basicMethods0.getMin(97, (int) '4');
        int int31 = basicMethods0.getMin(10, 100);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test156");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        int int61 = basicMethods0.abs((int) (byte) 1);
        int int64 = basicMethods0.getMin((int) (short) 10, 4);
        double double67 = basicMethods0.sum_doubles((double) (byte) 100, (double) 4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test157");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin((int) (short) 100, 1);
        int int55 = basicMethods0.abs(0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test158");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        double double17 = basicMethods0.sum_doubles(55.0d, 133.0d);
        int int19 = basicMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test159");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        double double62 = basicMethods0.sum_doubles((double) 35, 0.0d);
        int int65 = basicMethods0.getMin(10, 52);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test160");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int26 = basicMethods0.getMin((int) (short) 10, 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test161");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        int int25 = basicMethods0.getMin((-4), 0);
        int int27 = basicMethods0.abs((int) (byte) 100);
        int int29 = basicMethods0.abs(7);
        int int32 = basicMethods0.getMin((int) (byte) 1, (-3));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test162");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(35, 0);
        int int11 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin(9, (int) (short) -1);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        int int19 = basicMethods16.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods20 = new gassert.BasicMethods();
        int[] intArray21 = new int[] {};
        basicMethods20.incrementNumberAtIndex(intArray21, 6);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods20.addElementToSet(intSet40, (-5));
        basicMethods16.addElementToSet(intSet40, 2);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int int53 = basicMethods50.getMin((-100), 0);
        int int55 = basicMethods50.abs((int) '4');
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, 6);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods60.addElementToSet(intSet72, (-10));
        basicMethods56.addElementToSet(intSet72, 7);
        basicMethods50.addElementToSet(intSet72, 10);
        basicMethods16.addElementToSet(intSet72, 35);
        basicMethods12.addElementToSet(intSet72, 10);
        basicMethods0.addElementToSet(intSet72, (-5));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test163");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray5 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods0.incrementNumberAtIndex(intArray5, (-8));
        int int9 = basicMethods0.abs(1);
        int int12 = basicMethods0.getMin(0, (int) (byte) 100);
        int int15 = basicMethods0.getMin(10, (-1));
        int int17 = basicMethods0.abs(10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test164");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, (-7));
        gassert.BasicMethods basicMethods34 = new gassert.BasicMethods();
        int int37 = basicMethods34.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int[] intArray39 = new int[] {};
        basicMethods38.incrementNumberAtIndex(intArray39, 6);
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, 6);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods46.addElementToSet(intSet58, (-10));
        basicMethods42.addElementToSet(intSet58, 7);
        basicMethods38.addElementToSet(intSet58, (-5));
        basicMethods34.addElementToSet(intSet58, (-7));
        basicMethods0.addElementToSet(intSet58, (int) (short) 10);
        int int72 = basicMethods0.getMin(1, (int) (short) 0);
        int int74 = basicMethods0.abs(100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test165");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(7, (int) (byte) -1);
        int int38 = basicMethods0.abs(7);
        double double41 = basicMethods0.sum_doubles((double) 5, (double) 32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test166");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        int int38 = basicMethods0.abs((int) (short) 100);
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        int int42 = basicMethods39.getMin((-100), 0);
        int int44 = basicMethods39.abs((int) '4');
        int int47 = basicMethods39.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        int int51 = basicMethods48.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int[] intArray53 = new int[] {};
        basicMethods52.incrementNumberAtIndex(intArray53, 6);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, 6);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods60.addElementToSet(intSet72, (-10));
        basicMethods56.addElementToSet(intSet72, 7);
        basicMethods52.addElementToSet(intSet72, (-5));
        basicMethods48.addElementToSet(intSet72, 2);
        basicMethods39.addElementToSet(intSet72, (-100));
        basicMethods0.addElementToSet(intSet72, (-9));
        int int87 = basicMethods0.abs(10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test167");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        basicMethods10.addElementToSet(intSet22, (-10));
        basicMethods6.addElementToSet(intSet22, 7);
        basicMethods0.addElementToSet(intSet22, 10);
        double double32 = basicMethods0.sum_doubles((double) (short) -1, (double) 97);
        double double35 = basicMethods0.sum_doubles((double) 6, (double) (-9));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test168");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        int int6 = basicMethods0.getMin((int) (byte) -1, 35);
        gassert.BasicMethods basicMethods7 = new gassert.BasicMethods();
        int int10 = basicMethods7.getMin(9, (int) (short) -1);
        int int12 = basicMethods7.abs((int) (byte) 0);
        gassert.BasicMethods basicMethods13 = new gassert.BasicMethods();
        int int16 = basicMethods13.getMin((-100), 0);
        int int18 = basicMethods13.abs((int) '4');
        int int21 = basicMethods13.getMin(10, (int) (byte) -1);
        double double24 = basicMethods13.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods25 = new gassert.BasicMethods();
        int int28 = basicMethods25.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods25.addElementToSet(intSet58, 8);
        double double64 = basicMethods25.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods65 = new gassert.BasicMethods();
        int int68 = basicMethods65.getMin((-100), 0);
        gassert.BasicMethods basicMethods69 = new gassert.BasicMethods();
        int[] intArray74 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods69.incrementNumberAtIndex(intArray74, (-8));
        basicMethods65.incrementNumberAtIndex(intArray74, 9);
        basicMethods25.incrementNumberAtIndex(intArray74, 0);
        basicMethods13.incrementNumberAtIndex(intArray74, 0);
        basicMethods7.incrementNumberAtIndex(intArray74, 8);
        basicMethods0.incrementNumberAtIndex(intArray74, (int) (short) 0);
        double double89 = basicMethods0.sum_doubles(8.0d, 150.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test169");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int int7 = basicMethods4.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        basicMethods8.addElementToSet(intSet28, (-5));
        basicMethods4.addElementToSet(intSet28, 2);
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int int41 = basicMethods38.getMin((-100), 0);
        int int43 = basicMethods38.abs((int) '4');
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray45 = new int[] {};
        basicMethods44.incrementNumberAtIndex(intArray45, 6);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        basicMethods48.addElementToSet(intSet60, (-10));
        basicMethods44.addElementToSet(intSet60, 7);
        basicMethods38.addElementToSet(intSet60, 10);
        basicMethods4.addElementToSet(intSet60, 35);
        basicMethods0.addElementToSet(intSet60, 7);
        double double74 = basicMethods0.sum_doubles(7.0d, (double) (short) 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test170");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        int int5 = basicMethods0.abs(100);
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int[] intArray7 = new int[] {};
        basicMethods6.incrementNumberAtIndex(intArray7, 6);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        basicMethods14.addElementToSet(intSet26, (-10));
        basicMethods10.addElementToSet(intSet26, 7);
        basicMethods6.addElementToSet(intSet26, (-5));
        int int35 = basicMethods6.abs((-8));
        gassert.BasicMethods basicMethods36 = new gassert.BasicMethods();
        int int39 = basicMethods36.getMin((-100), 0);
        int int41 = basicMethods36.abs((int) '4');
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, 6);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods46.addElementToSet(intSet58, (-10));
        basicMethods42.addElementToSet(intSet58, 7);
        basicMethods36.addElementToSet(intSet58, 10);
        basicMethods6.addElementToSet(intSet58, 7);
        basicMethods0.addElementToSet(intSet58, (-8));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test171");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int25 = basicMethods0.abs(2);
        double double28 = basicMethods0.sum_doubles((double) (-5), (double) ' ');
        int int30 = basicMethods0.abs(2);
        int int32 = basicMethods0.abs(0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test172");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int32 = basicMethods0.abs((-1));
        int int35 = basicMethods0.getMin(10, 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test173");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        double double11 = basicMethods0.sum_doubles(0.0d, 35.0d);
        java.util.HashSet<java.lang.Integer> intSet12 = null;
        basicMethods0.addElementToSet(intSet12, 100);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test174");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int[] intArray39 = new int[] { (-100), (-2), (byte) 100, 52, (byte) 0 };
        basicMethods0.incrementNumberAtIndex(intArray39, 0);
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, 6);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods46.addElementToSet(intSet58, (-10));
        basicMethods42.addElementToSet(intSet58, 7);
        int int65 = basicMethods42.abs(0);
        gassert.BasicMethods basicMethods66 = new gassert.BasicMethods();
        int[] intArray67 = new int[] {};
        basicMethods66.incrementNumberAtIndex(intArray67, 6);
        gassert.BasicMethods basicMethods70 = new gassert.BasicMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        basicMethods70.addElementToSet(intSet82, (-10));
        basicMethods66.addElementToSet(intSet82, 7);
        basicMethods42.addElementToSet(intSet82, (int) (short) 10);
        basicMethods0.addElementToSet(intSet82, (-5));
        int int93 = basicMethods0.abs((int) (short) 100);
        int int96 = basicMethods0.getMin((-7), (int) (short) -1);
        double double99 = basicMethods0.sum_doubles((double) (short) 1, 47.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test175");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        gassert.BasicMethods basicMethods23 = new gassert.BasicMethods();
        int int26 = basicMethods23.getMin((-100), 0);
        int int28 = basicMethods23.abs((int) '4');
        int int31 = basicMethods23.getMin(10, (int) (byte) -1);
        double double34 = basicMethods23.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        int int38 = basicMethods35.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        basicMethods35.addElementToSet(intSet68, 8);
        basicMethods23.addElementToSet(intSet68, (-5));
        basicMethods0.addElementToSet(intSet68, 9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test176");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        double double11 = basicMethods0.sum_doubles(0.0d, 35.0d);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int int15 = basicMethods12.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        basicMethods12.addElementToSet(intSet45, 8);
        basicMethods0.addElementToSet(intSet45, (-5));
        int int52 = basicMethods0.abs(35);
        gassert.BasicMethods basicMethods53 = new gassert.BasicMethods();
        int int56 = basicMethods53.getMin((-100), 0);
        int int58 = basicMethods53.abs((-8));
        int int60 = basicMethods53.abs((int) '#');
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        basicMethods53.addElementToSet(intSet87, (-5));
        basicMethods0.addElementToSet(intSet87, (int) (byte) 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test177");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(52, (int) ' ');
        int int39 = basicMethods0.getMin(100, (int) (byte) 100);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        int int45 = basicMethods40.abs(0);
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods46.addElementToSet(intSet58, (-10));
        basicMethods40.addElementToSet(intSet58, 2);
        basicMethods0.addElementToSet(intSet58, 0);
        int int68 = basicMethods0.getMin((int) 'a', (-5));
        double double71 = basicMethods0.sum_doubles(107.0d, 0.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test178");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int2 = basicMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test179");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-100), 0);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray66 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods61.incrementNumberAtIndex(intArray66, (-8));
        basicMethods57.incrementNumberAtIndex(intArray66, 97);
        basicMethods0.incrementNumberAtIndex(intArray66, (-7));
        int int75 = basicMethods0.getMin((-5), (int) ' ');
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test180");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int50 = basicMethods0.getMin((-1), (-3));
        int int52 = basicMethods0.abs((int) (short) 100);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test181");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        int int10 = basicMethods0.abs(0);
        int int12 = basicMethods0.abs((int) (byte) 10);
        int int14 = basicMethods0.abs((-9));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test182");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray5 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods0.incrementNumberAtIndex(intArray5, (-8));
        int int9 = basicMethods0.abs(1);
        int int12 = basicMethods0.getMin(0, (int) (byte) 100);
        int int15 = basicMethods0.getMin(10, (-1));
        int int17 = basicMethods0.abs(0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test183");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int31 = basicMethods0.abs(6);
        gassert.BasicMethods basicMethods32 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet33 = null;
        basicMethods32.addElementToSet(intSet33, 0);
        int int37 = basicMethods32.abs((-8));
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int int41 = basicMethods38.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        int[] intArray43 = new int[] {};
        basicMethods42.incrementNumberAtIndex(intArray43, 6);
        basicMethods38.incrementNumberAtIndex(intArray43, (-7));
        basicMethods32.incrementNumberAtIndex(intArray43, (-100));
        int[] intArray53 = new int[] { (-9), 'a', '4' };
        basicMethods32.incrementNumberAtIndex(intArray53, (-6));
        basicMethods0.incrementNumberAtIndex(intArray53, (int) 'a');
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test184");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int26 = basicMethods0.getMin(0, (int) (short) 0);
        int int28 = basicMethods0.abs((int) (byte) 1);
        int int30 = basicMethods0.abs((-2));
        int int32 = basicMethods0.abs((-8));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test185");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        int[] intArray15 = new int[] {};
        basicMethods14.incrementNumberAtIndex(intArray15, 6);
        gassert.BasicMethods basicMethods18 = new gassert.BasicMethods();
        int[] intArray19 = new int[] {};
        basicMethods18.incrementNumberAtIndex(intArray19, 6);
        gassert.BasicMethods basicMethods22 = new gassert.BasicMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        basicMethods22.addElementToSet(intSet34, (-10));
        basicMethods18.addElementToSet(intSet34, 7);
        basicMethods14.addElementToSet(intSet34, (-5));
        basicMethods10.addElementToSet(intSet34, 2);
        basicMethods0.addElementToSet(intSet34, 32);
        int int47 = basicMethods0.abs(10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test186");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int int7 = basicMethods4.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        basicMethods8.addElementToSet(intSet28, (-5));
        basicMethods4.addElementToSet(intSet28, 2);
        double double40 = basicMethods4.sum_doubles((double) (-1), (double) 3);
        double double43 = basicMethods4.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int int47 = basicMethods44.getMin((-100), 0);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        int[] intArray53 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods48.incrementNumberAtIndex(intArray53, (-8));
        basicMethods44.incrementNumberAtIndex(intArray53, 97);
        basicMethods4.incrementNumberAtIndex(intArray53, (int) (byte) 0);
        basicMethods0.incrementNumberAtIndex(intArray53, (-7));
        int int64 = basicMethods0.getMin((-7), 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test187");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        int[] intArray36 = new int[] {};
        basicMethods35.incrementNumberAtIndex(intArray36, 6);
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, 6);
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        basicMethods43.addElementToSet(intSet55, (-10));
        basicMethods39.addElementToSet(intSet55, 7);
        basicMethods35.addElementToSet(intSet55, (-5));
        basicMethods31.addElementToSet(intSet55, 2);
        double double67 = basicMethods31.sum_doubles((double) (-1), (double) 3);
        double double70 = basicMethods31.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods71 = new gassert.BasicMethods();
        int int74 = basicMethods71.getMin((-100), 0);
        gassert.BasicMethods basicMethods75 = new gassert.BasicMethods();
        int[] intArray80 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods75.incrementNumberAtIndex(intArray80, (-8));
        basicMethods71.incrementNumberAtIndex(intArray80, 97);
        basicMethods31.incrementNumberAtIndex(intArray80, (int) (byte) 0);
        basicMethods0.incrementNumberAtIndex(intArray80, (int) ' ');
        double double91 = basicMethods0.sum_doubles((double) 3, (double) 1.0f);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test188");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        double double36 = basicMethods12.sum_doubles((double) (-6), (double) (-1L));
        int int39 = basicMethods12.getMin((int) (short) 1, (-3));
        double double42 = basicMethods12.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-1), (int) (byte) 1);
        int[] intArray52 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods43.incrementNumberAtIndex(intArray52, (int) (short) 0);
        basicMethods12.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        basicMethods57.incrementNumberAtIndex(intArray62, (-7));
        basicMethods12.incrementNumberAtIndex(intArray62, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        int int72 = basicMethods0.abs((int) (byte) 1);
        int int75 = basicMethods0.getMin(52, 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test189");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        int int10 = basicMethods0.abs(0);
        double double13 = basicMethods0.sum_doubles((double) 100, (-7.0d));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test190");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int11 = basicMethods0.abs(0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test191");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        double double50 = basicMethods0.sum_doubles((double) (-1), (double) 0);
        int int53 = basicMethods0.getMin(2, (int) (byte) 100);
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        int[] intArray55 = new int[] {};
        basicMethods54.incrementNumberAtIndex(intArray55, 6);
        gassert.BasicMethods basicMethods58 = new gassert.BasicMethods();
        int[] intArray59 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray59, 6);
        gassert.BasicMethods basicMethods62 = new gassert.BasicMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        basicMethods62.addElementToSet(intSet74, (-10));
        basicMethods58.addElementToSet(intSet74, 7);
        basicMethods54.addElementToSet(intSet74, (-5));
        basicMethods0.addElementToSet(intSet74, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        basicMethods0.addElementToSet(intSet84, 3);
        int int89 = basicMethods0.getMin((int) (short) 100, 10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test192");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(3, (int) (short) 100);
        double double12 = basicMethods0.sum_doubles((double) 0L, 96.0d);
        int int15 = basicMethods0.getMin((-9), (int) '#');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test193");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int21 = basicMethods0.abs(10);
        int int24 = basicMethods0.getMin((int) (short) 10, 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test194");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        int int12 = basicMethods0.getMin(52, (-10));
        int int14 = basicMethods0.abs((-8));
        int int16 = basicMethods0.abs((-100));
        int[] intArray17 = null;
        basicMethods0.incrementNumberAtIndex(intArray17, (-10));
        int int22 = basicMethods0.getMin(0, 97);
        int int25 = basicMethods0.getMin((-9), 32);
        int[] intArray26 = null;
        basicMethods0.incrementNumberAtIndex(intArray26, (int) (byte) -1);
        double double31 = basicMethods0.sum_doubles((double) (-3), 9.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test195");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int24 = basicMethods0.getMin((-6), (-10));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test196");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        int int14 = basicMethods0.getMin((int) (byte) 0, 7);
        int int16 = basicMethods0.abs(97);
        double double19 = basicMethods0.sum_doubles((double) '4', (double) (short) 10);
        int int22 = basicMethods0.getMin(0, 4);
        int int25 = basicMethods0.getMin((int) ' ', (int) (short) -1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test197");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int49 = basicMethods0.abs(4);
        double double52 = basicMethods0.sum_doubles(0.0d, (double) (-2));
        int int54 = basicMethods0.abs((int) (short) 10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test198");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        basicMethods0.incrementNumberAtIndex(intArray5, (-7));
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods10.addElementToSet(intSet43, 8);
        double double49 = basicMethods10.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        basicMethods10.incrementNumberAtIndex(intArray51, (int) (byte) 100);
        basicMethods0.incrementNumberAtIndex(intArray51, 2);
        int int59 = basicMethods0.abs((int) (byte) 10);
        double double62 = basicMethods0.sum_doubles((-95.0d), (double) (-1L));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test199");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) 0);
        int int50 = basicMethods0.getMin(10, 52);
        int int52 = basicMethods0.abs(100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test200");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 10 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods0.addElementToSet(intSet28, (-10));
        int int34 = basicMethods0.getMin((-4), 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test201");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) 0);
        int int50 = basicMethods0.getMin(5, 0);
        double double53 = basicMethods0.sum_doubles(17.0d, (double) ' ');
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test202");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        int int26 = basicMethods0.getMin(0, (int) (short) 0);
        int int28 = basicMethods0.abs((int) (byte) 1);
        int int30 = basicMethods0.abs((-2));
        double double33 = basicMethods0.sum_doubles(35.0d, (double) (-9));
        int int36 = basicMethods0.getMin(10, 2);
        double double39 = basicMethods0.sum_doubles((double) 3, (double) 0.0f);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray45 = new int[] {};
        basicMethods44.incrementNumberAtIndex(intArray45, 6);
        basicMethods40.incrementNumberAtIndex(intArray45, (-7));
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int int53 = basicMethods50.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        basicMethods50.addElementToSet(intSet83, 8);
        double double89 = basicMethods50.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods90 = new gassert.BasicMethods();
        int[] intArray91 = new int[] {};
        basicMethods90.incrementNumberAtIndex(intArray91, 6);
        basicMethods50.incrementNumberAtIndex(intArray91, (int) (byte) 100);
        basicMethods40.incrementNumberAtIndex(intArray91, 2);
        basicMethods0.incrementNumberAtIndex(intArray91, 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test203");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        int int62 = basicMethods0.getMin(52, 2);
        int int64 = basicMethods0.abs(1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test204");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int14 = basicMethods0.abs((int) (short) 1);
        double double17 = basicMethods0.sum_doubles(106.0d, (double) (short) 1);
        int int20 = basicMethods0.getMin(2, (int) (byte) 1);
        int int22 = basicMethods0.abs(35);
        gassert.BasicMethods basicMethods23 = new gassert.BasicMethods();
        int int26 = basicMethods23.getMin((-1), (int) (byte) 1);
        int[] intArray32 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods23.incrementNumberAtIndex(intArray32, (int) (short) 0);
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        int int38 = basicMethods35.getMin((-100), 0);
        int int40 = basicMethods35.abs((-8));
        int int42 = basicMethods35.abs((int) '#');
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        basicMethods35.addElementToSet(intSet69, (-5));
        basicMethods23.addElementToSet(intSet69, 7);
        basicMethods0.addElementToSet(intSet69, 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test205");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        double double62 = basicMethods0.sum_doubles(5.0d, 45.0d);
        int int64 = basicMethods0.abs((-1));
        int int66 = basicMethods0.abs((int) (short) 1);
        gassert.BasicMethods basicMethods67 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        basicMethods67.addElementToSet(intSet68, 0);
        int int72 = basicMethods67.abs((-8));
        gassert.BasicMethods basicMethods73 = new gassert.BasicMethods();
        int int76 = basicMethods73.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods77 = new gassert.BasicMethods();
        int[] intArray78 = new int[] {};
        basicMethods77.incrementNumberAtIndex(intArray78, 6);
        basicMethods73.incrementNumberAtIndex(intArray78, (-7));
        basicMethods67.incrementNumberAtIndex(intArray78, (-100));
        int[] intArray88 = new int[] { (-9), 'a', '4' };
        basicMethods67.incrementNumberAtIndex(intArray88, (-6));
        basicMethods0.incrementNumberAtIndex(intArray88, (int) ' ');
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test206");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((-8));
        int int7 = basicMethods0.abs((int) '#');
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 52, 100, (-8), 52, (-10), 4, (-2), 100, 1, 52, 3, (-4), 1, (-9), (-100), 7, 0, 32, 8, 5, (-1), (-6), 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        basicMethods0.addElementToSet(intSet32, (-1));
        int int38 = basicMethods0.getMin((int) (short) -1, 5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test207");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 9);
        basicMethods0.incrementNumberAtIndex(intArray49, 0);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int int59 = basicMethods56.getMin((-100), 0);
        int int61 = basicMethods56.abs((int) '4');
        gassert.BasicMethods basicMethods62 = new gassert.BasicMethods();
        int[] intArray63 = new int[] {};
        basicMethods62.incrementNumberAtIndex(intArray63, 6);
        gassert.BasicMethods basicMethods66 = new gassert.BasicMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        basicMethods66.addElementToSet(intSet78, (-10));
        basicMethods62.addElementToSet(intSet78, 7);
        basicMethods56.addElementToSet(intSet78, 10);
        basicMethods0.addElementToSet(intSet78, (int) (byte) 0);
        double double90 = basicMethods0.sum_doubles(0.0d, (-11.0d));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test208");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int2 = basicMethods0.abs((-100));
        int int5 = basicMethods0.getMin((int) (byte) -1, (int) (short) 100);
        double double8 = basicMethods0.sum_doubles(81.0d, 52.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test209");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int[] intArray41 = new int[] {};
        basicMethods40.incrementNumberAtIndex(intArray41, 6);
        basicMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 100);
        int int48 = basicMethods0.getMin((int) (short) 1, (int) (byte) 10);
        int int51 = basicMethods0.getMin((int) (byte) 1, 52);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test210");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        double double39 = basicMethods0.sum_doubles((double) 6, (double) 100L);
        int int41 = basicMethods0.abs(3);
        int int44 = basicMethods0.getMin(32, (-10));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test211");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        gassert.BasicMethods basicMethods1 = new gassert.BasicMethods();
        int int4 = basicMethods1.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods5 = new gassert.BasicMethods();
        int[] intArray6 = new int[] {};
        basicMethods5.incrementNumberAtIndex(intArray6, 6);
        basicMethods1.incrementNumberAtIndex(intArray6, (-7));
        basicMethods0.incrementNumberAtIndex(intArray6, 6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test212");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray5 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods0.incrementNumberAtIndex(intArray5, (-8));
        int int9 = basicMethods0.abs((-4));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test213");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int14 = basicMethods0.abs((int) (short) 1);
        int int16 = basicMethods0.abs((int) '4');
        double double19 = basicMethods0.sum_doubles((double) 0, (double) 1L);
        gassert.BasicMethods basicMethods20 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        basicMethods20.addElementToSet(intSet21, 0);
        int int25 = basicMethods20.abs((-8));
        int int28 = basicMethods20.getMin(10, (-2));
        gassert.BasicMethods basicMethods29 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet30 = null;
        basicMethods29.addElementToSet(intSet30, 0);
        int int34 = basicMethods29.abs((-8));
        gassert.BasicMethods basicMethods35 = new gassert.BasicMethods();
        int int38 = basicMethods35.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        int[] intArray40 = new int[] {};
        basicMethods39.incrementNumberAtIndex(intArray40, 6);
        basicMethods35.incrementNumberAtIndex(intArray40, (-7));
        basicMethods29.incrementNumberAtIndex(intArray40, (-100));
        int[] intArray50 = new int[] { (-9), 'a', '4' };
        basicMethods29.incrementNumberAtIndex(intArray50, (-6));
        gassert.BasicMethods basicMethods53 = new gassert.BasicMethods();
        int int56 = basicMethods53.getMin((-100), 0);
        int int58 = basicMethods53.abs((-8));
        int int60 = basicMethods53.abs((int) '#');
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        basicMethods53.addElementToSet(intSet87, (-5));
        basicMethods29.addElementToSet(intSet87, 3);
        basicMethods20.addElementToSet(intSet87, (-7));
        basicMethods0.addElementToSet(intSet87, 7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test214");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) 0);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet49 = null;
        basicMethods48.addElementToSet(intSet49, 0);
        int int53 = basicMethods48.abs((-8));
        gassert.BasicMethods basicMethods54 = new gassert.BasicMethods();
        int int57 = basicMethods54.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods58 = new gassert.BasicMethods();
        int[] intArray59 = new int[] {};
        basicMethods58.incrementNumberAtIndex(intArray59, 6);
        basicMethods54.incrementNumberAtIndex(intArray59, (-7));
        basicMethods48.incrementNumberAtIndex(intArray59, (-100));
        int[] intArray69 = new int[] { (-9), 'a', '4' };
        basicMethods48.incrementNumberAtIndex(intArray69, (-6));
        basicMethods0.incrementNumberAtIndex(intArray69, (int) (short) 1);
        double double76 = basicMethods0.sum_doubles((double) (short) -1, (double) 'a');
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test215");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((-7));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test216");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        basicMethods0.incrementNumberAtIndex(intArray5, (-7));
        int int11 = basicMethods0.abs((-100));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test217");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        int int14 = basicMethods0.getMin((int) (byte) 0, 7);
        gassert.BasicMethods basicMethods15 = new gassert.BasicMethods();
        int int18 = basicMethods15.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods19 = new gassert.BasicMethods();
        int[] intArray20 = new int[] {};
        basicMethods19.incrementNumberAtIndex(intArray20, 6);
        gassert.BasicMethods basicMethods23 = new gassert.BasicMethods();
        int[] intArray24 = new int[] {};
        basicMethods23.incrementNumberAtIndex(intArray24, 6);
        gassert.BasicMethods basicMethods27 = new gassert.BasicMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        basicMethods27.addElementToSet(intSet39, (-10));
        basicMethods23.addElementToSet(intSet39, 7);
        basicMethods19.addElementToSet(intSet39, (-5));
        basicMethods15.addElementToSet(intSet39, 2);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int int52 = basicMethods49.getMin((-100), 0);
        int int54 = basicMethods49.abs((int) '4');
        gassert.BasicMethods basicMethods55 = new gassert.BasicMethods();
        int[] intArray56 = new int[] {};
        basicMethods55.incrementNumberAtIndex(intArray56, 6);
        gassert.BasicMethods basicMethods59 = new gassert.BasicMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        basicMethods59.addElementToSet(intSet71, (-10));
        basicMethods55.addElementToSet(intSet71, 7);
        basicMethods49.addElementToSet(intSet71, 10);
        basicMethods15.addElementToSet(intSet71, 35);
        basicMethods0.addElementToSet(intSet71, 52);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test218");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        double double36 = basicMethods12.sum_doubles((double) (-6), (double) (-1L));
        int int39 = basicMethods12.getMin((int) (short) 1, (-3));
        double double42 = basicMethods12.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-1), (int) (byte) 1);
        int[] intArray52 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods43.incrementNumberAtIndex(intArray52, (int) (short) 0);
        basicMethods12.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        basicMethods57.incrementNumberAtIndex(intArray62, (-7));
        basicMethods12.incrementNumberAtIndex(intArray62, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        int int72 = basicMethods0.abs((int) (byte) 1);
        int int74 = basicMethods0.abs((int) '4');
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test219");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        gassert.BasicMethods basicMethods45 = new gassert.BasicMethods();
        int int48 = basicMethods45.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods49 = new gassert.BasicMethods();
        int[] intArray50 = new int[] {};
        basicMethods49.incrementNumberAtIndex(intArray50, 6);
        basicMethods45.incrementNumberAtIndex(intArray50, (-7));
        basicMethods0.incrementNumberAtIndex(intArray50, (int) (byte) -1);
        int int59 = basicMethods0.getMin((int) 'a', 100);
        int int61 = basicMethods0.abs((int) (byte) 1);
        int int64 = basicMethods0.getMin((int) (short) 10, 4);
        int int66 = basicMethods0.abs((int) (short) 10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test220");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        double double9 = basicMethods0.sum_doubles((double) (-100), (double) 100);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        basicMethods14.addElementToSet(intSet26, (-10));
        basicMethods10.addElementToSet(intSet26, 7);
        double double34 = basicMethods10.sum_doubles((double) (-6), (double) (-1L));
        int int37 = basicMethods10.getMin((int) (short) 1, (-3));
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int[] intArray39 = new int[] {};
        basicMethods38.incrementNumberAtIndex(intArray39, 6);
        gassert.BasicMethods basicMethods42 = new gassert.BasicMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        basicMethods42.addElementToSet(intSet54, (-10));
        basicMethods38.addElementToSet(intSet54, 7);
        int int61 = basicMethods38.abs(0);
        gassert.BasicMethods basicMethods62 = new gassert.BasicMethods();
        int[] intArray63 = new int[] {};
        basicMethods62.incrementNumberAtIndex(intArray63, 6);
        gassert.BasicMethods basicMethods66 = new gassert.BasicMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        basicMethods66.addElementToSet(intSet78, (-10));
        basicMethods62.addElementToSet(intSet78, 7);
        basicMethods38.addElementToSet(intSet78, (int) (short) 10);
        basicMethods10.addElementToSet(intSet78, (-9));
        basicMethods0.addElementToSet(intSet78, (int) (short) 100);
        double double92 = basicMethods0.sum_doubles(0.0d, 188.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test221");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        basicMethods6.incrementNumberAtIndex(intArray11, (-7));
        basicMethods0.incrementNumberAtIndex(intArray11, (-100));
        double double20 = basicMethods0.sum_doubles((double) 6, 35.0d);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        basicMethods0.addElementToSet(intSet21, 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test222");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int8 = basicMethods0.getMin(10, (int) (byte) -1);
        int int10 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods11 = new gassert.BasicMethods();
        int int14 = basicMethods11.getMin((-1), (int) (byte) 1);
        int[] intArray20 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods11.incrementNumberAtIndex(intArray20, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray20, 100);
        int int27 = basicMethods0.getMin(6, (-9));
        int int30 = basicMethods0.getMin((int) 'a', (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test223");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        basicMethods0.incrementNumberAtIndex(intArray5, (-7));
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        basicMethods10.addElementToSet(intSet43, 8);
        double double49 = basicMethods10.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        basicMethods10.incrementNumberAtIndex(intArray51, (int) (byte) 100);
        basicMethods0.incrementNumberAtIndex(intArray51, 2);
        int int59 = basicMethods0.abs((int) '4');
        double double62 = basicMethods0.sum_doubles((double) 1, 8.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test224");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        gassert.BasicMethods basicMethods34 = new gassert.BasicMethods();
        int int37 = basicMethods34.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int[] intArray39 = new int[] {};
        basicMethods38.incrementNumberAtIndex(intArray39, 6);
        basicMethods34.incrementNumberAtIndex(intArray39, (-7));
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int int47 = basicMethods44.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        basicMethods44.addElementToSet(intSet77, 8);
        double double83 = basicMethods44.sum_doubles((double) 6, (double) 100L);
        gassert.BasicMethods basicMethods84 = new gassert.BasicMethods();
        int[] intArray85 = new int[] {};
        basicMethods84.incrementNumberAtIndex(intArray85, 6);
        basicMethods44.incrementNumberAtIndex(intArray85, (int) (byte) 100);
        basicMethods34.incrementNumberAtIndex(intArray85, 2);
        basicMethods0.incrementNumberAtIndex(intArray85, 0);
        double double96 = basicMethods0.sum_doubles((double) 0, (double) 7);
        double double99 = basicMethods0.sum_doubles(11.0d, (double) (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test225");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        int int7 = basicMethods0.abs((-9));
        int int9 = basicMethods0.abs((-2));
        double double12 = basicMethods0.sum_doubles(106.0d, (double) (byte) 10);
        int int14 = basicMethods0.abs((int) (short) 1);
        double double17 = basicMethods0.sum_doubles(106.0d, (double) (short) 1);
        int int20 = basicMethods0.getMin(2, (int) (byte) 1);
        gassert.BasicMethods basicMethods21 = new gassert.BasicMethods();
        int[] intArray22 = new int[] {};
        basicMethods21.incrementNumberAtIndex(intArray22, 6);
        basicMethods0.incrementNumberAtIndex(intArray22, 52);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test226");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        double double6 = basicMethods0.sum_doubles((double) (-1L), (double) (byte) 0);
        int int9 = basicMethods0.getMin(3, (int) (short) 100);
        double double12 = basicMethods0.sum_doubles((double) 0L, 96.0d);
        double double15 = basicMethods0.sum_doubles(8.0d, (double) 10L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test227");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        int int23 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int[] intArray25 = new int[] {};
        basicMethods24.incrementNumberAtIndex(intArray25, 6);
        gassert.BasicMethods basicMethods28 = new gassert.BasicMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        basicMethods28.addElementToSet(intSet40, (-10));
        basicMethods24.addElementToSet(intSet40, 7);
        basicMethods0.addElementToSet(intSet40, (int) (short) 10);
        int int50 = basicMethods0.getMin((-1), (-3));
        int int52 = basicMethods0.abs(8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test228");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs(0);
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        gassert.BasicMethods basicMethods14 = new gassert.BasicMethods();
        int[] intArray15 = new int[] {};
        basicMethods14.incrementNumberAtIndex(intArray15, 6);
        gassert.BasicMethods basicMethods18 = new gassert.BasicMethods();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        basicMethods18.addElementToSet(intSet30, (-10));
        basicMethods14.addElementToSet(intSet30, 7);
        basicMethods10.addElementToSet(intSet30, (-5));
        basicMethods6.addElementToSet(intSet30, 2);
        int[] intArray45 = new int[] { (-100), (-2), (byte) 100, 52, (byte) 0 };
        basicMethods6.incrementNumberAtIndex(intArray45, 0);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        int[] intArray49 = new int[] {};
        basicMethods48.incrementNumberAtIndex(intArray49, 6);
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods52.addElementToSet(intSet64, (-10));
        basicMethods48.addElementToSet(intSet64, 7);
        double double72 = basicMethods48.sum_doubles((double) (-6), (double) (-1L));
        int int75 = basicMethods48.getMin((int) (short) 1, (-3));
        double double78 = basicMethods48.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods79 = new gassert.BasicMethods();
        int int82 = basicMethods79.getMin((-1), (int) (byte) 1);
        int[] intArray88 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods79.incrementNumberAtIndex(intArray88, (int) (short) 0);
        basicMethods48.incrementNumberAtIndex(intArray88, (int) (byte) 1);
        basicMethods6.incrementNumberAtIndex(intArray88, 0);
        basicMethods0.incrementNumberAtIndex(intArray88, (-2));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test229");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        int int5 = basicMethods0.abs((int) '4');
        double double8 = basicMethods0.sum_doubles(41.0d, 5.0d);
        int[] intArray9 = null;
        basicMethods0.incrementNumberAtIndex(intArray9, (-7));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test230");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        double double6 = basicMethods0.sum_doubles(10.0d, (double) '#');
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 1, (-9), (-1), 32, 1, 100, (-1), (-7), 0 };
        java.util.HashSet<java.lang.Integer> intSet17 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet17, intArray16);
        basicMethods0.addElementToSet(intSet17, (int) (byte) 10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test231");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int[] intArray9 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods0.incrementNumberAtIndex(intArray9, (int) (short) 0);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        double double36 = basicMethods12.sum_doubles((double) (-6), (double) (-1L));
        int int39 = basicMethods12.getMin((int) (short) 1, (-3));
        double double42 = basicMethods12.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods43 = new gassert.BasicMethods();
        int int46 = basicMethods43.getMin((-1), (int) (byte) 1);
        int[] intArray52 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods43.incrementNumberAtIndex(intArray52, (int) (short) 0);
        basicMethods12.incrementNumberAtIndex(intArray52, (int) (byte) 1);
        gassert.BasicMethods basicMethods57 = new gassert.BasicMethods();
        int int60 = basicMethods57.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods61 = new gassert.BasicMethods();
        int[] intArray62 = new int[] {};
        basicMethods61.incrementNumberAtIndex(intArray62, 6);
        basicMethods57.incrementNumberAtIndex(intArray62, (-7));
        basicMethods12.incrementNumberAtIndex(intArray62, (int) (byte) -1);
        basicMethods0.incrementNumberAtIndex(intArray62, (int) (byte) 1);
        int int72 = basicMethods0.abs((int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        basicMethods0.addElementToSet(intSet73, 10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test232");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int32 = basicMethods0.getMin(0, 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test233");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        double double30 = basicMethods0.sum_doubles((double) '#', (double) (-1L));
        gassert.BasicMethods basicMethods31 = new gassert.BasicMethods();
        int int34 = basicMethods31.getMin((-1), (int) (byte) 1);
        int[] intArray40 = new int[] { 3, (-2), (-9), (-2), 4 };
        basicMethods31.incrementNumberAtIndex(intArray40, (int) (short) 0);
        basicMethods0.incrementNumberAtIndex(intArray40, (int) (byte) 1);
        double double47 = basicMethods0.sum_doubles(0.0d, (double) 0);
        int int50 = basicMethods0.getMin(10, 52);
        int int52 = basicMethods0.abs(4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test234");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        int int5 = basicMethods0.abs(100);
        int int8 = basicMethods0.getMin((-1), (-9));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test235");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        basicMethods0.addElementToSet(intSet1, 0);
        int int5 = basicMethods0.abs((-8));
        gassert.BasicMethods basicMethods6 = new gassert.BasicMethods();
        int int9 = basicMethods6.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int[] intArray11 = new int[] {};
        basicMethods10.incrementNumberAtIndex(intArray11, 6);
        basicMethods6.incrementNumberAtIndex(intArray11, (-7));
        basicMethods0.incrementNumberAtIndex(intArray11, (-100));
        int[] intArray21 = new int[] { (-9), 'a', '4' };
        basicMethods0.incrementNumberAtIndex(intArray21, (-6));
        gassert.BasicMethods basicMethods24 = new gassert.BasicMethods();
        int int27 = basicMethods24.getMin((-100), 0);
        int int29 = basicMethods24.abs((-8));
        int int31 = basicMethods24.abs((int) '#');
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        basicMethods24.addElementToSet(intSet58, (-5));
        basicMethods0.addElementToSet(intSet58, 3);
        int int66 = basicMethods0.getMin((-100), 97);
        double double69 = basicMethods0.sum_doubles(110.0d, 105.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test236");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        double double6 = basicMethods0.sum_doubles(10.0d, (double) '#');
        int int9 = basicMethods0.getMin((int) '4', 8);
        gassert.BasicMethods basicMethods10 = new gassert.BasicMethods();
        int int13 = basicMethods10.getMin((-100), 0);
        int int15 = basicMethods10.abs((int) '4');
        int int17 = basicMethods10.abs((-9));
        int int19 = basicMethods10.abs((-2));
        int int22 = basicMethods10.getMin(52, (-10));
        int int24 = basicMethods10.abs((-8));
        int int26 = basicMethods10.abs((-100));
        int[] intArray27 = null;
        basicMethods10.incrementNumberAtIndex(intArray27, (-10));
        gassert.BasicMethods basicMethods30 = new gassert.BasicMethods();
        int int33 = basicMethods30.getMin((-100), 0);
        int int35 = basicMethods30.abs((-8));
        int int37 = basicMethods30.abs((int) '#');
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-2), (-10), (-6), (-3), 1, (-1), 9, (-1), 10, (-10), 1, 7, 100, (-1), 3, (-9), (-2), (-8), (-1), 97, 0, (-1), (-8), 10 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        basicMethods30.addElementToSet(intSet64, (-5));
        basicMethods10.addElementToSet(intSet64, 3);
        basicMethods0.addElementToSet(intSet64, 100);
        double double74 = basicMethods0.sum_doubles(6.0d, 128.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test237");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        double double36 = basicMethods0.sum_doubles((double) (-1), (double) 3);
        double double39 = basicMethods0.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        basicMethods40.addElementToSet(intSet41, 0);
        int int45 = basicMethods40.abs((-8));
        gassert.BasicMethods basicMethods46 = new gassert.BasicMethods();
        int int49 = basicMethods46.getMin((-1), (int) (byte) 1);
        gassert.BasicMethods basicMethods50 = new gassert.BasicMethods();
        int[] intArray51 = new int[] {};
        basicMethods50.incrementNumberAtIndex(intArray51, 6);
        basicMethods46.incrementNumberAtIndex(intArray51, (-7));
        basicMethods40.incrementNumberAtIndex(intArray51, (-100));
        int int60 = basicMethods40.getMin((int) '#', 7);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-4), 2, 2, 8, (-2), 7, 35, 100, 3, (-7), 5, (-7), (-4), (-100), 10, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        basicMethods40.addElementToSet(intSet78, (int) (byte) 10);
        basicMethods0.addElementToSet(intSet78, (int) (short) 10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test238");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        basicMethods8.addElementToSet(intSet20, (-10));
        basicMethods4.addElementToSet(intSet20, 7);
        basicMethods0.addElementToSet(intSet20, (-5));
        int int29 = basicMethods0.abs((-8));
        int int31 = basicMethods0.abs(6);
        gassert.BasicMethods basicMethods32 = new gassert.BasicMethods();
        int int35 = basicMethods32.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods36 = new gassert.BasicMethods();
        int int39 = basicMethods36.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int[] intArray41 = new int[] {};
        basicMethods40.incrementNumberAtIndex(intArray41, 6);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray45 = new int[] {};
        basicMethods44.incrementNumberAtIndex(intArray45, 6);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        basicMethods48.addElementToSet(intSet60, (-10));
        basicMethods44.addElementToSet(intSet60, 7);
        basicMethods40.addElementToSet(intSet60, (-5));
        basicMethods36.addElementToSet(intSet60, 2);
        int[] intArray75 = new int[] { (-100), (-2), (byte) 100, 52, (byte) 0 };
        basicMethods36.incrementNumberAtIndex(intArray75, 0);
        basicMethods32.incrementNumberAtIndex(intArray75, (-3));
        basicMethods0.incrementNumberAtIndex(intArray75, (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test239");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        int int36 = basicMethods0.getMin(52, (int) ' ');
        double double39 = basicMethods0.sum_doubles((double) (-2), (-7.0d));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test240");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-100), 0);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int int7 = basicMethods4.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        int[] intArray13 = new int[] {};
        basicMethods12.incrementNumberAtIndex(intArray13, 6);
        gassert.BasicMethods basicMethods16 = new gassert.BasicMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        basicMethods16.addElementToSet(intSet28, (-10));
        basicMethods12.addElementToSet(intSet28, 7);
        basicMethods8.addElementToSet(intSet28, (-5));
        basicMethods4.addElementToSet(intSet28, 2);
        gassert.BasicMethods basicMethods38 = new gassert.BasicMethods();
        int int41 = basicMethods38.getMin((-100), 0);
        int int43 = basicMethods38.abs((int) '4');
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray45 = new int[] {};
        basicMethods44.incrementNumberAtIndex(intArray45, 6);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        basicMethods48.addElementToSet(intSet60, (-10));
        basicMethods44.addElementToSet(intSet60, 7);
        basicMethods38.addElementToSet(intSet60, 10);
        basicMethods4.addElementToSet(intSet60, 35);
        basicMethods0.addElementToSet(intSet60, 7);
        int int74 = basicMethods0.getMin(3, (-100));
        int int76 = basicMethods0.abs(5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test241");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 0, (-10), 1, (-10), (-4), (-5), 9, 0, 6, (-1), (-5), (-7), 100, 2, (-1), 1, 0, 10, 100, 2, 0, (-4), 8, 9, 52, 4, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        basicMethods0.addElementToSet(intSet33, 8);
        int int38 = basicMethods0.abs((int) (short) 100);
        gassert.BasicMethods basicMethods39 = new gassert.BasicMethods();
        int int42 = basicMethods39.getMin((-100), 0);
        int int44 = basicMethods39.abs((int) '4');
        int int47 = basicMethods39.getMin(10, (int) (byte) -1);
        gassert.BasicMethods basicMethods48 = new gassert.BasicMethods();
        int int51 = basicMethods48.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods52 = new gassert.BasicMethods();
        int[] intArray53 = new int[] {};
        basicMethods52.incrementNumberAtIndex(intArray53, 6);
        gassert.BasicMethods basicMethods56 = new gassert.BasicMethods();
        int[] intArray57 = new int[] {};
        basicMethods56.incrementNumberAtIndex(intArray57, 6);
        gassert.BasicMethods basicMethods60 = new gassert.BasicMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        basicMethods60.addElementToSet(intSet72, (-10));
        basicMethods56.addElementToSet(intSet72, 7);
        basicMethods52.addElementToSet(intSet72, (-5));
        basicMethods48.addElementToSet(intSet72, 2);
        basicMethods39.addElementToSet(intSet72, (-100));
        basicMethods0.addElementToSet(intSet72, (-9));
        int int87 = basicMethods0.abs((-1));
        int int90 = basicMethods0.getMin((-1), (-2));
        double double93 = basicMethods0.sum_doubles(150.0d, (double) (short) 10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test242");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin(9, (int) (short) -1);
        double double6 = basicMethods0.sum_doubles(2.0d, 24.0d);
        int int8 = basicMethods0.abs(9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test243");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((-1), (int) (byte) 1);
        int int6 = basicMethods0.getMin(3, 8);
        gassert.BasicMethods basicMethods7 = new gassert.BasicMethods();
        int int10 = basicMethods7.getMin((-1), (int) (byte) 1);
        int int12 = basicMethods7.abs(0);
        gassert.BasicMethods basicMethods13 = new gassert.BasicMethods();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet25 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        basicMethods13.addElementToSet(intSet25, (-10));
        gassert.BasicMethods basicMethods29 = new gassert.BasicMethods();
        int int32 = basicMethods29.getMin((-100), 0);
        gassert.BasicMethods basicMethods33 = new gassert.BasicMethods();
        int[] intArray38 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods33.incrementNumberAtIndex(intArray38, (-8));
        basicMethods29.incrementNumberAtIndex(intArray38, 9);
        basicMethods13.incrementNumberAtIndex(intArray38, 7);
        basicMethods7.incrementNumberAtIndex(intArray38, 100);
        basicMethods0.incrementNumberAtIndex(intArray38, (-1));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test244");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int int3 = basicMethods0.getMin((int) '#', (-2));
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        int[] intArray5 = new int[] {};
        basicMethods4.incrementNumberAtIndex(intArray5, 6);
        gassert.BasicMethods basicMethods8 = new gassert.BasicMethods();
        int[] intArray9 = new int[] {};
        basicMethods8.incrementNumberAtIndex(intArray9, 6);
        gassert.BasicMethods basicMethods12 = new gassert.BasicMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        basicMethods12.addElementToSet(intSet24, (-10));
        basicMethods8.addElementToSet(intSet24, 7);
        basicMethods4.addElementToSet(intSet24, (-5));
        basicMethods0.addElementToSet(intSet24, 2);
        double double36 = basicMethods0.sum_doubles((double) (-1), (double) 3);
        double double39 = basicMethods0.sum_doubles((-7.0d), (double) 0);
        gassert.BasicMethods basicMethods40 = new gassert.BasicMethods();
        int int43 = basicMethods40.getMin((-100), 0);
        gassert.BasicMethods basicMethods44 = new gassert.BasicMethods();
        int[] intArray49 = new int[] { ' ', (short) 0, (short) 1, (-5) };
        basicMethods44.incrementNumberAtIndex(intArray49, (-8));
        basicMethods40.incrementNumberAtIndex(intArray49, 97);
        basicMethods0.incrementNumberAtIndex(intArray49, (int) (byte) 0);
        int int58 = basicMethods0.getMin(0, (int) (byte) 10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicMethodsTester0.test245");
        gassert.BasicMethods basicMethods0 = new gassert.BasicMethods();
        int[] intArray1 = new int[] {};
        basicMethods0.incrementNumberAtIndex(intArray1, 6);
        gassert.BasicMethods basicMethods4 = new gassert.BasicMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        basicMethods4.addElementToSet(intSet16, (-10));
        basicMethods0.addElementToSet(intSet16, 7);
        double double24 = basicMethods0.sum_doubles((double) (-6), (double) (-1L));
        int int27 = basicMethods0.getMin((int) (short) 1, (-3));
        int int30 = basicMethods0.getMin((int) (short) -1, (-7));
        int int32 = basicMethods0.abs(0);
    }
}

