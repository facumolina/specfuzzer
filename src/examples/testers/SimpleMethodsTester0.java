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
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        int[] intArray52 = new int[] { 100 };
        simpleMethods50.incrementNumberAtIndex(intArray52, 8);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods55.addElementToSet(intSet81, 6);
        simpleMethods50.addElementToSet(intSet81, (int) (short) 10);
        int int88 = simpleMethods50.abs(5);
        int int90 = simpleMethods50.abs(8);
        gassert.SimpleMethods simpleMethods91 = new gassert.SimpleMethods();
        int[] intArray93 = new int[] { 100 };
        simpleMethods91.incrementNumberAtIndex(intArray93, 8);
        simpleMethods50.incrementNumberAtIndex(intArray93, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray93, 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test002");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods64.addElementToSet(intSet90, 6);
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 1);
        int int97 = simpleMethods0.abs((-5));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test003");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        int[] intArray37 = new int[] { 100 };
        simpleMethods35.incrementNumberAtIndex(intArray37, 8);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods40.addElementToSet(intSet66, 6);
        simpleMethods35.addElementToSet(intSet66, (int) (short) 10);
        int int73 = simpleMethods35.abs(5);
        gassert.SimpleMethods simpleMethods74 = new gassert.SimpleMethods();
        int[] intArray76 = new int[] { 100 };
        simpleMethods74.incrementNumberAtIndex(intArray76, 8);
        simpleMethods35.incrementNumberAtIndex(intArray76, (int) (byte) 1);
        simpleMethods5.incrementNumberAtIndex(intArray76, 2);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods5.incrementNumberAtIndex(intArray85, 0);
        gassert.SimpleMethods simpleMethods90 = new gassert.SimpleMethods();
        int[] intArray92 = new int[] { 100 };
        simpleMethods90.incrementNumberAtIndex(intArray92, 8);
        simpleMethods5.incrementNumberAtIndex(intArray92, (-7));
        simpleMethods0.incrementNumberAtIndex(intArray92, 2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test004");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs(10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test005");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int int36 = simpleMethods34.abs((int) (byte) 100);
        int int38 = simpleMethods34.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods34.addElementToSet(intSet39, 100);
        int int43 = simpleMethods34.abs((-3));
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int[] intArray46 = new int[] { 100 };
        simpleMethods44.incrementNumberAtIndex(intArray46, 8);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet75 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        simpleMethods49.addElementToSet(intSet75, 6);
        simpleMethods44.addElementToSet(intSet75, (int) (short) 10);
        int int82 = simpleMethods44.abs(5);
        int int84 = simpleMethods44.abs(8);
        gassert.SimpleMethods simpleMethods85 = new gassert.SimpleMethods();
        int[] intArray87 = new int[] { 100 };
        simpleMethods85.incrementNumberAtIndex(intArray87, 8);
        simpleMethods44.incrementNumberAtIndex(intArray87, (int) (short) 0);
        simpleMethods34.incrementNumberAtIndex(intArray87, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray87, (int) (short) 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test006");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods41.addElementToSet(intSet72, (int) (short) 10);
        int int79 = simpleMethods41.abs(5);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int[] intArray82 = new int[] { 100 };
        simpleMethods80.incrementNumberAtIndex(intArray82, 8);
        simpleMethods41.incrementNumberAtIndex(intArray82, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray82, (-2));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test007");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods64.addElementToSet(intSet90, 6);
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 1);
        int int97 = simpleMethods0.abs(10);
        int int99 = simpleMethods0.abs((-3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test008");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods64.addElementToSet(intSet90, 6);
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 1);
        int int97 = simpleMethods0.abs(10);
        int int99 = simpleMethods0.abs((-100));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test009");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods0.addElementToSet(intSet63, 8);
        int int68 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test010");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        int[] intArray91 = null;
        simpleMethods0.incrementNumberAtIndex(intArray91, (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test011");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((-5));
        int int65 = simpleMethods0.abs(9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test012");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int[] intArray89 = null;
        simpleMethods0.incrementNumberAtIndex(intArray89, 5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test013");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        int int51 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test014");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs((int) (short) 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test015");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        int int9 = simpleMethods0.abs((-3));
        int int11 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test016");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 5, (-6), 4, (-6), (-3), (-10) };
        java.util.HashSet<java.lang.Integer> intSet93 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        simpleMethods0.addElementToSet(intSet93, 100);
        int int98 = simpleMethods0.abs((-9));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test017");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) (short) 1);
        int int95 = simpleMethods0.abs((-100));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test018");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int[] intArray75 = null;
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (byte) 100);
        int int79 = simpleMethods0.abs(10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test019");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int int93 = simpleMethods0.abs(52);
        int int95 = simpleMethods0.abs((int) (short) 1);
        int int97 = simpleMethods0.abs((-2));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test020");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (short) 1);
        int int47 = simpleMethods0.abs((int) (byte) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test021");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs((int) (short) -1);
        int int83 = simpleMethods0.abs((-2));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test022");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int[] intArray5 = null;
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        simpleMethods0.incrementNumberAtIndex(intArray10, 1);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        int int17 = simpleMethods15.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        int[] intArray20 = new int[] { 100 };
        simpleMethods18.incrementNumberAtIndex(intArray20, 8);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods23.addElementToSet(intSet49, 6);
        simpleMethods18.addElementToSet(intSet49, (int) (short) 10);
        int int56 = simpleMethods18.abs(5);
        int int58 = simpleMethods18.abs(8);
        gassert.SimpleMethods simpleMethods59 = new gassert.SimpleMethods();
        int[] intArray61 = new int[] { 100 };
        simpleMethods59.incrementNumberAtIndex(intArray61, 8);
        simpleMethods18.incrementNumberAtIndex(intArray61, (int) (short) 0);
        int int67 = simpleMethods18.abs((-8));
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods18.addElementToSet(intSet81, 8);
        simpleMethods15.addElementToSet(intSet81, (int) 'a');
        simpleMethods0.addElementToSet(intSet81, (-3));
        int[] intArray95 = new int[] { 10, 4, 32, (byte) 1, (byte) 1, (-1) };
        simpleMethods0.incrementNumberAtIndex(intArray95, (int) ' ');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test023");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs((-5));
        int int88 = simpleMethods0.abs(97);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test024");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        int[] intArray52 = new int[] { 100 };
        simpleMethods50.incrementNumberAtIndex(intArray52, 8);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods55.addElementToSet(intSet81, 6);
        simpleMethods50.addElementToSet(intSet81, (int) (short) 10);
        int int88 = simpleMethods50.abs(5);
        int int90 = simpleMethods50.abs(8);
        gassert.SimpleMethods simpleMethods91 = new gassert.SimpleMethods();
        int[] intArray93 = new int[] { 100 };
        simpleMethods91.incrementNumberAtIndex(intArray93, 8);
        simpleMethods50.incrementNumberAtIndex(intArray93, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray93, 52);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test025");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int44 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test026");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs(1);
        int int42 = simpleMethods0.abs((-2));
        int[] intArray43 = null;
        simpleMethods0.incrementNumberAtIndex(intArray43, (-2));
        int int47 = simpleMethods0.abs((-100));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test027");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test028");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((-10));
        int int83 = simpleMethods0.abs((-9));
        int int85 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test029");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs((int) (byte) 100);
        int int41 = simpleMethods37.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods37.addElementToSet(intSet42, 100);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int[] intArray47 = new int[] { 100 };
        simpleMethods45.incrementNumberAtIndex(intArray47, 8);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods50.addElementToSet(intSet76, 6);
        simpleMethods45.addElementToSet(intSet76, (int) (short) 10);
        simpleMethods37.addElementToSet(intSet76, 0);
        simpleMethods0.addElementToSet(intSet76, (-3));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test030");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods8.addElementToSet(intSet34, 6);
        simpleMethods3.addElementToSet(intSet34, (int) (short) 10);
        int int41 = simpleMethods3.abs(5);
        int int43 = simpleMethods3.abs(8);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int[] intArray46 = new int[] { 100 };
        simpleMethods44.incrementNumberAtIndex(intArray46, 8);
        simpleMethods3.incrementNumberAtIndex(intArray46, (int) (short) 0);
        int int52 = simpleMethods3.abs((-8));
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods3.addElementToSet(intSet66, 8);
        simpleMethods0.addElementToSet(intSet66, (int) 'a');
        gassert.SimpleMethods simpleMethods72 = new gassert.SimpleMethods();
        int[] intArray74 = new int[] { 100 };
        simpleMethods72.incrementNumberAtIndex(intArray74, 8);
        int int78 = simpleMethods72.abs((-4));
        gassert.SimpleMethods simpleMethods79 = new gassert.SimpleMethods();
        int[] intArray81 = new int[] { 100 };
        simpleMethods79.incrementNumberAtIndex(intArray81, 8);
        simpleMethods72.incrementNumberAtIndex(intArray81, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray81, (int) 'a');
        int int89 = simpleMethods0.abs(5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test031");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        gassert.SimpleMethods simpleMethods62 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods62.addElementToSet(intSet88, 6);
        simpleMethods0.addElementToSet(intSet88, 100);
        int int95 = simpleMethods0.abs((int) (byte) 1);
        int int97 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test032");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int[] intArray62 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray62, 0);
        int int66 = simpleMethods0.abs(0);
        int int68 = simpleMethods0.abs((int) ' ');
        int[] intArray69 = null;
        simpleMethods0.incrementNumberAtIndex(intArray69, 52);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test033");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        int[] intArray38 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods32.incrementNumberAtIndex(intArray38, (int) '#');
        simpleMethods0.incrementNumberAtIndex(intArray38, (-2));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test034");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int10 = simpleMethods8.abs((int) (byte) 100);
        int int12 = simpleMethods8.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods8.addElementToSet(intSet13, 100);
        int int17 = simpleMethods8.abs((-3));
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods18.addElementToSet(intSet44, 6);
        int[] intArray52 = new int[] { 6, 8, (-8), 4 };
        simpleMethods18.incrementNumberAtIndex(intArray52, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods18.addElementToSet(intSet85, 0);
        simpleMethods8.addElementToSet(intSet85, 6);
        simpleMethods0.addElementToSet(intSet85, 52);
        int int94 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test035");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs((int) (short) -1);
        int int83 = simpleMethods0.abs((int) '#');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test036");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs((int) (short) -1);
        int int83 = simpleMethods0.abs((int) (short) -1);
        int int85 = simpleMethods0.abs((-6));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test037");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((int) (byte) 100);
        int int65 = simpleMethods0.abs((int) '#');
        int int67 = simpleMethods0.abs(10);
        int int69 = simpleMethods0.abs(8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test038");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods0.addElementToSet(intSet67, 0);
        int int72 = simpleMethods0.abs(7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test039");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs(4);
        int int85 = simpleMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test040");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((int) (byte) 0);
        int int92 = simpleMethods0.abs((-3));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test041");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods1.addElementToSet(intSet27, 6);
        gassert.SimpleMethods simpleMethods31 = new gassert.SimpleMethods();
        int[] intArray33 = new int[] { 100 };
        simpleMethods31.incrementNumberAtIndex(intArray33, 8);
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods36.addElementToSet(intSet62, 6);
        simpleMethods31.addElementToSet(intSet62, (int) (short) 10);
        int int69 = simpleMethods31.abs(5);
        gassert.SimpleMethods simpleMethods70 = new gassert.SimpleMethods();
        int[] intArray72 = new int[] { 100 };
        simpleMethods70.incrementNumberAtIndex(intArray72, 8);
        simpleMethods31.incrementNumberAtIndex(intArray72, (int) (byte) 1);
        simpleMethods1.incrementNumberAtIndex(intArray72, 2);
        simpleMethods0.incrementNumberAtIndex(intArray72, (-4));
        int int82 = simpleMethods0.abs(100);
        int int84 = simpleMethods0.abs(4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test042");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int int93 = simpleMethods0.abs(52);
        int int95 = simpleMethods0.abs((int) (short) 1);
        int int97 = simpleMethods0.abs(4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test043");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs(4);
        int int94 = simpleMethods0.abs(6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test044");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int int93 = simpleMethods0.abs((int) (byte) 100);
        int int95 = simpleMethods0.abs((int) (short) 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test045");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs(1);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods41.addElementToSet(intSet72, (int) (short) 10);
        int int79 = simpleMethods41.abs(5);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int[] intArray82 = new int[] { 100 };
        simpleMethods80.incrementNumberAtIndex(intArray82, 8);
        simpleMethods41.incrementNumberAtIndex(intArray82, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray82, 32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test046");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int[] intArray51 = new int[] { 100 };
        simpleMethods49.incrementNumberAtIndex(intArray51, 8);
        int[] intArray54 = null;
        simpleMethods49.incrementNumberAtIndex(intArray54, (int) 'a');
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        int[] intArray59 = new int[] { 100 };
        simpleMethods57.incrementNumberAtIndex(intArray59, 8);
        simpleMethods49.incrementNumberAtIndex(intArray59, 1);
        simpleMethods0.incrementNumberAtIndex(intArray59, 6);
        int int67 = simpleMethods0.abs(0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test047");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-4));
        int int79 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test048");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] { 100 };
        simpleMethods14.incrementNumberAtIndex(intArray16, 8);
        gassert.SimpleMethods simpleMethods19 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods19.addElementToSet(intSet45, 6);
        simpleMethods14.addElementToSet(intSet45, (int) (short) 10);
        int int52 = simpleMethods14.abs(5);
        int int54 = simpleMethods14.abs(8);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        int[] intArray57 = new int[] { 100 };
        simpleMethods55.incrementNumberAtIndex(intArray57, 8);
        simpleMethods14.incrementNumberAtIndex(intArray57, (int) (short) 0);
        int int63 = simpleMethods14.abs((-8));
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods14.addElementToSet(intSet77, 8);
        simpleMethods0.addElementToSet(intSet77, 32);
        int int84 = simpleMethods0.abs(5);
        int int86 = simpleMethods0.abs((int) (byte) -1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test049");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int[] intArray5 = null;
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        simpleMethods0.incrementNumberAtIndex(intArray10, 1);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods15.addElementToSet(intSet41, 6);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int[] intArray47 = new int[] { 100 };
        simpleMethods45.incrementNumberAtIndex(intArray47, 8);
        int int51 = simpleMethods45.abs((-4));
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        int[] intArray54 = new int[] { 100 };
        simpleMethods52.incrementNumberAtIndex(intArray54, 8);
        simpleMethods45.incrementNumberAtIndex(intArray54, (-5));
        gassert.SimpleMethods simpleMethods59 = new gassert.SimpleMethods();
        int[] intArray61 = new int[] { 100 };
        simpleMethods59.incrementNumberAtIndex(intArray61, 8);
        simpleMethods45.incrementNumberAtIndex(intArray61, 0);
        simpleMethods15.incrementNumberAtIndex(intArray61, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray61, (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test050");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods41.addElementToSet(intSet67, 6);
        int int72 = simpleMethods41.abs(0);
        int int74 = simpleMethods41.abs((int) '#');
        gassert.SimpleMethods simpleMethods75 = new gassert.SimpleMethods();
        int[] intArray77 = new int[] { 100 };
        simpleMethods75.incrementNumberAtIndex(intArray77, 8);
        simpleMethods41.incrementNumberAtIndex(intArray77, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray77, (-10));
        int int85 = simpleMethods0.abs((-100));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test051");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int10 = simpleMethods8.abs((int) (byte) 100);
        int int12 = simpleMethods8.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods8.addElementToSet(intSet13, 100);
        int int17 = simpleMethods8.abs((-3));
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods18.addElementToSet(intSet44, 6);
        int[] intArray52 = new int[] { 6, 8, (-8), 4 };
        simpleMethods18.incrementNumberAtIndex(intArray52, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods18.addElementToSet(intSet85, 0);
        simpleMethods8.addElementToSet(intSet85, 6);
        simpleMethods0.addElementToSet(intSet85, 52);
        int int94 = simpleMethods0.abs(9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test052");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] { 100 };
        simpleMethods14.incrementNumberAtIndex(intArray16, 8);
        simpleMethods0.incrementNumberAtIndex(intArray16, 0);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        int[] intArray27 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods21.incrementNumberAtIndex(intArray27, (int) '#');
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods21.addElementToSet(intSet56, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet56, (int) (byte) 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test053");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        simpleMethods8.addElementToSet(intSet39, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet39, 0);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int[] intArray53 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods47.incrementNumberAtIndex(intArray53, (int) '#');
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods56.addElementToSet(intSet82, 6);
        simpleMethods47.addElementToSet(intSet82, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet82, (int) '4');
        int int91 = simpleMethods0.abs((-2));
        int int93 = simpleMethods0.abs(6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test054");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        int int11 = simpleMethods0.abs((int) (short) 10);
        int int13 = simpleMethods0.abs(0);
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] { 100 };
        simpleMethods14.incrementNumberAtIndex(intArray16, 8);
        int int20 = simpleMethods14.abs((-4));
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        int[] intArray23 = new int[] { 100 };
        simpleMethods21.incrementNumberAtIndex(intArray23, 8);
        simpleMethods14.incrementNumberAtIndex(intArray23, (-5));
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        int[] intArray30 = new int[] { 100 };
        simpleMethods28.incrementNumberAtIndex(intArray30, 8);
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods33.addElementToSet(intSet59, 6);
        simpleMethods28.addElementToSet(intSet59, (int) (short) 10);
        int int66 = simpleMethods28.abs(5);
        int int68 = simpleMethods28.abs(8);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods28.incrementNumberAtIndex(intArray71, (int) (short) 0);
        int int77 = simpleMethods28.abs((-8));
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet91 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        simpleMethods28.addElementToSet(intSet91, 8);
        simpleMethods14.addElementToSet(intSet91, 32);
        simpleMethods0.addElementToSet(intSet91, (int) (byte) 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test055");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs(10);
        int int92 = simpleMethods0.abs(0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test056");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        int[] intArray11 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods5.incrementNumberAtIndex(intArray11, (int) '#');
        simpleMethods0.incrementNumberAtIndex(intArray11, (-10));
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int[] intArray18 = new int[] { 100 };
        simpleMethods16.incrementNumberAtIndex(intArray18, 8);
        int[] intArray21 = null;
        simpleMethods16.incrementNumberAtIndex(intArray21, (int) 'a');
        gassert.SimpleMethods simpleMethods24 = new gassert.SimpleMethods();
        int[] intArray26 = new int[] { 100 };
        simpleMethods24.incrementNumberAtIndex(intArray26, 8);
        simpleMethods16.incrementNumberAtIndex(intArray26, 1);
        simpleMethods0.incrementNumberAtIndex(intArray26, 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test057");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int10 = simpleMethods8.abs((int) (byte) 100);
        int int12 = simpleMethods8.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods8.addElementToSet(intSet13, 100);
        int int17 = simpleMethods8.abs((-3));
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods18.addElementToSet(intSet44, 6);
        int[] intArray52 = new int[] { 6, 8, (-8), 4 };
        simpleMethods18.incrementNumberAtIndex(intArray52, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods18.addElementToSet(intSet85, 0);
        simpleMethods8.addElementToSet(intSet85, 6);
        simpleMethods0.addElementToSet(intSet85, 52);
        int int94 = simpleMethods0.abs((-2));
        int int96 = simpleMethods0.abs(0);
        int[] intArray97 = null;
        simpleMethods0.incrementNumberAtIndex(intArray97, (int) '#');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test058");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        int int9 = simpleMethods0.abs((-3));
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray12 = new int[] { 100 };
        simpleMethods10.incrementNumberAtIndex(intArray12, 8);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods15.addElementToSet(intSet41, 6);
        simpleMethods10.addElementToSet(intSet41, (int) (short) 10);
        int int48 = simpleMethods10.abs(5);
        int int50 = simpleMethods10.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods51.addElementToSet(intSet77, 6);
        simpleMethods10.addElementToSet(intSet77, 7);
        simpleMethods0.addElementToSet(intSet77, 0);
        int int86 = simpleMethods0.abs(0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test059");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 1);
        int int42 = simpleMethods0.abs(100);
        int int44 = simpleMethods0.abs((int) (byte) 100);
        int int46 = simpleMethods0.abs(7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test060");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        int[] intArray50 = null;
        simpleMethods0.incrementNumberAtIndex(intArray50, 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test061");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test062");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        java.util.HashSet<java.lang.Integer> intSet3 = null;
        simpleMethods0.addElementToSet(intSet3, 6);
        gassert.SimpleMethods simpleMethods6 = new gassert.SimpleMethods();
        int int8 = simpleMethods6.abs((int) (byte) 100);
        int int10 = simpleMethods6.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods6.addElementToSet(intSet11, 100);
        int int15 = simpleMethods6.abs((-3));
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        int[] intArray18 = new int[] { 100 };
        simpleMethods16.incrementNumberAtIndex(intArray18, 8);
        gassert.SimpleMethods simpleMethods21 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods21.addElementToSet(intSet47, 6);
        simpleMethods16.addElementToSet(intSet47, (int) (short) 10);
        int int54 = simpleMethods16.abs(5);
        int int56 = simpleMethods16.abs(8);
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        int[] intArray59 = new int[] { 100 };
        simpleMethods57.incrementNumberAtIndex(intArray59, 8);
        simpleMethods16.incrementNumberAtIndex(intArray59, (int) (short) 0);
        simpleMethods6.incrementNumberAtIndex(intArray59, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray59, 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test063");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 10);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        int int9 = simpleMethods3.abs((-4));
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray12 = new int[] { 100 };
        simpleMethods10.incrementNumberAtIndex(intArray12, 8);
        simpleMethods3.incrementNumberAtIndex(intArray12, (-5));
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int[] intArray19 = new int[] { 100 };
        simpleMethods17.incrementNumberAtIndex(intArray19, 8);
        simpleMethods3.incrementNumberAtIndex(intArray19, 0);
        simpleMethods0.incrementNumberAtIndex(intArray19, 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test064");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray6 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods0.incrementNumberAtIndex(intArray6, (int) '#');
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test065");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        simpleMethods8.addElementToSet(intSet39, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet39, 0);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int[] intArray49 = new int[] { 100 };
        simpleMethods47.incrementNumberAtIndex(intArray49, 8);
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods52.addElementToSet(intSet78, 6);
        simpleMethods47.addElementToSet(intSet78, (int) (short) 10);
        int int85 = simpleMethods47.abs(5);
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray88 = new int[] { 100 };
        simpleMethods86.incrementNumberAtIndex(intArray88, 8);
        simpleMethods47.incrementNumberAtIndex(intArray88, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray88, 5);
        int int96 = simpleMethods0.abs((-6));
        int int98 = simpleMethods0.abs(1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test066");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((int) (short) 0);
        int int83 = simpleMethods0.abs(1);
        int int85 = simpleMethods0.abs(10);
        int int87 = simpleMethods0.abs((-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test067");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods8.addElementToSet(intSet34, 6);
        gassert.SimpleMethods simpleMethods38 = new gassert.SimpleMethods();
        int[] intArray40 = new int[] { 100 };
        simpleMethods38.incrementNumberAtIndex(intArray40, 8);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods43.addElementToSet(intSet69, 6);
        simpleMethods38.addElementToSet(intSet69, (int) (short) 10);
        int int76 = simpleMethods38.abs(5);
        gassert.SimpleMethods simpleMethods77 = new gassert.SimpleMethods();
        int[] intArray79 = new int[] { 100 };
        simpleMethods77.incrementNumberAtIndex(intArray79, 8);
        simpleMethods38.incrementNumberAtIndex(intArray79, (int) (byte) 1);
        simpleMethods8.incrementNumberAtIndex(intArray79, 2);
        simpleMethods0.incrementNumberAtIndex(intArray79, 4);
        int int89 = simpleMethods0.abs(3);
        int int91 = simpleMethods0.abs(0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test068");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int[] intArray39 = new int[] { 100 };
        simpleMethods37.incrementNumberAtIndex(intArray39, 8);
        int int43 = simpleMethods37.abs((-4));
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int[] intArray46 = new int[] { 100 };
        simpleMethods44.incrementNumberAtIndex(intArray46, 8);
        simpleMethods37.incrementNumberAtIndex(intArray46, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray46, (int) '4');
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test069");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs(1);
        int int87 = simpleMethods0.abs(4);
        int int89 = simpleMethods0.abs(0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test070");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 1);
        int int42 = simpleMethods0.abs(100);
        int int44 = simpleMethods0.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods45.addElementToSet(intSet71, 6);
        gassert.SimpleMethods simpleMethods75 = new gassert.SimpleMethods();
        int[] intArray77 = new int[] { 100 };
        simpleMethods75.incrementNumberAtIndex(intArray77, 8);
        int int81 = simpleMethods75.abs((-4));
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        int[] intArray84 = new int[] { 100 };
        simpleMethods82.incrementNumberAtIndex(intArray84, 8);
        simpleMethods75.incrementNumberAtIndex(intArray84, (-5));
        gassert.SimpleMethods simpleMethods89 = new gassert.SimpleMethods();
        int[] intArray91 = new int[] { 100 };
        simpleMethods89.incrementNumberAtIndex(intArray91, 8);
        simpleMethods75.incrementNumberAtIndex(intArray91, 0);
        simpleMethods45.incrementNumberAtIndex(intArray91, (int) (byte) 0);
        simpleMethods0.incrementNumberAtIndex(intArray91, (int) (byte) -1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test071");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs(0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test072");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(10);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        int[] intArray53 = new int[] { 100 };
        simpleMethods51.incrementNumberAtIndex(intArray53, 8);
        int int57 = simpleMethods51.abs((-4));
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        int[] intArray60 = new int[] { 100 };
        simpleMethods58.incrementNumberAtIndex(intArray60, 8);
        simpleMethods51.incrementNumberAtIndex(intArray60, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray60, (int) (short) 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test073");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int[] intArray75 = null;
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (byte) 100);
        int int79 = simpleMethods0.abs((-6));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test074");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs(4);
        int int94 = simpleMethods0.abs((int) (byte) 100);
        int int96 = simpleMethods0.abs((-4));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test075");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int10 = simpleMethods8.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods11 = new gassert.SimpleMethods();
        int[] intArray13 = new int[] { 100 };
        simpleMethods11.incrementNumberAtIndex(intArray13, 8);
        gassert.SimpleMethods simpleMethods16 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods16.addElementToSet(intSet42, 6);
        simpleMethods11.addElementToSet(intSet42, (int) (short) 10);
        int int49 = simpleMethods11.abs(5);
        int int51 = simpleMethods11.abs(8);
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        int[] intArray54 = new int[] { 100 };
        simpleMethods52.incrementNumberAtIndex(intArray54, 8);
        simpleMethods11.incrementNumberAtIndex(intArray54, (int) (short) 0);
        int int60 = simpleMethods11.abs((-8));
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods11.addElementToSet(intSet74, 8);
        simpleMethods8.addElementToSet(intSet74, (int) 'a');
        simpleMethods0.addElementToSet(intSet74, (int) (short) 0);
        int int83 = simpleMethods0.abs(4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test076");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs(0);
        int int40 = simpleMethods0.abs((-9));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test077");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs((int) (byte) 1);
        int int87 = simpleMethods0.abs(100);
        int int89 = simpleMethods0.abs(10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test078");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods7.addElementToSet(intSet33, 6);
        int int38 = simpleMethods7.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods44.addElementToSet(intSet70, 6);
        simpleMethods39.addElementToSet(intSet70, (int) (short) 10);
        simpleMethods7.addElementToSet(intSet70, (-3));
        simpleMethods0.addElementToSet(intSet70, 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test079");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int int76 = simpleMethods0.abs(0);
        int int78 = simpleMethods0.abs(9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test080");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((int) (byte) 0);
        int int92 = simpleMethods0.abs((int) (short) 100);
        int int94 = simpleMethods0.abs(0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test081");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        int int15 = simpleMethods0.abs(1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test082");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int44 = simpleMethods0.abs(7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test083");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        simpleMethods8.addElementToSet(intSet39, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet39, 0);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int[] intArray53 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods47.incrementNumberAtIndex(intArray53, (int) '#');
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods56.addElementToSet(intSet82, 6);
        simpleMethods47.addElementToSet(intSet82, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet82, (int) '4');
        int int91 = simpleMethods0.abs(7);
        int int93 = simpleMethods0.abs(3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test084");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs((-7));
        int int88 = simpleMethods0.abs((int) (byte) 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test085");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        gassert.SimpleMethods simpleMethods62 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods62.addElementToSet(intSet88, 6);
        simpleMethods0.addElementToSet(intSet88, (-2));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test086");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 10);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods8.addElementToSet(intSet34, 6);
        simpleMethods3.addElementToSet(intSet34, (int) (short) 10);
        int int41 = simpleMethods3.abs(5);
        int int43 = simpleMethods3.abs(8);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        int[] intArray46 = new int[] { 100 };
        simpleMethods44.incrementNumberAtIndex(intArray46, 8);
        simpleMethods3.incrementNumberAtIndex(intArray46, (int) (short) 0);
        simpleMethods0.incrementNumberAtIndex(intArray46, 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test087");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int int9 = simpleMethods7.abs((int) (byte) 100);
        int int11 = simpleMethods7.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet12 = null;
        simpleMethods7.addElementToSet(intSet12, 100);
        int int16 = simpleMethods7.abs((-3));
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods17.addElementToSet(intSet43, 6);
        int[] intArray51 = new int[] { 6, 8, (-8), 4 };
        simpleMethods17.incrementNumberAtIndex(intArray51, (-1));
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods17.addElementToSet(intSet84, 0);
        simpleMethods7.addElementToSet(intSet84, 6);
        simpleMethods0.addElementToSet(intSet84, 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test088");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 5, (-6), 4, (-6), (-3), (-10) };
        java.util.HashSet<java.lang.Integer> intSet93 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        simpleMethods0.addElementToSet(intSet93, 100);
        int int98 = simpleMethods0.abs((-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test089");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs(0);
        int int40 = simpleMethods0.abs(0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test090");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        int int92 = simpleMethods0.abs((-8));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test091");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((-8));
        int[] intArray34 = null;
        simpleMethods0.incrementNumberAtIndex(intArray34, (int) (byte) 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test092");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        int int35 = simpleMethods0.abs(2);
        int int37 = simpleMethods0.abs((int) ' ');
        int int39 = simpleMethods0.abs(0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test093");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        int int35 = simpleMethods0.abs(2);
        int int37 = simpleMethods0.abs((int) ' ');
        int int39 = simpleMethods0.abs((-5));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test094");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods10.addElementToSet(intSet36, 6);
        int[] intArray44 = new int[] { 6, 8, (-8), 4 };
        simpleMethods10.incrementNumberAtIndex(intArray44, (-1));
        int int48 = simpleMethods10.abs((-9));
        int int50 = simpleMethods10.abs(1);
        int int52 = simpleMethods10.abs((-2));
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        int int55 = simpleMethods53.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods56.addElementToSet(intSet82, 6);
        int[] intArray90 = new int[] { 6, 8, (-8), 4 };
        simpleMethods56.incrementNumberAtIndex(intArray90, (-1));
        simpleMethods53.incrementNumberAtIndex(intArray90, 1);
        simpleMethods10.incrementNumberAtIndex(intArray90, (int) (short) 1);
        simpleMethods0.incrementNumberAtIndex(intArray90, 100);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test095");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int44 = simpleMethods0.abs(4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test096");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((int) (short) 0);
        int int83 = simpleMethods0.abs(1);
        int int85 = simpleMethods0.abs(10);
        int int87 = simpleMethods0.abs((int) (byte) -1);
        int int89 = simpleMethods0.abs((int) (short) 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test097");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-6));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods7.addElementToSet(intSet33, 6);
        int int38 = simpleMethods7.abs(0);
        int int40 = simpleMethods7.abs((int) '#');
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods7.incrementNumberAtIndex(intArray43, (-5));
        int int49 = simpleMethods7.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods50.addElementToSet(intSet76, 6);
        simpleMethods7.addElementToSet(intSet76, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet76, (int) '4');
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test098");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        int[] intArray11 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods5.incrementNumberAtIndex(intArray11, (int) '#');
        simpleMethods0.incrementNumberAtIndex(intArray11, (-10));
        int int17 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test099");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int[] intArray5 = null;
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        int int9 = simpleMethods0.abs(6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test100");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test101");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods41.addElementToSet(intSet67, 6);
        int int72 = simpleMethods41.abs(0);
        int int74 = simpleMethods41.abs((int) '#');
        gassert.SimpleMethods simpleMethods75 = new gassert.SimpleMethods();
        int[] intArray77 = new int[] { 100 };
        simpleMethods75.incrementNumberAtIndex(intArray77, 8);
        simpleMethods41.incrementNumberAtIndex(intArray77, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray77, (-1));
        int int85 = simpleMethods0.abs((-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test102");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((int) ' ');
        int int92 = simpleMethods0.abs(10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test103");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        int int35 = simpleMethods0.abs(1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test104");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(4);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods3.addElementToSet(intSet29, 6);
        int int34 = simpleMethods3.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        int[] intArray37 = new int[] { 100 };
        simpleMethods35.incrementNumberAtIndex(intArray37, 8);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods40.addElementToSet(intSet66, 6);
        simpleMethods35.addElementToSet(intSet66, (int) (short) 10);
        simpleMethods3.addElementToSet(intSet66, (-3));
        simpleMethods0.addElementToSet(intSet66, 5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test105");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods41.addElementToSet(intSet67, 6);
        simpleMethods0.addElementToSet(intSet67, 7);
        int int74 = simpleMethods0.abs((int) '#');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test106");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-4));
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, (-8));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test107");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int int93 = simpleMethods0.abs(52);
        int int95 = simpleMethods0.abs(35);
        int int97 = simpleMethods0.abs((int) ' ');
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test108");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs((int) (short) 0);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods41.addElementToSet(intSet72, (int) (short) 10);
        int int79 = simpleMethods41.abs(5);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int[] intArray82 = new int[] { 100 };
        simpleMethods80.incrementNumberAtIndex(intArray82, 8);
        simpleMethods41.incrementNumberAtIndex(intArray82, (int) (short) 1);
        simpleMethods0.incrementNumberAtIndex(intArray82, (int) (short) -1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test109");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        simpleMethods8.addElementToSet(intSet39, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet39, 0);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int[] intArray53 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods47.incrementNumberAtIndex(intArray53, (int) '#');
        gassert.SimpleMethods simpleMethods56 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods56.addElementToSet(intSet82, 6);
        simpleMethods47.addElementToSet(intSet82, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet82, (int) '4');
        int int91 = simpleMethods0.abs(7);
        int int93 = simpleMethods0.abs(8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test110");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        int int9 = simpleMethods0.abs((-9));
        int int11 = simpleMethods0.abs(32);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test111");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods0.addElementToSet(intSet63, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (-7));
        int int71 = simpleMethods0.abs(8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test112");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        simpleMethods8.addElementToSet(intSet39, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet39, 0);
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int[] intArray49 = new int[] { 100 };
        simpleMethods47.incrementNumberAtIndex(intArray49, 8);
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods52.addElementToSet(intSet78, 6);
        simpleMethods47.addElementToSet(intSet78, (int) (short) 10);
        int int85 = simpleMethods47.abs(5);
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray88 = new int[] { 100 };
        simpleMethods86.incrementNumberAtIndex(intArray88, 8);
        simpleMethods47.incrementNumberAtIndex(intArray88, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray88, 5);
        int int96 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test113");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        int int47 = simpleMethods0.abs(100);
        int int49 = simpleMethods0.abs(1);
        int int51 = simpleMethods0.abs((-7));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test114");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int10 = simpleMethods8.abs((int) (byte) 100);
        int int12 = simpleMethods8.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods8.addElementToSet(intSet13, 100);
        int int17 = simpleMethods8.abs((-3));
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods18.addElementToSet(intSet44, 6);
        int[] intArray52 = new int[] { 6, 8, (-8), 4 };
        simpleMethods18.incrementNumberAtIndex(intArray52, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods18.addElementToSet(intSet85, 0);
        simpleMethods8.addElementToSet(intSet85, 6);
        simpleMethods0.addElementToSet(intSet85, 52);
        int int94 = simpleMethods0.abs((-2));
        int int96 = simpleMethods0.abs((int) (short) 100);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test115");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(8);
        int int92 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test116");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((-10));
        int int83 = simpleMethods0.abs((int) (short) 100);
        java.lang.Integer[] intArray94 = new java.lang.Integer[] { 100, (-2), (-8), 5, (-100), (-100), (-7), (-100), 9, (-5) };
        java.util.HashSet<java.lang.Integer> intSet95 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet95, intArray94);
        simpleMethods0.addElementToSet(intSet95, 52);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test117");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs(1);
        int int87 = simpleMethods0.abs((-1));
        int int89 = simpleMethods0.abs(4);
        int int91 = simpleMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test118");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((int) (short) 0);
        int int51 = simpleMethods0.abs((int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet52 = null;
        simpleMethods0.addElementToSet(intSet52, 35);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test119");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods34.addElementToSet(intSet60, 6);
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods64.addElementToSet(intSet90, 6);
        simpleMethods34.addElementToSet(intSet90, (int) '#');
        simpleMethods0.addElementToSet(intSet90, 2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test120");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int int32 = simpleMethods30.abs(6);
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        int[] intArray35 = new int[] { 100 };
        simpleMethods33.incrementNumberAtIndex(intArray35, 8);
        simpleMethods30.incrementNumberAtIndex(intArray35, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray35, (int) ' ');
        int int43 = simpleMethods0.abs(1);
        int int45 = simpleMethods0.abs(52);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test121");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 1);
        int int42 = simpleMethods0.abs(100);
        int int44 = simpleMethods0.abs(0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test122");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray6 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods0.incrementNumberAtIndex(intArray6, (int) '#');
        int int10 = simpleMethods0.abs((int) (short) 10);
        int[] intArray11 = null;
        simpleMethods0.incrementNumberAtIndex(intArray11, 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test123");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs(0);
        int int85 = simpleMethods0.abs((-1));
        int int87 = simpleMethods0.abs(7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test124");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((int) (byte) 100);
        int int65 = simpleMethods0.abs((int) '#');
        int int67 = simpleMethods0.abs((-6));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test125");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        int[] intArray34 = new int[] { 100 };
        simpleMethods32.incrementNumberAtIndex(intArray34, 8);
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods37.addElementToSet(intSet63, 6);
        simpleMethods32.addElementToSet(intSet63, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet63, (-3));
        int int72 = simpleMethods0.abs(35);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test126");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs(1);
        int int42 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods43.addElementToSet(intSet69, 6);
        int int74 = simpleMethods43.abs(0);
        int int76 = simpleMethods43.abs((int) '#');
        gassert.SimpleMethods simpleMethods77 = new gassert.SimpleMethods();
        int[] intArray79 = new int[] { 100 };
        simpleMethods77.incrementNumberAtIndex(intArray79, 8);
        simpleMethods43.incrementNumberAtIndex(intArray79, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray79, 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test127");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs(0);
        int int85 = simpleMethods0.abs(9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test128");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs((int) (short) 0);
        int[] intArray41 = null;
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (short) 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test129");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs(1);
        int int42 = simpleMethods0.abs((-2));
        int[] intArray43 = null;
        simpleMethods0.incrementNumberAtIndex(intArray43, (-2));
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        int[] intArray52 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods46.incrementNumberAtIndex(intArray52, (int) '#');
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods55.addElementToSet(intSet81, 6);
        simpleMethods46.addElementToSet(intSet81, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet81, (int) (byte) 10);
        int int90 = simpleMethods0.abs(10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test130");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(1);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int int43 = simpleMethods41.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods44.addElementToSet(intSet70, 6);
        int[] intArray78 = new int[] { 6, 8, (-8), 4 };
        simpleMethods44.incrementNumberAtIndex(intArray78, (-1));
        simpleMethods41.incrementNumberAtIndex(intArray78, 1);
        simpleMethods0.incrementNumberAtIndex(intArray78, 10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test131");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs((-2));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test132");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs(0);
        int int85 = simpleMethods0.abs((-1));
        int int87 = simpleMethods0.abs(35);
        int int89 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test133");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] { 100 };
        simpleMethods14.incrementNumberAtIndex(intArray16, 8);
        gassert.SimpleMethods simpleMethods19 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods19.addElementToSet(intSet45, 6);
        simpleMethods14.addElementToSet(intSet45, (int) (short) 10);
        int int52 = simpleMethods14.abs(5);
        int int54 = simpleMethods14.abs(8);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        int[] intArray57 = new int[] { 100 };
        simpleMethods55.incrementNumberAtIndex(intArray57, 8);
        simpleMethods14.incrementNumberAtIndex(intArray57, (int) (short) 0);
        int int63 = simpleMethods14.abs((-8));
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods14.addElementToSet(intSet77, 8);
        simpleMethods0.addElementToSet(intSet77, 32);
        int int84 = simpleMethods0.abs(5);
        int int86 = simpleMethods0.abs(35);
        int int88 = simpleMethods0.abs((-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test134");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        int int35 = simpleMethods0.abs(0);
        int int37 = simpleMethods0.abs(0);
        int int39 = simpleMethods0.abs((-10));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test135");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        int int51 = simpleMethods0.abs(100);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test136");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        gassert.SimpleMethods simpleMethods49 = new gassert.SimpleMethods();
        int[] intArray51 = new int[] { 100 };
        simpleMethods49.incrementNumberAtIndex(intArray51, 8);
        int[] intArray54 = null;
        simpleMethods49.incrementNumberAtIndex(intArray54, (int) 'a');
        gassert.SimpleMethods simpleMethods57 = new gassert.SimpleMethods();
        int[] intArray59 = new int[] { 100 };
        simpleMethods57.incrementNumberAtIndex(intArray59, 8);
        simpleMethods49.incrementNumberAtIndex(intArray59, 1);
        simpleMethods0.incrementNumberAtIndex(intArray59, 6);
        int int67 = simpleMethods0.abs(100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test137");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((int) (byte) 0);
        int int92 = simpleMethods0.abs((int) (short) 100);
        int int94 = simpleMethods0.abs((-5));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test138");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((int) ' ');
        int int92 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test139");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int[] intArray62 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray62, 0);
        gassert.SimpleMethods simpleMethods65 = new gassert.SimpleMethods();
        int[] intArray67 = new int[] { 100 };
        simpleMethods65.incrementNumberAtIndex(intArray67, 8);
        int int71 = simpleMethods65.abs((-4));
        gassert.SimpleMethods simpleMethods72 = new gassert.SimpleMethods();
        int[] intArray74 = new int[] { 100 };
        simpleMethods72.incrementNumberAtIndex(intArray74, 8);
        simpleMethods65.incrementNumberAtIndex(intArray74, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray74, (-7));
        java.util.HashSet<java.lang.Integer> intSet81 = null;
        simpleMethods0.addElementToSet(intSet81, (int) (short) 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test140");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, (-6));
        int int91 = simpleMethods0.abs((int) (short) 100);
        int int93 = simpleMethods0.abs(0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test141");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((-5));
        int[] intArray80 = null;
        simpleMethods0.incrementNumberAtIndex(intArray80, 35);
        int int84 = simpleMethods0.abs(0);
        int int86 = simpleMethods0.abs((-7));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test142");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs(1);
        int int87 = simpleMethods0.abs((-1));
        int int89 = simpleMethods0.abs(4);
        int int91 = simpleMethods0.abs(6);
        int int93 = simpleMethods0.abs(97);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test143");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs(0);
        int int81 = simpleMethods0.abs(5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test144");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int[] intArray62 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray62, 0);
        int int66 = simpleMethods0.abs(0);
        int int68 = simpleMethods0.abs((int) ' ');
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray75 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods69.incrementNumberAtIndex(intArray75, (int) '#');
        simpleMethods0.incrementNumberAtIndex(intArray75, (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test145");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((int) (short) 0);
        int int83 = simpleMethods0.abs(1);
        int int85 = simpleMethods0.abs(5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test146");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs(0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test147");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((-5));
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int[] intArray82 = new int[] { 100 };
        simpleMethods80.incrementNumberAtIndex(intArray82, 8);
        int int86 = simpleMethods80.abs((-4));
        gassert.SimpleMethods simpleMethods87 = new gassert.SimpleMethods();
        int[] intArray89 = new int[] { 100 };
        simpleMethods87.incrementNumberAtIndex(intArray89, 8);
        simpleMethods80.incrementNumberAtIndex(intArray89, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray89, (int) (short) -1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test148");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        int[] intArray34 = new int[] { 100 };
        simpleMethods32.incrementNumberAtIndex(intArray34, 8);
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods37.addElementToSet(intSet63, 6);
        simpleMethods32.addElementToSet(intSet63, (int) (short) 10);
        int int70 = simpleMethods32.abs(5);
        gassert.SimpleMethods simpleMethods71 = new gassert.SimpleMethods();
        int[] intArray73 = new int[] { 100 };
        simpleMethods71.incrementNumberAtIndex(intArray73, 8);
        simpleMethods32.incrementNumberAtIndex(intArray73, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray73, 0);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 52);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test149");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, (-6));
        int int91 = simpleMethods0.abs((int) (short) 100);
        int int93 = simpleMethods0.abs((-4));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test150");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs((int) ' ');
        int int94 = simpleMethods0.abs((int) (short) 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test151");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs(1);
        int int87 = simpleMethods0.abs(1);
        int int89 = simpleMethods0.abs((-100));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test152");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((-5));
        int[] intArray80 = null;
        simpleMethods0.incrementNumberAtIndex(intArray80, 35);
        int int84 = simpleMethods0.abs(0);
        int int86 = simpleMethods0.abs(0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test153");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((-5));
        int int65 = simpleMethods0.abs((-100));
        int int67 = simpleMethods0.abs((int) '4');
        int int69 = simpleMethods0.abs(32);
        gassert.SimpleMethods simpleMethods70 = new gassert.SimpleMethods();
        int[] intArray72 = new int[] { 100 };
        simpleMethods70.incrementNumberAtIndex(intArray72, 8);
        int int76 = simpleMethods70.abs((-4));
        int int78 = simpleMethods70.abs(10);
        gassert.SimpleMethods simpleMethods79 = new gassert.SimpleMethods();
        int[] intArray81 = new int[] { 100 };
        simpleMethods79.incrementNumberAtIndex(intArray81, 8);
        int int85 = simpleMethods79.abs((-4));
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray88 = new int[] { 100 };
        simpleMethods86.incrementNumberAtIndex(intArray88, 8);
        simpleMethods79.incrementNumberAtIndex(intArray88, (-5));
        simpleMethods70.incrementNumberAtIndex(intArray88, (-7));
        simpleMethods0.incrementNumberAtIndex(intArray88, (-4));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test154");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((int) (short) 0);
        int int51 = simpleMethods0.abs((int) (byte) 1);
        int int53 = simpleMethods0.abs(4);
        java.util.HashSet<java.lang.Integer> intSet54 = null;
        simpleMethods0.addElementToSet(intSet54, 32);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test155");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-10));
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods9.addElementToSet(intSet35, 6);
        int int40 = simpleMethods9.abs(0);
        int int42 = simpleMethods9.abs((int) '#');
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray45 = new int[] { 100 };
        simpleMethods43.incrementNumberAtIndex(intArray45, 8);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods48.addElementToSet(intSet74, 6);
        simpleMethods43.addElementToSet(intSet74, (int) (short) 10);
        int int81 = simpleMethods43.abs(5);
        gassert.SimpleMethods simpleMethods82 = new gassert.SimpleMethods();
        int[] intArray84 = new int[] { 100 };
        simpleMethods82.incrementNumberAtIndex(intArray84, 8);
        simpleMethods43.incrementNumberAtIndex(intArray84, (int) (byte) 1);
        simpleMethods9.incrementNumberAtIndex(intArray84, (int) (byte) 100);
        simpleMethods0.incrementNumberAtIndex(intArray84, 97);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test156");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] { 100 };
        simpleMethods14.incrementNumberAtIndex(intArray16, 8);
        simpleMethods0.incrementNumberAtIndex(intArray16, 0);
        int int22 = simpleMethods0.abs(4);
        int int24 = simpleMethods0.abs(4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test157");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test158");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 10);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int int5 = simpleMethods3.abs((int) (byte) 100);
        int int7 = simpleMethods3.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods3.addElementToSet(intSet8, 100);
        int int12 = simpleMethods3.abs((-3));
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        int[] intArray47 = new int[] { 6, 8, (-8), 4 };
        simpleMethods13.incrementNumberAtIndex(intArray47, (-1));
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods13.addElementToSet(intSet80, 0);
        simpleMethods3.addElementToSet(intSet80, 6);
        simpleMethods0.addElementToSet(intSet80, (int) ' ');
        int int89 = simpleMethods0.abs((-3));
        int int91 = simpleMethods0.abs(0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test159");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        int int92 = simpleMethods0.abs(6);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 97);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test160");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        int int11 = simpleMethods0.abs(10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test161");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 10);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods3.addElementToSet(intSet29, 6);
        int[] intArray37 = new int[] { 6, 8, (-8), 4 };
        simpleMethods3.incrementNumberAtIndex(intArray37, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray37, 6);
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int[] intArray48 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods42.incrementNumberAtIndex(intArray48, (int) '#');
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods51.addElementToSet(intSet77, 6);
        simpleMethods42.addElementToSet(intSet77, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet77, 3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test162");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs(5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test163");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int[] intArray75 = null;
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (byte) 100);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        int[] intArray83 = null;
        simpleMethods78.incrementNumberAtIndex(intArray83, (int) 'a');
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray88 = new int[] { 100 };
        simpleMethods86.incrementNumberAtIndex(intArray88, 8);
        simpleMethods78.incrementNumberAtIndex(intArray88, 1);
        simpleMethods0.incrementNumberAtIndex(intArray88, 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test164");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods0.addElementToSet(intSet63, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (-2));
        int int71 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test165");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods3.addElementToSet(intSet29, 6);
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods33.addElementToSet(intSet59, 6);
        simpleMethods3.addElementToSet(intSet59, (int) '#');
        int[] intArray65 = new int[] {};
        simpleMethods3.incrementNumberAtIndex(intArray65, 0);
        simpleMethods0.incrementNumberAtIndex(intArray65, 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test166");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((int) (short) 0);
        int int83 = simpleMethods0.abs((-5));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test167");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        int int92 = simpleMethods0.abs(0);
        int int94 = simpleMethods0.abs(97);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test168");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        int int4 = simpleMethods0.abs(10);
        int[] intArray5 = null;
        simpleMethods0.incrementNumberAtIndex(intArray5, (-4));
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int int10 = simpleMethods8.abs((int) (byte) 100);
        int int12 = simpleMethods8.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods8.addElementToSet(intSet13, 100);
        int int17 = simpleMethods8.abs((-3));
        gassert.SimpleMethods simpleMethods18 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods18.addElementToSet(intSet44, 6);
        int[] intArray52 = new int[] { 6, 8, (-8), 4 };
        simpleMethods18.incrementNumberAtIndex(intArray52, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods18.addElementToSet(intSet85, 0);
        simpleMethods8.addElementToSet(intSet85, 6);
        simpleMethods0.addElementToSet(intSet85, 8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test169");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        int int11 = simpleMethods0.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int14 = simpleMethods12.abs((int) (byte) 100);
        int int16 = simpleMethods12.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet17 = null;
        simpleMethods12.addElementToSet(intSet17, 100);
        gassert.SimpleMethods simpleMethods20 = new gassert.SimpleMethods();
        int int22 = simpleMethods20.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods23 = new gassert.SimpleMethods();
        int[] intArray25 = new int[] { 100 };
        simpleMethods23.incrementNumberAtIndex(intArray25, 8);
        gassert.SimpleMethods simpleMethods28 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods28.addElementToSet(intSet54, 6);
        simpleMethods23.addElementToSet(intSet54, (int) (short) 10);
        int int61 = simpleMethods23.abs(5);
        int int63 = simpleMethods23.abs(8);
        gassert.SimpleMethods simpleMethods64 = new gassert.SimpleMethods();
        int[] intArray66 = new int[] { 100 };
        simpleMethods64.incrementNumberAtIndex(intArray66, 8);
        simpleMethods23.incrementNumberAtIndex(intArray66, (int) (short) 0);
        int int72 = simpleMethods23.abs((-8));
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods23.addElementToSet(intSet86, 8);
        simpleMethods20.addElementToSet(intSet86, (int) 'a');
        simpleMethods12.addElementToSet(intSet86, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet86, (-1));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test170");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(10);
        int int52 = simpleMethods0.abs((int) (byte) 1);
        int int54 = simpleMethods0.abs(3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test171");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        int[] intArray52 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods46.incrementNumberAtIndex(intArray52, (int) '#');
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods55.addElementToSet(intSet81, 6);
        simpleMethods46.addElementToSet(intSet81, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet81, (int) (byte) 0);
        int int90 = simpleMethods0.abs((-9));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test172");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        int int51 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods52.addElementToSet(intSet78, 6);
        int int83 = simpleMethods52.abs(0);
        int int85 = simpleMethods52.abs((int) '#');
        gassert.SimpleMethods simpleMethods86 = new gassert.SimpleMethods();
        int[] intArray88 = new int[] { 100 };
        simpleMethods86.incrementNumberAtIndex(intArray88, 8);
        simpleMethods52.incrementNumberAtIndex(intArray88, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray88, (-1));
        int[] intArray95 = null;
        simpleMethods0.incrementNumberAtIndex(intArray95, (int) (short) 100);
        int int99 = simpleMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test173");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs(1);
        int int87 = simpleMethods0.abs((int) ' ');
        int int89 = simpleMethods0.abs((int) (byte) 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test174");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        int int15 = simpleMethods0.abs((int) '#');
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test175");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int[] intArray75 = null;
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (byte) 100);
        int int79 = simpleMethods0.abs(97);
        int[] intArray81 = new int[] { (-3) };
        simpleMethods0.incrementNumberAtIndex(intArray81, 10);
        int int85 = simpleMethods0.abs(52);
        int[] intArray86 = null;
        simpleMethods0.incrementNumberAtIndex(intArray86, (int) (short) 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test176");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 10, 5, (-6), 4, (-6), (-3), (-10) };
        java.util.HashSet<java.lang.Integer> intSet93 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet93, intArray92);
        simpleMethods0.addElementToSet(intSet93, 100);
        int int98 = simpleMethods0.abs((int) (short) 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test177");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int[] intArray43 = new int[] { (-7), 1, 3, 10 };
        simpleMethods0.incrementNumberAtIndex(intArray43, 0);
        int int47 = simpleMethods0.abs((-9));
        int int49 = simpleMethods0.abs(1);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, 100);
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        int[] intArray59 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods53.incrementNumberAtIndex(intArray59, (int) '#');
        gassert.SimpleMethods simpleMethods62 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods62.addElementToSet(intSet88, 6);
        simpleMethods53.addElementToSet(intSet88, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet88, (int) (byte) 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test178");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs((-7));
        int int88 = simpleMethods0.abs(0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test179");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs(1);
        int int87 = simpleMethods0.abs(5);
        int int89 = simpleMethods0.abs(100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test180");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        gassert.SimpleMethods simpleMethods1 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods1.addElementToSet(intSet27, 6);
        gassert.SimpleMethods simpleMethods31 = new gassert.SimpleMethods();
        int[] intArray33 = new int[] { 100 };
        simpleMethods31.incrementNumberAtIndex(intArray33, 8);
        gassert.SimpleMethods simpleMethods36 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods36.addElementToSet(intSet62, 6);
        simpleMethods31.addElementToSet(intSet62, (int) (short) 10);
        int int69 = simpleMethods31.abs(5);
        gassert.SimpleMethods simpleMethods70 = new gassert.SimpleMethods();
        int[] intArray72 = new int[] { 100 };
        simpleMethods70.incrementNumberAtIndex(intArray72, 8);
        simpleMethods31.incrementNumberAtIndex(intArray72, (int) (byte) 1);
        simpleMethods1.incrementNumberAtIndex(intArray72, 2);
        simpleMethods0.incrementNumberAtIndex(intArray72, (-4));
        int int82 = simpleMethods0.abs(3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test181");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(10);
        int int52 = simpleMethods0.abs((int) '4');
        int int54 = simpleMethods0.abs(0);
        int int56 = simpleMethods0.abs((-100));
        int int58 = simpleMethods0.abs(32);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test182");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        int int92 = simpleMethods0.abs(6);
        int int94 = simpleMethods0.abs((int) (short) 100);
        int int96 = simpleMethods0.abs((-5));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test183");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        gassert.SimpleMethods simpleMethods62 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods62.addElementToSet(intSet88, 6);
        simpleMethods0.addElementToSet(intSet88, 100);
        int int95 = simpleMethods0.abs((int) (byte) 1);
        int int97 = simpleMethods0.abs((-100));
        int int99 = simpleMethods0.abs(1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test184");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int int38 = simpleMethods0.abs((-9));
        int int40 = simpleMethods0.abs(1);
        int int42 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int int45 = simpleMethods43.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        int[] intArray80 = new int[] { 6, 8, (-8), 4 };
        simpleMethods46.incrementNumberAtIndex(intArray80, (-1));
        simpleMethods43.incrementNumberAtIndex(intArray80, 1);
        simpleMethods0.incrementNumberAtIndex(intArray80, (int) (short) 1);
        int int88 = simpleMethods0.abs(5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test185");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods12.addElementToSet(intSet38, 6);
        simpleMethods7.addElementToSet(intSet38, (int) (short) 10);
        int int45 = simpleMethods7.abs(5);
        int int47 = simpleMethods7.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods48.addElementToSet(intSet74, 6);
        simpleMethods7.addElementToSet(intSet74, 7);
        simpleMethods0.addElementToSet(intSet74, (int) (short) 0);
        int int83 = simpleMethods0.abs((int) 'a');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test186");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        java.util.HashSet<java.lang.Integer> intSet3 = null;
        simpleMethods0.addElementToSet(intSet3, 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test187");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray6 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods0.incrementNumberAtIndex(intArray6, (int) '#');
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test188");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        int int4 = simpleMethods0.abs(10);
        int[] intArray5 = null;
        simpleMethods0.incrementNumberAtIndex(intArray5, (-4));
        int int9 = simpleMethods0.abs((-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test189");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test190");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(10);
        int int52 = simpleMethods0.abs((int) '4');
        int int54 = simpleMethods0.abs(0);
        int int56 = simpleMethods0.abs((-100));
        int int58 = simpleMethods0.abs(8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test191");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((int) (byte) 100);
        int int65 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods66 = new gassert.SimpleMethods();
        int int68 = simpleMethods66.abs((int) (byte) 100);
        int int70 = simpleMethods66.abs((-2));
        gassert.SimpleMethods simpleMethods71 = new gassert.SimpleMethods();
        int[] intArray77 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods71.incrementNumberAtIndex(intArray77, (int) '#');
        simpleMethods66.incrementNumberAtIndex(intArray77, (-10));
        simpleMethods0.incrementNumberAtIndex(intArray77, 52);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test192");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        int int35 = simpleMethods0.abs((-10));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test193");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(10);
        int int52 = simpleMethods0.abs((int) '4');
        int int54 = simpleMethods0.abs(0);
        int int56 = simpleMethods0.abs((-100));
        int int58 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test194");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int[] intArray9 = new int[] { 100 };
        simpleMethods7.incrementNumberAtIndex(intArray9, 8);
        simpleMethods0.incrementNumberAtIndex(intArray9, (-5));
        gassert.SimpleMethods simpleMethods14 = new gassert.SimpleMethods();
        int[] intArray16 = new int[] { 100 };
        simpleMethods14.incrementNumberAtIndex(intArray16, 8);
        gassert.SimpleMethods simpleMethods19 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods19.addElementToSet(intSet45, 6);
        simpleMethods14.addElementToSet(intSet45, (int) (short) 10);
        int int52 = simpleMethods14.abs(5);
        int int54 = simpleMethods14.abs(8);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        int[] intArray57 = new int[] { 100 };
        simpleMethods55.incrementNumberAtIndex(intArray57, 8);
        simpleMethods14.incrementNumberAtIndex(intArray57, (int) (short) 0);
        int int63 = simpleMethods14.abs((-8));
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods14.addElementToSet(intSet77, 8);
        simpleMethods0.addElementToSet(intSet77, 32);
        int int84 = simpleMethods0.abs(5);
        int int86 = simpleMethods0.abs(35);
        int int88 = simpleMethods0.abs((int) (byte) 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test195");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int int32 = simpleMethods30.abs(6);
        gassert.SimpleMethods simpleMethods33 = new gassert.SimpleMethods();
        int[] intArray35 = new int[] { 100 };
        simpleMethods33.incrementNumberAtIndex(intArray35, 8);
        simpleMethods30.incrementNumberAtIndex(intArray35, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray35, (int) ' ');
        gassert.SimpleMethods simpleMethods42 = new gassert.SimpleMethods();
        int int44 = simpleMethods42.abs((int) (byte) 100);
        int int46 = simpleMethods42.abs((-2));
        gassert.SimpleMethods simpleMethods47 = new gassert.SimpleMethods();
        int[] intArray53 = new int[] { 10, '#', (-4), (-10), '#' };
        simpleMethods47.incrementNumberAtIndex(intArray53, (int) '#');
        simpleMethods42.incrementNumberAtIndex(intArray53, (-10));
        simpleMethods0.incrementNumberAtIndex(intArray53, 4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test196");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(0);
        int int81 = simpleMethods0.abs((-9));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test197");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int[] intArray62 = new int[] {};
        simpleMethods0.incrementNumberAtIndex(intArray62, 0);
        gassert.SimpleMethods simpleMethods65 = new gassert.SimpleMethods();
        int[] intArray67 = new int[] { 100 };
        simpleMethods65.incrementNumberAtIndex(intArray67, 8);
        int int71 = simpleMethods65.abs((-4));
        gassert.SimpleMethods simpleMethods72 = new gassert.SimpleMethods();
        int[] intArray74 = new int[] { 100 };
        simpleMethods72.incrementNumberAtIndex(intArray74, 8);
        simpleMethods65.incrementNumberAtIndex(intArray74, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray74, (-7));
        int int82 = simpleMethods0.abs((-100));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test198");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        int int9 = simpleMethods0.abs((-9));
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int int12 = simpleMethods10.abs(6);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int[] intArray45 = new int[] { 100 };
        simpleMethods43.incrementNumberAtIndex(intArray45, 8);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods48.addElementToSet(intSet74, 6);
        simpleMethods43.addElementToSet(intSet74, (int) (short) 10);
        simpleMethods13.addElementToSet(intSet74, 100);
        simpleMethods10.addElementToSet(intSet74, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet74, (int) (byte) 100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test199");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((int) (short) 0);
        int int83 = simpleMethods0.abs(1);
        int int85 = simpleMethods0.abs((int) (byte) 10);
        int int87 = simpleMethods0.abs(10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test200");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 1);
        int int42 = simpleMethods0.abs(100);
        int int44 = simpleMethods0.abs((int) (byte) 100);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods45.addElementToSet(intSet71, 6);
        simpleMethods0.addElementToSet(intSet71, 97);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test201");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs(0);
        int int85 = simpleMethods0.abs(52);
        int int87 = simpleMethods0.abs(2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test202");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs(4);
        int int94 = simpleMethods0.abs(32);
        int int96 = simpleMethods0.abs((-8));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test203");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        int int42 = simpleMethods0.abs((int) (short) 0);
        int int44 = simpleMethods0.abs(97);
        int[] intArray45 = null;
        simpleMethods0.incrementNumberAtIndex(intArray45, 52);
        gassert.SimpleMethods simpleMethods48 = new gassert.SimpleMethods();
        int[] intArray50 = new int[] { 100 };
        simpleMethods48.incrementNumberAtIndex(intArray50, 8);
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods53.addElementToSet(intSet79, 6);
        simpleMethods48.addElementToSet(intSet79, (int) (short) 10);
        gassert.SimpleMethods simpleMethods85 = new gassert.SimpleMethods();
        int[] intArray87 = new int[] { 100 };
        simpleMethods85.incrementNumberAtIndex(intArray87, 8);
        simpleMethods48.incrementNumberAtIndex(intArray87, (int) (byte) 10);
        simpleMethods0.incrementNumberAtIndex(intArray87, (int) (short) 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test204");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int int86 = simpleMethods0.abs(6);
        int int88 = simpleMethods0.abs((-8));
        int int90 = simpleMethods0.abs(10);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) (short) 1);
        int int95 = simpleMethods0.abs(10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test205");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        int int11 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods12 = new gassert.SimpleMethods();
        int int14 = simpleMethods12.abs((int) (byte) 100);
        int int16 = simpleMethods12.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet17 = null;
        simpleMethods12.addElementToSet(intSet17, 100);
        int int21 = simpleMethods12.abs((-3));
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods22.addElementToSet(intSet48, 6);
        int[] intArray56 = new int[] { 6, 8, (-8), 4 };
        simpleMethods22.incrementNumberAtIndex(intArray56, (-1));
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet89 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        simpleMethods22.addElementToSet(intSet89, 0);
        simpleMethods12.addElementToSet(intSet89, 6);
        simpleMethods0.addElementToSet(intSet89, (-4));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test206");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        gassert.SimpleMethods simpleMethods37 = new gassert.SimpleMethods();
        int int39 = simpleMethods37.abs(6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        int[] intArray42 = new int[] { 100 };
        simpleMethods40.incrementNumberAtIndex(intArray42, 8);
        simpleMethods37.incrementNumberAtIndex(intArray42, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray42, 5);
        int int50 = simpleMethods0.abs(10);
        int int52 = simpleMethods0.abs((int) '4');
        int int54 = simpleMethods0.abs((int) ' ');
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test207");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 1);
        int int42 = simpleMethods0.abs(35);
        gassert.SimpleMethods simpleMethods43 = new gassert.SimpleMethods();
        int int45 = simpleMethods43.abs((int) (byte) 10);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        int[] intArray80 = new int[] { 6, 8, (-8), 4 };
        simpleMethods46.incrementNumberAtIndex(intArray80, (-1));
        simpleMethods43.incrementNumberAtIndex(intArray80, 6);
        simpleMethods0.incrementNumberAtIndex(intArray80, (-3));
        int int88 = simpleMethods0.abs((-8));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test208");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 10, 10, 1 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods0.addElementToSet(intSet83, 4);
        int int88 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test209");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        int int11 = simpleMethods0.abs(5);
        int int13 = simpleMethods0.abs((-4));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test210");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs(35);
        int int51 = simpleMethods0.abs(10);
        int int53 = simpleMethods0.abs(9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test211");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        int int35 = simpleMethods0.abs(2);
        int int37 = simpleMethods0.abs(10);
        int int39 = simpleMethods0.abs((-3));
        int int41 = simpleMethods0.abs((-7));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test212");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs(10);
        int int92 = simpleMethods0.abs((int) (byte) 100);
        int int94 = simpleMethods0.abs((int) (byte) 100);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test213");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods5.addElementToSet(intSet61, (int) '#');
        int int68 = simpleMethods5.abs((int) (byte) 100);
        int int70 = simpleMethods5.abs((int) '#');
        int int72 = simpleMethods5.abs(10);
        int int74 = simpleMethods5.abs((-5));
        int[] intArray76 = new int[] { 6 };
        simpleMethods5.incrementNumberAtIndex(intArray76, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray76, 9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test214");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (short) 1);
        int int47 = simpleMethods0.abs(0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test215");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-10));
        gassert.SimpleMethods simpleMethods9 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods9.addElementToSet(intSet35, 6);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods44.addElementToSet(intSet70, 6);
        simpleMethods39.addElementToSet(intSet70, (int) (short) 10);
        simpleMethods9.addElementToSet(intSet70, 100);
        simpleMethods0.addElementToSet(intSet70, (int) (short) 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test216");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        gassert.SimpleMethods simpleMethods62 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods62.addElementToSet(intSet88, 6);
        simpleMethods0.addElementToSet(intSet88, 100);
        int int95 = simpleMethods0.abs((-3));
        int int97 = simpleMethods0.abs((int) (byte) 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test217");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-3));
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods7.addElementToSet(intSet33, 6);
        int int38 = simpleMethods7.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        gassert.SimpleMethods simpleMethods44 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods44.addElementToSet(intSet70, 6);
        simpleMethods39.addElementToSet(intSet70, (int) (short) 10);
        simpleMethods7.addElementToSet(intSet70, (-3));
        simpleMethods0.addElementToSet(intSet70, 4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test218");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int[] intArray75 = null;
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (byte) 100);
        int int79 = simpleMethods0.abs((-7));
        int int81 = simpleMethods0.abs(8);
        int[] intArray82 = null;
        simpleMethods0.incrementNumberAtIndex(intArray82, (-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test219");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs(0);
        int int81 = simpleMethods0.abs(0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test220");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        int int47 = simpleMethods0.abs(100);
        int int49 = simpleMethods0.abs(1);
        int int51 = simpleMethods0.abs(10);
        gassert.SimpleMethods simpleMethods52 = new gassert.SimpleMethods();
        int int54 = simpleMethods52.abs(6);
        gassert.SimpleMethods simpleMethods55 = new gassert.SimpleMethods();
        int[] intArray57 = new int[] { 100 };
        simpleMethods55.incrementNumberAtIndex(intArray57, 8);
        simpleMethods52.incrementNumberAtIndex(intArray57, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray57, 3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test221");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        int int9 = simpleMethods7.abs((int) (byte) 100);
        int int11 = simpleMethods7.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet12 = null;
        simpleMethods7.addElementToSet(intSet12, 100);
        gassert.SimpleMethods simpleMethods15 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods15.addElementToSet(intSet41, 6);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int[] intArray47 = new int[] { 100 };
        simpleMethods45.incrementNumberAtIndex(intArray47, 8);
        gassert.SimpleMethods simpleMethods50 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods50.addElementToSet(intSet76, 6);
        simpleMethods45.addElementToSet(intSet76, (int) (short) 10);
        int int83 = simpleMethods45.abs(5);
        gassert.SimpleMethods simpleMethods84 = new gassert.SimpleMethods();
        int[] intArray86 = new int[] { 100 };
        simpleMethods84.incrementNumberAtIndex(intArray86, 8);
        simpleMethods45.incrementNumberAtIndex(intArray86, (int) (byte) 1);
        simpleMethods15.incrementNumberAtIndex(intArray86, 2);
        simpleMethods7.incrementNumberAtIndex(intArray86, 4);
        simpleMethods0.incrementNumberAtIndex(intArray86, 8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test222");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        int int9 = simpleMethods0.abs((-3));
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        int[] intArray12 = new int[] { 100 };
        simpleMethods10.incrementNumberAtIndex(intArray12, 8);
        int int16 = simpleMethods10.abs((-4));
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int[] intArray19 = new int[] { 100 };
        simpleMethods17.incrementNumberAtIndex(intArray19, 8);
        simpleMethods10.incrementNumberAtIndex(intArray19, (-5));
        gassert.SimpleMethods simpleMethods24 = new gassert.SimpleMethods();
        int[] intArray26 = new int[] { 100 };
        simpleMethods24.incrementNumberAtIndex(intArray26, 8);
        gassert.SimpleMethods simpleMethods29 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods29.addElementToSet(intSet55, 6);
        simpleMethods24.addElementToSet(intSet55, (int) (short) 10);
        int int62 = simpleMethods24.abs(5);
        int int64 = simpleMethods24.abs(8);
        gassert.SimpleMethods simpleMethods65 = new gassert.SimpleMethods();
        int[] intArray67 = new int[] { 100 };
        simpleMethods65.incrementNumberAtIndex(intArray67, 8);
        simpleMethods24.incrementNumberAtIndex(intArray67, (int) (short) 0);
        int int73 = simpleMethods24.abs((-8));
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods24.addElementToSet(intSet87, 8);
        simpleMethods10.addElementToSet(intSet87, 32);
        simpleMethods0.addElementToSet(intSet87, (int) (byte) -1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test223");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods0.addElementToSet(intSet5, 100);
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        simpleMethods8.addElementToSet(intSet39, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet39, 0);
        int int48 = simpleMethods0.abs(10);
        int int50 = simpleMethods0.abs(9);
        int int52 = simpleMethods0.abs((-9));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test224");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs(8);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        int[] intArray43 = new int[] { 100 };
        simpleMethods41.incrementNumberAtIndex(intArray43, 8);
        simpleMethods0.incrementNumberAtIndex(intArray43, (int) (short) 0);
        int int49 = simpleMethods0.abs((-8));
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 3, 0, (-2), (-2), 10, (-3), (-1), 6, 5, (-6), 1, 7 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods0.addElementToSet(intSet63, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (-7));
        int int71 = simpleMethods0.abs(1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test225");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-4));
        int int79 = simpleMethods0.abs((-6));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test226");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        int[] intArray5 = null;
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        gassert.SimpleMethods simpleMethods8 = new gassert.SimpleMethods();
        int[] intArray10 = new int[] { 100 };
        simpleMethods8.incrementNumberAtIndex(intArray10, 8);
        simpleMethods0.incrementNumberAtIndex(intArray10, 1);
        int int16 = simpleMethods0.abs((-4));
        gassert.SimpleMethods simpleMethods17 = new gassert.SimpleMethods();
        int[] intArray19 = new int[] { 100 };
        simpleMethods17.incrementNumberAtIndex(intArray19, 8);
        gassert.SimpleMethods simpleMethods22 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods22.addElementToSet(intSet48, 6);
        simpleMethods17.addElementToSet(intSet48, (int) (short) 10);
        int int55 = simpleMethods17.abs(5);
        int int57 = simpleMethods17.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods58 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods58.addElementToSet(intSet84, 6);
        simpleMethods17.addElementToSet(intSet84, 7);
        simpleMethods0.addElementToSet(intSet84, 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test227");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs(6);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int[] intArray5 = new int[] { 100 };
        simpleMethods3.incrementNumberAtIndex(intArray5, 8);
        simpleMethods0.incrementNumberAtIndex(intArray5, (int) 'a');
        gassert.SimpleMethods simpleMethods10 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods10.addElementToSet(intSet36, 6);
        gassert.SimpleMethods simpleMethods40 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods40.addElementToSet(intSet66, 6);
        simpleMethods10.addElementToSet(intSet66, (int) '#');
        int[] intArray72 = new int[] {};
        simpleMethods10.incrementNumberAtIndex(intArray72, 0);
        simpleMethods0.incrementNumberAtIndex(intArray72, 0);
        int int78 = simpleMethods0.abs((-100));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test228");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 10);
        gassert.SimpleMethods simpleMethods3 = new gassert.SimpleMethods();
        int int5 = simpleMethods3.abs((int) (byte) 100);
        int int7 = simpleMethods3.abs((-2));
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods3.addElementToSet(intSet8, 100);
        int int12 = simpleMethods3.abs((-3));
        gassert.SimpleMethods simpleMethods13 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods13.addElementToSet(intSet39, 6);
        int[] intArray47 = new int[] { 6, 8, (-8), 4 };
        simpleMethods13.incrementNumberAtIndex(intArray47, (-1));
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, (-1), (-1), 3, (-7), 4, 6, 4, (-6), (-3), (-1), 0, (-7), (-10), (-10), (-7), 9, (-5), 2, 7, 100, (-3), 9, 0, (-1), (-4), (-3), 10, 5 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods13.addElementToSet(intSet80, 0);
        simpleMethods3.addElementToSet(intSet80, 6);
        simpleMethods0.addElementToSet(intSet80, (int) ' ');
        int int89 = simpleMethods0.abs((-9));
        int int91 = simpleMethods0.abs((int) (byte) -1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test229");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs((int) '4');
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test230");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((-10));
        int int83 = simpleMethods0.abs((-5));
        int int85 = simpleMethods0.abs((-4));
        int int87 = simpleMethods0.abs(100);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test231");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        int int81 = simpleMethods0.abs(0);
        int int83 = simpleMethods0.abs((int) (byte) 1);
        int int85 = simpleMethods0.abs((-2));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test232");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods46.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-6));
        int int79 = simpleMethods0.abs(9);
        int int81 = simpleMethods0.abs((-10));
        int int83 = simpleMethods0.abs((int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        simpleMethods0.addElementToSet(intSet84, (-5));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test233");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int int93 = simpleMethods0.abs((int) (byte) 100);
        int int95 = simpleMethods0.abs(4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test234");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs(0);
        int int33 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods34 = new gassert.SimpleMethods();
        int[] intArray36 = new int[] { 100 };
        simpleMethods34.incrementNumberAtIndex(intArray36, 8);
        simpleMethods0.incrementNumberAtIndex(intArray36, (-5));
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods41.addElementToSet(intSet67, 6);
        int int72 = simpleMethods41.abs(0);
        int int74 = simpleMethods41.abs((int) '#');
        gassert.SimpleMethods simpleMethods75 = new gassert.SimpleMethods();
        int[] intArray77 = new int[] { 100 };
        simpleMethods75.incrementNumberAtIndex(intArray77, 8);
        simpleMethods41.incrementNumberAtIndex(intArray77, (-5));
        simpleMethods0.incrementNumberAtIndex(intArray77, (-10));
        int int85 = simpleMethods0.abs((int) (short) -1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test235");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 10);
        int int42 = simpleMethods0.abs((int) (short) 1);
        int int44 = simpleMethods0.abs(1);
        gassert.SimpleMethods simpleMethods45 = new gassert.SimpleMethods();
        int[] intArray47 = new int[] { 100 };
        simpleMethods45.incrementNumberAtIndex(intArray47, 8);
        int[] intArray50 = null;
        simpleMethods45.incrementNumberAtIndex(intArray50, (int) 'a');
        gassert.SimpleMethods simpleMethods53 = new gassert.SimpleMethods();
        int[] intArray55 = new int[] { 100 };
        simpleMethods53.incrementNumberAtIndex(intArray55, 8);
        simpleMethods45.incrementNumberAtIndex(intArray55, 1);
        simpleMethods0.incrementNumberAtIndex(intArray55, 1);
        int int63 = simpleMethods0.abs((int) (short) 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test236");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods30.addElementToSet(intSet56, 6);
        simpleMethods0.addElementToSet(intSet56, (int) '#');
        int int63 = simpleMethods0.abs((-5));
        int int65 = simpleMethods0.abs((-100));
        int int67 = simpleMethods0.abs((int) '4');
        int int69 = simpleMethods0.abs(32);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) 'a');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test237");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        int int40 = simpleMethods0.abs((int) (short) 10);
        gassert.SimpleMethods simpleMethods41 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods41.addElementToSet(intSet67, 6);
        simpleMethods0.addElementToSet(intSet67, 7);
        int[] intArray73 = null;
        simpleMethods0.incrementNumberAtIndex(intArray73, (int) 'a');
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test238");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 100);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) '#');
        gassert.SimpleMethods simpleMethods7 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods7.addElementToSet(intSet33, 6);
        int[] intArray41 = new int[] { 6, 8, (-8), 4 };
        simpleMethods7.incrementNumberAtIndex(intArray41, (-1));
        int int45 = simpleMethods7.abs(0);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-8), 10, 6, 8, (-100), (-5), 10, 1, (-5) };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods7.addElementToSet(intSet56, (-1));
        simpleMethods0.addElementToSet(intSet56, 0);
        int[] intArray65 = new int[] { (short) 1, (-9), 32 };
        simpleMethods0.incrementNumberAtIndex(intArray65, (-10));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test239");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int int31 = simpleMethods0.abs((int) (byte) -1);
        gassert.SimpleMethods simpleMethods32 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods32.addElementToSet(intSet58, 6);
        int[] intArray66 = new int[] { 6, 8, (-8), 4 };
        simpleMethods32.incrementNumberAtIndex(intArray66, (-1));
        simpleMethods0.incrementNumberAtIndex(intArray66, (int) (short) 100);
        int int72 = simpleMethods0.abs((-6));
        int int74 = simpleMethods0.abs((-6));
        int[] intArray75 = null;
        simpleMethods0.incrementNumberAtIndex(intArray75, (int) (short) 10);
        int int79 = simpleMethods0.abs(100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test240");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        int[] intArray2 = new int[] { 100 };
        simpleMethods0.incrementNumberAtIndex(intArray2, 8);
        gassert.SimpleMethods simpleMethods5 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods5.addElementToSet(intSet31, 6);
        simpleMethods0.addElementToSet(intSet31, (int) (short) 10);
        int int38 = simpleMethods0.abs(5);
        gassert.SimpleMethods simpleMethods39 = new gassert.SimpleMethods();
        int[] intArray41 = new int[] { 100 };
        simpleMethods39.incrementNumberAtIndex(intArray41, 8);
        simpleMethods0.incrementNumberAtIndex(intArray41, (int) (byte) 1);
        gassert.SimpleMethods simpleMethods46 = new gassert.SimpleMethods();
        int[] intArray48 = new int[] { 100 };
        simpleMethods46.incrementNumberAtIndex(intArray48, 8);
        gassert.SimpleMethods simpleMethods51 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods51.addElementToSet(intSet77, 6);
        simpleMethods46.addElementToSet(intSet77, (int) (short) 10);
        int int84 = simpleMethods46.abs(5);
        gassert.SimpleMethods simpleMethods85 = new gassert.SimpleMethods();
        int[] intArray87 = new int[] { 100 };
        simpleMethods85.incrementNumberAtIndex(intArray87, 8);
        simpleMethods46.incrementNumberAtIndex(intArray87, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray87, (int) ' ');
        int[] intArray94 = null;
        simpleMethods0.incrementNumberAtIndex(intArray94, (int) (byte) 10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test241");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        int int79 = simpleMethods0.abs((int) (short) 1);
        gassert.SimpleMethods simpleMethods80 = new gassert.SimpleMethods();
        int int82 = simpleMethods80.abs(6);
        gassert.SimpleMethods simpleMethods83 = new gassert.SimpleMethods();
        int[] intArray85 = new int[] { 100 };
        simpleMethods83.incrementNumberAtIndex(intArray85, 8);
        simpleMethods80.incrementNumberAtIndex(intArray85, (int) 'a');
        simpleMethods0.incrementNumberAtIndex(intArray85, 0);
        int int93 = simpleMethods0.abs(52);
        int int95 = simpleMethods0.abs((-6));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test242");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        gassert.SimpleMethods simpleMethods30 = new gassert.SimpleMethods();
        int[] intArray32 = new int[] { 100 };
        simpleMethods30.incrementNumberAtIndex(intArray32, 8);
        gassert.SimpleMethods simpleMethods35 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods35.addElementToSet(intSet61, 6);
        simpleMethods30.addElementToSet(intSet61, (int) (short) 10);
        int int68 = simpleMethods30.abs(5);
        gassert.SimpleMethods simpleMethods69 = new gassert.SimpleMethods();
        int[] intArray71 = new int[] { 100 };
        simpleMethods69.incrementNumberAtIndex(intArray71, 8);
        simpleMethods30.incrementNumberAtIndex(intArray71, (int) (byte) 1);
        simpleMethods0.incrementNumberAtIndex(intArray71, 2);
        gassert.SimpleMethods simpleMethods78 = new gassert.SimpleMethods();
        int[] intArray80 = new int[] { 100 };
        simpleMethods78.incrementNumberAtIndex(intArray80, 8);
        simpleMethods0.incrementNumberAtIndex(intArray80, 0);
        int[] intArray86 = new int[] { 0 };
        simpleMethods0.incrementNumberAtIndex(intArray86, 0);
        int int90 = simpleMethods0.abs((-4));
        int int92 = simpleMethods0.abs((int) ' ');
        int int94 = simpleMethods0.abs(7);
        int int96 = simpleMethods0.abs((int) ' ');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleMethodsTester0.test243");
        gassert.SimpleMethods simpleMethods0 = new gassert.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 100, 1, 0, (-7), 5, 1, (-5), (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100, 10, 0, 100, 5 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods0.addElementToSet(intSet26, 6);
        int[] intArray34 = new int[] { 6, 8, (-8), 4 };
        simpleMethods0.incrementNumberAtIndex(intArray34, (-1));
        int[] intArray37 = null;
        simpleMethods0.incrementNumberAtIndex(intArray37, (int) '4');
        int int41 = simpleMethods0.abs(97);
        int int43 = simpleMethods0.abs(32);
    }
}

