package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntTreeSetTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test001");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test002");
        DataStructures.kodkod.IntSet intSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet(intSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test003");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test004");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntCollection intCollection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = intTreeSet16.addAll(intCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test005");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean19 = intTreeSet16.add((-2));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test006");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test007");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        intTreeSet0.clear();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test008");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean12 = intTreeSet10.remove(9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test009");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = intTreeSet0.ceil((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test010");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int8 = intTreeSet0.min();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test011");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = intTreeSet0.ceil((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test012");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean8 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet6.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test013");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        boolean boolean25 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        intTreeSet17.clear();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test014");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = intTreeSet15.ceil(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test015");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = intTreeSet2.clone();
        boolean boolean14 = intTreeSet12.add(100);
        int int15 = intTreeSet12.max();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test016");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        intTreeSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test017");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet1.ceil((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test018");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntCollection intCollection28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = intTreeSet16.addAll(intCollection28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test019");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = intTreeSet1.ceil((-3));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test020");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        boolean boolean15 = intTreeSet2.add((int) '#');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test021");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntCollection intCollection59 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = intTreeSet18.addAll(intCollection59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test022");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = intTreeSet16.floor(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test023");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test024");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        boolean boolean26 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int27 = intTreeSet19.min();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet19.clone();
        boolean boolean29 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test025");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        int int24 = intTreeSet9.floor(5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test026");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add((-1));
        boolean boolean15 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int17 = intTreeSet12.ceil(100);
        boolean boolean19 = intTreeSet12.add((int) '#');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test027");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        intTreeSet3.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet3.ceil(3);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test028");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet18.floor(97);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test029");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = intTreeSet15.floor(8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test030");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        intTreeSet0.clear();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test031");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        boolean boolean14 = intTreeSet1.remove(10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test032");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = intTreeSet0.floor((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test033");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        intTreeSet6.clear();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test034");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.min();
        boolean boolean13 = intTreeSet0.remove((-4));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test035");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet10.clone();
        boolean boolean15 = intTreeSet13.add((int) '#');
        boolean boolean16 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intTreeSet5.floor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test036");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean19 = intTreeSet16.remove((-2147483648));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test037");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        boolean boolean61 = intTreeSet18.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add((-2));
        boolean boolean69 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        boolean boolean71 = intTreeSet62.remove(7);
        boolean boolean73 = intTreeSet62.remove((int) (short) 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test038");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean35 = intTreeSet33.remove((int) 'a');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test039");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        int int10 = intTreeSet7.max();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test040");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean37 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = intTreeSet30.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test041");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        boolean boolean11 = intTreeSet5.remove((int) (byte) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test042");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean8 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean10 = intTreeSet6.remove((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intTreeSet6.ceil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test043");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        boolean boolean11 = intTreeSet5.remove(1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test044");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet1.remove((-1));
        boolean boolean15 = intTreeSet1.remove((-2147483648));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test045");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.remove((int) (byte) 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test046");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int24 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add(9);
        int int38 = intTreeSet31.max();
        boolean boolean39 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean43 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean55 = intTreeSet51.remove(0);
        boolean boolean57 = intTreeSet51.add((-2));
        boolean boolean58 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        int int59 = intTreeSet51.min();
        boolean boolean60 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        boolean boolean61 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.add(9);
        boolean boolean74 = intTreeSet70.remove(0);
        boolean boolean76 = intTreeSet70.add((-2));
        boolean boolean77 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet70);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet78);
        boolean boolean80 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean83 = intTreeSet81.add(9);
        boolean boolean85 = intTreeSet81.remove(0);
        boolean boolean87 = intTreeSet81.add((-2));
        boolean boolean89 = intTreeSet81.add((int) 'a');
        boolean boolean90 = intTreeSet79.removeAll((DataStructures.kodkod.IntCollection) intTreeSet81);
        boolean boolean92 = intTreeSet79.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet93 = intTreeSet79.clone();
        boolean boolean94 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        intTreeSet25.clear();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test047");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet3.clone();
        int int16 = intTreeSet15.max();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test048");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        int int26 = intTreeSet19.max();
        boolean boolean27 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int28 = intTreeSet19.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int31 = intTreeSet29.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = intTreeSet0.floor((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test049");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet0.max();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test050");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        int int28 = intTreeSet15.ceil((-1));
        boolean boolean30 = intTreeSet15.remove(0);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intTreeSet3.ceil((-100));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test051");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean23 = intTreeSet6.add(3);
        boolean boolean25 = intTreeSet6.add((-100));
        int int27 = intTreeSet6.ceil((int) (byte) -1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test052");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = intTreeSet13.clone();
        boolean boolean22 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet13.clone();
        boolean boolean25 = intTreeSet23.add(100);
        int int27 = intTreeSet23.ceil(0);
        boolean boolean28 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        int int29 = intTreeSet23.max();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test053");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add(9);
        int int21 = intTreeSet14.max();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet14.clone();
        boolean boolean23 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean24 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test054");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int60 = intTreeSet18.ceil(7);
        int int61 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet67 = intTreeSet62.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean70 = intTreeSet68.add(9);
        boolean boolean72 = intTreeSet68.remove(0);
        boolean boolean74 = intTreeSet68.add(9);
        int int75 = intTreeSet68.max();
        boolean boolean76 = intTreeSet62.addAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        int int77 = intTreeSet68.max();
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean80 = intTreeSet78.add(9);
        boolean boolean82 = intTreeSet78.remove(0);
        boolean boolean83 = intTreeSet68.removeAll((DataStructures.kodkod.IntCollection) intTreeSet78);
        boolean boolean85 = intTreeSet68.add(3);
        boolean boolean86 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet68);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test055");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        int int26 = intTreeSet19.max();
        boolean boolean27 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int28 = intTreeSet19.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int31 = intTreeSet29.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        boolean boolean34 = intTreeSet0.remove(0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test056");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = intTreeSet26.clone();
        boolean boolean35 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean36 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test057");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = intTreeSet0.ceil((-4));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test058");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet10.min();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test059");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet3.clone();
        int int17 = intTreeSet3.floor((-4));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test060");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.add(9);
        boolean boolean15 = intTreeSet11.remove(0);
        boolean boolean17 = intTreeSet11.add(9);
        intTreeSet11.clear();
        boolean boolean20 = intTreeSet11.add((-3));
        int int22 = intTreeSet11.ceil(100);
        boolean boolean23 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test061");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet1.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet2.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet2.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test062");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        boolean boolean61 = intTreeSet18.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add((-2));
        boolean boolean69 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        int int71 = intTreeSet18.ceil((-2));
        int int73 = intTreeSet18.floor(0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test063");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean60 = intTreeSet44.remove((int) (byte) 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test064");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        int int33 = intTreeSet16.floor((-100));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test065");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean48 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        int int49 = intTreeSet45.max();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = intTreeSet50.clone();
        boolean boolean55 = intTreeSet53.add((int) '#');
        boolean boolean56 = intTreeSet45.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        boolean boolean57 = intTreeSet37.addAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        int int58 = intTreeSet37.min();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test066");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test067");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add((-8));
        int int10 = intTreeSet7.max();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test068");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test069");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        intTreeSet16.clear();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test070");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        intTreeSet30.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = intTreeSet30.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test071");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intTreeSet2.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test072");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add(9);
        int int28 = intTreeSet21.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add(9);
        int int41 = intTreeSet34.max();
        boolean boolean42 = intTreeSet31.addAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        int int43 = intTreeSet34.min();
        boolean boolean45 = intTreeSet34.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet34.clone();
        boolean boolean47 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean48 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean50 = intTreeSet20.remove(7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test073");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        intTreeSet19.clear();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test074");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet1.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test075");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean44 = intTreeSet38.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean49 = intTreeSet45.remove(0);
        boolean boolean51 = intTreeSet45.add((-2));
        boolean boolean52 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet53);
        boolean boolean55 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.add(9);
        boolean boolean60 = intTreeSet56.remove(0);
        boolean boolean62 = intTreeSet56.add((-2));
        boolean boolean64 = intTreeSet56.add((int) 'a');
        boolean boolean65 = intTreeSet54.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        boolean boolean67 = intTreeSet54.add((-9));
        int int69 = intTreeSet54.floor((int) '4');
        boolean boolean71 = intTreeSet54.remove(8);
        int int72 = intTreeSet54.min();
        boolean boolean74 = intTreeSet54.remove(7);
        boolean boolean75 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet54);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test076");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet0.min();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test077");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        intTreeSet2.clear();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test078");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int22 = intTreeSet16.min();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test079");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet7.clone();
        DataStructures.kodkod.IntCollection intCollection14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = intTreeSet13.addAll(intCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test080");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        int int7 = intTreeSet0.max();
        int int8 = intTreeSet0.min();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test081");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet6.clone();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test082");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int38 = intTreeSet7.max();
        intTreeSet7.clear();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test083");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet6.clone();
        boolean boolean15 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        boolean boolean17 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet0.clear();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test084");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet12.clone();
        boolean boolean21 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        boolean boolean22 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int23 = intTreeSet12.min();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test085");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        boolean boolean8 = intTreeSet5.add(2147483647);
        boolean boolean10 = intTreeSet5.remove(100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test086");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean8 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet6.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test087");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int36 = intTreeSet26.max();
        intTreeSet26.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = intTreeSet26.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test088");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        boolean boolean32 = intTreeSet30.add((int) ' ');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test089");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean23 = intTreeSet19.remove(8);
        boolean boolean24 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet0.clone();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test090");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean21 = intTreeSet19.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean25 = intTreeSet23.remove(5);
        boolean boolean26 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean28 = intTreeSet23.remove(0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test091");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test092");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean21 = intTreeSet19.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean25 = intTreeSet23.remove(5);
        boolean boolean26 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intTreeSet7.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test093");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet9.remove((int) 'a');
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test094");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean48 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        int int49 = intTreeSet45.max();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = intTreeSet50.clone();
        boolean boolean55 = intTreeSet53.add((int) '#');
        boolean boolean56 = intTreeSet45.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        boolean boolean57 = intTreeSet37.addAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = intTreeSet45.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test095");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        int int28 = intTreeSet15.ceil((-1));
        boolean boolean30 = intTreeSet15.remove(0);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet32);
        boolean boolean41 = intTreeSet39.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = intTreeSet39.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        int int45 = intTreeSet39.floor((int) (short) 1);
        int int47 = intTreeSet39.floor((int) (byte) 0);
        boolean boolean49 = intTreeSet39.add(6);
        boolean boolean50 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test096");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        intTreeSet12.clear();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test097");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int24 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add(9);
        int int38 = intTreeSet31.max();
        boolean boolean39 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean43 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean55 = intTreeSet51.remove(0);
        boolean boolean57 = intTreeSet51.add((-2));
        boolean boolean58 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        int int59 = intTreeSet51.min();
        boolean boolean60 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        boolean boolean61 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = intTreeSet62.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test098");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet12.clone();
        boolean boolean21 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        boolean boolean22 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int24 = intTreeSet5.floor(2147483647);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test099");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean23 = intTreeSet19.remove(8);
        boolean boolean24 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean26 = intTreeSet19.remove((-3));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test100");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        int int11 = intTreeSet5.floor(100);
        int int12 = intTreeSet5.max();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test101");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int24 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add(9);
        int int38 = intTreeSet31.max();
        boolean boolean39 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean43 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean55 = intTreeSet51.remove(0);
        boolean boolean57 = intTreeSet51.add((-2));
        boolean boolean58 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        int int59 = intTreeSet51.min();
        boolean boolean60 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        boolean boolean61 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.add(9);
        boolean boolean74 = intTreeSet70.remove(0);
        boolean boolean76 = intTreeSet70.add((-2));
        boolean boolean77 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet70);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet78);
        boolean boolean80 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean83 = intTreeSet81.add(9);
        boolean boolean85 = intTreeSet81.remove(0);
        boolean boolean87 = intTreeSet81.add((-2));
        boolean boolean89 = intTreeSet81.add((int) 'a');
        boolean boolean90 = intTreeSet79.removeAll((DataStructures.kodkod.IntCollection) intTreeSet81);
        boolean boolean92 = intTreeSet79.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet93 = intTreeSet79.clone();
        boolean boolean94 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        int int96 = intTreeSet25.floor(10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test102");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet3.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test103");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = intTreeSet2.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test104");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int60 = intTreeSet18.ceil(7);
        int int61 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet69 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet62);
        boolean boolean71 = intTreeSet69.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet72 = intTreeSet69.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet69);
        boolean boolean74 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet73);
        boolean boolean76 = intTreeSet18.remove(0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test105");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        boolean boolean8 = intTreeSet5.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        int int12 = intTreeSet9.floor(7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test106");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int23 = intTreeSet16.ceil(0);
        boolean boolean25 = intTreeSet16.add((int) 'a');
        int int27 = intTreeSet16.floor(7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test107");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add(9);
        int int25 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet18.clone();
        boolean boolean27 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        boolean boolean36 = intTreeSet28.remove((-5));
        boolean boolean38 = intTreeSet28.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet28.clone();
        boolean boolean40 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test108");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int8 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet9.remove(10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test109");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add(9);
        int int70 = intTreeSet63.max();
        boolean boolean71 = intTreeSet60.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        int int72 = intTreeSet63.min();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.add(9);
        boolean boolean77 = intTreeSet73.remove(0);
        boolean boolean79 = intTreeSet73.add((-2));
        boolean boolean81 = intTreeSet73.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet73);
        boolean boolean83 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        boolean boolean84 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        intTreeSet82.clear();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test110");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        intTreeSet7.clear();
        boolean boolean14 = intTreeSet7.remove((int) (byte) 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test111");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add(9);
        int int25 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet18.clone();
        boolean boolean27 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        int int43 = intTreeSet35.min();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet35.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet45 = intTreeSet44.clone();
        boolean boolean46 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test112");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        boolean boolean23 = intTreeSet9.remove(10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test113");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean25 = intTreeSet23.add((-9));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test114");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add((-8));
        int int11 = intTreeSet7.floor(100);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test115");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        intTreeSet8.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet8.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test116");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet59);
        DataStructures.kodkod.IntCollection intCollection61 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = intTreeSet60.removeAll(intCollection61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test117");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.add(9);
        boolean boolean31 = intTreeSet27.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet27.clone();
        int int34 = intTreeSet27.floor((-2));
        boolean boolean35 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet37);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean43 = intTreeSet39.remove(0);
        boolean boolean45 = intTreeSet39.add(9);
        int int46 = intTreeSet39.max();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet39.clone();
        boolean boolean48 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean49 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean50 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = intTreeSet1.floor(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test118");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet59);
        boolean boolean62 = intTreeSet60.remove(8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test119");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = intTreeSet2.clone();
        boolean boolean14 = intTreeSet12.add(100);
        intTreeSet12.clear();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test120");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int35 = intTreeSet0.min();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test121");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        intTreeSet3.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intTreeSet3.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test122");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet12.clone();
        boolean boolean21 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        boolean boolean22 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int23 = intTreeSet5.min();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test123");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        int int28 = intTreeSet15.ceil((-1));
        boolean boolean30 = intTreeSet15.remove(0);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intTreeSet3.floor(4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test124");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet6.clear();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test125");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        boolean boolean13 = intTreeSet11.add((int) (short) 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test126");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet3.floor(5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test127");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.ceil((int) (byte) 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test128");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        int int4 = intTreeSet0.min();
        int int5 = intTreeSet0.min();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test129");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        boolean boolean8 = intTreeSet5.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        int int11 = intTreeSet5.ceil((-2147483648));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test130");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add(9);
        int int70 = intTreeSet63.max();
        boolean boolean71 = intTreeSet60.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        int int72 = intTreeSet63.min();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.add(9);
        boolean boolean77 = intTreeSet73.remove(0);
        boolean boolean79 = intTreeSet73.add((-2));
        boolean boolean81 = intTreeSet73.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet73);
        boolean boolean83 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        boolean boolean84 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        intTreeSet18.clear();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test131");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intTreeSet2.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test132");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        int int4 = intTreeSet0.max();
        int int6 = intTreeSet0.ceil((-10));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test133");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet16.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intTreeSet16.ceil((int) '4');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test134");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add(9);
        int int27 = intTreeSet20.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet20.clone();
        boolean boolean29 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean31 = intTreeSet20.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet32.clone();
        int int39 = intTreeSet32.floor((-2));
        boolean boolean40 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean41 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test135");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int23 = intTreeSet16.ceil(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet24.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.add(9);
        boolean boolean34 = intTreeSet30.remove(0);
        boolean boolean36 = intTreeSet30.add(9);
        int int37 = intTreeSet30.max();
        boolean boolean38 = intTreeSet24.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        int int39 = intTreeSet30.max();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean41 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test136");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        int int35 = intTreeSet0.ceil((-9));
        int int37 = intTreeSet0.ceil((-2));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test137");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add(9);
        int int40 = intTreeSet33.max();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = intTreeSet33.clone();
        boolean boolean42 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean44 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean49 = intTreeSet45.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet45.clone();
        int int52 = intTreeSet45.floor((-2));
        boolean boolean53 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        boolean boolean54 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean56 = intTreeSet30.add(7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test138");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet10.clone();
        boolean boolean15 = intTreeSet13.add((int) '#');
        boolean boolean16 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet17.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add(9);
        int int30 = intTreeSet23.max();
        boolean boolean31 = intTreeSet17.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean35 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = intTreeSet32.clone();
        boolean boolean37 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet38.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean48 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        int int49 = intTreeSet45.max();
        boolean boolean50 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        boolean boolean51 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test139");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntCollection intCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = intTreeSet0.addAll(intCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test140");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet16.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intTreeSet16.floor(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test141");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean23 = intTreeSet6.remove((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet6.floor((-5));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test142");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        boolean boolean13 = intTreeSet11.remove(5);
        intTreeSet11.clear();
        boolean boolean16 = intTreeSet11.remove((-4));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test143");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        int int21 = intTreeSet12.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = intTreeSet22.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add(9);
        int int35 = intTreeSet28.max();
        boolean boolean36 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        int int37 = intTreeSet28.max();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean43 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int46 = intTreeSet0.max();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test144");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet36.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.add(9);
        boolean boolean46 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        int int47 = intTreeSet43.max();
        boolean boolean48 = intTreeSet37.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = intTreeSet43.clone();
        boolean boolean50 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test145");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove(35);
        int int12 = intTreeSet0.max();
        int int13 = intTreeSet0.min();
        DataStructures.kodkod.IntCollection intCollection14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = intTreeSet0.removeAll(intCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test146");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = intTreeSet18.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test147");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        boolean boolean39 = intTreeSet7.remove((int) (byte) 0);
        int int41 = intTreeSet7.floor((int) (byte) 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test148");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet3.clone();
        int int16 = intTreeSet15.min();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test149");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        int int22 = intTreeSet9.floor((int) '#');
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test150");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add((-1));
        boolean boolean16 = intTreeSet12.remove(8);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add((-1));
        boolean boolean21 = intTreeSet17.remove(8);
        boolean boolean22 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int25 = intTreeSet12.ceil((int) (short) 100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test151");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        int int62 = intTreeSet59.max();
        boolean boolean64 = intTreeSet59.remove((int) (short) 0);
        boolean boolean65 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean67 = intTreeSet18.add((-3));
        intTreeSet18.clear();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test152");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        boolean boolean11 = intTreeSet7.add(100);
        int int12 = intTreeSet7.min();
        int int13 = intTreeSet7.min();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test153");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = intTreeSet26.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add(9);
        int int39 = intTreeSet32.max();
        boolean boolean40 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int41 = intTreeSet32.max();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        boolean boolean47 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        int int49 = intTreeSet42.ceil(0);
        boolean boolean50 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet51);
        int int53 = intTreeSet52.max();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test154");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean22 = intTreeSet20.add(2147483647);
        boolean boolean24 = intTreeSet20.remove(5);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test155");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        int int7 = intTreeSet0.floor((-2));
        boolean boolean9 = intTreeSet0.add((-6));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test156");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = intTreeSet13.clone();
        boolean boolean22 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet12.clear();
        intTreeSet12.clear();
        boolean boolean25 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test157");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int10 = intTreeSet0.min();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test158");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean22 = intTreeSet20.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        int int25 = intTreeSet20.ceil((int) (short) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test159");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        boolean boolean15 = intTreeSet11.remove(9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test160");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        intTreeSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test161");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        int int17 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add(9);
        int int27 = intTreeSet20.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet20.clone();
        boolean boolean29 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean31 = intTreeSet20.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet32.clone();
        int int39 = intTreeSet32.floor((-2));
        boolean boolean40 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add(9);
        int int51 = intTreeSet44.max();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = intTreeSet44.clone();
        boolean boolean53 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean54 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean56 = intTreeSet41.remove((-10));
        boolean boolean57 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        boolean boolean59 = intTreeSet41.remove((-2147483648));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test162");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet1.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet2.clone();
        intTreeSet3.clear();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test163");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        intTreeSet0.clear();
        boolean boolean9 = intTreeSet0.add((-3));
        int int11 = intTreeSet0.ceil(100);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int14 = intTreeSet0.ceil((-9));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test164");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        int int17 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test165");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet2.clone();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test166");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean49 = intTreeSet47.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet47.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet47);
        int int53 = intTreeSet47.floor((int) (short) 1);
        boolean boolean54 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        int int56 = intTreeSet47.floor(2);
        int int57 = intTreeSet47.max();
        int int58 = intTreeSet47.min();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test167");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        boolean boolean34 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int35 = intTreeSet23.max();
        int int37 = intTreeSet23.ceil((-7));
        boolean boolean38 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean43 = intTreeSet39.remove(0);
        boolean boolean45 = intTreeSet39.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean53 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        int int54 = intTreeSet46.min();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = intTreeSet46.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.add(9);
        boolean boolean60 = intTreeSet56.remove(0);
        boolean boolean62 = intTreeSet56.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add((-2));
        boolean boolean70 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        int int71 = intTreeSet63.min();
        DataStructures.kodkod.IntTreeSet intTreeSet72 = intTreeSet63.clone();
        boolean boolean74 = intTreeSet72.remove((int) (byte) 0);
        boolean boolean75 = intTreeSet46.addAll((DataStructures.kodkod.IntCollection) intTreeSet72);
        DataStructures.kodkod.IntTreeSet intTreeSet76 = intTreeSet46.clone();
        int int78 = intTreeSet76.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean81 = intTreeSet79.add(9);
        boolean boolean83 = intTreeSet79.remove(0);
        boolean boolean85 = intTreeSet79.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet86 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet79);
        boolean boolean88 = intTreeSet86.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet89 = intTreeSet86.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet90 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet86);
        int int92 = intTreeSet86.floor((int) (short) 1);
        boolean boolean93 = intTreeSet76.removeAll((DataStructures.kodkod.IntCollection) intTreeSet86);
        boolean boolean94 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test168");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        intTreeSet37.clear();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test169");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test170");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        intTreeSet5.clear();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test171");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int12 = intTreeSet0.floor((int) 'a');
        int int13 = intTreeSet0.max();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test172");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-9));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test173");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        int int9 = intTreeSet8.min();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test174");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = intTreeSet13.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test175");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        boolean boolean61 = intTreeSet18.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add((-2));
        boolean boolean69 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        int int71 = intTreeSet18.ceil((-2));
        int int73 = intTreeSet18.ceil(1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test176");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add((-2));
        boolean boolean21 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        int int22 = intTreeSet14.min();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet14.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add((-2));
        boolean boolean38 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        int int39 = intTreeSet31.min();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = intTreeSet31.clone();
        boolean boolean42 = intTreeSet40.remove((int) (byte) 0);
        boolean boolean43 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet14.clone();
        intTreeSet44.clear();
        boolean boolean46 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        intTreeSet44.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean51 = intTreeSet49.add(9);
        boolean boolean53 = intTreeSet49.remove(0);
        boolean boolean55 = intTreeSet49.add(9);
        int int56 = intTreeSet49.max();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = intTreeSet49.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet49);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add(9);
        int int69 = intTreeSet62.max();
        boolean boolean70 = intTreeSet59.addAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        int int71 = intTreeSet62.min();
        boolean boolean73 = intTreeSet62.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet74 = intTreeSet62.clone();
        boolean boolean75 = intTreeSet49.addAll((DataStructures.kodkod.IntCollection) intTreeSet74);
        int int76 = intTreeSet49.max();
        boolean boolean77 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test177");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean15 = intTreeSet13.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        boolean boolean30 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        boolean boolean33 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add((-2));
        boolean boolean42 = intTreeSet34.add((int) 'a');
        boolean boolean43 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean44 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean45 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean47 = intTreeSet0.remove((int) '#');
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test178");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        int int18 = intTreeSet16.ceil((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test179");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = intTreeSet2.clone();
        boolean boolean14 = intTreeSet12.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        int int16 = intTreeSet12.min();
        boolean boolean18 = intTreeSet12.remove((-5));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test180");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        int int4 = intTreeSet0.max();
        boolean boolean6 = intTreeSet0.remove((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        boolean boolean16 = intTreeSet10.add(9);
        int int17 = intTreeSet10.max();
        boolean boolean18 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        int int19 = intTreeSet7.max();
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int22 = intTreeSet7.floor((int) (byte) 100);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test181");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test182");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        int int32 = intTreeSet16.max();
        boolean boolean34 = intTreeSet16.remove(0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test183");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet3.floor((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test184");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        boolean boolean25 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        intTreeSet26.clear();
        boolean boolean35 = intTreeSet26.add((-3));
        boolean boolean36 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet37);
        boolean boolean39 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test185");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet18.add((-5));
        int int30 = intTreeSet18.max();
        intTreeSet18.clear();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test186");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = intTreeSet13.clone();
        boolean boolean22 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet13.clone();
        boolean boolean25 = intTreeSet23.add(100);
        int int27 = intTreeSet23.ceil(0);
        boolean boolean28 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet23.clone();
        intTreeSet23.clear();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test187");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet16.clone();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test188");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        boolean boolean13 = intTreeSet0.add((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet0.clone();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test189");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove(35);
        int int12 = intTreeSet0.max();
        int int14 = intTreeSet0.ceil(0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test190");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet10.clone();
        boolean boolean15 = intTreeSet13.add((int) '#');
        boolean boolean16 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet17.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add(9);
        int int30 = intTreeSet23.max();
        boolean boolean31 = intTreeSet17.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean35 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = intTreeSet32.clone();
        boolean boolean37 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        int int39 = intTreeSet13.floor((-1));
        boolean boolean41 = intTreeSet13.add((int) (short) 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test191");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean24 = intTreeSet22.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet22.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet22);
        int int28 = intTreeSet22.floor((int) (short) 1);
        int int30 = intTreeSet22.floor((int) (byte) 0);
        boolean boolean32 = intTreeSet22.remove(0);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test192");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int59 = intTreeSet44.max();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        boolean boolean64 = intTreeSet60.remove(0);
        boolean boolean66 = intTreeSet60.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean69 = intTreeSet67.add(9);
        boolean boolean71 = intTreeSet67.remove(0);
        boolean boolean73 = intTreeSet67.add((-2));
        boolean boolean74 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet67);
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet75);
        boolean boolean77 = intTreeSet60.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean80 = intTreeSet78.add(9);
        boolean boolean82 = intTreeSet78.remove(0);
        boolean boolean84 = intTreeSet78.add((-2));
        boolean boolean86 = intTreeSet78.add((int) 'a');
        boolean boolean87 = intTreeSet76.removeAll((DataStructures.kodkod.IntCollection) intTreeSet78);
        boolean boolean88 = intTreeSet44.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = intTreeSet76.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test193");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        boolean boolean33 = intTreeSet16.remove(8);
        int int34 = intTreeSet16.min();
        boolean boolean36 = intTreeSet16.remove(7);
        int int38 = intTreeSet16.floor(1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test194");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet18.ceil(0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test195");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        int int6 = intTreeSet3.max();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        boolean boolean20 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean21 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test196");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean22 = intTreeSet20.add(2147483647);
        boolean boolean24 = intTreeSet20.remove(5);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet20.clone();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test197");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean32 = intTreeSet0.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean35 = intTreeSet33.remove((int) (byte) 10);
        int int36 = intTreeSet33.max();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test198");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet2.floor((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test199");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.ceil((int) (byte) -1);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add(9);
        int int21 = intTreeSet14.max();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet14.clone();
        boolean boolean23 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean25 = intTreeSet14.remove(0);
        int int27 = intTreeSet14.ceil((-1));
        boolean boolean28 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        int int30 = intTreeSet0.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.add(0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test200");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean16 = intTreeSet0.add((int) (byte) 0);
        intTreeSet0.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        boolean boolean27 = intTreeSet25.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        int int31 = intTreeSet25.floor((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        boolean boolean34 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test201");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test202");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        intTreeSet0.clear();
        boolean boolean11 = intTreeSet0.remove(1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test203");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        boolean boolean16 = intTreeSet10.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        boolean boolean24 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        boolean boolean27 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        boolean boolean36 = intTreeSet28.add((int) 'a');
        boolean boolean37 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        boolean boolean38 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int39 = intTreeSet7.min();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test204");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        boolean boolean12 = intTreeSet10.remove((int) (byte) 10);
        int int13 = intTreeSet10.min();
        intTreeSet10.clear();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test205");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet0.ceil(100);
        intTreeSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = intTreeSet0.floor((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test206");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove(35);
        int int13 = intTreeSet0.ceil((-5));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test207");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test208");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        boolean boolean14 = intTreeSet1.add(0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test209");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        int int17 = intTreeSet6.min();
        intTreeSet6.clear();
        boolean boolean20 = intTreeSet6.add((int) (byte) 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test210");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        int int7 = intTreeSet0.floor((-5));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test211");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        int int34 = intTreeSet0.min();
        boolean boolean36 = intTreeSet0.remove(2147483647);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test212");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.add(9);
        boolean boolean31 = intTreeSet27.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet27.clone();
        int int34 = intTreeSet27.floor((-2));
        boolean boolean35 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet37);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean43 = intTreeSet39.remove(0);
        boolean boolean45 = intTreeSet39.add(9);
        int int46 = intTreeSet39.max();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet39.clone();
        boolean boolean48 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean49 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean50 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = intTreeSet36.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test213");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        int int18 = intTreeSet16.ceil((int) (byte) 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test214");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        boolean boolean13 = intTreeSet11.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add(9);
        int int27 = intTreeSet20.max();
        boolean boolean28 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.add(9);
        boolean boolean32 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = intTreeSet33.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet38.clone();
        boolean boolean41 = intTreeSet38.add(2147483647);
        int int43 = intTreeSet38.ceil((-10));
        boolean boolean44 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean46 = intTreeSet14.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet14);
        boolean boolean49 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test215");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet1.clone();
        intTreeSet2.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet6.clone();
        boolean boolean15 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean17 = intTreeSet6.remove(0);
        int int19 = intTreeSet6.ceil((-1));
        int int20 = intTreeSet6.min();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test216");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean28 = intTreeSet0.remove(35);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test217");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        boolean boolean26 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        boolean boolean29 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.add(9);
        boolean boolean34 = intTreeSet30.remove(0);
        boolean boolean36 = intTreeSet30.add((-2));
        boolean boolean38 = intTreeSet30.add((int) 'a');
        boolean boolean39 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.add(9);
        boolean boolean51 = intTreeSet47.remove(0);
        boolean boolean53 = intTreeSet47.add((-2));
        boolean boolean54 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet55);
        boolean boolean57 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean60 = intTreeSet58.add(9);
        boolean boolean62 = intTreeSet58.remove(0);
        boolean boolean64 = intTreeSet58.add((-2));
        boolean boolean66 = intTreeSet58.add((int) 'a');
        boolean boolean67 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        boolean boolean69 = intTreeSet56.add((-9));
        boolean boolean70 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        int int72 = intTreeSet30.ceil(7);
        int int73 = intTreeSet30.max();
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean76 = intTreeSet74.add(9);
        boolean boolean78 = intTreeSet74.remove(0);
        boolean boolean80 = intTreeSet74.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet74);
        boolean boolean83 = intTreeSet81.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet84 = intTreeSet81.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet85 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet81);
        boolean boolean86 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet85);
        boolean boolean87 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet85);
        int int88 = intTreeSet7.min();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test218");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        intTreeSet7.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intTreeSet13.ceil((-4));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test219");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean35 = intTreeSet0.add((-10));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test220");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add(9);
        int int28 = intTreeSet21.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add(9);
        int int41 = intTreeSet34.max();
        boolean boolean42 = intTreeSet31.addAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        int int43 = intTreeSet34.min();
        boolean boolean45 = intTreeSet34.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet34.clone();
        boolean boolean47 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean48 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = intTreeSet21.clone();
        int int51 = intTreeSet49.ceil((-7));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test221");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        boolean boolean61 = intTreeSet18.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add((-2));
        boolean boolean69 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        boolean boolean71 = intTreeSet18.add(1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test222");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int23 = intTreeSet16.ceil(0);
        boolean boolean25 = intTreeSet16.add(3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test223");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add((-1));
        boolean boolean4 = intTreeSet0.remove(8);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add((-1));
        boolean boolean9 = intTreeSet5.remove(8);
        boolean boolean10 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test224");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.ceil((int) (byte) 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test225");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int10 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean20 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean29 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet21.add(1);
        boolean boolean32 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean34 = intTreeSet21.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean44 = intTreeSet38.add(9);
        int int45 = intTreeSet38.max();
        boolean boolean46 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int47 = intTreeSet35.max();
        int int49 = intTreeSet35.ceil((-7));
        boolean boolean50 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean51 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean53 = intTreeSet35.remove((int) (byte) 10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test226");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add(9);
        int int70 = intTreeSet63.max();
        boolean boolean71 = intTreeSet60.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        int int72 = intTreeSet63.min();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.add(9);
        boolean boolean77 = intTreeSet73.remove(0);
        boolean boolean79 = intTreeSet73.add((-2));
        boolean boolean81 = intTreeSet73.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet73);
        boolean boolean83 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        boolean boolean84 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        int int85 = intTreeSet82.max();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test227");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet15.clone();
        int int21 = intTreeSet19.ceil((-100));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test228");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        boolean boolean12 = intTreeSet10.remove((-9));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test229");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add((-2));
        boolean boolean28 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        boolean boolean31 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add((-2));
        boolean boolean40 = intTreeSet32.add((int) 'a');
        boolean boolean41 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean43 = intTreeSet30.add((-9));
        boolean boolean44 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean49 = intTreeSet45.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet45.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean55 = intTreeSet51.remove(0);
        boolean boolean57 = intTreeSet51.add(9);
        int int58 = intTreeSet51.max();
        boolean boolean59 = intTreeSet45.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        int int61 = intTreeSet45.ceil((int) '4');
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet69 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet62);
        boolean boolean70 = intTreeSet45.addAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        boolean boolean72 = intTreeSet45.add((-7));
        boolean boolean73 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet45);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test230");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean32 = intTreeSet0.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int36 = intTreeSet0.ceil((int) (byte) 10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test231");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = intTreeSet59.clone();
        int int62 = intTreeSet59.floor((int) ' ');
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test232");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add(9);
        int int38 = intTreeSet31.max();
        boolean boolean39 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean43 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        boolean boolean44 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        int int45 = intTreeSet40.max();
        int int46 = intTreeSet40.min();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test233");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = intTreeSet9.floor((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test234");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean10 = intTreeSet0.add(1);
        boolean boolean12 = intTreeSet0.add(35);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test235");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove((int) 'a');
        intTreeSet0.clear();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test236");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test237");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int23 = intTreeSet16.ceil(0);
        int int24 = intTreeSet16.min();
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test238");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        intTreeSet16.clear();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test239");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        int int26 = intTreeSet19.max();
        boolean boolean27 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int28 = intTreeSet19.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int31 = intTreeSet29.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        boolean boolean34 = intTreeSet29.add((int) (short) 10);
        int int36 = intTreeSet29.floor(4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test240");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet3.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test241");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int25 = intTreeSet0.ceil((int) (byte) 0);
        intTreeSet0.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.add(9);
        boolean boolean31 = intTreeSet27.remove(0);
        boolean boolean33 = intTreeSet27.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        boolean boolean36 = intTreeSet34.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet34.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = intTreeSet37.clone();
        boolean boolean39 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test242");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add(9);
        int int28 = intTreeSet21.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add(9);
        int int41 = intTreeSet34.max();
        boolean boolean42 = intTreeSet31.addAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        int int43 = intTreeSet34.min();
        boolean boolean45 = intTreeSet34.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet34.clone();
        boolean boolean47 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean48 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        boolean boolean54 = intTreeSet50.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.add(9);
        boolean boolean58 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        boolean boolean63 = intTreeSet59.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet64 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean66 = intTreeSet64.add(9);
        boolean boolean67 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        boolean boolean69 = intTreeSet59.add(1);
        boolean boolean70 = intTreeSet50.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean72 = intTreeSet59.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet59);
        boolean boolean74 = intTreeSet20.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test243");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        int int10 = intTreeSet0.floor(2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test244");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean37 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int39 = intTreeSet32.floor((-10));
        boolean boolean41 = intTreeSet32.add((-6));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test245");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        intTreeSet0.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test246");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        int int26 = intTreeSet19.max();
        boolean boolean27 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int28 = intTreeSet19.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int31 = intTreeSet29.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int33 = intTreeSet29.min();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test247");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        int int20 = intTreeSet16.max();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test248");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet7.clone();
        boolean boolean15 = intTreeSet7.add(6);
        int int16 = intTreeSet7.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet32);
        boolean boolean34 = intTreeSet17.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean43 = intTreeSet35.add((int) 'a');
        boolean boolean44 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean46 = intTreeSet33.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet33.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet48);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        boolean boolean54 = intTreeSet50.remove(0);
        boolean boolean56 = intTreeSet50.add(9);
        int int57 = intTreeSet50.max();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = intTreeSet50.clone();
        boolean boolean59 = intTreeSet49.removeAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        boolean boolean61 = intTreeSet50.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet67 = intTreeSet62.clone();
        int int69 = intTreeSet62.floor((-2));
        boolean boolean70 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        boolean boolean71 = intTreeSet47.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        boolean boolean72 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet50);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test249");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet0.clear();
        intTreeSet0.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = intTreeSet0.clone();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test250");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = intTreeSet26.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add(9);
        int int39 = intTreeSet32.max();
        boolean boolean40 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int41 = intTreeSet32.max();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        boolean boolean47 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        int int49 = intTreeSet42.ceil(0);
        boolean boolean50 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = intTreeSet19.clone();
        int int52 = intTreeSet51.min();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test251");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = intTreeSet26.clone();
        boolean boolean35 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean37 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = intTreeSet38.clone();
        int int45 = intTreeSet38.floor((-2));
        boolean boolean46 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean47 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean49 = intTreeSet9.remove((int) '4');
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test252");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int27 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet28.clone();
        boolean boolean31 = intTreeSet29.remove((int) (short) 100);
        boolean boolean33 = intTreeSet29.remove((-2147483648));
        int int35 = intTreeSet29.floor(100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test253");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        boolean boolean8 = intTreeSet5.add(2147483647);
        boolean boolean10 = intTreeSet5.add((-5));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test254");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet18.ceil((-10));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test255");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove(35);
        int int12 = intTreeSet0.max();
        int int13 = intTreeSet0.min();
        int int15 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        int int20 = intTreeSet17.max();
        int int22 = intTreeSet17.floor(0);
        boolean boolean23 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        boolean boolean25 = intTreeSet17.add((int) (byte) 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test256");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet15.clone();
        boolean boolean21 = intTreeSet15.add(0);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet22);
        boolean boolean31 = intTreeSet29.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet29.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet32.clone();
        intTreeSet33.clear();
        boolean boolean36 = intTreeSet33.add(100);
        boolean boolean38 = intTreeSet33.add(1);
        boolean boolean39 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        int int41 = intTreeSet33.floor((-100));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test257");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test258");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        intTreeSet11.clear();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test259");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        int int26 = intTreeSet19.max();
        boolean boolean27 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int28 = intTreeSet19.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int31 = intTreeSet29.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test260");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        boolean boolean34 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int35 = intTreeSet23.max();
        int int37 = intTreeSet23.ceil((-7));
        boolean boolean38 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet9.clone();
        intTreeSet9.clear();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test261");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        boolean boolean8 = intTreeSet5.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        boolean boolean12 = intTreeSet9.remove((-100));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test262");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        boolean boolean14 = intTreeSet1.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet15.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean25 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        int int26 = intTreeSet22.max();
        boolean boolean27 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet22.clone();
        boolean boolean29 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test263");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int8 = intTreeSet0.max();
        boolean boolean10 = intTreeSet0.add(0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test264");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add((-2));
        boolean boolean21 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        int int22 = intTreeSet14.min();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet14.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add((-2));
        boolean boolean38 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        int int39 = intTreeSet31.min();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = intTreeSet31.clone();
        boolean boolean42 = intTreeSet40.remove((int) (byte) 0);
        boolean boolean43 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet14.clone();
        intTreeSet44.clear();
        boolean boolean46 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = intTreeSet44.ceil(5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test265");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = intTreeSet59.clone();
        boolean boolean62 = intTreeSet60.remove(5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test266");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean41 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int42 = intTreeSet38.max();
        boolean boolean43 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet38.remove((int) (short) -1);
        boolean boolean46 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int47 = intTreeSet24.max();
        intTreeSet24.clear();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test267");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add(9);
        int int25 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet18.clone();
        boolean boolean27 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        intTreeSet28.clear();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test268");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        int int26 = intTreeSet19.max();
        boolean boolean27 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int28 = intTreeSet19.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int31 = intTreeSet29.ceil((int) (short) 1);
        boolean boolean32 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        boolean boolean34 = intTreeSet29.add((int) (short) 10);
        boolean boolean36 = intTreeSet29.add((int) (short) 0);
        int int37 = intTreeSet29.max();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test269");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean23 = intTreeSet16.add((int) (short) -1);
        int int25 = intTreeSet16.ceil((int) (short) 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test270");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet7.clone();
        int int13 = intTreeSet11.floor((-1));
        boolean boolean15 = intTreeSet11.add((int) (byte) 10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test271");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = intTreeSet0.ceil((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test272");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove(35);
        boolean boolean13 = intTreeSet0.add((int) (short) -1);
        int int14 = intTreeSet0.min();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test273");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        boolean boolean39 = intTreeSet7.remove((int) (byte) 0);
        intTreeSet7.clear();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test274");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet19.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test275");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean23 = intTreeSet19.remove(8);
        boolean boolean24 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = intTreeSet0.floor(9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test276");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
        boolean boolean13 = intTreeSet0.remove((int) (byte) 0);
        int int15 = intTreeSet0.floor(7);
        int int17 = intTreeSet0.floor((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet0.clone();
        int int19 = intTreeSet0.max();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test277");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        boolean boolean25 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        int int26 = intTreeSet0.max();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test278");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean32 = intTreeSet0.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean35 = intTreeSet33.remove((int) (byte) 10);
        int int36 = intTreeSet33.min();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test279");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet12.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean22 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int23 = intTreeSet19.max();
        boolean boolean24 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add((-2));
        boolean boolean40 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet41);
        boolean boolean43 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add((-2));
        boolean boolean52 = intTreeSet44.add((int) 'a');
        boolean boolean53 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean55 = intTreeSet42.add((-9));
        boolean boolean56 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean57 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean59 = intTreeSet0.remove((-100));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test280");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add((-2));
        boolean boolean21 = intTreeSet13.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean23 = intTreeSet3.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet24.clone();
        boolean boolean33 = intTreeSet3.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int35 = intTreeSet24.ceil((int) (short) 10);
        int int37 = intTreeSet24.ceil(10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test281");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add(9);
        int int21 = intTreeSet14.max();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet14.clone();
        boolean boolean23 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add((-1));
        boolean boolean27 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean29 = intTreeSet24.remove((int) '#');
        boolean boolean30 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test282");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.remove(35);
        int int12 = intTreeSet0.max();
        int int13 = intTreeSet0.min();
        int int15 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        int int20 = intTreeSet17.max();
        int int22 = intTreeSet17.floor(0);
        boolean boolean23 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.add(9);
        boolean boolean32 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add((-2));
        boolean boolean41 = intTreeSet33.remove((-5));
        boolean boolean43 = intTreeSet33.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet33.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean49 = intTreeSet45.remove(0);
        boolean boolean51 = intTreeSet45.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet45);
        int int54 = intTreeSet45.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.add(9);
        boolean boolean59 = intTreeSet55.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = intTreeSet55.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean63 = intTreeSet61.add(9);
        boolean boolean65 = intTreeSet61.remove(0);
        boolean boolean67 = intTreeSet61.add(9);
        int int68 = intTreeSet61.max();
        boolean boolean69 = intTreeSet55.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        int int70 = intTreeSet61.max();
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean73 = intTreeSet71.add(9);
        boolean boolean75 = intTreeSet71.remove(0);
        boolean boolean76 = intTreeSet61.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        boolean boolean77 = intTreeSet45.addAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        boolean boolean78 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        boolean boolean79 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean80 = intTreeSet17.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test283");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        int int4 = intTreeSet0.max();
        boolean boolean6 = intTreeSet0.remove((int) (short) 1);
        int int7 = intTreeSet0.min();
        int int9 = intTreeSet0.ceil((-8));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test284");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean15 = intTreeSet13.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        boolean boolean30 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        boolean boolean33 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add((-2));
        boolean boolean42 = intTreeSet34.add((int) 'a');
        boolean boolean43 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean44 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean45 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = intTreeSet0.ceil(35);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test285");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = intTreeSet17.clone();
        boolean boolean20 = intTreeSet17.add((int) (byte) 10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test286");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        boolean boolean8 = intTreeSet5.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        int int12 = intTreeSet9.ceil((-1));
        boolean boolean14 = intTreeSet9.remove(0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test287");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet6.clone();
        boolean boolean15 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        boolean boolean17 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int19 = intTreeSet0.ceil((-1));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test288");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        boolean boolean61 = intTreeSet18.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add((-2));
        boolean boolean69 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        intTreeSet62.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet71);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.add(9);
        boolean boolean77 = intTreeSet73.remove(0);
        boolean boolean79 = intTreeSet73.add(9);
        int int80 = intTreeSet73.max();
        DataStructures.kodkod.IntTreeSet intTreeSet81 = intTreeSet73.clone();
        boolean boolean82 = intTreeSet72.removeAll((DataStructures.kodkod.IntCollection) intTreeSet73);
        boolean boolean84 = intTreeSet73.remove(0);
        int int86 = intTreeSet73.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet87 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet73);
        boolean boolean89 = intTreeSet87.add((int) '4');
        boolean boolean90 = intTreeSet62.addAll((DataStructures.kodkod.IntCollection) intTreeSet87);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test289");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean18 = intTreeSet6.add((-7));
        int int20 = intTreeSet6.ceil(35);
        int int21 = intTreeSet6.min();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test290");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add(9);
        int int70 = intTreeSet63.max();
        boolean boolean71 = intTreeSet60.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        int int72 = intTreeSet63.min();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.add(9);
        boolean boolean77 = intTreeSet73.remove(0);
        boolean boolean79 = intTreeSet73.add((-2));
        boolean boolean81 = intTreeSet73.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet73);
        boolean boolean83 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        boolean boolean84 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet82);
        int int86 = intTreeSet82.ceil(35);
        DataStructures.kodkod.IntCollection intCollection87 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = intTreeSet82.removeAll(intCollection87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test291");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean23 = intTreeSet6.add(3);
        boolean boolean25 = intTreeSet6.add((-100));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        int int27 = intTreeSet6.min();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test292");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean11 = intTreeSet0.add((int) '4');
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test293");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        boolean boolean33 = intTreeSet16.remove(8);
        int int34 = intTreeSet16.min();
        boolean boolean36 = intTreeSet16.remove(7);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.add(9);
        boolean boolean41 = intTreeSet37.remove(0);
        boolean boolean43 = intTreeSet37.add((-2));
        boolean boolean45 = intTreeSet37.remove((-5));
        boolean boolean47 = intTreeSet37.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = intTreeSet37.clone();
        int int50 = intTreeSet37.ceil((-4));
        boolean boolean51 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test294");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet12.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean22 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int23 = intTreeSet19.max();
        boolean boolean24 = intTreeSet13.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add((-2));
        boolean boolean40 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet41);
        boolean boolean43 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add((-2));
        boolean boolean52 = intTreeSet44.add((int) 'a');
        boolean boolean53 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean55 = intTreeSet42.add((-9));
        boolean boolean56 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean57 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        int int59 = intTreeSet0.ceil(1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test295");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test296");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean8 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add((-2));
        boolean boolean17 = intTreeSet9.remove((-5));
        boolean boolean19 = intTreeSet9.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet9.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        int int30 = intTreeSet21.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.add(9);
        boolean boolean41 = intTreeSet37.remove(0);
        boolean boolean43 = intTreeSet37.add(9);
        int int44 = intTreeSet37.max();
        boolean boolean45 = intTreeSet31.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        int int46 = intTreeSet37.max();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.add(9);
        boolean boolean51 = intTreeSet47.remove(0);
        boolean boolean52 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean53 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean54 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean55 = intTreeSet6.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test297");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.add(9);
        boolean boolean15 = intTreeSet11.remove(0);
        boolean boolean17 = intTreeSet11.add((-2));
        boolean boolean19 = intTreeSet11.remove((-5));
        boolean boolean21 = intTreeSet11.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet11.clone();
        boolean boolean23 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet10.ceil(100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test298");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        boolean boolean13 = intTreeSet7.remove((-6));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test299");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        boolean boolean26 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int27 = intTreeSet19.min();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet19.clone();
        boolean boolean29 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test300");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int27 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.add(9);
        boolean boolean33 = intTreeSet29.remove(0);
        boolean boolean35 = intTreeSet29.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean44 = intTreeSet38.add(9);
        int int45 = intTreeSet38.max();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet38.clone();
        boolean boolean47 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.add((-1));
        boolean boolean51 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        boolean boolean52 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        boolean boolean54 = intTreeSet48.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.add(9);
        boolean boolean59 = intTreeSet55.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = intTreeSet55.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean63 = intTreeSet61.add(9);
        boolean boolean65 = intTreeSet61.remove(0);
        boolean boolean67 = intTreeSet61.add(9);
        int int68 = intTreeSet61.max();
        boolean boolean69 = intTreeSet55.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        int int70 = intTreeSet61.max();
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean73 = intTreeSet71.add(9);
        boolean boolean75 = intTreeSet71.remove(0);
        boolean boolean76 = intTreeSet61.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        int int78 = intTreeSet71.ceil(0);
        boolean boolean79 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        boolean boolean80 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = intTreeSet48.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet82 = intTreeSet81.clone();
        boolean boolean84 = intTreeSet82.remove(2147483647);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test301");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean41 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int42 = intTreeSet38.max();
        boolean boolean43 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet38.remove((int) (short) -1);
        boolean boolean46 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet38.clone();
        boolean boolean49 = intTreeSet38.remove((-2147483648));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test302");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        boolean boolean33 = intTreeSet16.remove(8);
        int int34 = intTreeSet16.min();
        boolean boolean36 = intTreeSet16.remove(7);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = intTreeSet37.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean43 = intTreeSet39.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean47 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int48 = intTreeSet44.max();
        boolean boolean49 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet44.clone();
        boolean boolean52 = intTreeSet44.add(6);
        int int53 = intTreeSet44.max();
        boolean boolean54 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test303");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        intTreeSet0.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test304");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean41 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int42 = intTreeSet38.max();
        boolean boolean43 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet38.remove((int) (short) -1);
        boolean boolean46 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet38.clone();
        int int49 = intTreeSet47.floor((int) '#');
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test305");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = intTreeSet10.clone();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test306");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        int int62 = intTreeSet59.max();
        boolean boolean64 = intTreeSet59.remove((int) (short) 0);
        boolean boolean65 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean67 = intTreeSet18.add(1);
        int int68 = intTreeSet18.min();
        int int70 = intTreeSet18.floor((int) (short) 0);
        boolean boolean72 = intTreeSet18.add((-3));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test307");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean48 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        int int49 = intTreeSet45.max();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = intTreeSet50.clone();
        boolean boolean55 = intTreeSet53.add((int) '#');
        boolean boolean56 = intTreeSet45.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        boolean boolean57 = intTreeSet37.addAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet45);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet45);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test308");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int24 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet25.clone();
        boolean boolean30 = intTreeSet28.add((int) '#');
        boolean boolean31 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        int int33 = intTreeSet28.ceil((int) (short) 10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test309");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        int int18 = intTreeSet16.ceil((-7));
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add(9);
        int int35 = intTreeSet28.max();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = intTreeSet28.clone();
        boolean boolean37 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add((-1));
        boolean boolean41 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean42 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int43 = intTreeSet19.min();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = intTreeSet44.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        boolean boolean54 = intTreeSet50.remove(0);
        boolean boolean56 = intTreeSet50.add(9);
        int int57 = intTreeSet50.max();
        boolean boolean58 = intTreeSet44.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        boolean boolean62 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.add(9);
        boolean boolean74 = intTreeSet70.remove(0);
        boolean boolean76 = intTreeSet70.add((-2));
        boolean boolean77 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet70);
        int int78 = intTreeSet70.min();
        boolean boolean79 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet70);
        boolean boolean80 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean81 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int83 = intTreeSet19.floor((int) (short) 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test310");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet3.clone();
        boolean boolean17 = intTreeSet3.add((int) (short) 1);
        intTreeSet3.clear();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test311");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        boolean boolean41 = intTreeSet37.add((-6));
        intTreeSet37.clear();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test312");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        int int62 = intTreeSet59.max();
        boolean boolean64 = intTreeSet59.remove((int) (short) 0);
        boolean boolean65 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean67 = intTreeSet18.add(1);
        int int68 = intTreeSet18.min();
        int int70 = intTreeSet18.floor((int) (short) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test313");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int59 = intTreeSet44.max();
        boolean boolean61 = intTreeSet44.remove(0);
        int int63 = intTreeSet44.ceil((-5));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test314");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        int int24 = intTreeSet14.floor((int) (byte) -1);
        int int26 = intTreeSet14.floor((int) (short) 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test315");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int12 = intTreeSet0.floor((int) 'a');
        int int14 = intTreeSet0.ceil(1);
        boolean boolean16 = intTreeSet0.remove(0);
        int int17 = intTreeSet0.min();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test316");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        int int10 = intTreeSet0.ceil(3);
        int int12 = intTreeSet0.floor((-9));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test317");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.add(9);
        boolean boolean8 = intTreeSet4.remove(0);
        boolean boolean10 = intTreeSet4.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        int int13 = intTreeSet4.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add(9);
        int int27 = intTreeSet20.max();
        boolean boolean28 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        int int29 = intTreeSet20.max();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.add(9);
        boolean boolean34 = intTreeSet30.remove(0);
        boolean boolean35 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean36 = intTreeSet4.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean39 = intTreeSet37.remove((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = intTreeSet40.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add(9);
        int int53 = intTreeSet46.max();
        boolean boolean54 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.add(9);
        boolean boolean58 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet55.clone();
        boolean boolean60 = intTreeSet37.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean62 = intTreeSet55.remove(97);
        boolean boolean63 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean65 = intTreeSet55.remove(35);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test318");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean49 = intTreeSet47.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet47.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet47);
        int int53 = intTreeSet47.floor((int) (short) 1);
        boolean boolean54 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        int int56 = intTreeSet47.floor(2);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet47);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test319");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.add(9);
        boolean boolean31 = intTreeSet27.remove(0);
        boolean boolean33 = intTreeSet27.add(9);
        int int34 = intTreeSet27.max();
        boolean boolean35 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        int int37 = intTreeSet21.ceil((int) '4');
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean44 = intTreeSet38.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean46 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        int int49 = intTreeSet47.floor(97);
        boolean boolean50 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean55 = intTreeSet51.remove(0);
        boolean boolean57 = intTreeSet51.add(9);
        int int59 = intTreeSet51.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet51);
        intTreeSet60.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet60);
        boolean boolean63 = intTreeSet47.addAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        int int65 = intTreeSet47.floor(7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test320");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int36 = intTreeSet26.max();
        intTreeSet26.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = intTreeSet38.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add(9);
        int int51 = intTreeSet44.max();
        boolean boolean52 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean54 = intTreeSet38.add((int) (byte) 0);
        boolean boolean55 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        boolean boolean63 = intTreeSet59.remove(0);
        boolean boolean65 = intTreeSet59.add(9);
        int int66 = intTreeSet59.max();
        boolean boolean67 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        int int68 = intTreeSet59.min();
        DataStructures.kodkod.IntTreeSet intTreeSet69 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean71 = intTreeSet69.add(9);
        boolean boolean73 = intTreeSet69.remove(0);
        boolean boolean75 = intTreeSet69.add((-2));
        boolean boolean77 = intTreeSet69.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet69);
        boolean boolean79 = intTreeSet59.addAll((DataStructures.kodkod.IntCollection) intTreeSet78);
        boolean boolean81 = intTreeSet59.add(8);
        int int83 = intTreeSet59.ceil((-2147483648));
        boolean boolean84 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test321");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean41 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int42 = intTreeSet38.max();
        boolean boolean43 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet38.remove((int) (short) -1);
        boolean boolean46 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet38.clone();
        int int49 = intTreeSet47.ceil((int) (short) 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test322");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet2.max();
        int int18 = intTreeSet2.min();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test323");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        int int62 = intTreeSet59.max();
        boolean boolean64 = intTreeSet59.remove((int) (short) 0);
        boolean boolean65 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean67 = intTreeSet18.add(1);
        int int68 = intTreeSet18.min();
        DataStructures.kodkod.IntTreeSet intTreeSet69 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean71 = intTreeSet69.add(9);
        boolean boolean73 = intTreeSet69.remove(0);
        boolean boolean75 = intTreeSet69.add(9);
        int int77 = intTreeSet69.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet69);
        boolean boolean80 = intTreeSet69.remove(35);
        int int81 = intTreeSet69.max();
        int int82 = intTreeSet69.min();
        int int84 = intTreeSet69.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet85 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet69);
        DataStructures.kodkod.IntTreeSet intTreeSet86 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean88 = intTreeSet86.add(9);
        int int89 = intTreeSet86.max();
        int int91 = intTreeSet86.floor(0);
        boolean boolean92 = intTreeSet69.addAll((DataStructures.kodkod.IntCollection) intTreeSet86);
        boolean boolean93 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet69);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test324");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean28 = intTreeSet25.remove(7);
        int int30 = intTreeSet25.ceil((int) '#');
        intTreeSet25.clear();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test325");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add(9);
        int int28 = intTreeSet21.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add(9);
        int int41 = intTreeSet34.max();
        boolean boolean42 = intTreeSet31.addAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        int int43 = intTreeSet34.min();
        boolean boolean45 = intTreeSet34.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet34.clone();
        boolean boolean47 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean48 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean50 = intTreeSet21.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        int int52 = intTreeSet21.max();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test326");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet18.add((-5));
        int int30 = intTreeSet18.max();
        int int31 = intTreeSet18.max();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test327");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add(9);
        int int28 = intTreeSet21.max();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add(9);
        int int41 = intTreeSet34.max();
        boolean boolean42 = intTreeSet31.addAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        int int43 = intTreeSet34.min();
        boolean boolean45 = intTreeSet34.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet34.clone();
        boolean boolean47 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean48 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = intTreeSet21.clone();
        int int50 = intTreeSet21.min();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test328");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        int int26 = intTreeSet19.min();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet27.clone();
        boolean boolean32 = intTreeSet30.remove((-1));
        int int34 = intTreeSet30.floor((-1));
        boolean boolean35 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test329");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        boolean boolean16 = intTreeSet10.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        boolean boolean24 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        int int25 = intTreeSet17.min();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet17.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = intTreeSet26.clone();
        boolean boolean29 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean32 = intTreeSet30.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        int int35 = intTreeSet9.max();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test330");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        int int28 = intTreeSet15.ceil((-1));
        boolean boolean30 = intTreeSet15.remove(0);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        int int32 = intTreeSet15.min();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test331");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test332");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        int int16 = intTreeSet2.min();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int18 = intTreeSet17.min();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test333");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int14 = intTreeSet7.ceil(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        boolean boolean17 = intTreeSet7.add((int) ' ');
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test334");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        intTreeSet0.clear();
        boolean boolean9 = intTreeSet0.add((-3));
        int int11 = intTreeSet0.ceil(100);
        intTreeSet0.clear();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test335");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet0.clone();
        int int8 = intTreeSet6.floor((-100));
        int int10 = intTreeSet6.ceil((-1));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test336");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        int int16 = intTreeSet2.min();
        int int17 = intTreeSet2.min();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test337");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet12.clone();
        boolean boolean21 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        boolean boolean22 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.add(9);
        boolean boolean34 = intTreeSet30.remove(0);
        boolean boolean36 = intTreeSet30.add((-2));
        boolean boolean37 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        int int38 = intTreeSet30.min();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet30.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = intTreeSet39.clone();
        boolean boolean42 = intTreeSet39.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        boolean boolean44 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        int int46 = intTreeSet43.ceil((-7));
        int int47 = intTreeSet43.max();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test338");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int35 = intTreeSet0.max();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test339");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        boolean boolean16 = intTreeSet10.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        boolean boolean24 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        int int25 = intTreeSet17.min();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet17.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = intTreeSet26.clone();
        boolean boolean29 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean32 = intTreeSet30.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        int int35 = intTreeSet33.max();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test340");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean21 = intTreeSet19.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int25 = intTreeSet19.floor((int) (short) 1);
        int int27 = intTreeSet19.floor((int) (byte) 0);
        boolean boolean29 = intTreeSet19.add(6);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet19.clone();
        int int32 = intTreeSet30.ceil((int) (short) 1);
        boolean boolean33 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test341");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        boolean boolean25 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.add(9);
        boolean boolean31 = intTreeSet27.remove(0);
        boolean boolean33 = intTreeSet27.add((-2));
        boolean boolean35 = intTreeSet27.remove((-5));
        boolean boolean37 = intTreeSet27.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add((-1));
        boolean boolean43 = intTreeSet39.remove(8);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add((-1));
        boolean boolean48 = intTreeSet44.remove(8);
        boolean boolean49 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean50 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean51 = intTreeSet17.addAll((DataStructures.kodkod.IntCollection) intTreeSet27);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test342");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean49 = intTreeSet47.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet47.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet47);
        int int53 = intTreeSet47.floor((int) (short) 1);
        boolean boolean54 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean56 = intTreeSet47.add(0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test343");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int10 = intTreeSet9.max();
        intTreeSet9.clear();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test344");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int14 = intTreeSet7.ceil(2147483647);
        intTreeSet7.clear();
        boolean boolean17 = intTreeSet7.remove(9);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test345");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean15 = intTreeSet13.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        boolean boolean30 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        boolean boolean33 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add((-2));
        boolean boolean42 = intTreeSet34.add((int) 'a');
        boolean boolean43 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean44 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean45 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test346");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet5);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test347");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.add(9);
        boolean boolean8 = intTreeSet4.remove(0);
        boolean boolean10 = intTreeSet4.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        int int13 = intTreeSet4.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add(9);
        int int27 = intTreeSet20.max();
        boolean boolean28 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        int int29 = intTreeSet20.max();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.add(9);
        boolean boolean34 = intTreeSet30.remove(0);
        boolean boolean35 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean36 = intTreeSet4.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean39 = intTreeSet37.remove((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = intTreeSet40.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add(9);
        int int53 = intTreeSet46.max();
        boolean boolean54 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.add(9);
        boolean boolean58 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet55.clone();
        boolean boolean60 = intTreeSet37.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean62 = intTreeSet55.remove(97);
        boolean boolean63 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean65 = intTreeSet0.remove(100);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test348");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet7.clone();
        boolean boolean19 = intTreeSet17.add(0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test349");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet0.ceil((int) '4');
        int int17 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add(9);
        int int27 = intTreeSet20.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet20.clone();
        boolean boolean29 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean31 = intTreeSet20.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet32.clone();
        int int39 = intTreeSet32.floor((-2));
        boolean boolean40 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add(9);
        int int51 = intTreeSet44.max();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = intTreeSet44.clone();
        boolean boolean53 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean54 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean56 = intTreeSet41.remove((-10));
        boolean boolean57 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        boolean boolean59 = intTreeSet0.remove(100);
        boolean boolean61 = intTreeSet0.add(35);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test350");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int25 = intTreeSet0.ceil((int) (byte) 0);
        int int27 = intTreeSet0.ceil((-4));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test351");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.add(9);
        boolean boolean40 = intTreeSet36.remove(0);
        boolean boolean42 = intTreeSet36.add(9);
        int int43 = intTreeSet36.max();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet36.clone();
        boolean boolean45 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean47 = intTreeSet36.remove(0);
        int int49 = intTreeSet36.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        boolean boolean52 = intTreeSet50.add((int) ' ');
        boolean boolean54 = intTreeSet50.add((-9));
        boolean boolean55 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        boolean boolean57 = intTreeSet50.add(0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test352");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        boolean boolean14 = intTreeSet1.add((-100));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test353");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int59 = intTreeSet44.max();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        boolean boolean64 = intTreeSet60.remove(0);
        boolean boolean66 = intTreeSet60.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean69 = intTreeSet67.add(9);
        boolean boolean71 = intTreeSet67.remove(0);
        boolean boolean73 = intTreeSet67.add((-2));
        boolean boolean74 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet67);
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet75);
        boolean boolean77 = intTreeSet60.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean80 = intTreeSet78.add(9);
        boolean boolean82 = intTreeSet78.remove(0);
        boolean boolean84 = intTreeSet78.add((-2));
        boolean boolean86 = intTreeSet78.add((int) 'a');
        boolean boolean87 = intTreeSet76.removeAll((DataStructures.kodkod.IntCollection) intTreeSet78);
        boolean boolean88 = intTreeSet44.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        intTreeSet44.clear();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test354");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        intTreeSet14.clear();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test355");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet7.clone();
        int int13 = intTreeSet11.floor((-1));
        int int15 = intTreeSet11.floor((int) (short) -1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test356");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        boolean boolean34 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int35 = intTreeSet23.max();
        int int37 = intTreeSet23.ceil((-7));
        boolean boolean38 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet9.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add((-2));
        boolean boolean48 = intTreeSet40.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet50);
        boolean boolean52 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean55 = intTreeSet53.add(9);
        boolean boolean57 = intTreeSet53.remove(0);
        boolean boolean59 = intTreeSet53.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet53);
        boolean boolean62 = intTreeSet60.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.add(9);
        boolean boolean74 = intTreeSet70.remove(0);
        boolean boolean76 = intTreeSet70.add((-2));
        boolean boolean77 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet70);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet78);
        boolean boolean80 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean83 = intTreeSet81.add(9);
        boolean boolean85 = intTreeSet81.remove(0);
        boolean boolean87 = intTreeSet81.add((-2));
        boolean boolean89 = intTreeSet81.add((int) 'a');
        boolean boolean90 = intTreeSet79.removeAll((DataStructures.kodkod.IntCollection) intTreeSet81);
        boolean boolean91 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        intTreeSet79.clear();
        intTreeSet79.clear();
        boolean boolean94 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = intTreeSet79.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test357");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        int int28 = intTreeSet15.ceil((-1));
        boolean boolean30 = intTreeSet15.remove(0);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        boolean boolean41 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = intTreeSet42.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.add(9);
        boolean boolean52 = intTreeSet48.remove(0);
        boolean boolean54 = intTreeSet48.add(9);
        int int55 = intTreeSet48.max();
        boolean boolean56 = intTreeSet42.addAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        int int57 = intTreeSet48.max();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet48);
        boolean boolean60 = intTreeSet48.add((-7));
        int int61 = intTreeSet48.max();
        boolean boolean62 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        boolean boolean64 = intTreeSet40.remove(4);
        int int65 = intTreeSet40.max();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test358");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet0.clone();
        intTreeSet6.clear();
        boolean boolean9 = intTreeSet6.remove((-8));
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet6.ceil((-100));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test359");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        int int4 = intTreeSet0.min();
        boolean boolean6 = intTreeSet0.remove((-6));
        boolean boolean8 = intTreeSet0.remove(10);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test360");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean41 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int42 = intTreeSet38.max();
        boolean boolean43 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet38.remove((int) (short) -1);
        boolean boolean46 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int47 = intTreeSet24.max();
        int int49 = intTreeSet24.ceil(9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test361");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        int int4 = intTreeSet0.min();
        boolean boolean6 = intTreeSet0.remove((-6));
        int int7 = intTreeSet0.min();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test362");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean22 = intTreeSet20.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean31 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.add(9);
        boolean boolean40 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        boolean boolean42 = intTreeSet32.add(1);
        boolean boolean43 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean45 = intTreeSet32.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean51 = intTreeSet49.add(9);
        boolean boolean53 = intTreeSet49.remove(0);
        boolean boolean55 = intTreeSet49.add(9);
        int int56 = intTreeSet49.max();
        boolean boolean57 = intTreeSet46.addAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        int int58 = intTreeSet46.max();
        int int60 = intTreeSet46.ceil((-7));
        boolean boolean61 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = intTreeSet32.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.add(9);
        boolean boolean67 = intTreeSet63.remove(0);
        boolean boolean69 = intTreeSet63.add((-2));
        boolean boolean71 = intTreeSet63.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet63);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet63);
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet73);
        boolean boolean75 = intTreeSet62.addAll((DataStructures.kodkod.IntCollection) intTreeSet73);
        boolean boolean76 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test363");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        boolean boolean18 = intTreeSet16.add((int) ' ');
        boolean boolean20 = intTreeSet16.add(0);
        int int21 = intTreeSet16.min();
        int int23 = intTreeSet16.ceil((-2147483648));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test364");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        int int13 = intTreeSet7.floor((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet7.clone();
        int int16 = intTreeSet14.ceil((int) (byte) 10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test365");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        int int11 = intTreeSet10.min();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test366");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean32 = intTreeSet0.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean42 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.add(9);
        boolean boolean47 = intTreeSet43.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.add(9);
        boolean boolean51 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        boolean boolean53 = intTreeSet43.add(1);
        boolean boolean54 = intTreeSet34.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean56 = intTreeSet43.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet57.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        boolean boolean64 = intTreeSet60.remove(0);
        boolean boolean66 = intTreeSet60.add(9);
        int int67 = intTreeSet60.max();
        boolean boolean68 = intTreeSet57.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        int int69 = intTreeSet57.max();
        int int71 = intTreeSet57.ceil((-7));
        boolean boolean72 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = intTreeSet43.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean76 = intTreeSet74.add(9);
        boolean boolean78 = intTreeSet74.remove(0);
        boolean boolean80 = intTreeSet74.add((-2));
        boolean boolean82 = intTreeSet74.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet83 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet74);
        DataStructures.kodkod.IntTreeSet intTreeSet84 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet74);
        DataStructures.kodkod.IntTreeSet intTreeSet85 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet84);
        boolean boolean86 = intTreeSet73.addAll((DataStructures.kodkod.IntCollection) intTreeSet84);
        boolean boolean87 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet73);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test367");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test368");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
        boolean boolean13 = intTreeSet0.remove((int) (byte) 0);
        int int15 = intTreeSet0.floor(7);
        intTreeSet0.clear();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test369");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean19 = intTreeSet16.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add((-2));
        boolean boolean28 = intTreeSet20.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean32 = intTreeSet20.remove((int) (short) 0);
        boolean boolean33 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean35 = intTreeSet16.remove((-2));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test370");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test371");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean37 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int39 = intTreeSet32.floor((-10));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.add(9);
        boolean boolean51 = intTreeSet47.remove(0);
        boolean boolean53 = intTreeSet47.add((-2));
        boolean boolean54 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        int int55 = intTreeSet47.min();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = intTreeSet47.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = intTreeSet57.clone();
        boolean boolean59 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet57);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test372");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet31.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean41 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int42 = intTreeSet38.max();
        boolean boolean43 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean45 = intTreeSet38.remove((int) (short) -1);
        boolean boolean46 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean48 = intTreeSet38.add((int) (byte) 100);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test373");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        intTreeSet0.clear();
        boolean boolean9 = intTreeSet0.add((-3));
        int int11 = intTreeSet0.ceil(100);
        boolean boolean13 = intTreeSet0.remove(97);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test374");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        boolean boolean7 = intTreeSet0.remove((int) (short) -1);
        int int8 = intTreeSet0.max();
        int int10 = intTreeSet0.floor((-10));
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test375");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet7.clone();
        boolean boolean15 = intTreeSet7.add(6);
        int int16 = intTreeSet7.max();
        boolean boolean18 = intTreeSet7.add((int) (short) 1);
        int int20 = intTreeSet7.ceil((-2));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test376");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean21 = intTreeSet19.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean25 = intTreeSet23.remove(5);
        boolean boolean26 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean28 = intTreeSet7.remove(7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test377");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean35 = intTreeSet33.remove((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.add(9);
        boolean boolean40 = intTreeSet36.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = intTreeSet36.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        boolean boolean48 = intTreeSet42.add(9);
        int int49 = intTreeSet42.max();
        boolean boolean50 = intTreeSet36.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean54 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = intTreeSet51.clone();
        boolean boolean56 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        boolean boolean58 = intTreeSet51.remove((-100));
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        boolean boolean63 = intTreeSet59.remove(0);
        boolean boolean65 = intTreeSet59.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet59);
        boolean boolean68 = intTreeSet66.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet69 = intTreeSet66.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet70 = intTreeSet69.clone();
        boolean boolean72 = intTreeSet69.remove(6);
        boolean boolean73 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet69);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test378");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test379");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet6.clone();
        boolean boolean15 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        boolean boolean17 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        boolean boolean27 = intTreeSet25.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        int int31 = intTreeSet25.floor((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        boolean boolean34 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean36 = intTreeSet6.add((-10));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test380");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        intTreeSet7.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        intTreeSet7.clear();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test381");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        int int13 = intTreeSet7.floor((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet7.clone();
        boolean boolean16 = intTreeSet7.remove(4);
        boolean boolean18 = intTreeSet7.remove((int) (byte) 1);
        int int20 = intTreeSet7.floor((-2147483648));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test382");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int28 = intTreeSet0.floor(100);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test383");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet16.clone();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test384");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean32 = intTreeSet0.add((-8));
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add((-2));
        boolean boolean42 = intTreeSet34.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet44);
        boolean boolean46 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test385");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean37 = intTreeSet0.remove(6);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test386");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean19 = intTreeSet16.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.add(9);
        boolean boolean24 = intTreeSet20.remove(0);
        boolean boolean26 = intTreeSet20.add((-2));
        boolean boolean28 = intTreeSet20.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean32 = intTreeSet20.remove((int) (short) 0);
        boolean boolean33 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.add(9);
        boolean boolean38 = intTreeSet34.remove(0);
        boolean boolean40 = intTreeSet34.add((-2));
        boolean boolean42 = intTreeSet34.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet45);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.add(9);
        boolean boolean51 = intTreeSet47.remove(0);
        boolean boolean53 = intTreeSet47.add(9);
        int int54 = intTreeSet47.max();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = intTreeSet47.clone();
        boolean boolean56 = intTreeSet46.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = intTreeSet47.clone();
        boolean boolean59 = intTreeSet57.add(100);
        int int61 = intTreeSet57.ceil(0);
        boolean boolean62 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean63 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        int int64 = intTreeSet16.min();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test387");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test388");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test389");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.ceil((int) (byte) -1);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add(9);
        int int21 = intTreeSet14.max();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet14.clone();
        boolean boolean23 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean25 = intTreeSet14.remove(0);
        int int27 = intTreeSet14.ceil((-1));
        boolean boolean28 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.add(9);
        boolean boolean33 = intTreeSet29.remove(0);
        boolean boolean35 = intTreeSet29.add(9);
        int int36 = intTreeSet29.max();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet29.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet38.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add((-2));
        boolean boolean48 = intTreeSet40.remove((-5));
        boolean boolean50 = intTreeSet40.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = intTreeSet40.clone();
        boolean boolean52 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        boolean boolean53 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test390");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add(9);
        int int22 = intTreeSet15.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet15.clone();
        boolean boolean24 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean26 = intTreeSet15.remove(0);
        int int28 = intTreeSet15.ceil((-1));
        boolean boolean30 = intTreeSet15.remove(0);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet15.clone();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test391");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet44.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = intTreeSet59.clone();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test392");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        int int62 = intTreeSet59.max();
        boolean boolean64 = intTreeSet59.remove((int) (short) 0);
        boolean boolean65 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean67 = intTreeSet18.add(1);
        int int68 = intTreeSet18.min();
        int int70 = intTreeSet18.floor((int) (short) 0);
        intTreeSet18.clear();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test393");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int14 = intTreeSet7.ceil(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        boolean boolean30 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        boolean boolean33 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean35 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.add(9);
        boolean boolean40 = intTreeSet36.remove(0);
        boolean boolean42 = intTreeSet36.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        boolean boolean45 = intTreeSet43.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = intTreeSet43.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean49 = intTreeSet47.remove(5);
        intTreeSet47.clear();
        boolean boolean51 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test394");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
        int int13 = intTreeSet0.floor(2);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        boolean boolean27 = intTreeSet21.add((-2));
        boolean boolean28 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        int int29 = intTreeSet21.min();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet21.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = intTreeSet30.clone();
        boolean boolean33 = intTreeSet30.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean36 = intTreeSet34.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        boolean boolean38 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test395");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean8 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean10 = intTreeSet6.remove((int) (byte) -1);
        boolean boolean12 = intTreeSet6.remove(10);
        intTreeSet6.clear();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test396");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        boolean boolean35 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int36 = intTreeSet26.max();
        intTreeSet26.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test397");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int33 = intTreeSet26.min();
        int int34 = intTreeSet26.min();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test398");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        boolean boolean13 = intTreeSet10.remove(6);
        boolean boolean15 = intTreeSet10.remove((int) (byte) 10);
        int int17 = intTreeSet10.floor(100);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test399");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        int int8 = intTreeSet5.floor((int) (byte) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test400");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        int int20 = intTreeSet18.floor((int) (short) 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test401");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test402");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet12.clone();
        boolean boolean21 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        boolean boolean22 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.add(9);
        boolean boolean34 = intTreeSet30.remove(0);
        boolean boolean36 = intTreeSet30.add((-2));
        boolean boolean37 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        int int38 = intTreeSet30.min();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = intTreeSet30.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = intTreeSet39.clone();
        boolean boolean42 = intTreeSet39.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        boolean boolean44 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean46 = intTreeSet5.add(2);
        int int48 = intTreeSet5.floor(100);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test403");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet12.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        boolean boolean31 = intTreeSet25.add(9);
        int int32 = intTreeSet25.max();
        boolean boolean33 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int34 = intTreeSet25.min();
        boolean boolean36 = intTreeSet25.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet25.clone();
        boolean boolean38 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        int int39 = intTreeSet12.max();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = intTreeSet12.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = intTreeSet40.clone();
        boolean boolean42 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test404");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int14 = intTreeSet7.ceil(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        intTreeSet7.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet7.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = intTreeSet17.ceil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test405");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int14 = intTreeSet7.ceil(2147483647);
        intTreeSet7.clear();
        boolean boolean17 = intTreeSet7.remove(9);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = intTreeSet7.ceil((-5));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test406");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean37 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = intTreeSet32.clone();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test407");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet0.clear();
        intTreeSet0.clear();
        boolean boolean36 = intTreeSet0.remove(1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test408");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = intTreeSet26.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add(9);
        int int39 = intTreeSet32.max();
        boolean boolean40 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int41 = intTreeSet32.max();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        boolean boolean47 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        int int49 = intTreeSet42.ceil(0);
        boolean boolean50 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = intTreeSet51.clone();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test409");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        int int19 = intTreeSet17.ceil(2);
        int int21 = intTreeSet17.floor((-2));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test410");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.add(9);
        boolean boolean15 = intTreeSet11.remove(0);
        boolean boolean17 = intTreeSet11.add(9);
        int int18 = intTreeSet11.max();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet11.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        boolean boolean32 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int33 = intTreeSet24.min();
        boolean boolean35 = intTreeSet24.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet36 = intTreeSet24.clone();
        boolean boolean37 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        int int38 = intTreeSet11.max();
        boolean boolean39 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        int int41 = intTreeSet11.floor((-10));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test411");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        boolean boolean14 = intTreeSet12.add((-2147483648));
        int int16 = intTreeSet12.floor((int) (short) -1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test412");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add((-2));
        boolean boolean21 = intTreeSet13.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean23 = intTreeSet3.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean25 = intTreeSet3.add(8);
        int int26 = intTreeSet3.min();
        intTreeSet3.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet3.clone();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test413");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        boolean boolean12 = intTreeSet10.remove((int) (byte) 10);
        int int14 = intTreeSet10.ceil(2);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test414");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet15.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test415");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
        intTreeSet0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test416");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add((-2));
        boolean boolean23 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean26 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add(9);
        int int36 = intTreeSet28.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        boolean boolean39 = intTreeSet28.remove(35);
        int int40 = intTreeSet28.max();
        int int41 = intTreeSet28.min();
        int int43 = intTreeSet28.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        int int48 = intTreeSet45.max();
        int int50 = intTreeSet45.floor(0);
        boolean boolean51 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        boolean boolean52 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        boolean boolean53 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test417");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        int int24 = intTreeSet9.max();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test418");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        int int4 = intTreeSet0.min();
        int int6 = intTreeSet0.floor((int) (byte) -1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test419");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        int int6 = intTreeSet3.max();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        boolean boolean20 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean21 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet22);
        boolean boolean31 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test420");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        int int4 = intTreeSet3.min();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test421");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet3.ceil(1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test422");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet16.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add(9);
        int int40 = intTreeSet33.max();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = intTreeSet33.clone();
        boolean boolean42 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean44 = intTreeSet33.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.add(9);
        boolean boolean49 = intTreeSet45.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = intTreeSet45.clone();
        int int52 = intTreeSet45.floor((-2));
        boolean boolean53 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet45);
        boolean boolean54 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet55);
        intTreeSet56.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean60 = intTreeSet58.add(9);
        boolean boolean62 = intTreeSet58.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = intTreeSet58.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet64 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean66 = intTreeSet64.add(9);
        boolean boolean68 = intTreeSet64.remove(0);
        boolean boolean70 = intTreeSet64.add(9);
        int int71 = intTreeSet64.max();
        boolean boolean72 = intTreeSet58.addAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        int int74 = intTreeSet64.floor((int) (short) 100);
        boolean boolean75 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        int int77 = intTreeSet64.floor(35);
        boolean boolean78 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet64);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test423");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet18.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        boolean boolean32 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int34 = intTreeSet18.ceil((int) '4');
        int int35 = intTreeSet18.min();
        boolean boolean36 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet18.clone();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test424");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int10 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean20 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean29 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet21.add(1);
        boolean boolean32 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean34 = intTreeSet21.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean44 = intTreeSet38.add(9);
        int int45 = intTreeSet38.max();
        boolean boolean46 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int47 = intTreeSet35.max();
        int int49 = intTreeSet35.ceil((-7));
        boolean boolean50 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean51 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = intTreeSet9.clone();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test425");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int9 = intTreeSet0.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        boolean boolean14 = intTreeSet10.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet10.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        boolean boolean24 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int25 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean31 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean35 = intTreeSet33.remove((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.add(9);
        boolean boolean40 = intTreeSet36.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = intTreeSet36.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        boolean boolean48 = intTreeSet42.add(9);
        int int49 = intTreeSet42.max();
        boolean boolean50 = intTreeSet36.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean54 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = intTreeSet51.clone();
        boolean boolean56 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet33.clear();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test426");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int24 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet25.clone();
        boolean boolean30 = intTreeSet28.add((int) '#');
        boolean boolean31 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet0.clear();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test427");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.add(9);
        boolean boolean40 = intTreeSet36.remove(0);
        boolean boolean42 = intTreeSet36.add(9);
        int int43 = intTreeSet36.max();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet36.clone();
        boolean boolean45 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean47 = intTreeSet36.remove(0);
        int int49 = intTreeSet36.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        int int51 = intTreeSet50.max();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.add(9);
        boolean boolean56 = intTreeSet52.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = intTreeSet52.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean60 = intTreeSet58.add(9);
        boolean boolean62 = intTreeSet58.remove(0);
        boolean boolean64 = intTreeSet58.add(9);
        int int65 = intTreeSet58.max();
        boolean boolean66 = intTreeSet52.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        int int68 = intTreeSet52.ceil((int) '4');
        int int69 = intTreeSet52.min();
        boolean boolean70 = intTreeSet50.addAll((DataStructures.kodkod.IntCollection) intTreeSet52);
        int int72 = intTreeSet50.floor((int) (byte) 10);
        boolean boolean73 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet50);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test428");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        boolean boolean19 = intTreeSet16.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean22 = intTreeSet20.remove(10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test429");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        boolean boolean34 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int35 = intTreeSet23.max();
        int int37 = intTreeSet23.ceil((-7));
        boolean boolean38 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = intTreeSet23.floor((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test430");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add((-2));
        boolean boolean16 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        boolean boolean19 = intTreeSet2.addAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet2.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add((-1));
        boolean boolean25 = intTreeSet21.remove(8);
        boolean boolean26 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean27 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test431");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        boolean boolean13 = intTreeSet10.remove(0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test432");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = intTreeSet25.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add(9);
        int int38 = intTreeSet31.max();
        boolean boolean39 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean43 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        boolean boolean44 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        int int45 = intTreeSet40.max();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet57);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        boolean boolean63 = intTreeSet59.remove(0);
        boolean boolean65 = intTreeSet59.add(9);
        int int66 = intTreeSet59.max();
        DataStructures.kodkod.IntTreeSet intTreeSet67 = intTreeSet59.clone();
        boolean boolean68 = intTreeSet58.removeAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        boolean boolean70 = intTreeSet59.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean73 = intTreeSet71.add(9);
        boolean boolean75 = intTreeSet71.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet76 = intTreeSet71.clone();
        int int78 = intTreeSet71.floor((-2));
        boolean boolean79 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        DataStructures.kodkod.IntTreeSet intTreeSet80 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet81);
        DataStructures.kodkod.IntTreeSet intTreeSet83 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean85 = intTreeSet83.add(9);
        boolean boolean87 = intTreeSet83.remove(0);
        boolean boolean89 = intTreeSet83.add(9);
        int int90 = intTreeSet83.max();
        DataStructures.kodkod.IntTreeSet intTreeSet91 = intTreeSet83.clone();
        boolean boolean92 = intTreeSet82.removeAll((DataStructures.kodkod.IntCollection) intTreeSet83);
        boolean boolean93 = intTreeSet80.removeAll((DataStructures.kodkod.IntCollection) intTreeSet83);
        boolean boolean94 = intTreeSet46.removeAll((DataStructures.kodkod.IntCollection) intTreeSet80);
        DataStructures.kodkod.IntTreeSet intTreeSet95 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet46);
        boolean boolean96 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet95);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test433");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        int int17 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet18.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        boolean boolean32 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int34 = intTreeSet18.ceil((int) '4');
        int int35 = intTreeSet18.min();
        boolean boolean36 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        int int37 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = intTreeSet18.clone();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test434");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int12 = intTreeSet10.ceil(3);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test435");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        boolean boolean14 = intTreeSet3.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet3.clone();
        boolean boolean17 = intTreeSet3.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet3);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test436");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet14.clone();
        int int21 = intTreeSet14.floor((-2));
        boolean boolean22 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean24 = intTreeSet2.remove((int) '4');
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test437");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean8 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean10 = intTreeSet6.remove((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet6.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test438");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.min();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test439");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int8 = intTreeSet0.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean13 = intTreeSet11.add((-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test440");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet9.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet10);
        boolean boolean13 = intTreeSet11.add((-7));
        boolean boolean15 = intTreeSet11.add((int) (byte) 100);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test441");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intTreeSet15.ceil((-1));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test442");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.add(9);
        boolean boolean7 = intTreeSet3.remove(0);
        boolean boolean9 = intTreeSet3.add(9);
        int int10 = intTreeSet3.max();
        boolean boolean11 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet3);
        int int12 = intTreeSet3.min();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add((-2));
        boolean boolean21 = intTreeSet13.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean23 = intTreeSet3.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet24.clone();
        boolean boolean33 = intTreeSet3.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int35 = intTreeSet24.ceil((int) (short) 10);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet24.clone();
        boolean boolean39 = intTreeSet37.remove(0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test443");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean18 = intTreeSet14.remove(0);
        boolean boolean20 = intTreeSet14.add((-2));
        boolean boolean21 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        int int22 = intTreeSet14.min();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet14.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.add(9);
        boolean boolean35 = intTreeSet31.remove(0);
        boolean boolean37 = intTreeSet31.add((-2));
        boolean boolean38 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        int int39 = intTreeSet31.min();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = intTreeSet31.clone();
        boolean boolean42 = intTreeSet40.remove((int) (byte) 0);
        boolean boolean43 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = intTreeSet14.clone();
        intTreeSet44.clear();
        boolean boolean46 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = intTreeSet44.floor(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test444");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int27 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet28.clone();
        int int30 = intTreeSet29.min();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test445");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int12 = intTreeSet0.floor((int) (byte) 100);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test446");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet10.clone();
        boolean boolean13 = intTreeSet11.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet11.clone();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test447");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        boolean boolean7 = intTreeSet0.remove((int) (short) -1);
        int int8 = intTreeSet0.max();
        int int10 = intTreeSet0.floor((-10));
        int int11 = intTreeSet0.max();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test448");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = intTreeSet26.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add(9);
        int int39 = intTreeSet32.max();
        boolean boolean40 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int41 = intTreeSet32.max();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.add(9);
        boolean boolean46 = intTreeSet42.remove(0);
        boolean boolean47 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        int int49 = intTreeSet42.ceil(0);
        boolean boolean50 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet51);
        int int53 = intTreeSet52.min();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test449");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet10.min();
        int int13 = intTreeSet10.ceil(6);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test450");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-9));
        boolean boolean4 = intTreeSet0.add((int) (byte) -1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test451");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet15.clone();
        intTreeSet19.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet19.floor(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test452");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add((-1));
        boolean boolean15 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        int int17 = intTreeSet12.ceil(100);
        int int19 = intTreeSet12.ceil(6);
        int int21 = intTreeSet12.floor((-1));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test453");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int16 = intTreeSet6.floor((int) (short) 100);
        boolean boolean18 = intTreeSet6.add((int) (byte) 1);
        int int20 = intTreeSet6.ceil((int) ' ');
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test454");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        int int9 = intTreeSet5.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = intTreeSet10.clone();
        boolean boolean15 = intTreeSet13.add((int) '#');
        boolean boolean16 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean18 = intTreeSet5.add(7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test455");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = intTreeSet18.clone();
        boolean boolean61 = intTreeSet18.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.add(9);
        boolean boolean66 = intTreeSet62.remove(0);
        boolean boolean68 = intTreeSet62.add((-2));
        boolean boolean69 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        int int71 = intTreeSet18.floor(2);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test456");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        boolean boolean16 = intTreeSet0.remove((int) (byte) 1);
        boolean boolean18 = intTreeSet0.add((int) (byte) 1);
        int int19 = intTreeSet0.max();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test457");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet24.clone();
        boolean boolean27 = intTreeSet24.add(2147483647);
        int int29 = intTreeSet24.ceil((-10));
        boolean boolean30 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.ceil((-2147483648));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test458");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean10 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int11 = intTreeSet7.max();
        boolean boolean12 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        boolean boolean14 = intTreeSet7.remove((int) (short) -1);
        int int15 = intTreeSet7.min();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test459");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean28 = intTreeSet26.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet26.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        int int32 = intTreeSet26.floor((int) (short) 1);
        int int34 = intTreeSet26.floor((int) (byte) 0);
        boolean boolean35 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test460");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean23 = intTreeSet16.add((int) (short) -1);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet16.clone();
        int int26 = intTreeSet16.ceil((-2));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test461");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        int int11 = intTreeSet5.floor(100);
        int int13 = intTreeSet5.floor(9);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = intTreeSet5.clone();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test462");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean18 = intTreeSet6.add((-7));
        int int20 = intTreeSet6.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = intTreeSet6.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet21.clone();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test463");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet15.clone();
        boolean boolean21 = intTreeSet15.add(0);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet22);
        boolean boolean31 = intTreeSet29.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet29.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet32.clone();
        intTreeSet33.clear();
        boolean boolean36 = intTreeSet33.add(100);
        boolean boolean38 = intTreeSet33.add(1);
        boolean boolean39 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean41 = intTreeSet33.add((int) (short) 0);
        intTreeSet33.clear();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test464");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        int int15 = intTreeSet7.min();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean21 = intTreeSet17.remove(0);
        boolean boolean23 = intTreeSet17.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add((-2));
        boolean boolean31 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int32 = intTreeSet24.min();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet24.clone();
        boolean boolean35 = intTreeSet33.remove((int) (byte) 0);
        boolean boolean36 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = intTreeSet7.clone();
        int int39 = intTreeSet37.ceil((-9));
        boolean boolean41 = intTreeSet37.add(0);
        int int42 = intTreeSet37.min();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test465");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        boolean boolean13 = intTreeSet2.remove(0);
        int int15 = intTreeSet2.ceil((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet16.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = intTreeSet18.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        boolean boolean32 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean36 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.add(9);
        boolean boolean41 = intTreeSet37.remove(0);
        boolean boolean43 = intTreeSet37.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        boolean boolean50 = intTreeSet44.add((-2));
        boolean boolean51 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int52 = intTreeSet44.min();
        boolean boolean53 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean54 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = intTreeSet18.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test466");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int10 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.add(9);
        boolean boolean20 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean25 = intTreeSet21.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean29 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet21.add(1);
        boolean boolean32 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        boolean boolean34 = intTreeSet21.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        boolean boolean44 = intTreeSet38.add(9);
        int int45 = intTreeSet38.max();
        boolean boolean46 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        int int47 = intTreeSet35.max();
        int int49 = intTreeSet35.ceil((-7));
        boolean boolean50 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean51 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.add(9);
        boolean boolean56 = intTreeSet52.remove(0);
        boolean boolean58 = intTreeSet52.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        boolean boolean63 = intTreeSet59.remove(0);
        boolean boolean65 = intTreeSet59.add((-2));
        boolean boolean66 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        int int67 = intTreeSet59.min();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = intTreeSet59.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet69 = intTreeSet68.clone();
        boolean boolean71 = intTreeSet68.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet68);
        boolean boolean74 = intTreeSet72.add(2147483647);
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet72);
        boolean boolean76 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet75);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test467");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean18 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        boolean boolean20 = intTreeSet17.add(10);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test468");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet0.clone();
        int int13 = intTreeSet0.ceil(2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test469");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        int int13 = intTreeSet7.floor((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add(9);
        int int23 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = intTreeSet16.clone();
        boolean boolean25 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet16.clone();
        boolean boolean28 = intTreeSet26.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        int int30 = intTreeSet26.min();
        int int31 = intTreeSet26.max();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean43 = intTreeSet39.remove(0);
        boolean boolean45 = intTreeSet39.add((-2));
        boolean boolean46 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        int int47 = intTreeSet39.min();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = intTreeSet39.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean51 = intTreeSet49.add(9);
        boolean boolean53 = intTreeSet49.remove(0);
        boolean boolean55 = intTreeSet49.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.add(9);
        boolean boolean60 = intTreeSet56.remove(0);
        boolean boolean62 = intTreeSet56.add((-2));
        boolean boolean63 = intTreeSet49.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        int int64 = intTreeSet56.min();
        DataStructures.kodkod.IntTreeSet intTreeSet65 = intTreeSet56.clone();
        boolean boolean67 = intTreeSet65.remove((int) (byte) 0);
        boolean boolean68 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet65);
        DataStructures.kodkod.IntTreeSet intTreeSet69 = intTreeSet39.clone();
        int int71 = intTreeSet69.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean74 = intTreeSet72.add(9);
        boolean boolean76 = intTreeSet72.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet77 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean79 = intTreeSet77.add(9);
        boolean boolean80 = intTreeSet72.removeAll((DataStructures.kodkod.IntCollection) intTreeSet77);
        int int81 = intTreeSet77.max();
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean84 = intTreeSet82.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet85 = intTreeSet82.clone();
        boolean boolean87 = intTreeSet85.add((int) '#');
        boolean boolean88 = intTreeSet77.removeAll((DataStructures.kodkod.IntCollection) intTreeSet85);
        boolean boolean89 = intTreeSet69.addAll((DataStructures.kodkod.IntCollection) intTreeSet77);
        boolean boolean91 = intTreeSet77.add(97);
        boolean boolean92 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet77);
        boolean boolean93 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet77);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test470");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.add(9);
        int int62 = intTreeSet59.max();
        boolean boolean64 = intTreeSet59.remove((int) (short) 0);
        boolean boolean65 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean68 = intTreeSet66.add((-1));
        boolean boolean69 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test471");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int12 = intTreeSet0.floor((int) (short) -1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test472");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean21 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean23 = intTreeSet6.remove((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intTreeSet6.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test473");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add(9);
        boolean boolean23 = intTreeSet19.remove(0);
        boolean boolean25 = intTreeSet19.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add((-2));
        boolean boolean33 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int34 = intTreeSet26.min();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = intTreeSet26.clone();
        boolean boolean36 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntCollection intCollection37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = intTreeSet26.addAll(intCollection37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test474");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = intTreeSet0.clone();
        int int4 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = intTreeSet6.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        int int19 = intTreeSet12.max();
        boolean boolean20 = intTreeSet6.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.add(9);
        boolean boolean29 = intTreeSet25.remove(0);
        boolean boolean31 = intTreeSet25.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add((-2));
        boolean boolean39 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int40 = intTreeSet32.min();
        boolean boolean41 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        int int42 = intTreeSet32.max();
        intTreeSet32.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean46 = intTreeSet44.add(9);
        boolean boolean48 = intTreeSet44.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = intTreeSet44.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.add(9);
        boolean boolean54 = intTreeSet50.remove(0);
        boolean boolean56 = intTreeSet50.add(9);
        int int57 = intTreeSet50.max();
        boolean boolean58 = intTreeSet44.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        boolean boolean60 = intTreeSet44.add((int) (byte) 0);
        boolean boolean61 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean62 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test475");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean21 = intTreeSet19.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean25 = intTreeSet23.remove(5);
        boolean boolean26 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        int int28 = intTreeSet23.floor(0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test476");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean32 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean33 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add(9);
        intTreeSet35.clear();
        boolean boolean44 = intTreeSet35.add((-3));
        int int46 = intTreeSet35.ceil(100);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet35);
        int int49 = intTreeSet47.ceil(8);
        boolean boolean50 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.add(9);
        boolean boolean55 = intTreeSet51.remove(0);
        boolean boolean57 = intTreeSet51.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean60 = intTreeSet58.add(9);
        boolean boolean62 = intTreeSet58.remove(0);
        boolean boolean64 = intTreeSet58.add((-2));
        boolean boolean65 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet66);
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet67);
        boolean boolean69 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        boolean boolean70 = intTreeSet47.addAll((DataStructures.kodkod.IntCollection) intTreeSet68);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test477");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        int int11 = intTreeSet0.min();
        int int12 = intTreeSet0.max();
        boolean boolean14 = intTreeSet0.remove(0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test478");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = intTreeSet5.clone();
        int int11 = intTreeSet5.ceil((-9));
        int int13 = intTreeSet5.ceil(100);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test479");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        boolean boolean15 = intTreeSet9.add(9);
        int int16 = intTreeSet9.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = intTreeSet9.clone();
        boolean boolean18 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.add((-1));
        boolean boolean22 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean23 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int25 = intTreeSet0.ceil((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet0.clone();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test480");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        boolean boolean16 = intTreeSet7.add((int) (short) -1);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test481");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.add(9);
        boolean boolean32 = intTreeSet28.remove(0);
        boolean boolean34 = intTreeSet28.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.add(9);
        boolean boolean39 = intTreeSet35.remove(0);
        boolean boolean41 = intTreeSet35.add((-2));
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean45 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.add(9);
        boolean boolean50 = intTreeSet46.remove(0);
        boolean boolean52 = intTreeSet46.add((-2));
        boolean boolean54 = intTreeSet46.add((int) 'a');
        boolean boolean55 = intTreeSet44.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        boolean boolean57 = intTreeSet44.add((-9));
        boolean boolean58 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int60 = intTreeSet18.ceil(7);
        int int61 = intTreeSet18.max();
        intTreeSet18.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int63 = intTreeSet18.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test482");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.add(9);
        boolean boolean8 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.add(9);
        boolean boolean13 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.add(9);
        boolean boolean17 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean19 = intTreeSet9.add(1);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean22 = intTreeSet9.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.add(9);
        boolean boolean30 = intTreeSet26.remove(0);
        boolean boolean32 = intTreeSet26.add(9);
        int int33 = intTreeSet26.max();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = intTreeSet26.clone();
        boolean boolean35 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean37 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.add(9);
        boolean boolean42 = intTreeSet38.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = intTreeSet38.clone();
        int int45 = intTreeSet38.floor((-2));
        boolean boolean46 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean47 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int49 = intTreeSet9.floor((int) (byte) 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test483");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet7.clone();
        int int11 = intTreeSet7.max();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add(9);
        boolean boolean16 = intTreeSet12.remove(0);
        boolean boolean18 = intTreeSet12.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean21 = intTreeSet19.add(1);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = intTreeSet19.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean25 = intTreeSet23.remove(5);
        boolean boolean26 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        int int27 = intTreeSet23.min();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test484");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        intTreeSet7.clear();
        boolean boolean12 = intTreeSet7.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean21 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        int int22 = intTreeSet18.max();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = intTreeSet23.clone();
        boolean boolean28 = intTreeSet26.add((int) '#');
        boolean boolean29 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int31 = intTreeSet26.floor((-1));
        boolean boolean33 = intTreeSet26.add((int) (short) 10);
        boolean boolean34 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet7);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test485");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = intTreeSet5.clone();
        int int8 = intTreeSet5.floor((int) (byte) 100);
        int int10 = intTreeSet5.ceil(2);
        int int11 = intTreeSet5.max();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test486");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        int int32 = intTreeSet16.max();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = intTreeSet16.clone();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test487");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = intTreeSet2.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = intTreeSet13.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add(9);
        boolean boolean20 = intTreeSet16.remove(0);
        boolean boolean22 = intTreeSet16.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add((-2));
        boolean boolean30 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        int int31 = intTreeSet23.min();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = intTreeSet23.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.add(9);
        boolean boolean37 = intTreeSet33.remove(0);
        boolean boolean39 = intTreeSet33.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.add(9);
        boolean boolean44 = intTreeSet40.remove(0);
        boolean boolean46 = intTreeSet40.add((-2));
        boolean boolean47 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        int int48 = intTreeSet40.min();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = intTreeSet40.clone();
        boolean boolean51 = intTreeSet49.remove((int) (byte) 0);
        boolean boolean52 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = intTreeSet23.clone();
        int int54 = intTreeSet23.max();
        boolean boolean55 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean57 = intTreeSet15.remove(1);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = intTreeSet15.clone();
        boolean boolean59 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test488");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        int int15 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean18 = intTreeSet6.add((-7));
        int int19 = intTreeSet6.max();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = intTreeSet6.clone();
        int int22 = intTreeSet6.floor((-6));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test489");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.add(9);
        boolean boolean10 = intTreeSet6.remove(0);
        boolean boolean12 = intTreeSet6.add(9);
        int int13 = intTreeSet6.max();
        boolean boolean14 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean18 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet15.clone();
        int int21 = intTreeSet19.floor((-6));
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.add(9);
        boolean boolean27 = intTreeSet23.remove(0);
        boolean boolean29 = intTreeSet23.add(9);
        int int31 = intTreeSet23.floor(1);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean34 = intTreeSet23.remove(35);
        int int35 = intTreeSet23.max();
        boolean boolean36 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test490");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        boolean boolean8 = intTreeSet0.remove((-5));
        boolean boolean10 = intTreeSet0.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.add(9);
        boolean boolean15 = intTreeSet11.remove(0);
        boolean boolean17 = intTreeSet11.add(9);
        int int18 = intTreeSet11.max();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = intTreeSet11.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.add(9);
        boolean boolean28 = intTreeSet24.remove(0);
        boolean boolean30 = intTreeSet24.add(9);
        int int31 = intTreeSet24.max();
        boolean boolean32 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        int int33 = intTreeSet24.min();
        boolean boolean35 = intTreeSet24.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet36 = intTreeSet24.clone();
        boolean boolean37 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        int int38 = intTreeSet11.max();
        boolean boolean39 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        int int40 = intTreeSet11.min();
        int int41 = intTreeSet11.max();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test491");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.add((-1));
        boolean boolean15 = intTreeSet2.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.add((-1));
        boolean boolean19 = intTreeSet2.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean21 = intTreeSet16.remove((-100));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test492");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.add(9);
        boolean boolean11 = intTreeSet7.remove(0);
        boolean boolean13 = intTreeSet7.add((-2));
        boolean boolean14 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean17 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.add(9);
        boolean boolean22 = intTreeSet18.remove(0);
        boolean boolean24 = intTreeSet18.add((-2));
        boolean boolean26 = intTreeSet18.add((int) 'a');
        boolean boolean27 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean29 = intTreeSet16.add((-9));
        int int31 = intTreeSet16.floor((int) '4');
        int int32 = intTreeSet16.max();
        boolean boolean34 = intTreeSet16.add(97);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test493");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        int int3 = intTreeSet0.max();
        int int5 = intTreeSet0.floor(0);
        int int7 = intTreeSet0.ceil(100);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test494");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean9 = intTreeSet7.add(1);
        boolean boolean11 = intTreeSet7.add(100);
        int int13 = intTreeSet7.floor((-6));
        int int15 = intTreeSet7.ceil((int) (byte) 100);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test495");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.add(9);
        boolean boolean4 = intTreeSet0.remove(0);
        boolean boolean6 = intTreeSet0.add(9);
        int int7 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.add(9);
        boolean boolean17 = intTreeSet13.remove(0);
        boolean boolean19 = intTreeSet13.add(9);
        int int20 = intTreeSet13.max();
        boolean boolean21 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        int int22 = intTreeSet13.min();
        boolean boolean24 = intTreeSet13.add((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = intTreeSet13.clone();
        boolean boolean26 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int27 = intTreeSet0.max();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = intTreeSet0.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = intTreeSet28.clone();
        boolean boolean31 = intTreeSet29.remove((int) (short) 100);
        int int33 = intTreeSet29.ceil((int) (byte) 1);
        int int34 = intTreeSet29.max();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test496");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet2 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean4 = intTreeSet2.add(9);
        boolean boolean6 = intTreeSet2.remove(0);
        boolean boolean8 = intTreeSet2.add(9);
        int int9 = intTreeSet2.max();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = intTreeSet2.clone();
        boolean boolean11 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet2);
        intTreeSet1.clear();
        boolean boolean14 = intTreeSet1.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.add(9);
        boolean boolean19 = intTreeSet15.remove(0);
        boolean boolean21 = intTreeSet15.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.add(9);
        boolean boolean26 = intTreeSet22.remove(0);
        boolean boolean28 = intTreeSet22.add((-2));
        boolean boolean29 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        int int30 = intTreeSet22.min();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = intTreeSet22.clone();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.add(9);
        boolean boolean36 = intTreeSet32.remove(0);
        boolean boolean38 = intTreeSet32.add((-2));
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.add(9);
        boolean boolean43 = intTreeSet39.remove(0);
        boolean boolean45 = intTreeSet39.add((-2));
        boolean boolean46 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        int int47 = intTreeSet39.min();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = intTreeSet39.clone();
        boolean boolean50 = intTreeSet48.remove((int) (byte) 0);
        boolean boolean51 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = intTreeSet22.clone();
        int int54 = intTreeSet52.ceil((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.add(9);
        boolean boolean59 = intTreeSet55.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.add(9);
        boolean boolean63 = intTreeSet55.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        int int64 = intTreeSet60.max();
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean67 = intTreeSet65.add(9);
        DataStructures.kodkod.IntTreeSet intTreeSet68 = intTreeSet65.clone();
        boolean boolean70 = intTreeSet68.add((int) '#');
        boolean boolean71 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        boolean boolean72 = intTreeSet52.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        boolean boolean73 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
    }
}

