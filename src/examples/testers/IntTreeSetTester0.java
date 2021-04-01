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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test002");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test003");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = intTreeSet0.ceil((int) (short) 1);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet4.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test005");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet4.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test006");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet1.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test008");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test009");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet1.min();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test011");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet1.floor(1);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet1.min();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intTreeSet11.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test014");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet11.floor((-5));
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intTreeSet1.ceil((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test016");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet1.ceil((int) (short) -1);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet0.ceil(9);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet4.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test019");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet0.floor((-1));
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.add((int) (short) 10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test021");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test022");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet4.ceil(6);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet1.ceil((-7));
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean34 = intTreeSet26.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = intTreeSet26.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intTreeSet26.floor(8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test026");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intTreeSet4.ceil(100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test027");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = intTreeSet1.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet1.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intTreeSet4.floor((int) (short) 0);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = intTreeSet15.floor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test031");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet0.floor((-6));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test032");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet1.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet15.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test034");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test035");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intTreeSet16.floor(3);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        boolean boolean4 = intTreeSet1.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = intTreeSet5.floor((-2));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test037");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        int int33 = intTreeSet20.ceil(1);
        DataStructures.kodkod.IntCollection intCollection34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = intTreeSet20.addAll(intCollection34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test038");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = intTreeSet0.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test039");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intTreeSet11.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test040");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intTreeSet16.floor((int) (short) 0);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet1.ceil((-1));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test042");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean34 = intTreeSet26.remove(3);
        intTreeSet26.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        intTreeSet37.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet37);
        boolean boolean42 = intTreeSet40.remove(0);
        boolean boolean43 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = intTreeSet26.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-9));
        // The following exception was thrown during execution in test generation
        try {
            int int7 = intTreeSet4.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test045");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intTreeSet32.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test046");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intTreeSet1.ceil((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test047");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intTreeSet11.ceil((-10));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test048");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet1.add((-9));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test049");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = intTreeSet22.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test050");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet4.remove(7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet4.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet8.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test052");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean24 = intTreeSet15.add((int) '4');
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test053");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet16.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test054");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet0.ceil(9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test055");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet6.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test056");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet4.floor((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test057");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet16.min();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test059");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean24 = intTreeSet22.remove((-9));
        boolean boolean25 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        int int26 = intTreeSet1.max();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test060");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test061");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean34 = intTreeSet26.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intTreeSet26.ceil((-7));
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test063");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean28 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = intTreeSet4.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test064");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-9));
        // The following exception was thrown during execution in test generation
        try {
            int int7 = intTreeSet4.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test065");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        int int33 = intTreeSet20.floor((int) ' ');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test066");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intTreeSet6.ceil((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test067");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intTreeSet1.floor((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test068");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet8.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        boolean boolean73 = intTreeSet53.add((int) (byte) -1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test070");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet1.remove((-3));
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = intTreeSet1.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet0.ceil((int) (byte) -1);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet11.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test073");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean15 = intTreeSet4.remove(1);
        boolean boolean17 = intTreeSet4.add((int) (short) 100);
        int int19 = intTreeSet4.ceil(6);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        boolean boolean22 = intTreeSet0.remove(1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test074");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet16.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        boolean boolean11 = intTreeSet7.remove(9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test076");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean42 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet33.remove(1);
        boolean boolean46 = intTreeSet33.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        intTreeSet48.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet52);
        boolean boolean54 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet57.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet58.clear();
        boolean boolean61 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet48.clear();
        intTreeSet48.clear();
        boolean boolean64 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        int int66 = intTreeSet33.min();
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean69 = intTreeSet67.removeAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        intTreeSet71.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet71);
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean77 = intTreeSet75.removeAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        intTreeSet76.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet76);
        boolean boolean80 = intTreeSet71.removeAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        boolean boolean82 = intTreeSet71.remove(1);
        boolean boolean84 = intTreeSet71.add((int) (short) 100);
        int int86 = intTreeSet71.ceil(6);
        boolean boolean87 = intTreeSet67.addAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        int int88 = intTreeSet71.min();
        boolean boolean89 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        boolean boolean90 = intTreeSet6.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test077");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet5);
        boolean boolean8 = intTreeSet5.remove((-6));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test078");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test079");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test080");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        boolean boolean4 = intTreeSet1.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntCollection intCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = intTreeSet1.addAll(intCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test081");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        boolean boolean25 = intTreeSet8.remove(100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = intTreeSet8.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test082");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean21 = intTreeSet19.add(3);
        boolean boolean22 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        boolean boolean33 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        intTreeSet35.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean45 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet49.clear();
        boolean boolean52 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean53 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean54 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean55 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = intTreeSet29.floor(0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test083");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean26 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test084");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.add(3);
        int int8 = intTreeSet4.ceil(0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test085");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean24 = intTreeSet22.remove((-9));
        boolean boolean25 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean27 = intTreeSet1.remove((-10));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test086");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        intTreeSet1.clear();
        intTreeSet1.clear();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test087");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = intTreeSet26.min();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        intTreeSet25.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean36 = intTreeSet25.remove(1);
        boolean boolean38 = intTreeSet25.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean46 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean49 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean50 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int51 = intTreeSet15.min();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test089");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet4.ceil((-3));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test090");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean15 = intTreeSet4.remove(1);
        boolean boolean17 = intTreeSet4.add((int) (short) 100);
        int int19 = intTreeSet4.ceil(6);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        int int21 = intTreeSet0.min();
        boolean boolean23 = intTreeSet0.add((int) 'a');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test091");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intTreeSet4.floor((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test092");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int32 = intTreeSet1.min();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test093");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean21 = intTreeSet19.add(3);
        boolean boolean22 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test094");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet8.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet4.remove((-5));
        intTreeSet4.clear();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test096");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test097");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        boolean boolean11 = intTreeSet7.add((int) (byte) 1);
        boolean boolean13 = intTreeSet7.add((-6));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test098");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        boolean boolean25 = intTreeSet8.remove(100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intTreeSet8.floor((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test099");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int33 = intTreeSet1.ceil((int) '#');
        int int34 = intTreeSet1.max();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test100");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        int int26 = intTreeSet15.ceil(10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test101");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(9);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean46 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean50 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = intTreeSet40.ceil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test102");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        boolean boolean9 = intTreeSet1.add((-3));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean21 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        intTreeSet25.clear();
        boolean boolean28 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean29 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean31 = intTreeSet25.remove((int) '#');
        boolean boolean33 = intTreeSet25.add(4);
        boolean boolean35 = intTreeSet25.remove(4);
        boolean boolean36 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test103");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        intTreeSet14.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean20 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        boolean boolean27 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean28 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet24.remove((int) '#');
        boolean boolean32 = intTreeSet24.add(5);
        boolean boolean33 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test104");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean24 = intTreeSet22.add(6);
        int int26 = intTreeSet22.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        intTreeSet32.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean38 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
        boolean boolean45 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean46 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean48 = intTreeSet42.remove((int) '#');
        boolean boolean49 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = intTreeSet42.floor(2);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test105");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean42 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet33.remove(1);
        boolean boolean46 = intTreeSet33.add((int) (short) 100);
        int int48 = intTreeSet33.ceil(6);
        boolean boolean49 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet51.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet54.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean57 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        intTreeSet61.clear();
        boolean boolean64 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        intTreeSet61.clear();
        boolean boolean67 = intTreeSet61.add((int) (short) 1);
        boolean boolean68 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet61);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test106");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean38 = intTreeSet1.add(4);
        boolean boolean40 = intTreeSet1.remove(10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test107");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int33 = intTreeSet1.ceil((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test108");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet4.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test109");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet1.add((int) (byte) 1);
        int int23 = intTreeSet1.floor(10);
        int int24 = intTreeSet1.max();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test110");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-9));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet4.ceil((-2));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test111");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-6));
        boolean boolean4 = intTreeSet0.add(0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test112");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((-9));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test113");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean33 = intTreeSet1.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        intTreeSet35.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean44 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        intTreeSet46.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean51 = intTreeSet49.removeAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        intTreeSet50.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean55 = intTreeSet53.removeAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        boolean boolean56 = intTreeSet50.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet50.addAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        intTreeSet60.clear();
        boolean boolean63 = intTreeSet50.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        boolean boolean64 = intTreeSet46.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        boolean boolean65 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet60);
        boolean boolean68 = intTreeSet60.remove(3);
        intTreeSet60.clear();
        boolean boolean70 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test114");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        boolean boolean18 = intTreeSet1.add(1);
        int int20 = intTreeSet1.ceil(6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test115");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        intTreeSet19.clear();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test116");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean15 = intTreeSet4.remove(1);
        boolean boolean17 = intTreeSet4.add((int) (short) 100);
        int int19 = intTreeSet4.ceil(6);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        int int21 = intTreeSet4.min();
        int int22 = intTreeSet4.min();
        int int24 = intTreeSet4.floor(6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test117");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean28 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        intTreeSet35.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet35);
        boolean boolean39 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean41 = intTreeSet30.remove(1);
        boolean boolean43 = intTreeSet30.add((int) (short) 100);
        int int45 = intTreeSet30.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean47 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test118");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        boolean boolean4 = intTreeSet1.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = intTreeSet5.floor(3);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test119");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean42 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet33.remove(1);
        boolean boolean46 = intTreeSet33.add((int) (short) 100);
        int int48 = intTreeSet33.ceil(6);
        boolean boolean49 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet51.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        intTreeSet56.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet56);
        boolean boolean60 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean63 = intTreeSet61.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        intTreeSet62.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean67 = intTreeSet65.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        intTreeSet66.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet69 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean71 = intTreeSet69.removeAll((DataStructures.kodkod.IntCollection) intTreeSet70);
        boolean boolean72 = intTreeSet66.addAll((DataStructures.kodkod.IntCollection) intTreeSet69);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean74 = intTreeSet66.addAll((DataStructures.kodkod.IntCollection) intTreeSet73);
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean77 = intTreeSet75.removeAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        intTreeSet76.clear();
        boolean boolean79 = intTreeSet66.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        boolean boolean80 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        boolean boolean81 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet76);
        boolean boolean84 = intTreeSet76.remove(3);
        boolean boolean86 = intTreeSet76.add((-10));
        DataStructures.kodkod.IntTreeSet intTreeSet87 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet88 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean89 = intTreeSet87.removeAll((DataStructures.kodkod.IntCollection) intTreeSet88);
        intTreeSet88.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet91 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet92 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean93 = intTreeSet91.removeAll((DataStructures.kodkod.IntCollection) intTreeSet92);
        boolean boolean94 = intTreeSet88.addAll((DataStructures.kodkod.IntCollection) intTreeSet91);
        intTreeSet91.clear();
        boolean boolean96 = intTreeSet76.addAll((DataStructures.kodkod.IntCollection) intTreeSet91);
        boolean boolean97 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet91);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test120");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intTreeSet11.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test121");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        boolean boolean18 = intTreeSet1.add(1);
        int int19 = intTreeSet1.max();
        int int21 = intTreeSet1.floor((int) (byte) 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test122");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean11 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = intTreeSet4.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test123");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean17 = intTreeSet11.add((int) (short) 1);
        int int19 = intTreeSet11.ceil(0);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        intTreeSet21.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        boolean boolean26 = intTreeSet24.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        boolean boolean37 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean39 = intTreeSet28.remove(1);
        boolean boolean41 = intTreeSet28.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        boolean boolean43 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        boolean boolean44 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        intTreeSet46.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet51.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet51);
        boolean boolean55 = intTreeSet46.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        boolean boolean57 = intTreeSet46.remove(1);
        boolean boolean59 = intTreeSet46.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet46);
        boolean boolean61 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test124");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        boolean boolean11 = intTreeSet7.add((int) (byte) 1);
        int int12 = intTreeSet7.max();
        boolean boolean14 = intTreeSet7.add((int) (short) 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test125");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        boolean boolean35 = intTreeSet16.remove(3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test126");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet4.remove((-5));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = intTreeSet4.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = intTreeSet53.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test128");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test129");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean42 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet33.remove(1);
        boolean boolean46 = intTreeSet33.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        intTreeSet48.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet52);
        boolean boolean54 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet57.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet58.clear();
        boolean boolean61 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet48.clear();
        intTreeSet48.clear();
        boolean boolean64 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        intTreeSet48.clear();
        boolean boolean66 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = intTreeSet48.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test130");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntCollection intCollection10 = null;
        boolean boolean11 = intTreeSet1.removeAll(intCollection10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test131");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean26 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean34 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet28.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean37 = intTreeSet17.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test132");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean21 = intTreeSet19.add(3);
        boolean boolean22 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        boolean boolean33 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        intTreeSet35.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean45 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet49.clear();
        boolean boolean52 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean53 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean54 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean55 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        intTreeSet60.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet64 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean66 = intTreeSet64.removeAll((DataStructures.kodkod.IntCollection) intTreeSet65);
        intTreeSet65.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet65);
        boolean boolean69 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet65);
        boolean boolean71 = intTreeSet60.remove(1);
        boolean boolean73 = intTreeSet60.add((int) (short) 100);
        int int75 = intTreeSet60.ceil(6);
        boolean boolean76 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        boolean boolean78 = intTreeSet56.add(100);
        boolean boolean79 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test133");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        boolean boolean11 = intTreeSet7.add((int) (byte) 1);
        int int13 = intTreeSet7.ceil((-6));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test134");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        int int25 = intTreeSet15.floor((-100));
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        boolean boolean38 = intTreeSet36.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        boolean boolean41 = intTreeSet36.remove(7);
        boolean boolean42 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean43 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test135");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet1.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test136");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean38 = intTreeSet1.add(4);
        boolean boolean40 = intTreeSet1.remove(5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test137");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean22 = intTreeSet15.add((-1));
        int int23 = intTreeSet15.min();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test138");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        int int25 = intTreeSet15.min();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test139");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean27 = intTreeSet1.add(100);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test140");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean42 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet33.remove(1);
        boolean boolean46 = intTreeSet33.add((int) (short) 100);
        int int48 = intTreeSet33.ceil(6);
        boolean boolean49 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        int int50 = intTreeSet33.max();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test141");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        int int25 = intTreeSet15.floor((-100));
        boolean boolean27 = intTreeSet15.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean30 = intTreeSet28.remove(0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test142");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        int int33 = intTreeSet20.floor(6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test143");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        boolean boolean32 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        boolean boolean33 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        boolean boolean34 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        intTreeSet36.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet40.removeAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        intTreeSet41.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet41);
        boolean boolean45 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        boolean boolean47 = intTreeSet36.remove(1);
        boolean boolean49 = intTreeSet36.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet51.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet54.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean57 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        intTreeSet61.clear();
        boolean boolean64 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        intTreeSet51.clear();
        intTreeSet51.clear();
        boolean boolean67 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet36);
        int int69 = intTreeSet36.min();
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.removeAll((DataStructures.kodkod.IntCollection) intTreeSet74);
        intTreeSet74.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet77 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet74);
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean80 = intTreeSet78.removeAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        intTreeSet79.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet79);
        boolean boolean83 = intTreeSet74.removeAll((DataStructures.kodkod.IntCollection) intTreeSet79);
        boolean boolean85 = intTreeSet74.remove(1);
        boolean boolean87 = intTreeSet74.add((int) (short) 100);
        int int89 = intTreeSet74.ceil(6);
        boolean boolean90 = intTreeSet70.addAll((DataStructures.kodkod.IntCollection) intTreeSet74);
        int int91 = intTreeSet74.min();
        boolean boolean92 = intTreeSet36.addAll((DataStructures.kodkod.IntCollection) intTreeSet74);
        boolean boolean93 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet74);
        boolean boolean94 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean96 = intTreeSet1.remove((-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test144");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.add(3);
        intTreeSet4.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet4.ceil((-1));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test145");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean17 = intTreeSet15.remove(10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test146");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean24 = intTreeSet15.remove((int) 'a');
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet30.removeAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        intTreeSet31.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet31);
        boolean boolean35 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        boolean boolean37 = intTreeSet26.remove(1);
        boolean boolean39 = intTreeSet26.add((int) (short) 100);
        int int41 = intTreeSet26.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        boolean boolean50 = intTreeSet44.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean51 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        int int52 = intTreeSet42.max();
        boolean boolean53 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test147");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int18 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean26 = intTreeSet20.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean28 = intTreeSet20.add((-3));
        boolean boolean29 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test148");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean26 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int27 = intTreeSet17.max();
        boolean boolean29 = intTreeSet17.add((int) (short) 100);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test149");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = intTreeSet19.floor((-7));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test150");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean15 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        boolean boolean22 = intTreeSet9.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean24 = intTreeSet9.add((-5));
        int int25 = intTreeSet9.min();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        intTreeSet27.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        boolean boolean31 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean32 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test151");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean17 = intTreeSet11.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        int int20 = intTreeSet18.ceil((int) '#');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test152");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        intTreeSet21.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet21.remove(1);
        boolean boolean34 = intTreeSet21.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        intTreeSet36.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        boolean boolean42 = intTreeSet36.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet36.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet45.removeAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        intTreeSet46.clear();
        boolean boolean49 = intTreeSet36.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        intTreeSet36.clear();
        intTreeSet36.clear();
        boolean boolean52 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        int int53 = intTreeSet21.min();
        boolean boolean55 = intTreeSet21.add((int) (short) 0);
        intTreeSet21.clear();
        boolean boolean57 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test153");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(9);
        boolean boolean40 = intTreeSet1.add((-7));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test154");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        intTreeSet37.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet37);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet42);
        boolean boolean46 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean48 = intTreeSet37.remove(1);
        boolean boolean50 = intTreeSet37.add((int) (short) 100);
        int int52 = intTreeSet37.ceil(6);
        boolean boolean53 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        boolean boolean54 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        boolean boolean56 = intTreeSet37.add(4);
        boolean boolean57 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test155");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intTreeSet1.floor(0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test156");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = intTreeSet1.floor(100);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test157");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean19 = intTreeSet17.remove(100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test158");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = intTreeSet23.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test159");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test160");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean15 = intTreeSet4.remove(1);
        boolean boolean17 = intTreeSet4.add((int) (short) 100);
        int int19 = intTreeSet4.ceil(6);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        int int21 = intTreeSet4.min();
        int int22 = intTreeSet4.max();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test161");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        intTreeSet16.clear();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test162");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(9);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean46 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean50 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet52);
        intTreeSet52.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        boolean boolean58 = intTreeSet52.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean60 = intTreeSet52.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean63 = intTreeSet61.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        intTreeSet62.clear();
        boolean boolean65 = intTreeSet52.addAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        intTreeSet52.clear();
        intTreeSet52.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet69 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean70 = intTreeSet68.removeAll((DataStructures.kodkod.IntCollection) intTreeSet69);
        intTreeSet69.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean74 = intTreeSet72.removeAll((DataStructures.kodkod.IntCollection) intTreeSet73);
        intTreeSet73.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet77 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean78 = intTreeSet76.removeAll((DataStructures.kodkod.IntCollection) intTreeSet77);
        boolean boolean79 = intTreeSet73.addAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        DataStructures.kodkod.IntTreeSet intTreeSet80 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean81 = intTreeSet73.addAll((DataStructures.kodkod.IntCollection) intTreeSet80);
        DataStructures.kodkod.IntTreeSet intTreeSet82 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet83 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean84 = intTreeSet82.removeAll((DataStructures.kodkod.IntCollection) intTreeSet83);
        intTreeSet83.clear();
        boolean boolean86 = intTreeSet73.addAll((DataStructures.kodkod.IntCollection) intTreeSet83);
        boolean boolean87 = intTreeSet69.removeAll((DataStructures.kodkod.IntCollection) intTreeSet83);
        boolean boolean88 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet69);
        boolean boolean90 = intTreeSet52.remove((-1));
        boolean boolean91 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet52);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test163");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean38 = intTreeSet1.add(4);
        int int39 = intTreeSet1.min();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test164");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int33 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int35 = intTreeSet1.max();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test165");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet10.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test166");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        boolean boolean11 = intTreeSet7.remove((int) (short) 100);
        boolean boolean13 = intTreeSet7.remove(10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test167");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        intTreeSet25.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean36 = intTreeSet25.remove(1);
        boolean boolean38 = intTreeSet25.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean46 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean49 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean50 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        intTreeSet15.clear();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test168");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        boolean boolean16 = intTreeSet1.add((-5));
        int int17 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean23 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet22.ceil(0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test169");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        boolean boolean18 = intTreeSet1.add(1);
        boolean boolean20 = intTreeSet1.remove(0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test170");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean10 = intTreeSet1.remove(5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test171");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = intTreeSet15.ceil(0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test172");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean33 = intTreeSet1.add(100);
        boolean boolean35 = intTreeSet1.add(10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test173");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        boolean boolean16 = intTreeSet11.remove(10);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean24 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        boolean boolean31 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        intTreeSet28.clear();
        boolean boolean36 = intTreeSet28.remove(6);
        boolean boolean38 = intTreeSet28.remove((-3));
        boolean boolean39 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        boolean boolean41 = intTreeSet11.remove((int) ' ');
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test174");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean15 = intTreeSet4.remove(1);
        boolean boolean17 = intTreeSet4.add((int) (short) 100);
        int int19 = intTreeSet4.ceil(6);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        int int21 = intTreeSet0.min();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test175");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int33 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean36 = intTreeSet34.remove((int) (short) 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test176");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        boolean boolean9 = intTreeSet1.remove((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet1.ceil((-5));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test177");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = intTreeSet23.ceil((-1));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test178");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        int int72 = intTreeSet19.max();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test179");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int18 = intTreeSet1.max();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        boolean boolean30 = intTreeSet24.addAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean32 = intTreeSet24.addAll((DataStructures.kodkod.IntCollection) intTreeSet31);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        intTreeSet34.clear();
        boolean boolean37 = intTreeSet24.addAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean38 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean40 = intTreeSet34.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        boolean boolean43 = intTreeSet41.add(6);
        int int45 = intTreeSet41.floor((-1));
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        intTreeSet47.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet51.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet54.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean57 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet60.removeAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        intTreeSet61.clear();
        boolean boolean64 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        boolean boolean65 = intTreeSet47.removeAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        boolean boolean67 = intTreeSet61.remove((int) '#');
        boolean boolean68 = intTreeSet41.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        boolean boolean69 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test180");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        boolean boolean4 = intTreeSet1.add((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean11 = intTreeSet9.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        boolean boolean22 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean24 = intTreeSet13.remove(1);
        boolean boolean26 = intTreeSet13.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean28 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean30 = intTreeSet13.add((-10));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test181");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean28 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = intTreeSet20.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test182");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        intTreeSet7.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet7.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test183");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(9);
        int int39 = intTreeSet1.min();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test184");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean5 = intTreeSet3.removeAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet4.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean13 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean15 = intTreeSet4.remove(1);
        boolean boolean17 = intTreeSet4.add((int) (short) 100);
        int int19 = intTreeSet4.ceil(6);
        boolean boolean20 = intTreeSet0.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        int int21 = intTreeSet4.min();
        int int22 = intTreeSet4.min();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean26 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        boolean boolean37 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean39 = intTreeSet28.remove(1);
        boolean boolean41 = intTreeSet28.add((int) (short) 100);
        int int43 = intTreeSet28.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        int int45 = intTreeSet28.max();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        int int48 = intTreeSet46.floor((-2));
        boolean boolean49 = intTreeSet4.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test185");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int34 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet44);
        boolean boolean48 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean50 = intTreeSet39.remove(1);
        boolean boolean52 = intTreeSet39.add((int) (short) 100);
        int int54 = intTreeSet39.ceil(6);
        boolean boolean55 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        int int56 = intTreeSet39.min();
        boolean boolean57 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean60 = intTreeSet58.removeAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        intTreeSet59.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet64 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        intTreeSet64.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet64);
        boolean boolean68 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        boolean boolean70 = intTreeSet59.remove(1);
        boolean boolean72 = intTreeSet59.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean75 = intTreeSet73.removeAll((DataStructures.kodkod.IntCollection) intTreeSet74);
        intTreeSet74.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet77 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet78 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean79 = intTreeSet77.removeAll((DataStructures.kodkod.IntCollection) intTreeSet78);
        boolean boolean80 = intTreeSet74.addAll((DataStructures.kodkod.IntCollection) intTreeSet77);
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean82 = intTreeSet74.addAll((DataStructures.kodkod.IntCollection) intTreeSet81);
        boolean boolean83 = intTreeSet59.addAll((DataStructures.kodkod.IntCollection) intTreeSet81);
        boolean boolean84 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test186");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intTreeSet4.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test187");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test188");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int33 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        intTreeSet34.clear();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test189");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int15 = intTreeSet1.min();
        int int16 = intTreeSet1.max();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean27 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        boolean boolean39 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        boolean boolean46 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean47 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean48 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean51 = intTreeSet43.remove(3);
        boolean boolean52 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test190");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        int int17 = intTreeSet1.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int19 = intTreeSet18.min();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test191");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int34 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet44);
        boolean boolean48 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean50 = intTreeSet39.remove(1);
        boolean boolean52 = intTreeSet39.add((int) (short) 100);
        int int54 = intTreeSet39.ceil(6);
        boolean boolean55 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        int int56 = intTreeSet39.min();
        boolean boolean57 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean59 = intTreeSet39.add((-100));
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean63 = intTreeSet61.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        intTreeSet62.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean67 = intTreeSet65.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        boolean boolean68 = intTreeSet62.addAll((DataStructures.kodkod.IntCollection) intTreeSet65);
        intTreeSet62.clear();
        boolean boolean70 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = intTreeSet62.floor((-10));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test192");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        boolean boolean16 = intTreeSet1.add((-8));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test193");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.remove((-6));
        boolean boolean4 = intTreeSet0.add((-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test194");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean33 = intTreeSet26.remove((int) (short) 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test195");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        boolean boolean42 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean44 = intTreeSet33.remove(1);
        boolean boolean46 = intTreeSet33.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean49 = intTreeSet47.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        intTreeSet48.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet52);
        boolean boolean54 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet57.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet58.clear();
        boolean boolean61 = intTreeSet48.addAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet48.clear();
        intTreeSet48.clear();
        boolean boolean64 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet48);
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        int int66 = intTreeSet33.min();
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean69 = intTreeSet67.removeAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean72 = intTreeSet70.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        intTreeSet71.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet74 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet71);
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean77 = intTreeSet75.removeAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        intTreeSet76.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet79 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet76);
        boolean boolean80 = intTreeSet71.removeAll((DataStructures.kodkod.IntCollection) intTreeSet76);
        boolean boolean82 = intTreeSet71.remove(1);
        boolean boolean84 = intTreeSet71.add((int) (short) 100);
        int int86 = intTreeSet71.ceil(6);
        boolean boolean87 = intTreeSet67.addAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        int int88 = intTreeSet71.min();
        boolean boolean89 = intTreeSet33.addAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        boolean boolean90 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet71);
        int int91 = intTreeSet71.min();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test196");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean21 = intTreeSet19.add(3);
        boolean boolean22 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        boolean boolean33 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        intTreeSet35.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean45 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet49.clear();
        boolean boolean52 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean53 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean54 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean55 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int57 = intTreeSet19.ceil((int) (byte) 0);
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test197");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(9);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean46 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet40);
        boolean boolean50 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        boolean boolean52 = intTreeSet1.add((int) (byte) 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test198");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean34 = intTreeSet26.remove(3);
        boolean boolean36 = intTreeSet26.add((-10));
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean44 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        intTreeSet41.clear();
        boolean boolean46 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test199");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        boolean boolean37 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean39 = intTreeSet28.remove(1);
        boolean boolean41 = intTreeSet28.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet46.removeAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean49 = intTreeSet43.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean51 = intTreeSet43.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean56 = intTreeSet43.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet43.clear();
        intTreeSet43.clear();
        boolean boolean59 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        boolean boolean61 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test200");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean28 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intTreeSet20.floor((-8));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test201");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        boolean boolean16 = intTreeSet11.remove(10);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean24 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        boolean boolean31 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet33);
        boolean boolean38 = intTreeSet36.add(3);
        boolean boolean39 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean40 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean42 = intTreeSet18.add((-100));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test202");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean11 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean14 = intTreeSet9.remove(7);
        boolean boolean15 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = intTreeSet9.floor((-5));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test203");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        boolean boolean16 = intTreeSet1.add((int) (short) -1);
        intTreeSet1.clear();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test204");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean19 = intTreeSet11.remove(6);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet20.removeAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        intTreeSet21.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean32 = intTreeSet21.remove(1);
        boolean boolean34 = intTreeSet21.add((int) (short) 100);
        int int36 = intTreeSet21.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean45 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean46 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean47 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet49.clear();
        intTreeSet49.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean55 = intTreeSet53.removeAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        intTreeSet54.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet57.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        intTreeSet58.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean63 = intTreeSet61.removeAll((DataStructures.kodkod.IntCollection) intTreeSet62);
        boolean boolean64 = intTreeSet58.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean66 = intTreeSet58.addAll((DataStructures.kodkod.IntCollection) intTreeSet65);
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet68 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean69 = intTreeSet67.removeAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        intTreeSet68.clear();
        boolean boolean71 = intTreeSet58.addAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        boolean boolean72 = intTreeSet54.removeAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        boolean boolean74 = intTreeSet68.remove((int) '#');
        boolean boolean76 = intTreeSet68.add(4);
        int int78 = intTreeSet68.floor((-100));
        boolean boolean79 = intTreeSet49.removeAll((DataStructures.kodkod.IntCollection) intTreeSet68);
        boolean boolean80 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet39.clear();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test205");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        boolean boolean25 = intTreeSet8.remove(100);
        intTreeSet8.clear();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test206");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean24 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet18.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean28 = intTreeSet25.add((-3));
        boolean boolean29 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        int int30 = intTreeSet25.max();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test207");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean34 = intTreeSet26.remove(3);
        boolean boolean36 = intTreeSet26.add((-10));
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean44 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        intTreeSet41.clear();
        boolean boolean46 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = intTreeSet41.ceil((-1));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test208");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int17 = intTreeSet15.ceil(6);
        int int19 = intTreeSet15.ceil((-6));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test209");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        boolean boolean24 = intTreeSet15.remove((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet15.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test210");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        int int38 = intTreeSet1.floor(9);
        boolean boolean40 = intTreeSet1.add((-1));
        int int41 = intTreeSet1.min();
        int int43 = intTreeSet1.ceil((int) (short) 10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test211");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet1.ceil((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test212");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        intTreeSet32.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean38 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
        boolean boolean45 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean46 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean48 = intTreeSet42.remove((int) '#');
        boolean boolean49 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean52 = intTreeSet50.removeAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        intTreeSet51.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean56 = intTreeSet54.removeAll((DataStructures.kodkod.IntCollection) intTreeSet55);
        boolean boolean57 = intTreeSet51.addAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        boolean boolean59 = intTreeSet51.remove((int) '4');
        boolean boolean60 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet51);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = intTreeSet23.floor(8);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int33 = intTreeSet1.min();
        boolean boolean35 = intTreeSet1.add((int) (short) 0);
        boolean boolean37 = intTreeSet1.add(4);
        int int39 = intTreeSet1.floor((-10));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test214");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean27 = intTreeSet1.remove((-7));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test215");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        intTreeSet4.clear();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test216");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        boolean boolean14 = intTreeSet8.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet8.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean17 = intTreeSet4.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test217");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean11 = intTreeSet9.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean14 = intTreeSet9.remove(7);
        boolean boolean15 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test218");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        int int25 = intTreeSet15.floor((-100));
        boolean boolean27 = intTreeSet15.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        int int29 = intTreeSet15.max();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test219");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet1.floor((-10));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test220");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        boolean boolean25 = intTreeSet8.remove(100);
        boolean boolean27 = intTreeSet8.remove(1);
        intTreeSet8.clear();
        boolean boolean30 = intTreeSet8.add(10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test221");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        int int17 = intTreeSet1.max();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean20 = intTreeSet1.add((-2147483648));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test222");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean30 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean34 = intTreeSet26.remove(3);
        boolean boolean36 = intTreeSet26.add((-10));
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean44 = intTreeSet38.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        intTreeSet41.clear();
        boolean boolean46 = intTreeSet26.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        boolean boolean48 = intTreeSet41.remove((-4));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test223");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        boolean boolean25 = intTreeSet8.remove(100);
        boolean boolean27 = intTreeSet8.remove(1);
        intTreeSet8.clear();
        boolean boolean30 = intTreeSet8.add((-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test224");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        boolean boolean28 = intTreeSet20.add(4);
        int int30 = intTreeSet20.floor((-100));
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        int int33 = intTreeSet20.ceil(1);
        boolean boolean35 = intTreeSet20.remove((-9));
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test225");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test226");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.remove((-4));
        // The following exception was thrown during execution in test generation
        try {
            int int11 = intTreeSet7.floor((-8));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test227");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet1.clear();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        intTreeSet22.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean28 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        intTreeSet32.clear();
        boolean boolean35 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean36 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        boolean boolean37 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean45 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean47 = intTreeSet39.add((-3));
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet49.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet49);
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean55 = intTreeSet53.removeAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        intTreeSet54.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet54);
        boolean boolean58 = intTreeSet49.removeAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        boolean boolean60 = intTreeSet49.remove(1);
        boolean boolean62 = intTreeSet49.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet64 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet67 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean68 = intTreeSet66.removeAll((DataStructures.kodkod.IntCollection) intTreeSet67);
        intTreeSet67.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet70 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet67);
        DataStructures.kodkod.IntTreeSet intTreeSet71 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean73 = intTreeSet71.removeAll((DataStructures.kodkod.IntCollection) intTreeSet72);
        intTreeSet72.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet75 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet72);
        boolean boolean76 = intTreeSet67.removeAll((DataStructures.kodkod.IntCollection) intTreeSet72);
        boolean boolean78 = intTreeSet67.remove(1);
        boolean boolean80 = intTreeSet67.add((int) (short) 100);
        int int82 = intTreeSet67.ceil(6);
        boolean boolean83 = intTreeSet63.addAll((DataStructures.kodkod.IntCollection) intTreeSet67);
        boolean boolean84 = intTreeSet49.addAll((DataStructures.kodkod.IntCollection) intTreeSet67);
        intTreeSet67.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet86 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet67);
        boolean boolean87 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet86);
        boolean boolean88 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet86);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test228");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        boolean boolean73 = intTreeSet53.add((-9));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test229");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intTreeSet1.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test230");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        boolean boolean9 = intTreeSet1.add((-3));
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        intTreeSet14.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean23 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean25 = intTreeSet14.remove(1);
        boolean boolean27 = intTreeSet14.add((int) (short) 100);
        int int29 = intTreeSet14.ceil(6);
        boolean boolean30 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        int int31 = intTreeSet14.min();
        int int32 = intTreeSet14.min();
        boolean boolean33 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test231");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        intTreeSet14.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean20 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean22 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet21);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        boolean boolean27 = intTreeSet14.addAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean28 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet24.remove((int) '#');
        boolean boolean32 = intTreeSet24.add(4);
        int int34 = intTreeSet24.floor((-100));
        boolean boolean35 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet36.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        intTreeSet37.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet37);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet45 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet42);
        boolean boolean46 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean48 = intTreeSet37.remove(1);
        boolean boolean50 = intTreeSet37.add((int) (short) 100);
        int int52 = intTreeSet37.ceil(6);
        boolean boolean53 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        boolean boolean54 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        intTreeSet56.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        boolean boolean62 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean67 = intTreeSet65.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        intTreeSet66.clear();
        boolean boolean69 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        intTreeSet66.clear();
        boolean boolean72 = intTreeSet66.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet66);
        int int74 = intTreeSet66.min();
        boolean boolean75 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test232");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean26 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        intTreeSet32.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean38 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
        boolean boolean45 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean46 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean48 = intTreeSet42.remove((int) '#');
        boolean boolean50 = intTreeSet42.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        boolean boolean60 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        boolean boolean61 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        int int63 = intTreeSet19.ceil((int) '#');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test233");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        int int17 = intTreeSet1.max();
        int int19 = intTreeSet1.ceil(10);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet1.ceil(0);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        boolean boolean12 = intTreeSet4.addAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean14 = intTreeSet9.remove((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = intTreeSet9.floor((-10));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test235");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        boolean boolean16 = intTreeSet1.add((-5));
        int int17 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean23 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        boolean boolean25 = intTreeSet1.remove((int) (byte) 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test236");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intTreeSet20.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        intTreeSet25.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean36 = intTreeSet25.remove(1);
        boolean boolean38 = intTreeSet25.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean46 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean48 = intTreeSet40.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean49 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet47);
        boolean boolean50 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet51 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean53 = intTreeSet51.removeAll((DataStructures.kodkod.IntCollection) intTreeSet52);
        intTreeSet52.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet55 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean57 = intTreeSet55.removeAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        intTreeSet56.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet59 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet59.removeAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        boolean boolean62 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet59);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        DataStructures.kodkod.IntTreeSet intTreeSet65 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet66 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean67 = intTreeSet65.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        intTreeSet66.clear();
        boolean boolean69 = intTreeSet56.addAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        boolean boolean70 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet66);
        boolean boolean72 = intTreeSet52.remove((-3));
        intTreeSet52.clear();
        boolean boolean74 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet52);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test238");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        int int17 = intTreeSet1.max();
        int int19 = intTreeSet1.ceil(10);
        intTreeSet1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet1.floor((-6));
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test239");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intTreeSet0.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test240");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-9));
        boolean boolean8 = intTreeSet4.remove(1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test241");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int18 = intTreeSet1.max();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        int int22 = intTreeSet20.ceil((int) 'a');
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test242");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean18 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        intTreeSet22.clear();
        boolean boolean25 = intTreeSet12.addAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        intTreeSet22.clear();
        boolean boolean28 = intTreeSet22.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        intTreeSet34.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        boolean boolean40 = intTreeSet34.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean42 = intTreeSet34.addAll((DataStructures.kodkod.IntCollection) intTreeSet41);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        boolean boolean47 = intTreeSet34.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean48 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean49 = intTreeSet22.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean50 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test243");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int17 = intTreeSet15.ceil(6);
        int int19 = intTreeSet15.ceil(100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test244");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int18 = intTreeSet1.max();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int21 = intTreeSet1.ceil((int) 'a');
        int int22 = intTreeSet1.min();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test245");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        boolean boolean34 = intTreeSet16.remove((int) (byte) 100);
        boolean boolean36 = intTreeSet16.remove(5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test246");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean21 = intTreeSet19.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet28);
        boolean boolean32 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        boolean boolean34 = intTreeSet23.remove(1);
        boolean boolean36 = intTreeSet23.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean38 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean39 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        int int41 = intTreeSet23.floor(1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test247");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean17 = intTreeSet11.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        boolean boolean20 = intTreeSet11.add(1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test248");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = intTreeSet7.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test249");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean24 = intTreeSet22.remove((-9));
        boolean boolean25 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        intTreeSet27.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        boolean boolean32 = intTreeSet30.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test250");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
        boolean boolean21 = intTreeSet19.add(3);
        boolean boolean22 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        boolean boolean33 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean36 = intTreeSet34.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        intTreeSet35.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean45 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean47 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet46);
        DataStructures.kodkod.IntTreeSet intTreeSet48 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean50 = intTreeSet48.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        intTreeSet49.clear();
        boolean boolean52 = intTreeSet39.addAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean53 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet49);
        boolean boolean54 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        boolean boolean55 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int57 = intTreeSet19.ceil((int) (byte) 0);
        int int59 = intTreeSet19.ceil(5);
        intTreeSet19.clear();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test251");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean17 = intTreeSet11.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet11);
        boolean boolean20 = intTreeSet18.add((-10));
        boolean boolean22 = intTreeSet18.add(1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test252");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        boolean boolean9 = intTreeSet7.add(3);
        boolean boolean11 = intTreeSet7.add((int) (byte) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean16 = intTreeSet13.add((int) (byte) 0);
        int int18 = intTreeSet13.ceil((-1));
        boolean boolean19 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean21 = intTreeSet7.remove((-7));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test253");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        boolean boolean4 = intTreeSet1.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean8 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet7);
        intTreeSet7.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        boolean boolean13 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet16.removeAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        intTreeSet17.clear();
        boolean boolean20 = intTreeSet7.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        intTreeSet17.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet17);
        boolean boolean23 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet1.floor(10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test254");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = intTreeSet20.ceil((int) (byte) 0);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int34 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet44);
        boolean boolean48 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean50 = intTreeSet39.remove(1);
        boolean boolean52 = intTreeSet39.add((int) (short) 100);
        int int54 = intTreeSet39.ceil(6);
        boolean boolean55 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        int int56 = intTreeSet39.min();
        boolean boolean57 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean59 = intTreeSet39.add((-100));
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        boolean boolean63 = intTreeSet61.add((int) (short) 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test256");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet73 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean74 = intTreeSet72.removeAll((DataStructures.kodkod.IntCollection) intTreeSet73);
        intTreeSet73.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet76 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet77 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean78 = intTreeSet76.removeAll((DataStructures.kodkod.IntCollection) intTreeSet77);
        intTreeSet77.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet80 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet81 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean82 = intTreeSet80.removeAll((DataStructures.kodkod.IntCollection) intTreeSet81);
        boolean boolean83 = intTreeSet77.addAll((DataStructures.kodkod.IntCollection) intTreeSet80);
        DataStructures.kodkod.IntTreeSet intTreeSet84 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean85 = intTreeSet77.addAll((DataStructures.kodkod.IntCollection) intTreeSet84);
        DataStructures.kodkod.IntTreeSet intTreeSet86 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet87 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean88 = intTreeSet86.removeAll((DataStructures.kodkod.IntCollection) intTreeSet87);
        intTreeSet87.clear();
        boolean boolean90 = intTreeSet77.addAll((DataStructures.kodkod.IntCollection) intTreeSet87);
        boolean boolean91 = intTreeSet73.removeAll((DataStructures.kodkod.IntCollection) intTreeSet87);
        boolean boolean93 = intTreeSet87.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet94 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet87);
        boolean boolean95 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet87);
        boolean boolean97 = intTreeSet87.remove((int) (short) -1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test257");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean11 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet10);
        intTreeSet10.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean16 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean18 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet17);
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        intTreeSet20.clear();
        boolean boolean23 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean24 = intTreeSet6.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean26 = intTreeSet20.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet20);
        boolean boolean28 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean36 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean38 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet37);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet40 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean41 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        intTreeSet40.clear();
        boolean boolean43 = intTreeSet30.addAll((DataStructures.kodkod.IntCollection) intTreeSet40);
        boolean boolean45 = intTreeSet30.add((-5));
        int int46 = intTreeSet30.min();
        boolean boolean48 = intTreeSet30.remove((-2));
        boolean boolean49 = intTreeSet20.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test258");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet5);
        boolean boolean8 = intTreeSet5.add((-1));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test259");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intTreeSet7.ceil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test260");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test261");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        DataStructures.kodkod.IntTreeSet intTreeSet72 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet53);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test262");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = intTreeSet15.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test263");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        intTreeSet9.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean15 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        intTreeSet14.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet14);
        boolean boolean18 = intTreeSet9.removeAll((DataStructures.kodkod.IntCollection) intTreeSet14);
        boolean boolean20 = intTreeSet9.remove(1);
        boolean boolean22 = intTreeSet9.add((int) (short) 100);
        int int24 = intTreeSet9.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet9);
        boolean boolean26 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test264");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intTreeSet15.max();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean24 = intTreeSet22.remove((-9));
        boolean boolean25 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        intTreeSet27.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        boolean boolean32 = intTreeSet30.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = intTreeSet33.max();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test266");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean25 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        intTreeSet24.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet24);
        boolean boolean28 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet24);
        boolean boolean30 = intTreeSet19.remove(1);
        boolean boolean32 = intTreeSet19.add((int) (short) 100);
        int int34 = intTreeSet19.ceil(6);
        boolean boolean35 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean36 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean39 = intTreeSet37.removeAll((DataStructures.kodkod.IntCollection) intTreeSet38);
        intTreeSet38.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet38);
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean44 = intTreeSet42.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        intTreeSet43.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet46 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet43);
        boolean boolean47 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet43);
        boolean boolean49 = intTreeSet38.remove(1);
        boolean boolean51 = intTreeSet38.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet52 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean54 = intTreeSet52.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet56 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean58 = intTreeSet56.removeAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        boolean boolean59 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet56);
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean61 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet60);
        DataStructures.kodkod.IntTreeSet intTreeSet62 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean64 = intTreeSet62.removeAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet63.clear();
        boolean boolean66 = intTreeSet53.addAll((DataStructures.kodkod.IntCollection) intTreeSet63);
        intTreeSet53.clear();
        intTreeSet53.clear();
        boolean boolean69 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        intTreeSet53.clear();
        boolean boolean71 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet53);
        boolean boolean73 = intTreeSet53.remove(10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test267");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        int int25 = intTreeSet15.floor((-100));
        boolean boolean27 = intTreeSet15.remove((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet15);
        int int30 = intTreeSet15.floor(0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test268");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet11.removeAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        intTreeSet12.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet12);
        boolean boolean17 = intTreeSet10.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test269");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        intTreeSet1.clear();
        intTreeSet1.clear();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test270");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet23);
        boolean boolean28 = intTreeSet26.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet26);
        boolean boolean30 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        boolean boolean31 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        int int33 = intTreeSet1.ceil((int) '#');
        int int35 = intTreeSet1.floor((-3));
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test271");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet3 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet0);
        boolean boolean5 = intTreeSet3.remove((-8));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test272");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet1.add((int) (byte) 1);
        boolean boolean23 = intTreeSet1.remove(4);
        boolean boolean25 = intTreeSet1.remove((int) (short) -1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test273");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int33 = intTreeSet1.min();
        boolean boolean35 = intTreeSet1.add((int) (short) 0);
        boolean boolean37 = intTreeSet1.add(4);
        boolean boolean39 = intTreeSet1.add((int) (short) 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test274");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        int int34 = intTreeSet1.min();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        DataStructures.kodkod.IntTreeSet intTreeSet38 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet38.removeAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        intTreeSet39.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet43 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet44 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean45 = intTreeSet43.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        intTreeSet44.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet47 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet44);
        boolean boolean48 = intTreeSet39.removeAll((DataStructures.kodkod.IntCollection) intTreeSet44);
        boolean boolean50 = intTreeSet39.remove(1);
        boolean boolean52 = intTreeSet39.add((int) (short) 100);
        int int54 = intTreeSet39.ceil(6);
        boolean boolean55 = intTreeSet35.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        int int56 = intTreeSet39.min();
        boolean boolean57 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        boolean boolean59 = intTreeSet39.add((-100));
        DataStructures.kodkod.IntTreeSet intTreeSet60 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet39);
        int int62 = intTreeSet61.max();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test275");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean24 = intTreeSet22.remove((-9));
        boolean boolean25 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        intTreeSet27.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet27);
        boolean boolean32 = intTreeSet30.remove(0);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean36 = intTreeSet22.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = intTreeSet22.min();
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        boolean boolean18 = intTreeSet1.add(1);
        int int19 = intTreeSet1.max();
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean23 = intTreeSet21.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntTreeSet intTreeSet24 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean26 = intTreeSet24.removeAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        intTreeSet25.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet25);
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        intTreeSet30.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet30);
        boolean boolean34 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        boolean boolean36 = intTreeSet25.remove(1);
        boolean boolean38 = intTreeSet25.add((int) (short) 100);
        int int40 = intTreeSet25.ceil(6);
        boolean boolean41 = intTreeSet21.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
        boolean boolean42 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet25);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test277");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean11 = intTreeSet1.remove((int) '#');
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean19 = intTreeSet17.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        intTreeSet18.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet21 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet18);
        boolean boolean22 = intTreeSet13.removeAll((DataStructures.kodkod.IntCollection) intTreeSet18);
        boolean boolean24 = intTreeSet13.remove(1);
        boolean boolean26 = intTreeSet13.add((int) (short) 100);
        int int28 = intTreeSet13.ceil(6);
        int int29 = intTreeSet13.max();
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean31 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test278");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean21 = intTreeSet15.remove((int) '#');
        boolean boolean23 = intTreeSet15.add(4);
        int int25 = intTreeSet15.floor((-100));
        int int26 = intTreeSet15.min();
        boolean boolean28 = intTreeSet15.add((-2147483648));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test279");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean22 = intTreeSet15.add((-1));
        boolean boolean24 = intTreeSet15.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        intTreeSet34.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        boolean boolean38 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean40 = intTreeSet29.remove(1);
        boolean boolean42 = intTreeSet29.add((int) (short) 100);
        int int44 = intTreeSet29.ceil(6);
        boolean boolean45 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int46 = intTreeSet29.min();
        boolean boolean47 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int48 = intTreeSet29.min();
        DataStructures.kodkod.IntTreeSet intTreeSet49 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet50 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean51 = intTreeSet49.removeAll((DataStructures.kodkod.IntCollection) intTreeSet50);
        intTreeSet50.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet53 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet54 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean55 = intTreeSet53.removeAll((DataStructures.kodkod.IntCollection) intTreeSet54);
        intTreeSet54.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet57 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet58 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean59 = intTreeSet57.removeAll((DataStructures.kodkod.IntCollection) intTreeSet58);
        boolean boolean60 = intTreeSet54.addAll((DataStructures.kodkod.IntCollection) intTreeSet57);
        DataStructures.kodkod.IntTreeSet intTreeSet61 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean62 = intTreeSet54.addAll((DataStructures.kodkod.IntCollection) intTreeSet61);
        DataStructures.kodkod.IntTreeSet intTreeSet63 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet64 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean65 = intTreeSet63.removeAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        intTreeSet64.clear();
        boolean boolean67 = intTreeSet54.addAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        boolean boolean68 = intTreeSet50.addAll((DataStructures.kodkod.IntCollection) intTreeSet64);
        boolean boolean70 = intTreeSet50.add((int) (byte) 1);
        int int72 = intTreeSet50.floor(10);
        boolean boolean73 = intTreeSet29.addAll((DataStructures.kodkod.IntCollection) intTreeSet50);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test280");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet26.clear();
        boolean boolean29 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        intTreeSet16.clear();
        intTreeSet16.clear();
        boolean boolean32 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        int int33 = intTreeSet1.min();
        boolean boolean35 = intTreeSet1.add((int) (short) 0);
        int int37 = intTreeSet1.ceil(0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test281");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        // The following exception was thrown during execution in test generation
        try {
            int int7 = intTreeSet4.min();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: no this.ints");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test282");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean12 = intTreeSet10.remove(3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test283");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        intTreeSet5.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean10 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet9);
        boolean boolean11 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean13 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet12);
        DataStructures.kodkod.IntTreeSet intTreeSet14 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean16 = intTreeSet14.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean18 = intTreeSet5.addAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        boolean boolean19 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet15);
        intTreeSet15.clear();
        boolean boolean22 = intTreeSet15.add((-1));
        boolean boolean24 = intTreeSet15.add(5);
        DataStructures.kodkod.IntTreeSet intTreeSet25 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean27 = intTreeSet25.removeAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet29 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean30 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        intTreeSet29.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet29);
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet34 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean35 = intTreeSet33.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        intTreeSet34.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet37 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet34);
        boolean boolean38 = intTreeSet29.removeAll((DataStructures.kodkod.IntCollection) intTreeSet34);
        boolean boolean40 = intTreeSet29.remove(1);
        boolean boolean42 = intTreeSet29.add((int) (short) 100);
        int int44 = intTreeSet29.ceil(6);
        boolean boolean45 = intTreeSet25.addAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int46 = intTreeSet29.min();
        boolean boolean47 = intTreeSet15.addAll((DataStructures.kodkod.IntCollection) intTreeSet29);
        int int49 = intTreeSet29.ceil(10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test284");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        boolean boolean6 = intTreeSet4.remove((-4));
        DataStructures.kodkod.IntTreeSet intTreeSet7 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet7.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        intTreeSet8.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet12 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet13 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean14 = intTreeSet12.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        intTreeSet13.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet13);
        boolean boolean17 = intTreeSet8.removeAll((DataStructures.kodkod.IntCollection) intTreeSet13);
        boolean boolean19 = intTreeSet8.remove(1);
        boolean boolean21 = intTreeSet8.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet8);
        boolean boolean23 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = intTreeSet4.floor(6);
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
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        int int16 = intTreeSet1.ceil(6);
        DataStructures.kodkod.IntTreeSet intTreeSet17 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet19);
        boolean boolean24 = intTreeSet22.remove((-9));
        boolean boolean25 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet22);
        DataStructures.kodkod.IntCollection intCollection26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = intTreeSet22.addAll(intCollection26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test286");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet1);
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet6 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean7 = intTreeSet5.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        intTreeSet6.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet9 = new DataStructures.kodkod.IntTreeSet((DataStructures.kodkod.IntSet) intTreeSet6);
        boolean boolean10 = intTreeSet1.removeAll((DataStructures.kodkod.IntCollection) intTreeSet6);
        boolean boolean12 = intTreeSet1.remove(1);
        boolean boolean14 = intTreeSet1.add((int) (short) 100);
        DataStructures.kodkod.IntTreeSet intTreeSet15 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet16 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean17 = intTreeSet15.removeAll((DataStructures.kodkod.IntCollection) intTreeSet16);
        intTreeSet16.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet20 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean21 = intTreeSet19.removeAll((DataStructures.kodkod.IntCollection) intTreeSet20);
        boolean boolean22 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet16.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        boolean boolean25 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet28 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean29 = intTreeSet27.removeAll((DataStructures.kodkod.IntCollection) intTreeSet28);
        intTreeSet28.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet31 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean33 = intTreeSet31.removeAll((DataStructures.kodkod.IntCollection) intTreeSet32);
        intTreeSet32.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet35 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet36 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean37 = intTreeSet35.removeAll((DataStructures.kodkod.IntCollection) intTreeSet36);
        boolean boolean38 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet35);
        DataStructures.kodkod.IntTreeSet intTreeSet39 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean40 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet39);
        DataStructures.kodkod.IntTreeSet intTreeSet41 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet42 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean43 = intTreeSet41.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
        boolean boolean45 = intTreeSet32.addAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean46 = intTreeSet28.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        boolean boolean48 = intTreeSet42.remove((int) '#');
        boolean boolean49 = intTreeSet23.removeAll((DataStructures.kodkod.IntCollection) intTreeSet42);
        intTreeSet42.clear();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntTreeSetTester0.test287");
        DataStructures.kodkod.IntTreeSet intTreeSet0 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet1 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean2 = intTreeSet0.removeAll((DataStructures.kodkod.IntCollection) intTreeSet1);
        intTreeSet1.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet4 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet5 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean6 = intTreeSet4.removeAll((DataStructures.kodkod.IntCollection) intTreeSet5);
        boolean boolean7 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet4);
        DataStructures.kodkod.IntTreeSet intTreeSet8 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean9 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet8);
        DataStructures.kodkod.IntTreeSet intTreeSet10 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet11 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean12 = intTreeSet10.removeAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean14 = intTreeSet1.addAll((DataStructures.kodkod.IntCollection) intTreeSet11);
        intTreeSet11.clear();
        boolean boolean17 = intTreeSet11.add((int) (short) 1);
        DataStructures.kodkod.IntTreeSet intTreeSet18 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet19 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean20 = intTreeSet18.removeAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        intTreeSet19.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet22 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet23 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean24 = intTreeSet22.removeAll((DataStructures.kodkod.IntCollection) intTreeSet23);
        intTreeSet23.clear();
        DataStructures.kodkod.IntTreeSet intTreeSet26 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet27 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean28 = intTreeSet26.removeAll((DataStructures.kodkod.IntCollection) intTreeSet27);
        boolean boolean29 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet26);
        DataStructures.kodkod.IntTreeSet intTreeSet30 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean31 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet30);
        DataStructures.kodkod.IntTreeSet intTreeSet32 = new DataStructures.kodkod.IntTreeSet();
        DataStructures.kodkod.IntTreeSet intTreeSet33 = new DataStructures.kodkod.IntTreeSet();
        boolean boolean34 = intTreeSet32.removeAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        intTreeSet33.clear();
        boolean boolean36 = intTreeSet23.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean37 = intTreeSet19.addAll((DataStructures.kodkod.IntCollection) intTreeSet33);
        boolean boolean38 = intTreeSet11.addAll((DataStructures.kodkod.IntCollection) intTreeSet19);
        boolean boolean40 = intTreeSet19.remove((-2147483648));
    }
}

